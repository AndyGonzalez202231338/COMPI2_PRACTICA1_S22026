/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.ast;

/**
 *
 * @author andy
 */
public class NodoDeclaracionStructVar extends NodoDeclaracion {
    public String nombre;
    public String tipoStruct;             // ej. "Persona", "Selva"
    public NodoLiteralEstructura valores; // los valores asignados a cada atributo
}
