/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.parser;

import com.mycompany.codexlatinuscompiler.lexerparser.CodexLatinusBaseListener;
import com.mycompany.codexlatinuscompiler.lexerparser.CodexLatinusParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/**
 * Listener que captura cada paso del analizador sintáctico (ANTLR4):
 * entrar/salir de una regla y consumir un token. Mantiene la pila de
 * reglas activas en cada instante y un historial completo de eventos
 * (EstadoPila) para su posterior visualización paso a paso.
 * @author andy
 */
public class ParserTraceListener extends CodexLatinusBaseListener {

    private final Deque<String> pilaReglas = new ArrayDeque<>();
    private final List<EstadoPila> historial = new ArrayList<>();

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        String nombreRegla = CodexLatinusParser.ruleNames[ctx.getRuleIndex()];
        pilaReglas.push(nombreRegla);
        historial.add(new EstadoPila(
                new ArrayList<>(pilaReglas),
                "ENTER " + nombreRegla,
                ctx.getStart().getLine()
        ));
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        String nombreRegla = CodexLatinusParser.ruleNames[ctx.getRuleIndex()];
        if (!pilaReglas.isEmpty()) {
            pilaReglas.pop();
        }
        historial.add(new EstadoPila(
                new ArrayList<>(pilaReglas),
                "EXIT " + nombreRegla,
                ctx.getStart().getLine()
        ));
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        String texto = node.getText();
        int tipo = node.getSymbol().getType();
        String nombreTipo = CodexLatinusParser.VOCABULARY.getDisplayName(tipo);

        historial.add(new EstadoPila(
                new ArrayList<>(pilaReglas),
                "CONSUME " + texto + " (" + nombreTipo + ")",
                node.getSymbol().getLine(),
                texto,
                tipo
        ));
    }

    /**
     * Devuelve el historial completo de eventos, en orden cronológico e inmutable.
     * @return 
     */
    public List<EstadoPila> getHistorial() {
        return Collections.unmodifiableList(historial);
    }

    /**
     * Limpia la pila y el historial, por si el listener se reutiliza.
     */
    public void reset() {
        pilaReglas.clear();
        historial.clear();
    }
}