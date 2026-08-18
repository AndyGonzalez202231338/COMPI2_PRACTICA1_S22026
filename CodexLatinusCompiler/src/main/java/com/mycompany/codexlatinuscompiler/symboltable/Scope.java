/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.symboltable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author andy
 */
public class Scope {
    private final Map<String, Simbolo> simbolos = new LinkedHashMap<>();
    private final Scope padre;
    private final List<Scope> hijos = new ArrayList<>();
    private final String descripcion;

    public Scope(Scope padre, String descripcion, boolean persistente) {
        this.padre = padre;
        this.descripcion = descripcion;
        if (padre != null && persistente) {
            padre.hijos.add(this);
        }
    }
    /** 
     * Declara en ESTE scope. Retorna false si ya existía aquí mismo (redeclaración). 
     */
    public boolean declarar(Simbolo s) {
        if (simbolos.containsKey(s.nombre)) return false;
        simbolos.put(s.nombre, s);
        return true;
    }

    /** 
     * Busca el símbolo subiendo por la cadena de scopes padres. 
     */
    public Simbolo resolver(String nombre) {
        Simbolo local = simbolos.get(nombre);
        if (local != null) return local;
        if (padre != null) return padre.resolver(nombre);
        return null;
    }

    public Scope getPadre() {
        return padre;
    }

    public List<Scope> getHijos() {
        return hijos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Collection<Simbolo> simbolosLocales() {
        return simbolos.values();
    }
}
