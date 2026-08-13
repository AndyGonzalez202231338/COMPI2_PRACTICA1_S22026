/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.gui.controller.util;

import com.mycompany.codexlatinuscompiler.ast.NodoAST;
import javafx.scene.control.TreeItem;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 *
 * @author andy
 */
/**
 * Convierte cualquier nodo AST (subclase de NodoAST) en un TreeItem<String>
 * para visualización en un TreeView de JavaFX.
 * 
 * Los campos públicos se procesan así:
 *  - String, números, booleanos, etc. → se incluyen en la etiqueta como "campo=valor"
 *  - NodoAST → se agrega como hijo con prefijo "campo: "
 *  - List<NodoAST> → se agrega un contenedor con el nombre del campo y cada elemento como hijo
 *  - null → se omite
 *  - linea y columna (heredados) → se excluyen
 */
public class ASTTreeConverter {

    /**
     * Convierte un nodo AST a un TreeItem<String>.
     * @param nodo el nodo raíz (puede ser null)
     * @return TreeItem con la representación jerárquica, o un TreeItem con "null" si nodo es null
     */
    public static TreeItem<String> convertir(NodoAST nodo) {
        if (nodo == null) {
            return new TreeItem<>("null");
        }
        return convertirNodo(nodo, null);
    }

    // Método recursivo principal
    private static TreeItem<String> convertirNodo(NodoAST nodo, String campoNombre) {
        if (nodo == null) return null;

        // Construir la etiqueta: nombre de clase + campos escalares
        String nombreClase = nodo.getClass().getSimpleName();
        StringBuilder etiqueta = new StringBuilder(nombreClase);

        // Recopilar campos escalares (String, primitivos, Boolean, etc.)
        StringBuilder escalares = new StringBuilder();
        Field[] campos = nodo.getClass().getFields();
        for (Field f : campos) {
            f.setAccessible(true);
            // Saltar linea y columna (heredados de NodoAST)
            if (f.getName().equals("linea") || f.getName().equals("columna")) {
                continue;
            }
            Object valor = null;
            try {
                valor = f.get(nodo);
            } catch (IllegalAccessException e) {
                continue;
            }
            // Si es null, omitir
            if (valor == null) continue;

            // Determinar si es escalar (no es NodoAST ni List)
            Class<?> tipo = f.getType();
            if (esEscalar(tipo)) {
                if (escalares.length() > 0) escalares.append(", ");
                escalares.append(f.getName()).append("=").append(formatearValor(valor));
            }
        }

        if (escalares.length() > 0) {
            etiqueta.append(" (").append(escalares).append(")");
        }

        TreeItem<String> item = new TreeItem<>(etiqueta.toString());

        // Procesar campos que son NodoAST o List<NodoAST>
        for (Field f : campos) {
            f.setAccessible(true);
            if (f.getName().equals("linea") || f.getName().equals("columna")) continue;
            Object valor = null;
            try {
                valor = f.get(nodo);
            } catch (IllegalAccessException e) {
                continue;
            }
            if (valor == null) continue;

            Class<?> tipo = f.getType();

            // Si es NodoAST (o subclase)
            if (NodoAST.class.isAssignableFrom(tipo)) {
                TreeItem<String> hijo = convertirNodo((NodoAST) valor, f.getName());
                if (hijo != null) {
                    // Cambiar la etiqueta del hijo para incluir el nombre del campo
                    String hijoTexto = hijo.getValue();
                    hijo.setValue(f.getName() + ": " + hijoTexto);
                    item.getChildren().add(hijo);
                }
                continue;
            }

            // Si es List<?> (posiblemente List<NodoAST>)
            if (List.class.isAssignableFrom(tipo)) {
                // Verificar si es List<NodoAST>
                Type genericType = f.getGenericType();
                if (genericType instanceof ParameterizedType) {
                    ParameterizedType pt = (ParameterizedType) genericType;
                    Type[] actualArgs = pt.getActualTypeArguments();
                    if (actualArgs.length == 1) {
                        Type arg = actualArgs[0];
                        if (arg instanceof Class && NodoAST.class.isAssignableFrom((Class<?>) arg)) {
                            // Es List<NodoAST>
                            List<?> lista = (List<?>) valor;
                            if (!lista.isEmpty()) {
                                TreeItem<String> contenedor = new TreeItem<>(f.getName());
                                for (Object elem : lista) {
                                    if (elem instanceof NodoAST) {
                                        TreeItem<String> elemItem = convertirNodo((NodoAST) elem, null);
                                        if (elemItem != null) {
                                            contenedor.getChildren().add(elemItem);
                                        }
                                    }
                                }
                                if (!contenedor.getChildren().isEmpty()) {
                                    item.getChildren().add(contenedor);
                                }
                            }
                            continue;
                        }
                    }
                }
                // Si no es List<NodoAST>, lo ignoramos (puede ser List<String> etc.)
            }
        }

        return item;
    }

    // Determina si un tipo es "escalar" (se mostrará en la etiqueta)
    private static boolean esEscalar(Class<?> tipo) {
        return tipo.isPrimitive() ||
               tipo == String.class ||
               tipo == Boolean.class ||
               tipo == Integer.class ||
               tipo == Double.class ||
               tipo == Float.class ||
               tipo == Long.class ||
               tipo == Short.class ||
               tipo == Byte.class ||
               tipo == Character.class ||
               tipo == Object.class; // si es Object, lo tratamos como escalar
    }

    // Formatea un valor para mostrarlo en la etiqueta
    private static String formatearValor(Object valor) {
        if (valor == null) return "null";
        if (valor instanceof String) {
            return "\"" + valor + "\"";
        }
        return valor.toString();
    }
}
