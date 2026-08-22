/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.translator;

/**
 *
 * @author andy
 */
public enum PalabraReservada {
    ESTO("esto"),
    SERIES("series"),
    STRUCTURA("structura"),
    FINIS_BLOQUE("finis"),
    FINIS_PROGRAMA("FINIS"),
    SI("si"),
    ALITER("aliter"),
    DUM("dum"),
    FACERE("facere"),
    PER("per"),
    PERGE("perge"),
    INTERRUMPE("interrumpe"),
    ACTIO("actio"),
    RATIO("ratio"),
    REDDERE("reddere"),
    NON("non"),
    NUMERUS("numerus"),
    TEXTUM("textum"),
    DECIMALIS("decimalis"),
    LITTERA("littera"),
    VERUM("verum"),
    FALSUS("falsus"),
    BOOL("bool"),
    VARIABILES("VARIABILES"),
    MUNERA("MUNERA"),
    MAIOR("MAIOR");

    private final String original;
    private final String traducido;

    PalabraReservada(String original) {
        this.original = original;
        this.traducido = PigLatinUtil.convertirPalabra(original);
    }

    public static String traducir(String texto) {
        for (PalabraReservada p : values()) {
            if (p.original.equals(texto)) {
                return p.traducido;
            }
        }
        return null; // no es una palabra reservada
    }

    public String getOriginal() {
        return original;
    }

    public String getTraducido() {
        return traducido;
    }
    
}

