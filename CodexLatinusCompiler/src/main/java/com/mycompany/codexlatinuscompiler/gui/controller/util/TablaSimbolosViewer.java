/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.gui.controller.util;


import com.mycompany.codexlatinuscompiler.symboltable.Scope;
import com.mycompany.codexlatinuscompiler.symboltable.Simbolo;
import com.mycompany.codexlatinuscompiler.symboltable.TablaSimbolos;
import com.mycompany.codexlatinuscompiler.symboltable.TablaTipos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableCell;
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

    public static TreeTableView<Fila> crear(TablaSimbolos tabla, TablaTipos tipos) {
        Fila raizFila = new Fila("Codex Latinus", "", "Programa", "", "");
        TreeItem<Fila> raiz = new TreeItem<>(raizFila);
               raiz.setExpanded(true);

        // ---- Sección: Estructuras (TablaTipos) ----
        if (tipos != null && !tipos.todas().isEmpty()) {
            TreeItem<Fila> nodoStructs = new TreeItem<>(
                    new Fila("📦 Estructuras", "", "Sección", "", tipos.todas().size() + " definida(s)")
            );
            nodoStructs.setExpanded(true);
            for (Simbolo structDef : tipos.todas()) {
                nodoStructs.getChildren().add(construirNodoStruct(structDef));
            }
            raiz.getChildren().add(nodoStructs);
        }

        // ---- Sección: Ámbito global y sus hijos ----
        TreeItem<Fila> nodoGlobal = construirNodoScope(tabla.getScopeGlobal(), "Ámbito global");
        raiz.getChildren().add(nodoGlobal);

        TreeTableView<Fila> treeTable = new TreeTableView<>(raiz);
        treeTable.setShowRoot(true);

        TreeTableColumn<Fila, String> colElemento = new TreeTableColumn<>("Elemento");
        colElemento.setCellValueFactory(new TreeItemPropertyValueFactory<>("elemento"));
        colElemento.setPrefWidth(240);

        TreeTableColumn<Fila, String> colTipo = new TreeTableColumn<>("Tipo");
        colTipo.setCellValueFactory(new TreeItemPropertyValueFactory<>("tipo"));
        colTipo.setPrefWidth(100);
                TreeTableColumn<Fila, String> colCategoria = new TreeTableColumn<>("Categoría");
        colCategoria.setCellValueFactory(new TreeItemPropertyValueFactory<>("categoria"));
        colCategoria.setPrefWidth(90);

        TreeTableColumn<Fila, String> colLinea = new TreeTableColumn<>("Línea");
        colLinea.setCellValueFactory(new TreeItemPropertyValueFactory<>("linea"));
        colLinea.setPrefWidth(55);

        TreeTableColumn<Fila, String> colDetalle = new TreeTableColumn<>("Detalles");
        colDetalle.setCellValueFactory(new TreeItemPropertyValueFactory<>("detalle"));
        colDetalle.setPrefWidth(320);
        colDetalle.setCellFactory(col -> celdaConWrap());

        treeTable.getColumns().setAll(colElemento, colTipo, colCategoria, colLinea, colDetalle);
        treeTable.setColumnResizePolicy(TreeTableView.CONSTRAINED_RESIZE_POLICY);
        return treeTable;
    }
    
        /** Celda con texto que hace wrap en vez de truncarse con "...". */
    private static TreeTableCell<Fila, String> celdaConWrap() {
        return new TreeTableCell<>() {
            private final Label label = new Label();
            {
                label.setWrapText(true);
                label.maxWidthProperty().bind(widthProperty().subtract(10));
            }
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setGraphic(null);
                } else {
                    label.setText(item);
                    setGraphic(label);
                }
            }
        };
    }

    private static TreeItem<Fila> construirNodoStruct(Simbolo structDef) {
        Fila fila = new Fila("+ " + structDef.nombre, "", "Struct", String.valueOf(structDef.linea),
                (structDef.atributosStruct != null ? structDef.atributosStruct.size() : 0) + " atributo(s)");
        TreeItem<Fila> nodo = new TreeItem<>(fila);

        if (structDef.atributosStruct != null) {
            for (Simbolo attr : structDef.atributosStruct) {
                String cat = attr.esArreglo ? "Atributo (arreglo)" : "Atributo";
                nodo.getChildren().add(new TreeItem<>(
                        new Fila("🔹 " + attr.nombre, attr.tipo, cat, String.valueOf(attr.linea), "")
                ));
            }
        }
        return nodo;
    }
    
     private static TreeItem<Fila> construirNodoScope(Scope scope, String nombreMostrado) {
        Fila header = new Fila("📁 " + nombreMostrado, "", "Ámbito", "", "");
        TreeItem<Fila> nodo = new TreeItem<>(header);
        nodo.setExpanded(true);

        // Indexa los scopes hijos que pertenecen a una función por su nombre,
        // para poder colgarlos directamente de la fila de esa función
        Map<String, Scope> scopesPorFuncion = new HashMap<>();
        List<Scope> scopesNoFuncion = new ArrayList<>();
        for (Scope hijo : scope.getHijos()) {
            String desc = hijo.getDescripcion();
            if (desc != null && desc.startsWith("Función: ")) {
                scopesPorFuncion.put(desc.substring("Función: ".length()), hijo);
            } else {
                scopesNoFuncion.add(hijo);
            }
        }

        for (Simbolo s : scope.simbolosLocales()) {
            TreeItem<Fila> filaSimbolo = new TreeItem<>(filaDeSimbolo(s));
            if (s.esFuncion && scopesPorFuncion.containsKey(s.nombre)) {
                Scope scopeFuncion = scopesPorFuncion.remove(s.nombre);
                agregarHijosDeScope(filaSimbolo, scopeFuncion);
                filaSimbolo.setExpanded(false); // colapsado por defecto
            }
            nodo.getChildren().add(filaSimbolo);
        }

        for (Scope hijo : scopesNoFuncion) {
            if (esScopeVacio(hijo)) continue; // oculta bloques sin nada dentro
            String etiqueta = hijo.getDescripcion() != null ? hijo.getDescripcion() : "Bloque";
            nodo.getChildren().add(construirNodoScope(hijo, etiqueta));
        }

        return nodo;
    }
     
    private static void agregarHijosDeScope(TreeItem<Fila> nodoDestino, Scope scope) {
        for (Simbolo s : scope.simbolosLocales()) {
            nodoDestino.getChildren().add(new TreeItem<>(filaDeSimbolo(s)));
        }
        for (Scope hijo : scope.getHijos()) {
            if (esScopeVacio(hijo)) continue;
            String etiqueta = hijo.getDescripcion() != null ? hijo.getDescripcion() : "Bloque";
            nodoDestino.getChildren().add(construirNodoScope(hijo, etiqueta));
        }
    }
    
    private static boolean esScopeVacio(Scope scope) {
        return scope.simbolosLocales().isEmpty()
            && scope.getHijos().stream().allMatch(TablaSimbolosViewer::esScopeVacio);
    }

    private static Fila filaDeSimbolo(Simbolo s) {
        String icono;
        String categoria;
        if (s.esFuncion) { icono = "🔧"; categoria = "Función"; }
        else if (s.esArreglo) { icono = "[]"; categoria = "Arreglo"; }
        else if (s.esParametro) { icono = "🔸"; categoria = "Parámetro"; } // 👈 nuevo
        else { icono = "🔹"; categoria = "Variable"; }

        String detalle = "";
        if (s.esArreglo) {
            detalle = "tamaño: " + (s.tamanoArreglo != null ? s.tamanoArreglo : "no evaluable en compilación");
        }
        if (s.esFuncion) {
            String params = (s.parametros == null || s.parametros.isEmpty()) ? "" :
                s.parametros.stream().map(p -> p.tipo + " " + p.nombre)
                    .reduce((a, b) -> a + ", " + b).orElse("");
            detalle = "(" + params + ") -> " + (s.tipoRetorno != null ? s.tipoRetorno : "actio (sin retorno)");
        }

        return new Fila(icono + " " + s.nombre, s.tipo, categoria, String.valueOf(s.linea), detalle);
    }
}