/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.gui.controller.util;

import com.mycompany.codexlatinuscompiler.ast.NodoAST;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.parse.Parser;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
/**
 *
 * @author andy
 */
public class ASTGraphvizViewer {
    
    public static Node crearVistaAST(NodoAST ast) {
        // Convertir AST a formato DOT
        ASTToDotConverter converter = new ASTToDotConverter();
        String dot = converter.convertir(ast);
        // Generar imagen con Graphviz
        // scale() sube la resolución de renderizado; al expandir el árbol
        // (más nodesep/ranksep en el DOT) la imagen resultante es más grande,
        // así que renderizamos con más DPI para que no se vea borrosa al hacer zoom.
        BufferedImage image = Graphviz.fromString(dot)
                .scale(1.5)
                .render(Format.PNG)
                .toImage();
        // Convertir a Image de JavaFX
        Image fxImage = SwingFXUtils.toFXImage(image, null);
        ImageView imageView = new ImageView(fxImage);
        imageView.setPreserveRatio(true);
        // Envolver en ScrollPane para poder hacer zoom/scroll
        ScrollPane scrollPane = new ScrollPane(imageView);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        scrollPane.setStyle("-fx-background: #1e1e1e;");
        // Permitir zoom con Ctrl+Scroll
        // (opcional, lo dejamos para después)
        
        return scrollPane;
    }
}