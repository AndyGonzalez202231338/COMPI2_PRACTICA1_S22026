/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.semantic;

import com.mycompany.codexlatinuscompiler.ast.NodoAST;
import com.mycompany.codexlatinuscompiler.ast.NodoBinaria;
import com.mycompany.codexlatinuscompiler.ast.NodoLiteral;
import com.mycompany.codexlatinuscompiler.ast.NodoUnaria;

/**
 *
 * @author andy
 */
public class EvaluadorConstantes {
    public static Integer evaluar(NodoAST expr) {
        //Nodo Literal significa que el numero es un entero, no viene una operacion
        if (expr instanceof NodoLiteral lit && "numerus".equals(lit.tipoInferido)) {
            return (Integer) lit.valor;
        }
        //Nodo Unario significa que viene un umero negatico, no vuene una operacion
        if (expr instanceof NodoUnaria u && u.operador.equals("-")) {
            Integer val = evaluar(u.operando);
            return val != null ? -val : null;
        }
        
        //Nodo Binario vienen operaciones de dos numeros (5-2)*2
        if (expr instanceof NodoBinaria b) {
            Integer izq = evaluar(b.izquierda);
            Integer der = evaluar(b.derecha);
            if (izq == null || der == null) return null;
            return switch (b.operador) {
                case "+" -> izq + der;
                case "-" -> izq - der;
                case "*" -> izq * der;
                case "/" -> der != 0 ? izq / der : null;
                default -> null;
            };
        }
        return null;
    }
}
