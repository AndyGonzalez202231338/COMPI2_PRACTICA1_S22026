/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.gui.view;

import com.mycompany.codexlatinuscompiler.gui.controller.MainController;
import java.time.Duration;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
/**
 *
 * @author andy
 */
public class MainView extends BorderPane {

    private final MainController controller;
    private SyntaxHighlighter syntaxHighlighter;

    // Componentes que necesitaremos actualizar desde el controlador
    private CodeArea editorCodeArea;
    private TextArea consoleTextArea;
    private TabPane resultsTabPane;
    private Label statusLabel;

    public MainView() {
        controller = new MainController(this); // Pasamos la vista al controlador

        // Estilos generales
        this.setPadding(new Insets(10));
        this.setStyle("-fx-background-color: #f0f0f0;");

        // ------------------------
        // 1. Barra de menú superior
        // ------------------------
        MenuBar menuBar = createMenuBar();

        // ------------------------
        // 2. Toolbar
        // ------------------------
        ToolBar toolBar = createToolBar();

        // ------------------------
        // 3. Panel central (SplitPane)
        // ------------------------
        SplitPane centerSplit = createCenterSplitPane();

        // ------------------------
        // 4. Panel inferior (Consola)
        // ------------------------
        VBox bottomArea = createBottomArea();

        // ------------------------
        // Ensamblaje final
        // ------------------------
        VBox topContainer = new VBox(menuBar, toolBar);
        this.setTop(topContainer);
        this.setCenter(centerSplit);
this.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
BorderPane.setAlignment(centerSplit, javafx.geometry.Pos.CENTER);
        this.setBottom(bottomArea);

        // Tamaño preferido
        this.setPrefSize(1200, 800);
    }

    // ---------- Métodos auxiliares de creación ----------

    private MenuBar createMenuBar() {
        MenuBar menuBar = new MenuBar();

        // Menú Archivo
        Menu menuArchivo = new Menu("Archivo");
        MenuItem itemNuevo = new MenuItem("Nuevo");
        MenuItem itemAbrir = new MenuItem("Abrir .lat");
        MenuItem itemGuardar = new MenuItem("Guardar");
        MenuItem itemGuardarComo = new MenuItem("Guardar como");
        MenuItem itemExportarAST = new MenuItem("Exportar AST");
        MenuItem itemSalir = new MenuItem("Salir");
        itemNuevo.setOnAction(e -> controller.nuevoArchivo());
        itemAbrir.setOnAction(e -> controller.abrirArchivo());
        itemGuardar.setOnAction(e -> controller.guardarArchivo());
        itemGuardarComo.setOnAction(e -> controller.guardarComo());
        itemExportarAST.setOnAction(e -> controller.exportarAST());
        itemSalir.setOnAction(e -> controller.salir());
        menuArchivo.getItems().addAll(itemNuevo, itemAbrir, itemGuardar, itemGuardarComo, new SeparatorMenuItem(), itemExportarAST,itemSalir);
        //menuArchivo.getItems().add(itemExportarAST);

        // Menú Editar
        Menu menuEditar = new Menu("Editar");
        MenuItem itemCortar = new MenuItem("Cortar");
        MenuItem itemCopiar = new MenuItem("Copiar");
        MenuItem itemPegar = new MenuItem("Pegar");
        itemCortar.setOnAction(e -> editorCodeArea.cut());
        itemCopiar.setOnAction(e -> editorCodeArea.copy());
        itemPegar.setOnAction(e -> editorCodeArea.paste());
        menuEditar.getItems().addAll(itemCortar, itemCopiar, itemPegar);

        // Menú Analizar
        Menu menuAnalizar = new Menu("Analizar");
        MenuItem itemAnalizar = new MenuItem("Analizar código");
        itemAnalizar.setOnAction(e -> controller.analizarCodigo());
        menuAnalizar.getItems().add(itemAnalizar);

        // Menú Ver
        Menu menuVer = new Menu("Ver");
        MenuItem itemAST = new MenuItem("Ver AST");
        MenuItem itemSimbolos = new MenuItem("Ver Tabla de Símbolos");
        MenuItem itemPila = new MenuItem("Ver Pila de Procesos");
        itemAST.setOnAction(e -> controller.mostrarAST());
        itemSimbolos.setOnAction(e -> controller.mostrarTablaSimbolos());
        itemPila.setOnAction(e -> controller.mostrarPila());
        menuVer.getItems().addAll(itemAST, itemSimbolos, itemPila);

        // Menú Traducir
        Menu menuTraducir = new Menu("Traducir");
        MenuItem itemTraducir = new MenuItem("Traducir a PigLatin");
        itemTraducir.setOnAction(e -> controller.traducirAPigLatin());
        menuTraducir.getItems().add(itemTraducir);

        // Menú Ayuda
        Menu menuAyuda = new Menu("Ayuda");
        MenuItem itemAcerca = new MenuItem("Acerca de");
        itemAcerca.setOnAction(e -> controller.mostrarAcerca());
        menuAyuda.getItems().add(itemAcerca);

        menuBar.getMenus().addAll(menuArchivo, menuEditar, menuAnalizar, menuVer, menuTraducir, menuAyuda);
        return menuBar;
    }

