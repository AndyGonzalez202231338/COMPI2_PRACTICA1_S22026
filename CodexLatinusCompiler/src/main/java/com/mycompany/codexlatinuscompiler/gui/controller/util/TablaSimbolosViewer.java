/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.gui.controller.util;


import com.mycompany.codexlatinuscompiler.symboltable.Scope;
import com.mycompany.codexlatinuscompiler.symboltable.Simbolo;
import com.mycompany.codexlatinuscompiler.symboltable.TablaSimbolos;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;

/**
 *
 * @author andy
 */
public class TablaSimbolosViewer {

    public static class Fila {
        private final SimpleStringProperty elemento;
        private final SimpleStringProperty tipo;
        private final SimpleStringProperty categoria;
        private final SimpleStringProperty linea;
        private final SimpleStringProperty detalle;

        public Fila(String elemento, String tipo, String categoria, String linea, String detalle) {
            this.elemento = new SimpleStringProperty(elemento);
            this.tipo = new SimpleStringProperty(tipo);
            this.categoria = new SimpleStringProperty(categoria);
            this.linea = new SimpleStringProperty(linea);
            this.detalle = new SimpleStringProperty(detalle);
        }

        public SimpleStringProperty elementoProperty() { return elemento; }
        public SimpleStringProperty tipoProperty() { return tipo; }
        public SimpleStringProperty categoriaProperty() { return categoria; }
        public SimpleStringProperty lineaProperty() { return linea; }
        public SimpleStringProperty detalleProperty() { return detalle; }
    }

    public static TreeTableView<Fila> crear(TablaSimbolos tabla) {
        TreeItem<Fila> raiz = construirNodoScope(tabla.getScopeGlobal(), "Global");
        raiz.setExpanded(true);

        TreeTableView<Fila> treeTable = new TreeTableView<>(raiz);
        treeTable.setShowRoot(true);

        TreeTableColumn<Fila, String> colElemento = new TreeTableColumn<>("Elemento");
        colElemento.setCellValueFactory(new TreeItemPropertyValueFactory<>("elemento"));
        colElemento.setPrefWidth(220);

        TreeTableColumn<Fila, String> colTipo = new TreeTableColumn<>("Tipo");
        colTipo.setCellValueFactory(new TreeItemPropertyValueFactory<>("tipo"));
        colTipo.setPrefWidth(100);

        TreeTableColumn<Fila, String> colCategoria = new TreeTableColumn<>("Categoría");
        colCategoria.setCellValueFactory(new TreeItemPropertyValueFactory<>("categoria"));
        colCategoria.setPrefWidth(100);

        TreeTableColumn<Fila, String> colLinea = new TreeTableColumn<>("Línea");
        colLinea.setCellValueFactory(new TreeItemPropertyValueFactory<>("linea"));
        colLinea.setPrefWidth(60);

        TreeTableColumn<Fila, String> colDetalle = new TreeTableColumn<>("Detalles");
        colDetalle.setCellValueFactory(new TreeItemPropertyValueFactory<>("detalle"));
        colDetalle.setPrefWidth(250);

        treeTable.getColumns().setAll(colElemento, colTipo, colCategoria, colLinea, colDetalle);
        return treeTable;
    }

    private static TreeItem<Fila> construirNodoScope(Scope scope, String nombreScope) {
        Fila header = new Fila("+" + nombreScope, "", "Ámbito", "", "");
        TreeItem<Fila> nodo = new TreeItem<>(header);
        nodo.setExpanded(true);

        for (Simbolo s : scope.simbolosLocales()) {
            nodo.getChildren().add(new TreeItem<>(filaDeSimbolo(s)));
        }
        for (Scope hijo : scope.getHijos()) {
            nodo.getChildren().add(construirNodoScope(hijo, "Scope #" + hijo.getId()));
        }
        return nodo;
    }

    private static Fila filaDeSimbolo(Simbolo s) {
        String icono;
        String categoria;
        if (s.esFuncion) { icono = "🔧"; categoria = "Función"; }
        else if (s.esStruct) { icono = "+"; categoria = "Struct"; }
        else if (s.esArreglo) { icono = "[]"; categoria = "Arreglo"; }
        else { icono = "🔹"; categoria = "Variable"; }

        String detalle = "";
        if (s.esArreglo) {
            detalle = "tamaño: " + (s.tamanoArreglo != null ? s.tamanoArreglo : "?");
        }
        if (s.esFuncion) {
            String params = s.parametros == null ? "" :
                s.parametros.stream().map(p -> p.tipo + " " + p.nombre)
                    .reduce((a, b) -> a + ", " + b).orElse("");
            detalle = "(" + params + ") -> " + (s.tipoRetorno != null ? s.tipoRetorno : "actio");
        }
        if (s.esStruct && s.atributosStruct != null) {
            detalle = s.atributosStruct.size() + " atributo(s)";
        }

        return new Fila(icono + " " + s.nombre, s.tipo, categoria,
                String.valueOf(s.linea), detalle);
    }
    
}
