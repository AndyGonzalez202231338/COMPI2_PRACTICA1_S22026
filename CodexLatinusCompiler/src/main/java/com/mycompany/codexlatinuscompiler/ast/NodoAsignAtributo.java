/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.ast;
import java.util.List;

/**
 *
 * @author andy
 */
public class NodoAsignAtributo extends NodoAST {
    public String nombreAtributo;
    public NodoAST valor;        // expresión normal, o NodoLiteralEstructura anidado
    public NodoAST tamanoArreglo; // solo se usa si el valor es "Tipo[n]" (ej. Animal[7]); null en otro caso
    public String tipoArregloReferenciado; // ej. "Animal" en Animal[7]; null si no aplica
}
