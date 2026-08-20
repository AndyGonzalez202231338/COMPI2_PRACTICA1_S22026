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
public class AnalizadorFase5 {

    private final TablaSimbolos tabla;
    private final TablaTipos tipos;
    private final ManejadorErrores errores;

    public AnalizadorFase5(TablaSimbolos tabla, TablaTipos tipos, ManejadorErrores errores) {
        this.tabla = tabla;
        this.tipos = tipos;
        this.errores = errores;
    }

    public void analizar(NodoPrograma programa) {
        for (NodoFuncion f : programa.funciones) {
            verificarFuncion(f);
        }
    }

    private void verificarFuncion(NodoFuncion f) {
        tabla.entrarScopeTemporal();

        for (NodoParametro p : f.parametros) {
            declararSilencioso(p.nombre, p.tipo, p.linea);
        }
        for (NodoDeclaracion d : f.variablesLocales) {
            declararSilenciosoDeclaracion(d);
        }

        boolean siempreRetorna = analizarBloque(f.cuerpo, f.tipoRetorno);

        if (f.tipoRetorno != null && !siempreRetorna) {
            errores.reportar("La función '" + f.nombre +
                    "' no retorna un valor en todos los caminos posibles", f.linea);
        }

        tabla.salirScope();
    }

    private void declararSilencioso(String nombre, String tipo, int linea) {
        Simbolo s = new Simbolo();
        s.nombre = nombre;
        s.tipo = tipo;
        s.linea = linea;
        tabla.declarar(s);
    }

    private void declararSilenciosoDeclaracion(NodoDeclaracion d) {
        if (d instanceof NodoDeclaracionVariable v) {
            declararSilencioso(v.nombre, v.tipo, v.linea);
        } else if (d instanceof NodoDeclaracionArray a) {
            declararSilencioso(a.nombre, a.tipo, a.linea);
        } else if (d instanceof NodoDeclaracionStructVar sv) {
            declararSilencioso(sv.nombre, sv.tipoStruct, sv.linea);
        }
    }

    private boolean analizarBloque(List<NodoAST> sentencias, String tipoEsperado) {
        if (sentencias == null) return false;

        boolean yaRetorno = false;

        for (NodoAST s : sentencias) {
            if (yaRetorno) {
                errores.reportar("Código inalcanzable: ya se retornó un valor antes de esta línea",
                        s.linea);
                continue; // seguimos marcando el resto como inalcanzable, sin más análisis
            }
            if (analizarSentencia(s, tipoEsperado)) {
                yaRetorno = true;
            }
        }

        return yaRetorno;
    }

    private boolean analizarSentencia(NodoAST nodo, String tipoEsperado) {
        if (nodo instanceof NodoRetorno r) {
            verificarTipoRetorno(r, tipoEsperado);
            return true;
        }

        if (nodo instanceof NodoSi si) {
            boolean siRetorna = analizarBloque(si.bloqueSi, tipoEsperado);

            boolean todasLasRamasRetornan = siRetorna;
            for (NodoAliterIf al : si.ramasAliter) {
                boolean ramaRetorna = analizarBloque(al.bloque, tipoEsperado);
                todasLasRamasRetornan = todasLasRamasRetornan && ramaRetorna;
            }

            if (si.bloqueAliterFinal != null) {
                boolean finalRetorna = analizarBloque(si.bloqueAliterFinal, tipoEsperado);
                todasLasRamasRetornan = todasLasRamasRetornan && finalRetorna;
            } else {
            
                todasLasRamasRetornan = false;
            }

            return todasLasRamasRetornan;
        }

        if (nodo instanceof NodoFacere f) {
            
            return analizarBloque(f.cuerpo, tipoEsperado);
        }

        if (nodo instanceof NodoDum d) {
            analizarBloque(d.cuerpo, tipoEsperado);
            return false;
        }

        if (nodo instanceof NodoPer p) {
            analizarBloque(p.cuerpo, tipoEsperado);
            return false;
        }

        return false;
    }

    private void verificarTipoRetorno(NodoRetorno r, String tipoEsperado) {
        if (tipoEsperado == null) {
            return;
        }
        if (r.valor == null) {
            
            return;
        }

        String tipoValor = inferirTipo(r.valor);
        if (tipoValor == null) return;

        if (!VerificadorTipos.compatible(tipoEsperado, tipoValor)) {
            errores.reportar("La función debe retornar '" + tipoEsperado +
                    "' pero 'reddere' entrega un valor de tipo '" + tipoValor + "'", r.linea);
        }
    }

    private String inferirTipo(NodoAST expr) {
        if (expr == null) return null;

        if (expr instanceof NodoLiteral lit) return lit.tipoInferido;

        if (expr instanceof NodoIdentificador id) {
            Simbolo s = tabla.resolver(id.nombre);
            return s != null ? s.tipo : null;
        }

        if (expr instanceof NodoAccesoArreglo acc) {
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
            return func != null ? func.tipoRetorno : null;
        }

        if (expr instanceof NodoUnaria u) {
            return u.operador.equals("non") ? "booleano" : inferirTipo(u.operando);
        }

        if (expr instanceof NodoBinaria b) {
            String izq = inferirTipo(b.izquierda);
            String der = inferirTipo(b.derecha);
            if (izq == null || der == null) return null;

            if (List.of("==", "!=", "<", ">", "<=", ">=", "&&", "||").contains(b.operador)) {
                return "booleano";
            }
            if (izq.equals("textum") || der.equals("textum")) return "textum";
            if (!TipoDato.esPrimitivo(izq) || !TipoDato.esPrimitivo(der)) return null;
            return TipoDato.masAlto(izq, der);
        }

        return null;
    }

}