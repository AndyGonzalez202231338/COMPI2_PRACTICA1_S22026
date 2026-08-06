/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.ast;

/**
 *
 * @author andy
 */
public class NodoAsignacion extends NodoAST {
    public NodoAST destino;   // NodoIdentificador, NodoAccesoArreglo o NodoAccesoAtributo
    public NodoAST valor;     // expresión o NodoLiteralEstructura
}