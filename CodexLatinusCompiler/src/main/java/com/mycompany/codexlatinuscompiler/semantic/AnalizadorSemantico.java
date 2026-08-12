/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.semantic;

import com.mycompany.codexlatinuscompiler.ast.*;
import com.mycompany.codexlatinuscompiler.errors.*;
import com.mycompany.codexlatinuscompiler.symboltable.*;

import java.util.ArrayList;
/**
 *
 * @author andy
 */
public class AnalizadorSemantico {
    private final TablaSimbolos tabla = new TablaSimbolos();
    private final TablaTipos tipos = new TablaTipos();
    private final ManejadorErrores errores = new ManejadorErrores();
    
    public void analizar(NodoPrograma programa) {
        primeraPasada(programa);
        // Fase 2 en adelante irá aquí después
    }
    
    // FASE 1: registrar structs y símbolos globales
    private void primeraPasada(NodoPrograma programa) {
        for (NodoDeclaracion decl : programa.variablesGlobales) {
            registrarDeclaracionGlobal(decl);
        }
        for (NodoFuncion f : programa.funciones) {
            registrarFuncion(f);
        }
    }   
    
        private void registrarDeclaracionGlobal(NodoDeclaracion decl) {
        if (decl instanceof NodoDeclaracionStructDef d) {
            registrarStructDef(d);
        } else if (decl instanceof NodoDeclaracionVariable d) {
            registrarVariableSimple(d);
        } else if (decl instanceof NodoDeclaracionArray d) {
            registrarArray(d);
        } else if (decl instanceof NodoDeclaracionStructVar d) {
            registrarStructVar(d);
        }
    }
        
        
    private void registrarStructDef(NodoDeclaracionStructDef d) {
        Simbolo s = new Simbolo();
        s.nombre = d.nombre;
        s.esStruct = true;
        s.linea = d.linea;
        s.atributosStruct = new ArrayList<>();

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
    
    private void registrarVariableSimple(NodoDeclaracionVariable d) {
        Simbolo s = new Simbolo();
        s.nombre = d.nombre;
        s.tipo = d.tipo;
        s.linea = d.linea;

        if (!tabla.declarar(s)) {
            errores.reportar("La variable '" + d.nombre + "' ya fue declarada", d.linea);
        }
    }

    private void registrarArray(NodoDeclaracionArray d) {
        Simbolo s = new Simbolo();
        s.nombre = d.nombre;
        s.tipo = d.tipo; // puede ser null aquí; se resuelve en fase posterior
        s.esArreglo = true;
        s.linea = d.linea;

        if (!tabla.declarar(s)) {
            errores.reportar("El arreglo '" + d.nombre + "' ya fue declarado", d.linea);
        }
    }
    
    private void registrarStructVar(NodoDeclaracionStructVar d) {
        Simbolo s = new Simbolo();
        s.nombre = d.nombre;
        s.tipo = d.tipoStruct;
        s.linea = d.linea;

        if (!tabla.declarar(s)) {
            errores.reportar("La variable '" + d.nombre + "' ya fue declarada", d.linea);
        }
    }
    
        private void registrarFuncion(NodoFuncion f) {
        Simbolo s = new Simbolo();
        s.nombre = f.nombre;
        s.esFuncion = true;
        s.tipoRetorno = f.tipoRetorno; // null si es actio
        s.linea = f.linea;
        s.parametros = new ArrayList<>();

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
    

    public TablaSimbolos getTabla() {
        return tabla;
    }

    public TablaTipos getTipos() {
        return tipos;
    }

    public ManejadorErrores getErrores() {
        return errores;
    }
    
}
