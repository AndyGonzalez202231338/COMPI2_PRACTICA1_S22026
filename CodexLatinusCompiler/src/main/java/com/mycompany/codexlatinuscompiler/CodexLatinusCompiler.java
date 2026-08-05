package com.mycompany.codexlatinuscompiler;

import com.mycompany.codexlatinuscompiler.errors.ErrorListenerConsola;
import com.mycompany.codexlatinuscompiler.lexerparser.CodexLatinusLexer;
import com.mycompany.codexlatinuscompiler.lexerparser.CodexLatinusParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.nio.file.Path;

public class CodexLatinusCompiler {

    public static void main(String[] args) {
        String path = args.length > 0 ? args[0] : "test-files/ejemplo1.lat";

        try {
            CharStream input = CharStreams.fromFileName(path);

            CodexLatinusLexer lexer = new CodexLatinusLexer(input);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new ErrorListenerConsola());

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            CodexLatinusParser parser = new CodexLatinusParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new ErrorListenerConsola());

            // Cambia "programa" por el nombre real de tu regla de entrada
            ParseTree arbol = parser.programa();

            System.out.println("=== Árbol sintáctico (LISP-style) ===");
            System.out.println(arbol.toStringTree(parser));

        } catch (java.io.IOException e) {
            System.err.println("No se pudo leer el archivo: " + path);
            e.printStackTrace();
        }
    }
}