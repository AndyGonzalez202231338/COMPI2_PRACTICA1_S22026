/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.symboltable;

/**
 *
 * @author andy
 */
public class TablaSimbolos {
    private Scope actual;
    private final Scope global;

    public TablaSimbolos() {
        global = new Scope(null);
        actual = global;
    }

    public void entrarScope() {
        actual = new Scope(actual);
    }

    public void salirScope() {
        if (actual.getPadre() != null) {
            actual = actual.getPadre();
        }
    }

    public boolean declarar(Simbolo s) {
        return actual.declarar(s);
    }

    public Simbolo resolver(String nombre) {
        return actual.resolver(nombre);
    }

    public Scope getScopeActual() {
        return actual;
    }

    public Scope getScopeGlobal() {
        return global;
    }
}