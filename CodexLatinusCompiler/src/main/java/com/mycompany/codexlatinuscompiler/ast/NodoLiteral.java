/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.ast;

/**
 *
 * @author andy
 */
public class NodoLiteral extends NodoAST {
    public Object valor;        // Integer, Double, String, Character, Boolean
    public String tipoInferido; // "numerus" | "decimalis" | "textum" | "littera" | "booleano"
}