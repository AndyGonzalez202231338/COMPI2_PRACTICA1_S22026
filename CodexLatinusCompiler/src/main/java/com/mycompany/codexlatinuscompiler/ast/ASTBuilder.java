/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.ast;

import com.mycompany.codexlatinuscompiler.lexerparser.CodexLatinusBaseVisitor;
import com.mycompany.codexlatinuscompiler.lexerparser.CodexLatinusParser.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author andy
 */
public class ASTBuilder extends CodexLatinusBaseVisitor<NodoAST> {
    /*****  PROGRAMA *****/
    @Override
    public NodoAST visitPrograma(ProgramaContext ctx) {
        NodoPrograma nodo = new NodoPrograma();
        nodo.linea = ctx.getStart().getLine();

        nodo.variablesGlobales = new ArrayList<>();
        if (ctx.seccionVariables() != null) {
            for (var decl : ctx.seccionVariables().declaracion()) {
                nodo.variablesGlobales.add((NodoDeclaracion) visit(decl));
            }
        }

        nodo.funciones = new ArrayList<>();
        if (ctx.seccionFunciones() != null) {
            for (var f : ctx.seccionFunciones().funcion()) {
                nodo.funciones.add((NodoFuncion) visit(f));
            }
        }

        nodo.sentenciasPrincipal = new ArrayList<>();
        for (var s : ctx.seccionPrincipal().sentencia()) {
            nodo.sentenciasPrincipal.add(visit(s));
        }

        return nodo;
    }
    
    /*****  DECLARACIONES *****/
    
    @Override
    public NodoAST visitDeclaracionVariable(DeclaracionVariableContext ctx) {
        //ESTO ID COLON tipoPrimitivo expresion? SEMI
        NodoDeclaracionVariable nodo = new NodoDeclaracionVariable();
        nodo.linea = ctx.getStart().getLine();
        nodo.nombre = ctx.ID().getText();

        if (ctx.tipoPrimitivo() != null) {
            String tipoTexto = ctx.tipoPrimitivo().getText();
            nodo.tipo = tipoTexto.equals("bool") ? "booleano" : tipoTexto;
            if (ctx.expresion() != null) {
                nodo.valorInicial = visit(ctx.expresion());
            }
        } else {
            nodo.tipo = "booleano";
            NodoLiteral lit = new NodoLiteral();
            lit.linea = ctx.getStart().getLine();
            lit.tipoInferido = "booleano";
            lit.valor = ctx.VERUM() != null;
            nodo.valorInicial = lit;
        }

        return nodo;
    }
    
    @Override
    public NodoAST visitDeclaracionArray(DeclaracionArrayContext ctx) {
        //SERIES ID LBRACK expresion RBRACK COLON tipo (LBRACE listaExpresiones RBRACE)? SEMI
        NodoDeclaracionArray nodo = new NodoDeclaracionArray();
        nodo.linea = ctx.getStart().getLine();
        nodo.nombre = ctx.ID().getText();
        nodo.tipo = ctx.tipo() != null ? normalizarTipo(ctx.tipo().getText()) : null;
        nodo.tamano = visit(ctx.expresion());
        nodo.valoresIniciales = null;
        if (ctx.listaValoresArray() != null) {
            nodo.valoresIniciales = new ArrayList<>();
            for (var v : ctx.listaValoresArray().valorArrayElemento()) {
                nodo.valoresIniciales.add(
                    v.literalEstructura() != null ? visit(v.literalEstructura()) : visit(v.expresion())
                );
            }
        }
        return nodo;
    }

    @Override
    public NodoAST visitDeclaracionStructDef(DeclaracionStructDefContext ctx) {
        //STRUCTURA ID LBRACE listaAtributos RBRACE FINIS_SENTENCIAS SEMI
        NodoDeclaracionStructDef nodo = new NodoDeclaracionStructDef();
        nodo.linea = ctx.getStart().getLine();
        nodo.nombre = ctx.ID().getText();
        nodo.atributos = new ArrayList<>();

        for (var a : ctx.listaAtributos().atributo()) {
            NodoAtributoStruct attr = new NodoAtributoStruct();
            attr.linea = a.getStart().getLine();
            attr.nombre = a.ID().getText();
            attr.esArreglo = a.SERIES() != null;
            attr.tipo = normalizarTipo(a.tipo().getText());
            nodo.atributos.add(attr);
        }
        return nodo;
    }

