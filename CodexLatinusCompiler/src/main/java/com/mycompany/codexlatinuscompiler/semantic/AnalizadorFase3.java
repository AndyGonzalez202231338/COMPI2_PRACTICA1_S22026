/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.semantic;

import com.mycompany.codexlatinuscompiler.ast.*;
import com.mycompany.codexlatinuscompiler.errors.ManejadorErrores;
import com.mycompany.codexlatinuscompiler.symboltable.*;

import java.util.List;

/**
 *
 * @author andy
 */
public class AnalizadorFase3 {
    
    private final TablaSimbolos tabla;
    private final TablaTipos tipos;
    private final ManejadorErrores errores;
    private EvaluadorConstantes evaluarConstante;

    public AnalizadorFase3(TablaSimbolos tabla, TablaTipos tipos, ManejadorErrores errores) {
        this.tabla = tabla;
        this.tipos = tipos;
        this.errores = errores;
    }
    
    public void analizar(NodoPrograma programa) {
        for (NodoDeclaracion d : programa.variablesGlobales) {
            verificarDeclaracion(d);
        }
        
        for (NodoFuncion f : programa.funciones) {
            verificarFuncion(f);
        }
        
        for (NodoAST sent : programa.sentenciasPrincipal) {
            verificarSentencia(sent);
        }
    }

    private void verificarFuncion(NodoFuncion f) {
        tabla.entrarScopeTemporal();

        for (NodoParametro p : f.parametros) {
            Simbolo s = new Simbolo();
            s.nombre = p.nombre;
            s.tipo = p.tipo;
            s.linea = p.linea;
            tabla.declarar(s);
        }

        for (NodoDeclaracion d : f.variablesLocales) {
            declararYVerificar(d);
        }

        for (NodoAST sent : f.cuerpo) {
            verificarSentencia(sent);
        }

        tabla.salirScope();
    }

    private void verificarSentencia(NodoAST nodo) {
        if (nodo == null) return;
        if (nodo instanceof NodoDeclaracion d) {
            declararYVerificar(d);
        } else if (nodo instanceof NodoAsignacion a) {
            verificarAsignacion(a);
        } else if (nodo instanceof NodoSi si) {
            verificarSi(si);
        } else if (nodo instanceof NodoDum d) {
            verificarCondicionBooleana(d.condicion, "dum");
            verificarBloque(d.cuerpo);
        } else if (nodo instanceof NodoFacere f) {
            verificarBloque(f.cuerpo);
            verificarCondicionBooleana(f.condicion, "facere...dum");
        } else if (nodo instanceof NodoPer p) {
            verificarPer(p);
        } else if (nodo instanceof NodoRetorno r) {
            verificarRetorno(r);
        } else if (nodo instanceof NodoEscritura e) {
            for (NodoAST v : e.valores) inferirTipo(v);
        } else if (nodo instanceof NodoLlamadaFuncion call) {
            verificarLlamadaFuncion(call);
        } else if (nodo instanceof NodoUnaria || nodo instanceof NodoBinaria) {
            inferirTipo(nodo);
        }
    }

    private void verificarBloque(List<NodoAST> sentencias) {
        if (sentencias == null || sentencias.isEmpty()) return;
        tabla.entrarScopeTemporal();
        for (NodoAST sent : sentencias) {
            verificarSentencia(sent);
        }
        tabla.salirScope();
    }

    private void verificarSi(NodoSi si) {
        verificarCondicionBooleana(si.condicion, "si");
        verificarBloque(si.bloqueSi);
        for (NodoAliterIf al : si.ramasAliter) {
            verificarCondicionBooleana(al.condicion, "aliter");
            verificarBloque(al.bloque);
        }
        if (si.bloqueAliterFinal != null) {
            verificarBloque(si.bloqueAliterFinal);
        }
    }

