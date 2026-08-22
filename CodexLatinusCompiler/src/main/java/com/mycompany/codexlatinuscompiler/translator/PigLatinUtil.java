package com.mycompany.codexlatinuscompiler.translator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andy
 */
public class PigLatinUtil {
    
    private static final String VOCALES = "aeiouAEIOU";
    
    /**
     * Aplica la ley de Consonantes/Vocales a una sola palabra.
     * @param palabra
     * @return 
     */
    public static String convertirPalabra(String palabra) {
        if (palabra == null || palabra.isEmpty()) return palabra;

        if (esVocal(palabra.charAt(0))) {
            return palabra + "way";
        }

        int i = 0;
        while (i < palabra.length() && !esVocal(palabra.charAt(i))) i++;

        if (i == palabra.length()) {
            return palabra + "ay"; // no tiene vocales
        }

        return palabra.substring(i) + palabra.substring(0, i) + "ay";
    }
    
    /**
     * Traduce el contenido de un literal de texto, palabra por palabra,
     * conservando espacios y puntuación tal cual (no se traducen símbolos).
     * @param texto
     * @return 
     */
    public static String convertirTexto(String texto) {
        StringBuilder resultado = new StringBuilder();
        StringBuilder palabraActual = new StringBuilder();

        for (int i = 0; i <= texto.length(); i++) {
            char c = (i < texto.length()) ? texto.charAt(i) : ' ';
            if (Character.isLetter(c)) {
                palabraActual.append(c);
            } else {
                if (palabraActual.length() > 0) {
                    resultado.append(convertirPalabra(palabraActual.toString()));
                    palabraActual.setLength(0);
                }
                if (i < texto.length()) resultado.append(c);
            }
        }
        return resultado.toString();
    }
    
    private static boolean esVocal(char c) {
        return VOCALES.indexOf(c) >= 0;
    }
    
}
