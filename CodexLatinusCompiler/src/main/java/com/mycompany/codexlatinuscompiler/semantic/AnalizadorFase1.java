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

    private void registrarStructDef(NodoDeclaracionStructDef d) {
        Simbolo s = new Simbolo();
        s.nombre = d.nombre;
        s.esStruct = true;
        s.linea = d.linea;
        s.atributosStruct = new java.util.ArrayList<>();

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
    
    private void registrarVariableGlobal(NodoDeclaracionVariable d) {
        Simbolo s = new Simbolo();
        s.nombre = d.nombre;
        s.tipo = d.tipo;
        s.linea = d.linea;
        if (!tabla.declarar(s)) {
            errores.reportar("La variable global '" + d.nombre + "' ya fue declarada", d.linea);
        }
    }
    
    private void registrarArrayGlobal(NodoDeclaracionArray d) {
        Simbolo s = new Simbolo();
        s.nombre = d.nombre;
        s.tipo = d.tipo;
        s.esArreglo = true;
        s.linea = d.linea;
        if (!tabla.declarar(s)) {
            errores.reportar("El arreglo global '" + d.nombre + "' ya fue declarado", d.linea);
        }
    }
    
    private void registrarStructVarGlobal(NodoDeclaracionStructVar d) {
        Simbolo s = new Simbolo();
        s.nombre = d.nombre;
        s.tipo = d.tipoStruct;
        s.linea = d.linea;
        if (!tabla.declarar(s)) {
            errores.reportar("La variable global '" + d.nombre + "' ya fue declarada", d.linea);
        }
    }
    
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
