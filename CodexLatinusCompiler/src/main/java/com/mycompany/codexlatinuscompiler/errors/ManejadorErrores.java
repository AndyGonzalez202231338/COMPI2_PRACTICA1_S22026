/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.errors;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andy
 */
public class ManejadorErrores {
    private final List<String> errores = new ArrayList<>();

    public void reportar(String mensaje, int linea) {
        errores.add("[línea " + linea + "] " + mensaje);
    }

    public boolean tieneErrores() {
        return !errores.isEmpty();
    }

    public List<String> getErrores() {
        return errores;
    }
    
    public void imprimirTodos() {
        for (String err : errores) {
            System.out.println(err);
        }
    }
}
