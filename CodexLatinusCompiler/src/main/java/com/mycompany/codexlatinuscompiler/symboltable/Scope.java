/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.symboltable;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author andy
 */
public class Scope {
    private final Map<String, Simbolo> simbolos = new LinkedHashMap<>();
    private final Scope padre; // null si es el scope global

    public Scope(Scope padre) {
        this.padre = padre;
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

    /** 
     * Busca SOLO en este scope (útil para validar redeclaración exacta). 
     */
    public Simbolo resolverLocal(String nombre) {
        return simbolos.get(nombre);
    }

    public Scope getPadre() {
        return padre;
    }

    public Collection<Simbolo> simbolosLocales() {
        return simbolos.values();
    }
}
