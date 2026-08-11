/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler;

import com.mycompany.codexlatinuscompiler.ast.ASTBuilder;
import com.mycompany.codexlatinuscompiler.ast.NodoPrograma;
import com.mycompany.codexlatinuscompiler.errors.ErrorListenerConsola;
import com.mycompany.codexlatinuscompiler.lexerparser.CodexLatinusLexer;
import com.mycompany.codexlatinuscompiler.lexerparser.CodexLatinusParser;
import java.util.ArrayList;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author andy
 */
public class Compilador {

    public ResultadoCompilacion compilar(String codigoFuente) {
        ResultadoCompilacion resultado = new ResultadoCompilacion();
        resultado.erroresLexicos = new ArrayList<>();
        resultado.erroresSintacticos = new ArrayList<>();
        resultado.erroresSemanticos = new ArrayList<>();

        CharStream input = CharStreams.fromString(codigoFuente);

        CodexLatinusLexer lexer = new CodexLatinusLexer(input);
        ErrorListenerConsola lexerErrores = new ErrorListenerConsola();
        lexer.removeErrorListeners();
        lexer.addErrorListener(lexerErrores);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CodexLatinusParser parser = new CodexLatinusParser(tokens);
        ErrorListenerConsola parserErrores = new ErrorListenerConsola();
        parser.removeErrorListeners();
        parser.addErrorListener(parserErrores);

        ParseTree arbol = parser.programa();

        resultado.erroresLexicos.addAll(lexerErrores.getErrores());
        resultado.erroresSintacticos.addAll(parserErrores.getErrores());
        resultado.arbolTexto = arbol.toStringTree(parser);

        if (lexerErrores.tieneErrores() || parserErrores.tieneErrores()) {
            resultado.exitoso = false;
            return resultado; 
        }

        ASTBuilder builder = new ASTBuilder();
        resultado.ast = (NodoPrograma) builder.visit(arbol);

        // TODO: aquí luego conectamos AnalizadorSemantico y llenamos
        // resultado.erroresSemanticos; por ahora, si llegó hasta aquí, es válido.
        resultado.exitoso = true;

        return resultado;
    }
}
