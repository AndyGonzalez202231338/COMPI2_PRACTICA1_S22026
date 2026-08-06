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
public class NodoPer extends NodoAST { // for
    public NodoDeclaracionVariable inicializacion;
    public NodoAST condicion;
    public NodoAST incremento;
    public List<NodoAST> cuerpo;
}