    @Override
    public NodoAST visitDeclaracionStructVar(DeclaracionStructVarContext ctx) {
        // ESTO ID COLON ID literalEstructura SEMI?
        NodoDeclaracionStructVar nodo = new NodoDeclaracionStructVar();
        nodo.linea = ctx.getStart().getLine();
        nodo.nombre = ctx.ID(0).getText();
        nodo.tipoStruct = ctx.ID(1).getText();
        nodo.valores = ctx.literalEstructura() != null ? (NodoLiteralEstructura) visit(ctx.literalEstructura()) : null;
        return nodo;
    }
    
    @Override
    public NodoAST visitLiteralEstructura(LiteralEstructuraContext ctx) {
        // LBRACE listaAsignAtributos RBRACE
        NodoLiteralEstructura nodo = new NodoLiteralEstructura();
        nodo.linea = ctx.getStart().getLine();
        nodo.asignaciones = new ArrayList<>();

        for (var a : ctx.listaAsignAtributos().asignAtributo()) {
            nodo.asignaciones.add((NodoAsignAtributo) visit(a));
        }
        return nodo;
    }

    @Override
    public NodoAST visitAsignAtributo(AsignAtributoContext ctx) {
        /**
         * asignAtributo
         *  : ID COLON valorAtributo
         *  ;
         */
        NodoAsignAtributo nodo = new NodoAsignAtributo();
        nodo.linea = ctx.getStart().getLine();
        nodo.nombreAtributo = ctx.ID().getText(); // único ID de esta regla
        
        /**
         * valorAtributo
         *   : expresion                    
         *   | literalEstructura             
         *   | ID LBRACK expresion RBRACK    
         *   ;
         */
        ValorAtributoContext val = ctx.valorAtributo();

        if (val.expresion() != null && val.ID() == null) {
            // caso: nombre: "Perro"
            nodo.valor = visit(val.expresion());
        } else if (val.literalEstructura() != null) {
            // caso: subestructura anidada literal
            nodo.valor = visit(val.literalEstructura());
        } else if (val.ID() != null) {
            // caso: animales: Animal[7]
            nodo.tipoArregloReferenciado = val.ID().getText();
            nodo.tamanoArreglo = visit(val.expresion());
        }

        return nodo;
    }
    
    /*****  SENTENCIAS  *****/
    @Override
    public NodoAST visitAsignacion(AsignacionContext ctx) {
        // accesoAsignable ASSIGN (expresion | literalEstructura) SEMI
        NodoAsignacion nodo = new NodoAsignacion();
        nodo.linea = ctx.getStart().getLine();
        nodo.destino = visit(ctx.accesoAsignable());
        nodo.valor = ctx.literalEstructura() != null
                ? visit(ctx.literalEstructura())
                : visit(ctx.expresion());
        return nodo;
    }

    @Override
    public NodoAST visitAccesoAsignable(AccesoAsignableContext ctx) {
        // ID (LBRACK expresion RBRACK)? (DOT ID (LBRACK expresion RBRACK)?)*
        var children = ctx.children;
        int i = 0;

        NodoIdentificador base = new NodoIdentificador();
        base.linea = ctx.getStart().getLine();
        base.nombre = children.get(i).getText();
        i++;
        NodoAST actual = base;

        if (i < children.size() && children.get(i).getText().equals("[")) {
            i++;
            NodoAccesoArreglo arr = new NodoAccesoArreglo();
            arr.linea = ctx.getStart().getLine();
            arr.base = actual;
            arr.indice = visit(children.get(i));
            i += 2; // expresion + ]
            actual = arr;
        }

        while (i < children.size() && children.get(i).getText().equals(".")) {
            i++; // .
            String nombreAtributo = children.get(i).getText();
            i++;
            NodoAccesoAtributo attr = new NodoAccesoAtributo();
            attr.linea = ctx.getStart().getLine();
            attr.base = actual;
            attr.nombreAtributo = nombreAtributo;
            actual = attr;

            if (i < children.size() && children.get(i).getText().equals("[")) {
                i++;
                NodoAccesoArreglo arr = new NodoAccesoArreglo();
                arr.linea = ctx.getStart().getLine();
                arr.base = actual;
                arr.indice = visit(children.get(i));
                i += 2;
                actual = arr;
            }
        }

        return actual;
    }

