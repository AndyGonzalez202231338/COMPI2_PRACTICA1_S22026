/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.gui.view;

import com.mycompany.codexlatinuscompiler.gui.controller.MainController;
import java.util.List;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * Vista auxiliar que encapsula la construcción de la pestaña "Pila".
 * Muestra, para cada paso capturado por el {@code ParserTraceListener}:
 * la pila de reglas activas, el token actual, un log descriptivo de la
 * acción realizada y un contador "Paso X de Y", junto con botones de
 * navegación "Anterior" / "Siguiente".
 *
 * Los botones invocan directamente a {@link MainController#anteriorPaso()}
 * y {@link MainController#siguientePaso()}; el resto de la actualización
 * visual se hace mediante los métodos públicos expuestos aquí, que
 * {@code MainView} delega desde sus propios métodos homónimos.
 *
 * @author andy
 */
public class PilaProcesosView extends BorderPane {

    private final ListView<String> listaPila;
    private final Label lblToken;
    private final TextArea logArea;
    private final Label lblContador;
    private final Button btnAnterior;
    private final Button btnSiguiente;

    public PilaProcesosView(MainController controller) {
        this.setPadding(new Insets(5));

        // ---------- Top: contador de pasos + botones de navegación ----------
        lblContador = new Label("Paso 0 de 0");
        lblContador.setFont(Font.font("Arial", FontWeight.BOLD, 13));

        btnAnterior = new Button("⬅ Anterior");
        btnSiguiente = new Button("Siguiente ➡");
        btnAnterior.setOnAction(e -> controller.anteriorPaso());
        btnSiguiente.setOnAction(e -> controller.siguientePaso());
        btnAnterior.setDisable(true);
        btnSiguiente.setDisable(true);

        HBox topBox = new HBox(10, lblContador, btnAnterior, btnSiguiente);
        topBox.setAlignment(Pos.CENTER_LEFT);
        topBox.setPadding(new Insets(5));
        this.setTop(topBox);

        // ---------- Center: pila de reglas (arriba) + token/log (abajo) ----------
        Label lblPila = new Label("Pila de reglas activas");
        lblPila.setFont(Font.font("Arial", FontWeight.BOLD, 12));

        listaPila = new ListView<>();
        listaPila.setPrefHeight(200);
        VBox.setVgrow(listaPila, Priority.ALWAYS);

        VBox pilaBox = new VBox(5, lblPila, listaPila);
        VBox.setVgrow(pilaBox, Priority.ALWAYS);

        Label lblTokenTitulo = new Label("Token actual");
        lblTokenTitulo.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        lblToken = new Label("(sin datos)");
        lblToken.setStyle("-fx-font-family: Consolas; -fx-font-size: 13px;");

        Label lblLogTitulo = new Label("Log de acción");
        lblLogTitulo.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        logArea = new TextArea();
        logArea.setEditable(false);
        logArea.setWrapText(true);
        logArea.setPrefHeight(120);
        logArea.setStyle("-fx-font-family: Consolas; -fx-font-size: 13px;");

        VBox infoBox = new VBox(5, lblTokenTitulo, lblToken, lblLogTitulo, logArea);
        infoBox.setPadding(new Insets(5, 0, 0, 0));

        SplitPane split = new SplitPane();
        split.setOrientation(Orientation.VERTICAL);
        split.getItems().addAll(pilaBox, infoBox);
        split.setDividerPositions(0.6);

        this.setCenter(split);
    }

    // ---------- Métodos públicos de actualización (llamados desde MainView) ----------

    /** Muestra la pila de reglas activas, una por línea (tope de la pila primero). */
    public void setPilaReglas(List<String> pilaReglas) {
        listaPila.getItems().setAll(pilaReglas);
    }

    /** Muestra el token actual y su tipo. Si tokenTexto es null, se asume que el paso no es un CONSUME. */
    public void setTokenActual(String tokenTexto, int tokenTipo) {
        if (tokenTexto == null) {
            lblToken.setText("(sin token en este paso)");
        } else {
            lblToken.setText("Token: '" + tokenTexto + "' (tipo=" + tokenTipo + ")");
        }
    }

    /** Muestra el mensaje descriptivo de la acción (ENTER/EXIT/CONSUME). */
    public void setLogAccion(String accion) {
        logArea.setText(accion);
    }

    /** Actualiza el contador "Paso X de Y" (1-indexado para el usuario). */
    public void setContadorPasos(int actual, int total) {
        lblContador.setText("Paso " + actual + " de " + total);
    }

    /** Habilita/deshabilita los botones de navegación según la posición actual. */
    public void setBotonesNavegacion(boolean hayAnterior, boolean haySiguiente) {
        btnAnterior.setDisable(!hayAnterior);
        btnSiguiente.setDisable(!haySiguiente);
    }

    /** Resetea todos los componentes a un estado vacío (sin historial disponible). */
    public void limpiarPila() {
        listaPila.getItems().clear();
        lblToken.setText("(sin datos)");
        logArea.setText("No hay datos de pila disponibles.");
        lblContador.setText("Paso 0 de 0");
        btnAnterior.setDisable(true);
        btnSiguiente.setDisable(true);
    }
}