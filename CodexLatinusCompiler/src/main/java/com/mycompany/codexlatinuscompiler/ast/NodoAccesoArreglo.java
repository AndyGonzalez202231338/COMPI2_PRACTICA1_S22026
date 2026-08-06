/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.ast;

/**
 *
 * @author andy
 */
public class NodoAccesoArreglo extends NodoAST {
    public NodoAST base;   // normalmente un NodoIdentificador o NodoAccesoAtributo
    public NodoAST indice; // expresión
}
