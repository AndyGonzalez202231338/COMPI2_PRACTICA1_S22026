/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.gui.view.console;

import com.mycompany.codexlatinuscompiler.gui.util.TipoMensaje;

/**
 *
 * @author andy
 */
public class ConsoleMessage {
    private final String text;
    private final TipoMensaje tipo;

    public ConsoleMessage(String text, TipoMensaje tipo) {
        this.text = text;
        this.tipo = tipo;
    }

    public String getText() { return text; }
    public TipoMensaje getTipo() { return tipo; }
}