    private void verificarPer(NodoPer p) {
        tabla.entrarScopeTemporal();

        if (p.inicializacion != null) {
            Simbolo s = new Simbolo();
            s.nombre = p.inicializacion.nombre;
            s.tipo = p.inicializacion.tipo;
            s.linea = p.inicializacion.linea;
            tabla.declarar(s);

            if (p.inicializacion.valorInicial != null) {
                verificarDeclaracionVariable(p.inicializacion);
            }
        }

        verificarCondicionBooleana(p.condicion, "per");
        if (p.incremento != null) {
            if (p.incremento instanceof NodoAsignacion asigInc) {
                verificarAsignacion(asigInc);
            } else {
                inferirTipo(p.incremento);
            }
        }

        verificarBloque(p.cuerpo);

        tabla.salirScope();
    }
    /**
     * Analisis semantico: una variable en las condiciones solo puede ser booleana
     *                      no se permite usar un numerus o decimalis etc
     * @param condicion
     * @param contexto 
     */
    private void verificarCondicionBooleana(NodoAST condicion, String contexto) {
        if (condicion == null) return;
        String tipo = inferirTipo(condicion);
        if (tipo != null && !tipo.equals("booleano")) {
            errores.reportar("Corrupción de Flujo: la condición de '" + contexto +
                    "' debe ser estrictamente booleana (se encontró '" + tipo + "')",
                    condicion.linea);
        }
    }

    private void declararYVerificar(NodoDeclaracion decl) {
        if (decl instanceof NodoDeclaracionVariable d) {
            Simbolo s = new Simbolo();
            s.nombre = d.nombre;
            s.tipo = d.tipo;
            s.linea = d.linea;
            tabla.declarar(s);
            verificarDeclaracionVariable(d);

        } else if (decl instanceof NodoDeclaracionArray d) {
            Simbolo s = new Simbolo();
            s.nombre = d.nombre;
            s.tipo = d.tipo;
            s.esArreglo = true;
            s.tamanoArreglo = EvaluadorConstantes.evaluar(d.tamano);
            s.linea = d.linea;
            tabla.declarar(s);
            verificarDeclaracionArray(d);

        } else if (decl instanceof NodoDeclaracionStructVar d) {
            Simbolo s = new Simbolo();
            s.nombre = d.nombre;
            s.tipo = d.tipoStruct;
            s.esStruct = true;
            s.linea = d.linea;
            tabla.declarar(s);

            if (d.valores != null) {
                for (NodoAsignAtributo a : d.valores.asignaciones) {
                    if (a.valor != null) inferirTipo(a.valor);
                }
            }
        }
        // NodoDeclaracionStructDef: no aplica en un cuerpo de función según tu gramática actual;
        // si la habilitaste ahí, regístrala en TablaTipos aquí también.
    }

    /** Para variables/arreglos globales (fuera de función), sin re-declarar 
     *  (ya están en Fase 1).
     */
    private void verificarDeclaracion(NodoDeclaracion decl) {
        if (decl instanceof NodoDeclaracionVariable d) {
            verificarDeclaracionVariable(d);
        } else if (decl instanceof NodoDeclaracionArray d) {
            verificarDeclaracionArray(d);
        } else if (decl instanceof NodoDeclaracionStructVar d) {
            if (d.valores != null) {
                for (NodoAsignAtributo a : d.valores.asignaciones) {
                    if (a.valor != null) inferirTipo(a.valor);
                }
            }
        }
    }
    
    private void verificarDeclaracionVariable(NodoDeclaracionVariable d) {
        if (d.valorInicial == null) return;
        String tipoValor = inferirTipo(d.valorInicial);
        if (tipoValor == null) return;

        if (!VerificadorTipos.compatible(d.tipo, tipoValor)) {
            errores.reportar("Tipo incompatible en '" + d.nombre + "': se declaró '" +
                    d.tipo + "' pero el valor es de tipo '" + tipoValor + "'", d.linea);
        }
    }

