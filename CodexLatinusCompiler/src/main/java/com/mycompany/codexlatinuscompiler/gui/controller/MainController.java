/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.gui.controller;

import com.mycompany.codexlatinuscompiler.Compilador;
import com.mycompany.codexlatinuscompiler.ResultadoCompilacion;
import com.mycompany.codexlatinuscompiler.ast.NodoAST;
import com.mycompany.codexlatinuscompiler.gui.controller.util.ASTGraphvizViewer;
import com.mycompany.codexlatinuscompiler.gui.controller.util.ASTToDotConverter;
import com.mycompany.codexlatinuscompiler.gui.controller.util.ASTTreeConverter;
import com.mycompany.codexlatinuscompiler.gui.controller.util.TablaSimbolosViewer;
import com.mycompany.codexlatinuscompiler.gui.view.MainView;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import java.awt.image.BufferedImage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javax.imageio.ImageIO;
/**
 *
 * @author andy
 */
public class MainController {

    private final MainView view;
    private File currentFile;
    private ResultadoCompilacion ultimoResultado;
    private final Compilador compilador = new Compilador();     

    public MainController(MainView view) {
        this.view = view;
    }

    // ---------- Acciones de Archivo ----------
    public void nuevoArchivo() {
        view.setSourceCode("");
        currentFile = null;
        view.setStatus("Nuevo archivo", "#f39c12");
        view.appendToConsole("[INFO] Nuevo archivo creado.");
    }

