/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.symboltable;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andy
 */
public class TablaTipos {
    private final Map<String, Simbolo> structs = new HashMap<>();

    public boolean declararStruct(Simbolo s) {
        if (structs.containsKey(s.nombre)) return false;
        structs.put(s.nombre, s);
        return true;
    }

    public Simbolo resolverStruct(String nombre) {
        return structs.get(nombre);
    }

    public boolean existeStruct(String nombre) {
        return structs.containsKey(nombre);
    }
}