/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.semantic;

import com.mycompany.codexlatinuscompiler.symboltable.TipoDato;

/**
 *
 * @author andy
 */
public class VerificadorTipos {

    public static boolean compatible(String tipoDestino, String tipoValor) {
        if (tipoDestino == null || tipoValor == null) return true;
        if (tipoDestino.equals(tipoValor)) return true;
        if (tipoDestino.equals("textum") || tipoValor.equals("textum")) return false;

        TipoDato destino = TipoDato.desdeNombre(tipoDestino);
        TipoDato valor = TipoDato.desdeNombre(tipoValor);
        if (destino == null || valor == null) return false;

        return destino.getJerarquia() >= valor.getJerarquia(); // ensanchar sí, achicar no
    }
}