    @Override
    public NodoAST visitCondicional(CondicionalContext ctx) {
        /**
         * condicional
            : SI LPAREN expresion RPAREN bloque
              (ALITER LPAREN expresion RPAREN bloque)*
              (ALITER bloque)?
              FINIS_SENTENCIAS SEMI
            ;
         */
        NodoSi nodo = new NodoSi();
        nodo.linea = ctx.getStart().getLine();

        var condiciones = ctx.expresion();
        var bloques = ctx.bloque();

        nodo.condicion = visit(condiciones.get(0));
        nodo.bloqueSi = visitarBloque(bloques.get(0).sentencia());

        nodo.ramasAliter = new ArrayList<>();
        int numAliterCond = condiciones.size() - 1;
        for (int i = 1; i <= numAliterCond; i++) {
            NodoAliterIf rama = new NodoAliterIf();
            rama.linea = ctx.getStart().getLine();
            rama.condicion = visit(condiciones.get(i));
            rama.bloque = visitarBloque(bloques.get(i).sentencia());
            nodo.ramasAliter.add(rama);
        }

        boolean tieneAliterFinal = bloques.size() > condiciones.size();
        nodo.bloqueAliterFinal = tieneAliterFinal
                ? visitarBloque(bloques.get(bloques.size() - 1).sentencia())
                : null;

        return nodo;
    }

    @Override
    public NodoAST visitCicloDum(CicloDumContext ctx) {
        // DUM LPAREN expresion RPAREN LBRACE sentencia* RBRACE FINIS_SENTENCIAS SEMI
        NodoDum nodo = new NodoDum();
        nodo.linea = ctx.getStart().getLine();
        nodo.condicion = visit(ctx.expresion());
        nodo.cuerpo = visitarBloque(ctx.sentencia());
        return nodo;
    }

    @Override
    public NodoAST visitCicloFacere(CicloFacereContext ctx) {
        // FACERE LBRACE sentencia* RBRACE DUM LPAREN expresion RPAREN SEMI
        NodoFacere nodo = new NodoFacere();
        nodo.linea = ctx.getStart().getLine();
        nodo.cuerpo = visitarBloque(ctx.sentencia());
        nodo.condicion = visit(ctx.expresion());
        return nodo;
    }

    @Override
    public NodoAST visitCicloPer(CicloPerContext ctx) {
        // PER LPAREN declaracionVariable expresion SEMI expresion RPAREN LBRACE sentencia* RBRACE
        NodoPer nodo = new NodoPer();
        nodo.linea = ctx.getStart().getLine();
        nodo.inicializacion = (NodoDeclaracionVariable) visit(ctx.declaracionVariable());
        nodo.condicion = visit(ctx.expresion());
        nodo.incremento = visit(ctx.incrementoPer());
        nodo.cuerpo = visitarBloque(ctx.sentencia());
        return nodo;
    }
    
    @Override
    public NodoAST visitIncrementoPer(IncrementoPerContext ctx) {
        if (ctx.ASSIGN() != null) {
            NodoAsignacion nodo = new NodoAsignacion();
            nodo.linea = ctx.getStart().getLine();
            nodo.destino = visit(ctx.accesoAsignable());
            nodo.valor = visit(ctx.expresion());
            return nodo;
        }
        return visit(ctx.expresionUnaria());
    }

    @Override
    public NodoAST visitLectura(LecturaContext ctx) {
        // LEER (ID)? SEMI
        NodoLectura nodo = new NodoLectura();
        nodo.linea = ctx.getStart().getLine();
        nodo.nombreVariable = ctx.ID() != null ? ctx.ID().getText() : null;
        return nodo;
    }

    @Override
    public NodoAST visitEscritura(EscrituraContext ctx) {
        // ESCRIBIR (expresion (ESCRIBIR expresion)*) SEMI
        NodoEscritura nodo = new NodoEscritura();
        nodo.linea = ctx.getStart().getLine();
        nodo.valores = new ArrayList<>();
        for (var e : ctx.expresion()) {
            nodo.valores.add(visit(e));
        }
        return nodo;
    }