    private void verificarDeclaracionArray(NodoDeclaracionArray d) {
        if (d.tamano != null) {
            String tipoIndice = inferirTipo(d.tamano);
            if (tipoIndice != null && !tipoIndice.equals("numerus")) {
                errores.reportar("El tamaño del arreglo '" + d.nombre +
                        "' debe ser numerus", d.linea);
            }
        }

        if (d.valoresIniciales == null) return;

        if (d.tipo == null) {
            boolean todosBooleanos = true;
            for (NodoAST v : d.valoresIniciales) {
                if (!"booleano".equals(inferirTipo(v))) todosBooleanos = false;
            }
            if (!todosBooleanos) {
                errores.reportar("El arreglo '" + d.nombre +
                        "' debe declarar un tipo explícito (solo 'booleano' puede inferirse)", d.linea);
            }
            return;
        }

        for (NodoAST v : d.valoresIniciales) {
            String tipoVal = inferirTipo(v);
            if (tipoVal != null && !VerificadorTipos.compatible(d.tipo, tipoVal)) {
                errores.reportar("Valor incompatible en el arreglo '" + d.nombre +
                        "': se esperaba '" + d.tipo + "' y se encontró '" + tipoVal + "'", v.linea);
            }
        }

        Integer tamanoConst = EvaluadorConstantes.evaluar(d.tamano);
        if (tamanoConst != null && d.valoresIniciales.size() > tamanoConst) {
            errores.reportar("El arreglo '" + d.nombre + "' declara tamaño " + tamanoConst +
                    " pero recibe " + d.valoresIniciales.size() + " valores", d.linea);
        }
    }

    private void verificarAsignacion(NodoAsignacion a) {
        if (a.valor instanceof NodoLiteralEstructura) {
            return;
        }

        String tipoDestino = inferirTipo(a.destino);
        String tipoValor = inferirTipo(a.valor);

        if (tipoDestino != null && tipoValor != null && !VerificadorTipos.compatible(tipoDestino, tipoValor)) {
            errores.reportar("Asignación de tipo incompatible: destino '" + tipoDestino +
                    "', valor '" + tipoValor + "'", a.linea);
        }

        if (a.destino instanceof NodoAccesoArreglo acc) {
            verificarRangoArreglo(acc);
        }
    }

    private void verificarRangoArreglo(NodoAccesoArreglo acc) {
        if (!(acc.base instanceof NodoIdentificador id)) return;
        Simbolo s = tabla.resolver(id.nombre);
        if (s == null || s.tamanoArreglo == null) return;

        Integer indiceConst = EvaluadorConstantes.evaluar(acc.indice);
        if (indiceConst != null && (indiceConst < 0 || indiceConst >= s.tamanoArreglo)) {
            errores.reportar("Índice fuera de rango para '" + id.nombre +
                    "': tamaño declarado " + s.tamanoArreglo + ", índice " + indiceConst,
                    acc.linea);
        }
    }
    
    /**
     * Analisis semantico: Se espera un argumento booleando pero llaman a la funcion con
     *                      numerus o algun otro tipo.
     * @param nodo 
     */
    private void verificarLlamadaFuncion(NodoLlamadaFuncion nodo) {
        Simbolo func = tabla.resolver(nodo.nombre);
        if (func == null || !func.esFuncion || func.parametros == null) return;

        int n = Math.min(func.parametros.size(),
                nodo.argumentos != null ? nodo.argumentos.size() : 0);

        for (int i = 0; i < n; i++) {
            String tipoEsperado = func.parametros.get(i).tipo;
            String tipoDado = inferirTipo(nodo.argumentos.get(i));
            if (tipoDado != null && !VerificadorTipos.compatible(tipoEsperado, tipoDado)) {
                errores.reportar("Argumento " + (i + 1) + " de '" + nodo.nombre +
                        "' espera tipo '" + tipoEsperado + "' pero se dio '" + tipoDado + "'",
                        nodo.linea);
            }
        }
    }

    private void verificarRetorno(NodoRetorno r) {
        if (r.valor != null) inferirTipo(r.valor);
    }

