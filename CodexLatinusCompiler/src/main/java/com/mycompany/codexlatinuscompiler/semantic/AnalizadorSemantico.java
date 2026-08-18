/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.semantic;

import com.mycompany.codexlatinuscompiler.ast.*;
import com.mycompany.codexlatinuscompiler.errors.*;
import com.mycompany.codexlatinuscompiler.symboltable.*;

import java.util.ArrayList;
/**
 *
 * @author andy
 */
public class AnalizadorSemantico {
    private final TablaSimbolos tabla = new TablaSimbolos();
    private final TablaTipos tipos = new TablaTipos();
    private final ManejadorErrores errores = new ManejadorErrores();
    private final AnalizadorContexto contexto = new AnalizadorContexto();

    private final AnalizadorFase1 fase1;
    private final AnalizadorFase2 fase2;
    private final AnalizadorFase3 fase3;
    private final AnalizadorFase4 fase4;
    private final AnalizadorFase5 fase5;

    public AnalizadorSemantico() {
        this.fase1 = new AnalizadorFase1(tabla, tipos, errores);
        this.fase2 = new AnalizadorFase2(tabla, tipos, errores, contexto);
        this.fase3 = new AnalizadorFase3(tabla, tipos, errores);
        this.fase4 = new AnalizadorFase4(tabla, tipos, errores);
        this.fase5 = new AnalizadorFase5(tabla, tipos, errores);
        
    }

    public void analizar(NodoPrograma programa) {
        fase1.analizar(programa);
        fase2.analizar(programa);
        fase3.analizar(programa);
        fase4.analizar(programa);
        fase5.analizar(programa);
        
        if (errores.tieneErrores()) {
            errores.imprimirTodos();
        }
    }
    

    public TablaSimbolos getTabla() {
        return tabla;
    }

    public TablaTipos getTipos() {
        return tipos;
    }

    public ManejadorErrores getErrores() {
        return errores;
    }
    
}
