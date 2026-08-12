package com.mycompany.codexlatinuscompiler;

import com.mycompany.codexlatinuscompiler.ast.ASTBuilder;
import com.mycompany.codexlatinuscompiler.ast.NodoPrograma;
import com.mycompany.codexlatinuscompiler.errors.ErrorListenerConsola;
import com.mycompany.codexlatinuscompiler.lexerparser.CodexLatinusLexer;
import com.mycompany.codexlatinuscompiler.lexerparser.CodexLatinusParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import com.mycompany.codexlatinuscompiler.gui.view.MainView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.nio.file.Path;

//public class CodexLatinusCompiler{
//
//    public static void main(String[] args) {
//        String path = args.length > 0 ? args[0] : "test-files/ejemplo1.lat";
//
//        try {
//            CharStream input = CharStreams.fromFileName(path);
//
//            CodexLatinusLexer lexer = new CodexLatinusLexer(input);
//            lexer.removeErrorListeners();
//            lexer.addErrorListener(new ErrorListenerConsola());
//
//            CommonTokenStream tokens = new CommonTokenStream(lexer);
//
//            CodexLatinusParser parser = new CodexLatinusParser(tokens);
//            parser.removeErrorListeners();
//            parser.addErrorListener(new ErrorListenerConsola());
//
//            // Cambia "programa" por el nombre real de tu regla de entrada
//            ParseTree arbol = parser.programa();
//            
//            ASTBuilder builder = new ASTBuilder();
//            NodoPrograma ast = (NodoPrograma) builder.visit(arbol);
//
//            System.out.println("=== Árbol sintáctico (LISP-style) ===");
//            System.out.println(arbol.toStringTree(parser));
//
//        } catch (java.io.IOException e) {
//            System.err.println("No se pudo leer el archivo: " + path);
//            e.printStackTrace();
//        }
//    }
//}

public class CodexLatinusCompiler extends Application {

    @Override
    public void start(Stage stage) {

        MainView mainView = new MainView();

        Scene scene = new Scene(mainView, 1200, 700);

        stage.setTitle("Codex Latinus Compiler");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}