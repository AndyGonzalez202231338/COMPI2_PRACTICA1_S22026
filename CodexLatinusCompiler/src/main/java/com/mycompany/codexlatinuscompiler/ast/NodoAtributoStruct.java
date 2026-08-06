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
public class NodoAtributoStruct extends NodoAST {
    public String nombre;
    public String tipo;   // puede ser primitivo o el nombre de otra struct
    public boolean esArreglo; // true si se declaró con "series" dentro de la struct
}
