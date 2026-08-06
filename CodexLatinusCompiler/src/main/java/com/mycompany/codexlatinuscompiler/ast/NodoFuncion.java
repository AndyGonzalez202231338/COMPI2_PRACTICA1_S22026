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
public class NodoFuncion extends NodoAST {
    public String nombre;
    public String tipoRetorno;               // null si es "actio" (sin retorno)
    public List<NodoParametro> parametros;
    public List<NodoDeclaracionVariable> variablesLocales; // sección VARIABILES[...]
    public List<NodoAST> cuerpo;
    public NodoAST expresionRetorno;         // solo aplica a "ratio"; null si es "actio"
}
