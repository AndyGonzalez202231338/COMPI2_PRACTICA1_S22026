/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler;

import com.mycompany.codexlatinuscompiler.ast.NodoPrograma;
import com.mycompany.codexlatinuscompiler.symboltable.TablaSimbolos;
import com.mycompany.codexlatinuscompiler.symboltable.TablaTipos;
import java.util.List;

/**
 *
 * @author andy
 */
public class ResultadoCompilacion {
    public boolean exitoso;
    public NodoPrograma ast;             
    public List<String> erroresLexicos;
    public List<String> erroresSintacticos;
    public List<String> erroresSemanticos; 
    public String arbolTexto; 
    
    public TablaSimbolos tablaSimbolos;
    public TablaTipos tablaTipos; 

    public NodoPrograma getAst() {
        return ast;
    }

    public void setAst(NodoPrograma ast) {
        this.ast = ast;
    }

    public TablaSimbolos getTablaSimbolos() {
        return tablaSimbolos;
    }

    public TablaTipos getTablaTipos() {
        return tablaTipos;
    }
    
}