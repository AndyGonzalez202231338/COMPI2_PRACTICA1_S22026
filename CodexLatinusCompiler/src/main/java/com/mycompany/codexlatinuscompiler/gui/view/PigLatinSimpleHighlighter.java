/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.gui.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javafx.application.Platform;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;

/**
 *
 * @author andy
 */
public class PigLatinSimpleHighlighter {

    private static final Set<String> KEYWORDS = new HashSet<>(Arrays.asList(
        "esto", "series", "structuraway", "finis", "FINIS", "si", "aliter",
        "dum", "facere", "per", "perge", "interrumpe", "actio", "ratio",
        "reddere", "non", "numerus", "textum", "decimalis", "littera",
        "verum", "falsus", "bool", "VARIABILES", "MUNERA", "MAIOR"
    ));

    private static final Set<Character> OPERATORS = new HashSet<>(Arrays.asList(
        '=', '+', '-', '*', '/', '%', '(', ')', '{', '}', '[', ']', ';', ':', ',', '.'
    ));

    private final CodeArea codeArea;

    public PigLatinSimpleHighlighter(CodeArea codeArea) {
        this.codeArea = codeArea;
    }

    public void highlight(String text) {
        if (text == null || text.isEmpty()) {
            codeArea.setStyleSpans(0, new StyleSpansBuilder<Collection<String>>().add(Collections.emptyList(), 0).create());
            return;
        }

        // Construir lista de estilos: cada entrada es [start, end, styleClass]
        List<StyleSpan> spans = new ArrayList<>();
        int i = 0;
        while (i < text.length()) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                // Encontrar palabra completa
                int start = i;
                while (i < text.length() && Character.isLetterOrDigit(c)) { // permitir dígitos en medio
                    i++;
                    if (i < text.length()) c = text.charAt(i);
                }
                String word = text.substring(start, i);
                String style = KEYWORDS.contains(word) ? "keyword" : null;
                if (style != null) {
                    spans.add(new StyleSpan(start, i, style));
                }
                continue;
            } else if (Character.isDigit(c)) {
                int start = i;
                while (i < text.length() && (Character.isDigit(c) || c == '.')) {
                    i++;
                    if (i < text.length()) c = text.charAt(i);
                }
                spans.add(new StyleSpan(start, i, "number"));
                continue;
            } else if (c == '"') {
                int start = i;
                i++;
                while (i < text.length() && text.charAt(i) != '"') {
                    i++;
                }
                if (i < text.length() && text.charAt(i) == '"') i++; // cerrar comilla
                spans.add(new StyleSpan(start, i, "string"));
                continue;
            } else if (OPERATORS.contains(c)) {
                // Operadores individuales (pueden ser múltiples caracteres como "==", pero aquí tratamos uno a uno)
                int start = i;
                i++;
                spans.add(new StyleSpan(start, i, "operator"));
                continue;
            } else if (c == '/' && i + 1 < text.length() && text.charAt(i+1) == '/') {
                // Comentario de línea
                int start = i;
                while (i < text.length() && text.charAt(i) != '\n') i++;
                spans.add(new StyleSpan(start, i, "comment"));
                continue;
            } else if (c == '/' && i + 1 < text.length() && text.charAt(i+1) == '*') {
                // Comentario bloque
                int start = i;
                i += 2;
                while (i < text.length() && !(text.charAt(i-1) == '*' && text.charAt(i) == '/')) i++;
                if (i < text.length()) i++; // cerrar */
                spans.add(new StyleSpan(start, i, "comment"));
                continue;
            } else {
                // Caracteres normales (no estilizados)
                i++;
            }
        }

        // Crear los StyleSpans
        StyleSpansBuilder<Collection<String>> builder = new StyleSpansBuilder<>();
        int lastEnd = 0;
        for (StyleSpan span : spans) {
            if (span.start > lastEnd) {
                builder.add(Collections.emptyList(), span.start - lastEnd);
            }
            builder.add(Collections.singleton(span.styleClass), span.end - span.start);
            lastEnd = span.end;
        }
        if (lastEnd < text.length()) {
            builder.add(Collections.emptyList(), text.length() - lastEnd);
        }
        StyleSpans<Collection<String>> styleSpans = builder.create();

        // Aplicar en el hilo de JavaFX
        Platform.runLater(() -> {
            if (text.equals(codeArea.getText())) {
                codeArea.setStyleSpans(0, styleSpans);
            }
        });
    }

    private static class StyleSpan {
        int start, end;
        String styleClass;
        StyleSpan(int start, int end, String styleClass) {
            this.start = start;
            this.end = end;
            this.styleClass = styleClass;
        }
    }
}