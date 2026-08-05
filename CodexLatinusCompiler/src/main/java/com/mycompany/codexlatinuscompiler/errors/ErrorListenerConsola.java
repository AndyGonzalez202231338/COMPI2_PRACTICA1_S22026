/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.errors;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
/**
 *
 * @author andy
 */
public class ErrorListenerConsola extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                             int line, int charPositionInLine,
                             String msg, RecognitionException e) {
        System.err.println("Error sintáctico [línea " + line + ":" + charPositionInLine + "] " + msg);
    }
}