    public void abrirArchivo() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Abrir archivo .lat");
        fileChooser.getExtensionFilters().add(
            new FileChooser.ExtensionFilter("Codex Latinus", "*.lat")
        );
        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            try {
                String content = new String(Files.readAllBytes(file.toPath()));
                view.setSourceCode(content);
                currentFile = file;
                view.setStatus("Archivo cargado: " + file.getName(), "#2ecc71");
                view.appendToConsole("[INFO] Archivo cargado: " + file.getAbsolutePath());
            } catch (IOException e) {
                showError("Error al abrir", e.getMessage());
            }
        }
    }

    public void guardarArchivo() {
        if (currentFile == null) {
            guardarComo();
            return;
        }
        try {
            Files.write(currentFile.toPath(), view.getSourceCode().getBytes());
            view.setStatus("Guardado: " + currentFile.getName(), "#2ecc71");
            view.appendToConsole("[INFO] Archivo guardado.");
        } catch (IOException e) {
            showError("Error al guardar", e.getMessage());
        }
    }

    public void guardarComo() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Guardar como...");
        fileChooser.getExtensionFilters().add(
            new FileChooser.ExtensionFilter("Codex Latinus", "*.lat")
        );
        File file = fileChooser.showSaveDialog(null);
        if (file != null) {
            try {
                Files.write(file.toPath(), view.getSourceCode().getBytes());
                currentFile = file;
                view.setStatus("Guardado como: " + file.getName(), "#2ecc71");
                view.appendToConsole("[INFO] Archivo guardado como: " + file.getAbsolutePath());
            } catch (IOException e) {
                showError("Error al guardar", e.getMessage());
            }
        }
    }

    public void salir() {
        System.exit(0);
    }

    // ---------- Acción de Análisis ----------
    public void analizarCodigo() {
        String code = view.getSourceCode();
        if (code.trim().isEmpty()) {
            view.appendToConsole("[ERROR] No hay código para analizar.");
            return;
        }
        view.clearConsole();
        view.appendToConsole("[INFO] Iniciando análisis...");

        ResultadoCompilacion resultado = compilador.compilar(code);

        if (!resultado.erroresLexicos.isEmpty() || !resultado.erroresSintacticos.isEmpty()) {
            view.appendToConsole("[ERROR] Se encontraron errores de análisis léxico/sintáctico:");
            for (String e : resultado.erroresLexicos) view.appendToConsole("  " + e);
            for (String e : resultado.erroresSintacticos) view.appendToConsole("  " + e);

            view.setStatus("Errores encontrados", "#e74c3c");
            view.setErrorsContent(new javafx.scene.control.TextArea(
                    String.join("\n", resultado.erroresLexicos) + "\n" +
                    String.join("\n", resultado.erroresSintacticos)
            ));
            return;
        }

        view.appendToConsole("[OK] Análisis léxico completado");
        view.appendToConsole("[OK] Análisis sintáctico completado");

        // --- PRIMERO: Verificar si hay AST ---
        if (resultado.getAst() != null) {
            view.appendToConsole("[OK] AST generado");
            // Generar la imagen del AST
            Node astGraph = ASTGraphvizViewer.crearVistaAST(resultado.getAst());
            view.setASTContent(astGraph);
        } else {
            view.appendToConsole("[WARN] No se generó AST");
            view.setASTContent(new Label("No se pudo generar AST."));
        }

        view.setErrorsContent(new Label("Sin errores."));

        // --- ANÁLISIS SEMÁNTICO ---
        if (!resultado.erroresSemanticos.isEmpty()) {
            view.appendToConsole("[ERROR] Se encontraron errores semánticos:");
            for (String e : resultado.erroresSemanticos) view.appendToConsole("  " + e);

            view.setStatus("Errores semánticos encontrados", "#e74c3c");
            view.setErrorsContent(new TextArea(
                    String.join("\n", resultado.erroresSemanticos)
            ));
        } else {
            view.appendToConsole("[OK] Análisis semántico completado (Fase 1)");
            view.setStatus("Análisis completado", "#2ecc71");
            view.setErrorsContent(new Label("Sin errores."));
        }
        
        if (resultado.getTablaSimbolos()!= null) {
            view.setSymbolTableContent(
                TablaSimbolosViewer.crear(resultado.getTablaSimbolos())
            );
        }

        // Pestañas pendientes
        //view.setSymbolTableContent(new Label("Tabla de símbolos (pendiente)."));
        view.setStackContent(new Label("Pila de procesos (pendiente)."));
    }

    // ---------- Acciones de Visualización ----------
    public void mostrarAST() {
        // Seleccionar la pestaña AST
        view.getResultsTabPane().getSelectionModel().select(0);
    }

    public void mostrarTablaSimbolos() {
        view.getResultsTabPane().getSelectionModel().select(1);
    }

    public void mostrarPila() {
        view.getResultsTabPane().getSelectionModel().select(2);
    }

    // ---------- Traducción ----------
    public void traducirAPigLatin() {
        // Debe recorrer el AST para traducir
        view.appendToConsole("[INFO] Traduciendo a PigLatin... (simulado)");
        // Luego actualizar pestaña
        view.setPigLatinContent(new javafx.scene.control.Label("Código PigLatin generado."));
        view.getResultsTabPane().getSelectionModel().select(4);
    }

    // ---------- Ayuda ----------
    public void mostrarAcerca() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Acerca de Codex Latinus");
        alert.setHeaderText("Codex Latinus Compiler v1.0");
        alert.setContentText("Práctica 1 - Organización de Lenguajes y Compiladores 2\n"
                + "Universidad de San Carlos de Guatemala\n"
                + "Segundo semestre 2026\n\n"
                + "Desarrollado con JavaFX y ANTLR4");
        alert.showAndWait();
    }

    // ---------- Utilidades ----------
    private void showError(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
    public void exportarAST() {
        // Obtener el AST de la última compilación (debes guardarlo en un campo)
        if (ultimoResultado == null || ultimoResultado.getAst() == null) {
            view.appendToConsole("[ERROR] No hay AST para exportar. Analiza primero.");
            return;
        }

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Exportar AST");
        fileChooser.getExtensionFilters().add(
            new FileChooser.ExtensionFilter("Archivo de texto", "*.txt")
        );
        File file = fileChooser.showSaveDialog(null);
        if (file == null) return;

        try {
            // Generar representación textual del AST usando el mismo convertidor
            String contenido = generarTextoAST(ultimoResultado.getAst(), 0);
            Files.write(file.toPath(), contenido.getBytes());
            view.appendToConsole("[INFO] AST exportado a: " + file.getAbsolutePath());
        } catch (IOException e) {
            showError("Error al exportar", e.getMessage());
        }
    }
    
    private String generarTextoAST(NodoAST nodo, int nivel) {
        if (nodo == null) return "null";
        StringBuilder sb = new StringBuilder();
        String indent = "  ".repeat(nivel);
        sb.append(indent).append(nodo.getClass().getSimpleName());

        // Agregar campos escalares (similar a la etiqueta del TreeItem)
        // Puedes usar el mismo método de ASTTreeConverter o implementar uno similar
        // Por simplicidad, usamos toString() del nodo si está sobrescrito
        // o llamamos al método auxiliar de ASTTreeConverter (si lo haces público)

        // Alternativa: usar el método convertir para obtener la representación jerárquica
        // pero aquí generamos texto plano con sangrías

        // Obtener los hijos NodoAST y listas
        Field[] fields = nodo.getClass().getFields();
        for (Field f : fields) {
            f.setAccessible(true);
            if (f.getName().equals("linea") || f.getName().equals("columna")) continue;
            try {
                Object value = f.get(nodo);
                if (value == null) continue;
                if (value instanceof NodoAST) {
                    sb.append("\n").append(generarTextoAST((NodoAST) value, nivel + 1));
                } else if (value instanceof List) {
                    List<?> list = (List<?>) value;
                    if (!list.isEmpty() && list.get(0) instanceof NodoAST) {
                        sb.append("\n").append(indent).append("  ").append(f.getName()).append(":");
                        for (Object elem : list) {
                            if (elem instanceof NodoAST) {
                                sb.append("\n").append(generarTextoAST((NodoAST) elem, nivel + 2));
                            }
                        }
                    }
                }
            } catch (IllegalAccessException e) {
                // Ignorar
            }
        }
        return sb.toString();
    }
    
    public void exportarASTGrafico() {
        if (ultimoResultado == null || ultimoResultado.getAst() == null) {
            view.appendToConsole("[ERROR] No hay AST para exportar.");
            return;
        }

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Exportar AST como imagen");
        fileChooser.getExtensionFilters().add(
            new FileChooser.ExtensionFilter("PNG Image", "*.png")
        );
        File file = fileChooser.showSaveDialog(null);
        if (file == null) return;

        try {
            // Generar de nuevo la imagen
            ASTToDotConverter converter = new ASTToDotConverter();
            String dot = converter.convertir(ultimoResultado.getAst());
            BufferedImage image = Graphviz.fromString(dot)
                    .render(Format.PNG)
                    .toImage();

            // Guardar
            ImageIO.write(image, "png", file);
            view.appendToConsole("[INFO] AST exportado a: " + file.getAbsolutePath());
        } catch (IOException e) {
            showError("Error al exportar", e.getMessage());
        }
    }
}