    // Helper reutilizable para convertir List<SentenciaContext> -> List<NodoAST>
    private List<NodoAST> visitarBloque(List<SentenciaContext> sentencias) {
        List<NodoAST> resultado = new ArrayList<>();
        for (var s : sentencias) {
            resultado.add(visit(s));
        }
        return resultado;
    }
    
    /*****  FUNCIONES   *****/
    @Override
    public NodoAST visitFuncion(FuncionContext ctx) {
        /**
         * funcion
         *   : ACTIO ID LPAREN listaParametros? RPAREN LBRACE
         *       (VARIABILES_LOCAL_HDR declaracion* RBRACK)?
         *       sentencia*
         *     RBRACE FINIS_SENTENCIAS SEMI
         *   | RATIO tipo ID LPAREN listaParametros? RPAREN LBRACE
         *       (VARIABILES_LOCAL_HDR declaracion* RBRACK)?
         *       sentencia*
         *     RBRACE FINIS_SENTENCIAS SEMI
         *   ;
         * 
         */

        NodoFuncion nodo = new NodoFuncion();
            nodo.linea = ctx.getStart().getLine();
            nodo.nombre = ctx.ID().getText();
            nodo.parametros = new ArrayList<>();

            if (ctx.listaParametros() != null) {
                for (var p : ctx.listaParametros().parametro()) {
                    NodoParametro param = new NodoParametro();
                    param.linea = p.getStart().getLine();
                    param.nombre = p.ID().getText();
                    param.tipo = normalizarTipo(p.tipo().getText());
                    nodo.parametros.add(param);
                }
            }

            nodo.variablesLocales = new ArrayList<>();
            if (ctx.declaracion() != null) {
                for (var d : ctx.declaracion()) {
                    nodo.variablesLocales.add((NodoDeclaracion) visit(d));
                }
            }

            nodo.cuerpo = visitarBloque(ctx.sentencia());
            nodo.tipoRetorno = ctx.RATIO() != null ? normalizarTipo(ctx.tipo().getText()) : null;

            return nodo;
    }
    
    @Override
    public NodoAST visitRetorno(RetornoContext ctx) {
        NodoRetorno nodo = new NodoRetorno();
        nodo.linea = ctx.getStart().getLine();
        nodo.valor = visit(ctx.expresion());
        return nodo;
    }
   
    @Override
    public NodoAST visitLlamadaFuncion(LlamadaFuncionContext ctx) {
        // ID LPAREN listaExpresiones? RPAREN
        NodoLlamadaFuncion nodo = new NodoLlamadaFuncion();
        nodo.linea = ctx.getStart().getLine();
        nodo.nombre = ctx.ID().getText();
        nodo.argumentos = new ArrayList<>();
        if (ctx.listaExpresiones() != null) {
            for (var e : ctx.listaExpresiones().expresion()) {
                nodo.argumentos.add(visit(e));
            }
        }
        return nodo;
    }
    
    /*****  EXPRESIONES *****/
    @Override
    public NodoAST visitExpresionLogica(ExpresionLogicaContext ctx) {
        return construirBinaria(ctx.expresionRelacional(), ctx);
    }

    @Override
    public NodoAST visitExpresionRelacional(ExpresionRelacionalContext ctx) {
        return construirBinaria(ctx.expresionAditiva(), ctx);
    }

    @Override
    public NodoAST visitExpresionAditiva(ExpresionAditivaContext ctx) {
        return construirBinaria(ctx.expresionMultiplicativa(), ctx);
    }

    @Override
    public NodoAST visitExpresionMultiplicativa(ExpresionMultiplicativaContext ctx) {
        return construirBinaria(ctx.expresionUnaria(), ctx);
    }

    // Genérico: si hay 1 solo hijo relevante, propaga; si hay más, arma binarios encadenados
    private NodoAST construirBinaria(List<? extends org.antlr.v4.runtime.tree.ParseTree> operandos,
                                      org.antlr.v4.runtime.ParserRuleContext ctx) {
        NodoAST izquierda = visit(operandos.get(0));
        for (int i = 1; i < operandos.size(); i++) {
            NodoBinaria bin = new NodoBinaria();
            bin.linea = ctx.getStart().getLine();
            bin.operador = ctx.getChild(2 * i - 1).getText(); // el token operador entre operandos
            bin.izquierda = izquierda;
            bin.derecha = visit(operandos.get(i));
            izquierda = bin;
        }
        return izquierda;
    }

