/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.semantic;

import com.mycompany.codexlatinuscompiler.ast.*;
import com.mycompany.codexlatinuscompiler.errors.ManejadorErrores;
import com.mycompany.codexlatinuscompiler.symboltable.*;


/**
 *
 * @author andy
 */
public class AnalizadorFase1 {
    private final TablaSimbolos tabla;
    private final TablaTipos tipos;
    private final ManejadorErrores errores;
    
    public AnalizadorFase1(TablaSimbolos tabla, TablaTipos tipos, ManejadorErrores errores) {
        this.tabla = tabla;
        this.tipos = tipos;
        this.errores = errores;
    }
    
    public void analizar(NodoPrograma programa) {
        for (NodoDeclaracion decl : programa.variablesGlobales) {
            registrarDeclaracionGlobal(decl);
        }
        for (NodoFuncion f : programa.funciones) {
            registrarFuncion(f);
        }
    }
    
    /**
     * Registra todas la varibles globales, definciones de estructuras, arreglos y 
     * instancias de estructuras.
     * @param decl 
     */
    private void registrarDeclaracionGlobal(NodoDeclaracion decl) {
        if (decl instanceof NodoDeclaracionStructDef d) {
            registrarStructDef(d);
        } else if (decl instanceof NodoDeclaracionVariable d) {
            registrarVariableGlobal(d);
        } else if (decl instanceof NodoDeclaracionArray d) {
            registrarArrayGlobal(d);
        } else if (decl instanceof NodoDeclaracionStructVar d) {
            registrarStructVarGlobal(d);
        }
    }
    
    /**
     * Registra la definicion de una estructura
     * Analisis semantico: Struct Redeclarada
     * @param d 
     */
    private void registrarStructDef(NodoDeclaracionStructDef d) {
        Simbolo s = new Simbolo();
        s.nombre = d.nombre;
        s.esStruct = true;
        s.linea = d.linea;
        s.atributosStruct = new java.util.ArrayList<>(); //atributos de una estructura

        for (NodoAtributoStruct attr : d.atributos) {
            Simbolo attrSim = new Simbolo();
            attrSim.nombre = attr.nombre;
            attrSim.tipo = attr.tipo;
            attrSim.esArreglo = attr.esArreglo;
            attrSim.linea = attr.linea;
            s.atributosStruct.add(attrSim);
        }

        if (!tipos.declararStruct(s)) {
            errores.reportar("La estructura '" + d.nombre + "' ya fue declarada", d.linea);
        }
    }
    
    /**
     * Registra una declaracion de varibale a nivel global
     * Analisis Semantico: variable global ya fue declarada
     * @param d 
     */
    private void registrarVariableGlobal(NodoDeclaracionVariable d) {
        Simbolo s = new Simbolo();
        s.nombre = d.nombre;
        s.tipo = d.tipo;
        s.linea = d.linea;
        //s.inicializada = (d.valorInicial != null);
        if (!tabla.declarar(s)) {
            errores.reportar("La variable global '" + d.nombre + "' ya fue declarada", d.linea);
        }
    }
    
    /**
     * Registrar una declaracion de arreglo de manera global
     * Analisis semantico: Un arreglo ya declarado.
     *                     tamaño del arreglo declarado como cero
     *
     * @param d 
     */
    private void registrarArrayGlobal(NodoDeclaracionArray d) {
        Simbolo s = new Simbolo();
        s.nombre = d.nombre;
        s.tipo = d.tipo;
        s.esArreglo = true;
        s.tamanoArreglo = EvaluadorConstantes.evaluar(d.tamano);
        s.linea = d.linea;

        if (s.tamanoArreglo != null && s.tamanoArreglo <= 0) {
            errores.reportar("El arreglo '" + d.nombre + "' debe tener tamaño mayor a 0, se declaró " +
                    s.tamanoArreglo, d.linea);
        }

        if (!tabla.declarar(s)) {
            errores.reportar("El arreglo global '" + d.nombre + "' ya fue declarado", d.linea);
        }
    }

    /**
     * registra declaracion de variables de tipo estructura
     * Analisis Semantico: La variable estructura ya fue declarada
     * @param d 
     */
    private void registrarStructVarGlobal(NodoDeclaracionStructVar d) {
        Simbolo s = new Simbolo();
        s.nombre = d.nombre;
        s.tipo = d.tipoStruct;
        s.linea = d.linea;
        s.inicializada = (d.valores != null);
        if (!tabla.declarar(s)) {
            errores.reportar("La variable global '" + d.nombre + "' ya fue declarada", d.linea);
        }
    }
    
    /**
     * Registra una funciones
     * analisis Semantico: La funcion ya fue declarada
     * @param f 
     */
    private void registrarFuncion(NodoFuncion f) {
        Simbolo s = new Simbolo();
        s.nombre = f.nombre;
        s.esFuncion = true;
        s.tipoRetorno = f.tipoRetorno;
        s.linea = f.linea;
        s.parametros = new java.util.ArrayList<>();

        for (NodoParametro p : f.parametros) {
            Simbolo param = new Simbolo();
            param.nombre = p.nombre;
            param.tipo = p.tipo;
            s.parametros.add(param);
        }

        if (!tabla.declarar(s)) {
            errores.reportar("La función '" + f.nombre + "' ya fue declarada", f.linea);
        }
    }
    
}
