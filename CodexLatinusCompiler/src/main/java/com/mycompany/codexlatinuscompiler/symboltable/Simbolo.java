/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.symboltable;

import java.util.List;

/**
 *
 * @author andy
 */
public class Simbolo {
    public String nombre;
    public String tipo; // "numerus", "textum", "decimalis", "littera", "booleano",
                        // o el nombre de una struct (ej. "Persona")

    public int linea;                 // dónde se declaró, para mensajes de error

    public boolean esArreglo;
    public Integer tamanoArreglo;     // null si no se pudo evaluar en tiempo de compilación

    public boolean esStruct;
    public List<Simbolo> atributosStruct; // solo si esStruct == true

    public boolean esFuncion;
    public String tipoRetorno;        // null si es "actio" (sin retorno)
    public List<Simbolo> parametros;  // solo si esFuncion == true

    @Override
    public String toString() {
        return nombre + " : " + tipo + (esArreglo ? "[]" : "") +
               (esFuncion ? " (funcion)" : "") +
               (esStruct ? " (struct)" : "");
    }
}