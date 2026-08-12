/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.gui.view;

import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javafx.application.Platform;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;
import com.mycompany.codexlatinuscompiler.highlight.HighlightLexer;

/**
 *
 * @author andy
 */
public class SyntaxHighlighter {

    private final CodeArea codeArea;
    private final ExecutorService executor = Executors.newSingleThreadExecutor(r -> {
        Thread t = new Thread(r, "highlight-thread");
        t.setDaemon(true);
        return t;
    });
    private Future<?> pendingTask;

    public SyntaxHighlighter(CodeArea codeArea) {
        this.codeArea = codeArea;
    }

    public void requestHighlight(String text) {
        if (pendingTask != null) pendingTask.cancel(true);
        pendingTask = executor.submit(() -> computeAndApply(text));
    }

    private void computeAndApply(String text) {
        StyleSpans<java.util.Collection<String>> spans = computeHighlighting(text);
        Platform.runLater(() -> {
            if (text.equals(codeArea.getText())) {
                codeArea.setStyleSpans(0, spans);
            }
        });
    }

    private StyleSpans<java.util.Collection<String>> computeHighlighting(String text) {
        StyleSpansBuilder<java.util.Collection<String>> builder = new StyleSpansBuilder<>();

        HighlightLexer lexer = new HighlightLexer(CharStreams.fromString(text));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        int lastEnd = 0;
        for (Token token : tokens.getTokens()) {
            if (token.getType() == Token.EOF) continue;
            int start = token.getStartIndex();
            int end = token.getStopIndex() + 1;
            if (start < lastEnd || start < 0) continue;

            if (start > lastEnd) {
                builder.add(Collections.emptyList(), start - lastEnd);
            }
            builder.add(Collections.singleton(styleClassFor(token.getType())), end - start);
            lastEnd = end;
        }
        if (lastEnd < text.length()) {
            builder.add(Collections.emptyList(), text.length() - lastEnd);
        }
        if (text.isEmpty()) {
            builder.add(Collections.emptyList(), 0);
        }
        return builder.create();
    }

    private String styleClassFor(int type) {
        if (type == HighlightLexer.LINE_COMMENT || type == HighlightLexer.BLOCK_COMMENT) return "comment";
        if (type == HighlightLexer.STRING || type == HighlightLexer.CHAR_LIT)             return "string";
        if (type == HighlightLexer.KEYWORD)                                               return "keyword";
        if (type == HighlightLexer.TYPE)                                                  return "type";
        if (type == HighlightLexer.BOOL_LIT)                                              return "boolean";
        if (type == HighlightLexer.NUMBER)                                                return "number";
        if (type == HighlightLexer.OP)                                                    return "operator";
        if (type == HighlightLexer.PUNCT)                                                 return "punct";
        if (type == HighlightLexer.IDENTIFIER)                                            return "identifier";
        return "default-text";
    }

    public void shutdown() {
        executor.shutdownNow();
    }
}