/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.ast;

/**
 *
 * @author andy
 */
public class NodoDeclaracionVariable extends NodoDeclaracion {
    public String nombre;
    public String tipo;          // "numerus", "textum", "decimalis", "littera", "verum/falsus"
    public NodoAST valorInicial; // puede ser null
}