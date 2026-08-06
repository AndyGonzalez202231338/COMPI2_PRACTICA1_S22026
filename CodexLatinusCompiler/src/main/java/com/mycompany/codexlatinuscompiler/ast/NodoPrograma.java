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
public class NodoPrograma extends NodoAST{
    public List<NodoDeclaracion> variablesGlobales;
    public List<NodoFuncion> funciones;
    public List<NodoAST> sentenciasPrincipal;
}
