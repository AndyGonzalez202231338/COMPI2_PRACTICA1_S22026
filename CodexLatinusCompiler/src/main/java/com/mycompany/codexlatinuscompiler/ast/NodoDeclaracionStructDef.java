/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.ast;
import java.util.List;

/**
 * @author andy
 *   declaracionStructDef
       : STRUCTURA ID LBRACE listaAtributos RBRACE FINIS_SENTENCIAS SEMI
       ;
 *
 * structura Animal {​
   nombre: textum,​
   apodo: textum​
   }
 * 
 */
public class NodoDeclaracionStructDef extends NodoDeclaracion {
    public String nombre;                    // nombre de la estructura (ej. "Persona")
    public List<NodoAtributoStruct> atributos;
}