    private ToolBar createToolBar() {
        ToolBar toolBar = new ToolBar();

        Button btnNuevo = new Button("Nuevo");
        Button btnAbrir = new Button("Abrir");
        Button btnGuardar = new Button("Guardar");
        Button btnGuardarComo = new Button("Guardar como");
        Button btnAnalizar = new Button("Analizar");
        Button btnPigLatin = new Button("PigLatin");

        // Estilos básicos
        btnNuevo.setOnAction(e -> controller.nuevoArchivo());
        btnAbrir.setOnAction(e -> controller.abrirArchivo());
        btnGuardar.setOnAction(e -> controller.guardarArchivo());
        btnGuardarComo.setOnAction(e -> controller.guardarComo());
        btnAnalizar.setOnAction(e -> controller.analizarCodigo());
        btnPigLatin.setOnAction(e -> controller.traducirAPigLatin());

        // Separador
        Separator sep = new Separator(Orientation.VERTICAL);

        // Etiqueta de estado (indicador)
        statusLabel = new Label("Sin analizar");
        statusLabel.setStyle("-fx-text-fill: #e74c3c; -fx-font-weight: bold;");

        toolBar.getItems().addAll(
            btnNuevo, btnAbrir, btnGuardar, btnGuardarComo,
            sep,
            btnAnalizar, btnPigLatin,
            new Separator(Orientation.VERTICAL),
            statusLabel
        );

        return toolBar;
    }

    private SplitPane createCenterSplitPane() {
        SplitPane split = new SplitPane();

        VBox leftEditor = createEditorPanel();
        VBox rightResults = createResultsPanel();

        // Asegurar que ambos paneles ocupen todo el espacio disponible
        leftEditor.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        rightResults.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);

        split.getItems().addAll(leftEditor, rightResults);
        split.setDividerPositions(0.6);
        split.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        split.setResizableWithParent(leftEditor, true);
        split.setResizableWithParent(rightResults, true);

        // Esto es clave para que el SplitPane se expanda dentro del BorderPane
        split.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        split.setMinSize(100, 100); // Para evitar que se encoja demasiado

