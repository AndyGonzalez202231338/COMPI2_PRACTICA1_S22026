/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.gui.controller.util;

import com.mycompany.codexlatinuscompiler.ast.NodoAST;
import java.lang.reflect.Field;
import java.util.List;
/**
 *
 * @author andy
 */
public class ASTToDotConverter {
    
    private static final String INDENT = "  ";
    private int nodeCounter = 0;
    private StringBuilder dot;
    
    public String convertir(NodoAST nodo) {
        dot = new StringBuilder();
        dot.append("digraph AST {\n");
        dot.append(INDENT).append("node [shape=box, style=filled, fillcolor=lightblue];\n");
        dot.append(INDENT).append("edge [color=gray];\n");
        
        if (nodo != null) {
            convertirNodo(nodo, null);
        }
        
        dot.append("}\n");
        return dot.toString();
    }
    
    private String convertirNodo(NodoAST nodo, String parentId) {
        if (nodo == null) return null;
        
        String nodeId = "n" + (nodeCounter++);
        String label = nodo.getClass().getSimpleName();
        
        // Agregar campos escalares a la etiqueta
        StringBuilder escalares = new StringBuilder();
        Field[] fields = nodo.getClass().getFields();
        for (Field f : fields) {
            f.setAccessible(true);
            if (f.getName().equals("linea") || f.getName().equals("columna")) continue;
            try {
                Object value = f.get(nodo);
                if (value == null) continue;
                if (esEscalar(f.getType())) {
                    if (escalares.length() > 0) escalares.append("\\n");
                    escalares.append(f.getName()).append("=").append(formatearValor(value));
                }
            } catch (IllegalAccessException e) {}
        }
        
        if (escalares.length() > 0) {
            label += "\\n" + escalares;
        }
        
        // Escapar caracteres especiales para DOT
        label = label.replace("\"", "\\\"");
        
        // Crear nodo
        dot.append(INDENT).append(nodeId)
           .append(" [label=\"").append(label).append("\"];\n");
        
        // Conectar con el padre
        if (parentId != null) {
            dot.append(INDENT).append(parentId)
               .append(" -> ").append(nodeId).append(";\n");
        }
        
        // Procesar hijos
        for (Field f : fields) {
            f.setAccessible(true);
            if (f.getName().equals("linea") || f.getName().equals("columna")) continue;
            try {
                Object value = f.get(nodo);
                if (value == null) continue;
                
                Class<?> type = f.getType();
                
                // Si es NodoAST
                if (NodoAST.class.isAssignableFrom(type)) {
                    String childId = convertirNodo((NodoAST) value, nodeId);
                    if (childId != null) {
                        // Agregar etiqueta al borde
                        dot.append(INDENT).append(nodeId)
                           .append(" -> ").append(childId)
                           .append(" [label=\"").append(f.getName()).append("\"];\n");
                    }
                }
                // Si es List<NodoAST>
                else if (List.class.isAssignableFrom(type)) {
                    List<?> list = (List<?>) value;
                    if (!list.isEmpty() && list.get(0) instanceof NodoAST) {
                        String containerId = "n" + (nodeCounter++);
                        dot.append(INDENT).append(containerId)
                           .append(" [label=\"").append(f.getName()).append("\", shape=ellipse, fillcolor=lightgray];\n");
                        dot.append(INDENT).append(nodeId)
                           .append(" -> ").append(containerId).append(";\n");
                        for (Object elem : list) {
                            if (elem instanceof NodoAST) {
                                String childId = convertirNodo((NodoAST) elem, containerId);
                                if (childId != null) {
                                    // No agregamos etiqueta para elementos de lista
                                }
                            }
                        }
                    }
                }
            } catch (IllegalAccessException e) {}
        }
        
        return nodeId;
    }
    
    private boolean esEscalar(Class<?> type) {
        return type.isPrimitive() ||
               type == String.class ||
               type == Boolean.class ||
               type == Integer.class ||
               type == Double.class ||
               type == Float.class ||
               type == Long.class ||
               type == Short.class ||
               type == Byte.class ||
               type == Character.class ||
               type == Object.class;
    }
    
    private String formatearValor(Object value) {
        if (value == null) return "null";
        if (value instanceof String) {
            return "\"" + value + "\"";
        }
        return value.toString();
    }
}