    /*** INFERENCIA DE TIPOS ***/
    private String inferirTipo(NodoAST expr) {
        if (expr == null) return null;

        if (expr instanceof NodoLiteral lit) {
            return lit.tipoInferido;
        }

        if (expr instanceof NodoIdentificador id) {
            Simbolo s = tabla.resolver(id.nombre);
            return s != null ? s.tipo : null;
        }

        if (expr instanceof NodoAccesoArreglo acc) {
            if (acc.base instanceof NodoIdentificador baseId) {
                Simbolo s = tabla.resolver(baseId.nombre);
                return s != null ? s.tipo : null;
            }
            return inferirTipo(acc.base);
        }

        if (expr instanceof NodoAccesoAtributo attr) {
            String tipoBase = inferirTipo(attr.base);
            if (tipoBase == null) return null;
            Simbolo structDef = tipos.resolverStruct(tipoBase);
            if (structDef == null) return null;
            for (Simbolo at : structDef.atributosStruct) {
                if (at.nombre.equals(attr.nombreAtributo)) return at.tipo;
            }
            return null;
        }

        if (expr instanceof NodoLlamadaFuncion call) {
            Simbolo func = tabla.resolver(call.nombre);
            if (func != null) {
                /** Analsis Semantico: Verificar que la llamada de funcion ingrese los parametros correctos**/
                verificarLlamadaFuncion(call);
                return func.tipoRetorno;
            }
            return null;
        }

        if (expr instanceof NodoUnaria u) {
            String tipoOperando = inferirTipo(u.operando);
            if (u.operador.equals("non")) {
                if (tipoOperando != null && !tipoOperando.equals("booleano")) {
                    errores.reportar("El operador 'non' requiere un valor booleano, se encontró '" +
                            tipoOperando + "'", u.linea);
                }
                return "booleano";
            }
            if (tipoOperando != null && !esNumerico(tipoOperando)) {
                errores.reportar("El operador '" + u.operador +
                        "' requiere un tipo numérico, se encontró '" + tipoOperando + "'", u.linea);
            }
            return tipoOperando;
        }

        if (expr instanceof NodoBinaria b) {
            return inferirTipoBinaria(b);
        }

        return null;
    }
    
    /**
     * Analisis Semtantico: La logica relacional solo permite dos expresiones booleanas
     *                      el textum solo puede concatenarse con una suma no con otra operacion.
     *                      El tipo 'textum' no puede compararse con el operador '== , !=, <, >, etc solo permite concatenacion
     * 
     *                      
     * @param b
     * @return 
     */
    private String inferirTipoBinaria(NodoBinaria b) {
        String tipoIzq = inferirTipo(b.izquierda);
        String tipoDer = inferirTipo(b.derecha);
        if (tipoIzq == null || tipoDer == null) return null;

        boolean esRelacionalOLogico = List.of("==", "!=", "<", ">", "<=", ">=", "&&", "||").contains(b.operador);
        if (esRelacionalOLogico) {
            if (b.operador.equals("&&") || b.operador.equals("||")) {
                if (!tipoIzq.equals("booleano") || !tipoDer.equals("booleano")) {
                    errores.reportar("El operador '" + b.operador + "' requiere operandos booleanos", b.linea);
                }
            } else {
                // Para el resto de relacionales, no se permite textum
                if (tipoIzq.equals("textum") || tipoDer.equals("textum")) {
                    errores.reportar("El tipo 'textum' no puede compararse con el operador '" + b.operador + "'; solo se permite concatenación con '+'", b.linea);
                }
            }
            return "booleano";
        }

        boolean izqEsTextum = tipoIzq.equals("textum");
        boolean derEsTextum = tipoDer.equals("textum");

        if (izqEsTextum || derEsTextum) {
            if (!b.operador.equals("+")) {
                errores.reportar("'textum' solo puede combinarse con el operador '+' (concatenación)",
                        b.linea);
            }
            return "textum";
        }

        if (!TipoDato.esPrimitivo(tipoIzq) || !TipoDato.esPrimitivo(tipoDer)) {
            errores.reportar("Tipos no compatibles en operación: '" + tipoIzq +
                    "' y '" + tipoDer + "'", b.linea);
            return null;
        }

        return TipoDato.masAlto(tipoIzq, tipoDer);
    }

    private boolean esNumerico(String tipo) {
        return tipo.equals("numerus") || tipo.equals("decimalis");
    }


}