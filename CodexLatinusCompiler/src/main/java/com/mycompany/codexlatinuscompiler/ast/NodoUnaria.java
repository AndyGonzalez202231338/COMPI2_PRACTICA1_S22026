/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.ast;

/**
 *
 * @author andy
 */
public class NodoUnaria extends NodoAST {
    public String operador;   // "non", "++", "--"
    public NodoAST operando;
    public boolean esPrefijo; // true: ++x / non x   |   false: x++
}
