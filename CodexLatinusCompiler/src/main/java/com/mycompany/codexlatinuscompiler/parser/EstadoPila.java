/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.parser;

import java.util.List;

/**
 *
 * @author andy
 */
/**
 * Representa un estado puntual del parser (ANTLR4) durante el análisis
 * sintáctico: la pila de reglas activas en ese momento, la acción que
 * disparó el evento (ENTER/EXIT de regla o CONSUME de token) y metadata
 * asociada (línea, texto y tipo de token cuando aplica).
 *
 * @author andy
 */
public class EstadoPila {
    private final List<String> pilaReglas; // copia inmutable de la pila en ese momento
    private final String accion;           // ej. "ENTER sentencia_if", "CONSUME 'if' (KEYWORD)"
    private final int linea;               // línea del token que disparó el evento
    private final String tokenTexto;       // solo si acción es CONSUME, puede ser null
    private final int tokenTipo;           // tipo de token (CodexLatinusParser.KEYWORD, etc.), -1 si no aplica

    /**
     *  Constructor completo (usado para eventos CONSUME). 
     * @param pilaReglas
     * @param accion
     * @param linea
     * @param tokenTexto
     * @param tokenTipo 
     */
    public EstadoPila(List<String> pilaReglas, String accion, int linea, String tokenTexto, int tokenTipo) {
        this.pilaReglas = List.copyOf(pilaReglas); // copia defensiva e inmutable
        this.accion = accion;
        this.linea = linea;
        this.tokenTexto = tokenTexto;
        this.tokenTipo = tokenTipo;
    }

    /**
     * Constructor sin token (usado para eventos ENTER/EXIT de regla).
     * @param pilaReglas
     * @param accion
     * @param linea 
     */
    public EstadoPila(List<String> pilaReglas, String accion, int linea) {
        this(pilaReglas, accion, linea, null, -1);
    }

    public List<String> getPilaReglas() {
        return pilaReglas;
    }

    public String getAccion() {
        return accion;
    }

    public int getLinea() {
        return linea;
    }

    public String getTokenTexto() {
        return tokenTexto;
    }

    public int getTokenTipo() {
        return tokenTipo;
    }
    
    
}
