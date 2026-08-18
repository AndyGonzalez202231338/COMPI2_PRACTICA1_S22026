/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.gui.view.console;

import com.mycompany.codexlatinuscompiler.gui.util.TipoMensaje;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

/**
 *
 * @author andy
 */
public class ConsoleView extends ListView<ConsoleMessage> {

    public ConsoleView() {
        setCellFactory(lv -> new ListCell<ConsoleMessage>() {
            @Override
            protected void updateItem(ConsoleMessage item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                    setStyle("");
                } else {
                    setText(item.getText());
                    String color;
                    switch (item.getTipo()) {
                        case INFO -> color = "#a0c0e0";
                        case ERROR_LEXICO -> color = "#FFD700";
                        case ERROR_SINTACTICO -> color = "#9B59B6";
                        case ERROR_SEMANTICO -> color = "#E74C3C";
                        default -> color = "#a0c0e0";
                    }
                    setStyle("-fx-text-fill: " + color + "; -fx-background-color: #1e1e1e;");
                }
            }
        });
        setStyle("-fx-control-inner-background: #1e1e1e; -fx-background-color: #1e1e1e;");
        setPrefHeight(150);
    }

    public void addMessage(String text, TipoMensaje tipo) {
        getItems().add(new ConsoleMessage(text, tipo));
        scrollTo(getItems().size() - 1);
    }

    public void clear() {
        getItems().clear();
    }
}
