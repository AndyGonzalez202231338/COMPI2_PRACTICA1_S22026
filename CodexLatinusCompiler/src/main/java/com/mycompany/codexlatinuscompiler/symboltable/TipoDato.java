/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.symboltable;

/**
 *
 * @author andy
 */
public enum TipoDato {
    TEXTUM("textum", 5),
    DECIMALIS("decimalis", 4),
    NUMERUS("numerus", 3),
    LITTERA("littera", 2),
    BOOLEANO("booleano", 1);

    private final String nombre;
    private final int jerarquia;

    TipoDato(String nombre, int jerarquia) {
        this.nombre = nombre;
        this.jerarquia = jerarquia;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getJerarquia() {
        return jerarquia;
    }
    
    public static TipoDato desdeNombre(String nombre) {
        if (nombre == null) return null;
        for (TipoDato t : values()) {
            if (t.nombre.equals(nombre)) return t;
        }
        return null;
    }

    public static boolean esPrimitivo(String nombre) {
        return desdeNombre(nombre) != null;
    }
    
    public static String masAlto(String nombreIzq, String nombreDer) {
        TipoDato izq = desdeNombre(nombreIzq);
        TipoDato der = desdeNombre(nombreDer);
        if (izq == null || der == null) return null;
        return izq.jerarquia >= der.jerarquia ? izq.nombre : der.nombre;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
}