        return split;
    }

    private VBox createEditorPanel() {
        VBox panel = new VBox();
        panel.setPadding(new Insets(5));
        panel.setSpacing(5);
        panel.setMinWidth(0);
        panel.setMinHeight(0);
        panel.setMaxWidth(Double.MAX_VALUE);
        panel.setMaxHeight(Double.MAX_VALUE);

        Label lblEditor = new Label("CÓDIGO FUENTE (.lat)");
        lblEditor.setFont(Font.font("Arial", FontWeight.BOLD, 14));

        // --- CodeArea reemplaza al TextArea: soporta estilos por rango + números de línea nativos ---
        CodeArea codeEditor = new CodeArea();
        codeEditor.setParagraphGraphicFactory(LineNumberFactory.get(codeEditor));
        codeEditor.getStylesheets().add(getClass().getResource("/styles/syntax-highlighting.css").toExternalForm());
        codeEditor.setStyle("-fx-font-family: Consolas; -fx-font-size: 14px;");

        VirtualizedScrollPane<CodeArea> scrollableEditor = new VirtualizedScrollPane<>(codeEditor);
        VBox.setVgrow(scrollableEditor, Priority.ALWAYS);
        scrollableEditor.setMaxWidth(Double.MAX_VALUE);
        scrollableEditor.setMaxHeight(Double.MAX_VALUE);

        // --- Resaltado en hilo aparte, con debounce para no lanzar un hilo por cada tecla ---
        syntaxHighlighter = new SyntaxHighlighter(codeEditor);
        codeEditor.plainTextChanges()
            .successionEnds(Duration.ofMillis(150)) // espera breve pausa al escribir
            .subscribe(change -> syntaxHighlighter.requestHighlight(codeEditor.getText()));

        panel.getChildren().addAll(lblEditor, scrollableEditor);

        // Guarda referencia si otras partes del código usaban getSourceCode()/setSourceCode()
        this.editorCodeArea = codeEditor; // ver nota abajo sobre reemplazar editorTextArea

        return panel;
    }
    
    private VBox createResultsPanel() {
        VBox panel = new VBox();
        panel.setPadding(new Insets(5));

        Label lblResults = new Label("RESULTADOS");
        lblResults.setFont(Font.font("Arial", FontWeight.BOLD, 14));

        // TabPane para AST, Símbolos, Pila, Errores, PigLatin
        resultsTabPane = new TabPane();

        // Pestaña AST (inicialmente vacía, se llenará desde el controlador)
        Tab tabAST = new Tab("AST");
        tabAST.setContent(new Label("El AST se mostrará aquí tras analizar."));
        tabAST.setClosable(false);

        Tab tabSymbols = new Tab("Tabla Símbolos");
        tabSymbols.setContent(new Label("La tabla de símbolos se mostrará aquí."));
        tabSymbols.setClosable(false);

        Tab tabStack = new Tab("Pila");
        tabStack.setContent(new Label("La pila de procesos se mostrará aquí."));
        tabStack.setClosable(false);

        Tab tabErrors = new Tab("Errores");
        tabErrors.setContent(new Label("Los errores semánticos/sintácticos aparecerán aquí."));
        tabErrors.setClosable(false);

        Tab tabPigLatin = new Tab("PigLatin");
        tabPigLatin.setContent(new Label("La traducción a PigLatin aparecerá aquí."));
        tabPigLatin.setClosable(false);

        resultsTabPane.getTabs().addAll(tabAST, tabSymbols, tabStack, tabErrors, tabPigLatin);

        VBox.setVgrow(resultsTabPane, Priority.ALWAYS);
        panel.getChildren().addAll(lblResults, resultsTabPane);
        return panel;
    }

    private VBox createBottomArea() {
        VBox panel = new VBox();
        panel.setPadding(new Insets(5));
        panel.setStyle("-fx-background-color: #2c3e50;");

        Label lblConsole = new Label("Consola / Errores");
        lblConsole.setStyle("-fx-text-fill: white; -fx-font-weight: bold;");

        consoleTextArea = new TextArea();
        consoleTextArea.setEditable(false);
        consoleTextArea.setFont(Font.font("Consolas", 13));
        consoleTextArea.setStyle("-fx-control-inner-background: #1e1e1e; -fx-text-fill: #a0c0e0;");
        consoleTextArea.setPrefHeight(150);
        consoleTextArea.setPromptText("Mensajes del compilador...");

        // Mensaje de bienvenida
        consoleTextArea.appendText("[INFO] Bienvenido a Codex Latinus Compiler\n");
        consoleTextArea.appendText("[INFO] Abre o escribe un archivo .lat y presiona 'Analizar'.\n");

        panel.getChildren().addAll(lblConsole, consoleTextArea);
        return panel;
    }

    // ---------- Métodos públicos para actualizar la vista desde el controlador ----------

    public String getSourceCode() {
        return editorCodeArea.getText();
    }

    public void setSourceCode(String code) {
        editorCodeArea.replaceText(code);
    }

    public void appendToConsole(String message) {
        consoleTextArea.appendText(message + "\n");
    }

    public void clearConsole() {
        consoleTextArea.clear();
    }

    public void setStatus(String text, String color) {
        statusLabel.setText(text);
        statusLabel.setStyle("-fx-text-fill: " + color + "; -fx-font-weight: bold;");
    }

    public TabPane getResultsTabPane() {
        return resultsTabPane;
    }

    // Métodos para actualizar cada pestaña (serán llamados desde el controlador)
    public void setASTContent(Node content) {
        StackPane stack = new StackPane();
        stack.getChildren().add(content);

        // Botón para exportar la imagen
        Button btnExport = new Button("💾 Exportar imagen");
        btnExport.setOnAction(e -> controller.exportarASTGrafico());
        btnExport.setStyle("-fx-background-color: #2ecc71; -fx-text-fill: white; " +
                           "-fx-font-size: 12px; -fx-padding: 5 10 5 10;");
        StackPane.setAlignment(btnExport, Pos.TOP_RIGHT);
        StackPane.setMargin(btnExport, new Insets(10));

        stack.getChildren().add(btnExport);
        resultsTabPane.getTabs().get(0).setContent(stack);
    }

    public void setSymbolTableContent(Node content) {
        resultsTabPane.getTabs().get(1).setContent(content);
    }

    public void setStackContent(Node content) {
        resultsTabPane.getTabs().get(2).setContent(content);
    }

    public void setErrorsContent(Node content) {
        resultsTabPane.getTabs().get(3).setContent(content);
    }

    public void setPigLatinContent(Node content) {
        resultsTabPane.getTabs().get(4).setContent(content);
    }
}