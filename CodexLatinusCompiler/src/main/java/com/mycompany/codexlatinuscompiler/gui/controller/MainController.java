/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.gui.controller;

import com.mycompany.codexlatinuscompiler.Compilador;
import com.mycompany.codexlatinuscompiler.ResultadoCompilacion;
import com.mycompany.codexlatinuscompiler.gui.view.MainView;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author andy
 */
public class MainController {

    private final MainView view;
    private File currentFile;
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
        view.appendToConsole("[OK] AST generado");
        view.setStatus("Análisis completado", "#2ecc71");

        view.setASTContent(new javafx.scene.control.TextArea(resultado.arbolTexto));
        view.setErrorsContent(new javafx.scene.control.Label("Sin errores."));
        
        if (!resultado.erroresSemanticos.isEmpty()) {
            view.appendToConsole("[ERROR] Se encontraron errores semánticos:");
            for (String e : resultado.erroresSemanticos) view.appendToConsole("  " + e);

            view.setStatus("Errores semánticos encontrados", "#e74c3c");
            view.setErrorsContent(new javafx.scene.control.TextArea(
                    String.join("\n", resultado.erroresSemanticos)
            ));
        } else {
            view.appendToConsole("[OK] Análisis semántico completado (Fase 1)");
            view.setStatus("Análisis completado", "#2ecc71");
            view.setErrorsContent(new javafx.scene.control.Label("Sin errores."));
        }

        // Estas dos siguen pendientes hasta que conectemos AnalizadorSemantico
        view.setSymbolTableContent(new javafx.scene.control.Label("Tabla de símbolos (pendiente)."));
        view.setStackContent(new javafx.scene.control.Label("Pila de procesos (pendiente)."));
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
}

