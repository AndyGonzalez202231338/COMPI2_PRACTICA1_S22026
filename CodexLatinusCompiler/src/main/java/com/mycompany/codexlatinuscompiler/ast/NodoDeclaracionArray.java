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
public class NodoDeclaracionArray extends NodoDeclaracion {
    public String nombre;
    public String tipo;              // tipo de cada elemento
    public NodoAST tamano;           // expresion dentro de [ ]
    public List<NodoAST> valoresIniciales; // null si "sin inicialización"
}