    @Override
    public NodoAST visitExpresionUnaria(ExpresionUnariaContext ctx) {
        if (ctx.NON() != null) {
            NodoUnaria nodo = new NodoUnaria();
            nodo.linea = ctx.getStart().getLine();
            nodo.operador = "non";
            nodo.esPrefijo = true;
            nodo.operando = visit(ctx.expresionUnaria());
            return nodo;
        }
        
        if (ctx.MINUS() != null) {
            NodoUnaria nodo = new NodoUnaria();
            nodo.linea = ctx.getStart().getLine();
            nodo.operador = "-";
            nodo.esPrefijo = true;
            nodo.operando = visit(ctx.expresionUnaria());
            return nodo;
        }

        if (ctx.INC() != null || ctx.DEC() != null) {
            NodoUnaria nodo = new NodoUnaria();
            nodo.linea = ctx.getStart().getLine();

            boolean esPrefijo = ctx.getChild(0).getText().equals("++")
                              || ctx.getChild(0).getText().equals("--");

            nodo.esPrefijo = esPrefijo;
            nodo.operador = esPrefijo ? ctx.getChild(0).getText() : ctx.getChild(1).getText();
            nodo.operando = visit(ctx.primario());
            return nodo;
        }

        return visit(ctx.primario());
    }

    @Override
    public NodoAST visitPrimario(PrimarioContext ctx) {
        if (ctx.expresion() != null) return visit(ctx.expresion());
        if (ctx.llamadaFuncion() != null) return visit(ctx.llamadaFuncion());
        if (ctx.accesoAsignable() != null) return visit(ctx.accesoAsignable());

        NodoLiteral nodo = new NodoLiteral();
        nodo.linea = ctx.getStart().getLine();

        if (ctx.NUM_LIT() != null) {
            nodo.valor = Integer.parseInt(ctx.NUM_LIT().getText());
            nodo.tipoInferido = "numerus";
        } else if (ctx.DEC_LIT() != null) {
            nodo.valor = Double.parseDouble(ctx.DEC_LIT().getText());
            nodo.tipoInferido = "decimalis";
        } else if (ctx.TEXTO_LIT() != null) {
            String texto = ctx.TEXTO_LIT().getText();
            nodo.valor = texto.substring(1, texto.length() - 1); // quita comillas
            nodo.tipoInferido = "textum";
        } else if (ctx.CHAR_LIT() != null) {
            nodo.valor = ctx.CHAR_LIT().getText().charAt(1);
            nodo.tipoInferido = "littera";
        } else if (ctx.VERUM() != null) {
            nodo.valor = true;
            nodo.tipoInferido = "booleano";
        } else if (ctx.FALSUS() != null) {
            nodo.valor = false;
            nodo.tipoInferido = "booleano";
        }
        return nodo;
    }   
    
    @Override
    public NodoAST visitSentencia(SentenciaContext ctx) {
        if (ctx.declaracion() != null)     return visit(ctx.declaracion());
        if (ctx.asignacion() != null)      return visit(ctx.asignacion());
        if (ctx.llamadaFuncion() != null)  return visit(ctx.llamadaFuncion());
        if (ctx.expresionUnaria() != null) return visit(ctx.expresionUnaria());
        if (ctx.condicional() != null)     return visit(ctx.condicional());
        if (ctx.cicloDum() != null)        return visit(ctx.cicloDum());
        if (ctx.cicloFacere() != null)     return visit(ctx.cicloFacere());
        if (ctx.cicloPer() != null)        return visit(ctx.cicloPer());
        if (ctx.lectura() != null)         return visit(ctx.lectura());
        if (ctx.escritura() != null)       return visit(ctx.escritura());
        if (ctx.retorno() != null) return visit(ctx.retorno());

        if (ctx.PERGE() != null) {
            NodoPerge nodo = new NodoPerge();
            nodo.linea = ctx.getStart().getLine();
            return nodo;
        }
        if (ctx.INTERRUMPE() != null) {
            NodoInterrumpe nodo = new NodoInterrumpe();
            nodo.linea = ctx.getStart().getLine();
            return nodo;
        }

        return null; // no debería llegar aquí si la gramática está bien cubierta
    }
    
    private String normalizarTipo(String texto) {
        return texto.equals("bool") ? "booleano" : texto;
    }
    
}
