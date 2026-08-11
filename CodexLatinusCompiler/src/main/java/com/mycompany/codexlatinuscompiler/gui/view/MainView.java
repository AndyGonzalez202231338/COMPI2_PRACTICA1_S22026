/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.gui.view;

import com.mycompany.codexlatinuscompiler.gui.controller.MainController;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
/**
 *
 * @author andy
 */
public class MainView extends BorderPane {

    private final MainController controller;

    // Componentes que necesitaremos actualizar desde el controlador
    private TextArea editorTextArea;
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
        MenuItem itemSalir = new MenuItem("Salir");
        itemNuevo.setOnAction(e -> controller.nuevoArchivo());
        itemAbrir.setOnAction(e -> controller.abrirArchivo());
        itemGuardar.setOnAction(e -> controller.guardarArchivo());
        itemGuardarComo.setOnAction(e -> controller.guardarComo());
        itemSalir.setOnAction(e -> controller.salir());
        menuArchivo.getItems().addAll(itemNuevo, itemAbrir, itemGuardar, itemGuardarComo, new SeparatorMenuItem(), itemSalir);

        // Menú Editar
        Menu menuEditar = new Menu("Editar");
        MenuItem itemCortar = new MenuItem("Cortar");
        MenuItem itemCopiar = new MenuItem("Copiar");
        MenuItem itemPegar = new MenuItem("Pegar");
        itemCortar.setOnAction(e -> editorTextArea.cut());
        itemCopiar.setOnAction(e -> editorTextArea.copy());
        itemPegar.setOnAction(e -> editorTextArea.paste());
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

        // --- Números de línea ---
        Text lineNumbers = new Text();
        lineNumbers.setFont(Font.font("Consolas", 14));
        lineNumbers.setFill(Color.GRAY);
        lineNumbers.setText("1\n");

        VBox lineNumbersBox = new VBox(lineNumbers);
        lineNumbersBox.setPadding(new Insets(4, 5, 4, 5));
        lineNumbersBox.setStyle("-fx-background-color: #252526;");
        lineNumbersBox.setMinWidth(30);
        lineNumbersBox.setMaxHeight(Double.MAX_VALUE);

        // Envolvemos los números en su propio ScrollPane, sin scrollbars visibles,
        // que moveremos "a mano" sincronizado con el scroll del editor.
        ScrollPane lineNumberScrollPane = new ScrollPane(lineNumbersBox);
        lineNumberScrollPane.setFitToWidth(true);
        lineNumberScrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        lineNumberScrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        lineNumberScrollPane.setStyle("-fx-background-color: #252526; -fx-background: #252526;");
        lineNumberScrollPane.setPrefWidth(35);
        lineNumberScrollPane.setMinWidth(35);
        lineNumberScrollPane.setMaxWidth(35);
        lineNumberScrollPane.setMaxHeight(Double.MAX_VALUE);
        // El TextArea no debe capturar scroll de esta zona; no es interactivo
        lineNumberScrollPane.setPannable(false);

        // --- Editor de texto ---
        editorTextArea = new TextArea();
        editorTextArea.setFont(Font.font("Consolas", 14));
        editorTextArea.setWrapText(false); // Sin salto de línea horizontal
        editorTextArea.setStyle("-fx-control-inner-background: #1e1e1e; -fx-text-fill: #d4d4d4;");

        editorTextArea.setMinWidth(0);
        editorTextArea.setMinHeight(0);
        editorTextArea.setMaxWidth(Double.MAX_VALUE);
        editorTextArea.setMaxHeight(Double.MAX_VALUE);
        HBox.setHgrow(editorTextArea, Priority.ALWAYS);

        // --- Sincronizar el scroll vertical del editor con los números de línea ---
        editorTextArea.skinProperty().addListener((obs, oldSkin, newSkin) -> {
            if (newSkin != null) {
                ScrollPane internalScrollPane = (ScrollPane) editorTextArea.lookup(".scroll-pane");
                if (internalScrollPane != null) {
                    internalScrollPane.vvalueProperty().addListener((o, oldVal, newVal) ->
                        lineNumberScrollPane.setVvalue(newVal.doubleValue())
                    );
                }
            }
        });

        // --- Contenedor HBox (números + editor) ---
        HBox editorContainer = new HBox(lineNumberScrollPane, editorTextArea);
        editorContainer.setMinWidth(0);
        editorContainer.setMinHeight(0);
        editorContainer.setMaxWidth(Double.MAX_VALUE);
        editorContainer.setMaxHeight(Double.MAX_VALUE);
        editorContainer.setFillHeight(true);
        VBox.setVgrow(editorContainer, Priority.ALWAYS);

        panel.getChildren().addAll(lblEditor, editorContainer);

        // --- Actualizar números al cambiar el texto ---
        editorTextArea.textProperty().addListener((obs, oldText, newText) -> {
            int lines = newText.split("\n", -1).length;
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= lines; i++) {
                sb.append(i).append("\n");
            }
            lineNumbers.setText(sb.toString());
        });

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
        return editorTextArea.getText();
    }

    public void setSourceCode(String code) {
        editorTextArea.setText(code);
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
        resultsTabPane.getTabs().get(0).setContent(content);
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