/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.ast;
import java.util.List;

/**
 * @author andy
 * 
 *      condicional
            : SI LPAREN expresion RPAREN bloque
              (ALITER LPAREN expresion RPAREN bloque)*
              (ALITER bloque)?
              FINIS_SENTENCIAS SEMI
            ;
 */
public class NodoSi extends NodoAST {
    public NodoAST condicion;
    public List<NodoAST> bloqueSi;
    public List<NodoAliterIf> ramasAliter;  // "aliter (cond) { ... }" puede ir vacío
    public List<NodoAST> bloqueAliterFinal; // "aliter { ... }" final sin condición null si no existe
}
