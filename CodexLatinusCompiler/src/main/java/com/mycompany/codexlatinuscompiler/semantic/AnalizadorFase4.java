/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.semantic;

import com.mycompany.codexlatinuscompiler.ast.*;
import com.mycompany.codexlatinuscompiler.errors.ManejadorErrores;
import com.mycompany.codexlatinuscompiler.symboltable.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author andy
 */
public class AnalizadorFase4 {

    private final TablaSimbolos tabla;
    private final TablaTipos tipos;
    private final ManejadorErrores errores;

    public AnalizadorFase4(TablaSimbolos tabla, TablaTipos tipos, ManejadorErrores errores) {
        this.tabla = tabla;
        this.tipos = tipos;
        this.errores = errores;
    }

    public void analizar(NodoPrograma programa) {
        for (NodoDeclaracion d : programa.variablesGlobales) {
            if (d instanceof NodoDeclaracionStructDef structDef) {
                validarStructDef(structDef);
            }
        }

        for (NodoDeclaracion d : programa.variablesGlobales) {
            procesarDeclaracionGlobal(d);
        }

        for (NodoFuncion f : programa.funciones) {
            procesarFuncion(f);
        }

        for (NodoAST sent : programa.sentenciasPrincipal) {
            procesarSentencia(sent);
        }
    }

    /**
     * Analisis semtantico duplicado de atrinuto en estructuras
     * @param d 
     */
    private void validarStructDef(NodoDeclaracionStructDef d) {
        Set<String> nombres = new HashSet<>();
        for (NodoAtributoStruct attr : d.atributos) {
            if (!nombres.add(attr.nombre)) {
                errores.reportar("Atributo duplicado '" + attr.nombre +
                        "' en la estructura '" + d.nombre + "'", attr.linea);
            }
        }
    }

    private void procesarFuncion(NodoFuncion f) {
        tabla.entrarScopeTemporal();

        for (NodoParametro p : f.parametros) {
            declararSilencioso(p.nombre, p.tipo, false, p.linea);
        }
        for (NodoDeclaracion d : f.variablesLocales) {
            procesarDeclaracionLocal(d);
        }
        for (NodoAST sent : f.cuerpo) {
            procesarSentencia(sent);
        }

        tabla.salirScope();
    }

    private void procesarDeclaracionGlobal(NodoDeclaracion d) {
        if (d instanceof NodoDeclaracionStructVar sv) {
            if (sv.valores != null) {
                validarLiteralEstructura(sv.valores, sv.tipoStruct);
                verificarExpresion(sv.valores);
            }
        }
        // Si hay variables globales con inicializador, también se pueden procesar:
        if (d instanceof NodoDeclaracionVariable v) {
            if (v.valorInicial != null) {
                verificarExpresion(v.valorInicial);
            }
        }
        if (d instanceof NodoDeclaracionArray a) {
            if (a.valoresIniciales != null) {
                for (NodoAST valor : a.valoresIniciales) {
                    verificarExpresion(valor);
                }
            }
        }
    }

    private void procesarDeclaracionLocal(NodoDeclaracion d) {
        if (d instanceof NodoDeclaracionVariable v) {
            declararSilencioso(v.nombre, v.tipo, false, v.linea);
            if (v.valorInicial != null) {
                verificarExpresion(v.valorInicial);
            }
        } else if (d instanceof NodoDeclaracionArray a) {
            declararSilencioso(a.nombre, a.tipo, true, a.linea);
            if (a.valoresIniciales != null) {
                for (NodoAST valor : a.valoresIniciales) {
                    verificarExpresion(valor);
                }
            }
        } else if (d instanceof NodoDeclaracionStructVar sv) {
            declararSilencioso(sv.nombre, sv.tipoStruct, false, sv.linea);
            if (sv.valores != null) {
                validarLiteralEstructura(sv.valores, sv.tipoStruct);
                verificarExpresion(sv.valores);
            }
        }
    }

    private void declararSilencioso(String nombre, String tipo, boolean esArreglo, int linea) {
        Simbolo s = new Simbolo();
        s.nombre = nombre;
        s.tipo = tipo;
        s.esArreglo = esArreglo;
        s.linea = linea;
        tabla.declarar(s); // duplicados ya se reportaron en fases previas
    }

    private void procesarSentencia(NodoAST nodo) {
        if (nodo == null) return;

        if (nodo instanceof NodoDeclaracion d) {
            procesarDeclaracionLocal(d);
        } else if (nodo instanceof NodoAsignacion a) {
            procesarAsignacion(a);
        } else if (nodo instanceof NodoSi si) {
            procesarBloque(si.bloqueSi);
            for (NodoAliterIf al : si.ramasAliter) procesarBloque(al.bloque);
            if (si.bloqueAliterFinal != null) procesarBloque(si.bloqueAliterFinal);
        } else if (nodo instanceof NodoDum d) {
            procesarBloque(d.cuerpo);
        } else if (nodo instanceof NodoFacere f) {
            procesarBloque(f.cuerpo);
        } else if (nodo instanceof NodoPer p) {
            tabla.entrarScopeTemporal();
            if (p.inicializacion != null) {
                declararSilencioso(p.inicializacion.nombre, p.inicializacion.tipo, false, p.inicializacion.linea);
            }
            procesarBloque(p.cuerpo);
            tabla.salirScope();
        }
    }

    private void procesarBloque(List<NodoAST> sentencias) {
        if (sentencias == null || sentencias.isEmpty()) return;
        tabla.entrarScopeTemporal();
        for (NodoAST s : sentencias) procesarSentencia(s);
        tabla.salirScope();
    }

    private void procesarAsignacion(NodoAsignacion a) {
        if (!(a.valor instanceof NodoLiteralEstructura lit)) return;

        String tipoStruct = obtenerTipoStructDestino(a.destino);
        if (tipoStruct == null) {
            errores.reportar("No se pudo determinar el tipo de estructura para la asignación", a.linea);
            return;
        }
        validarLiteralEstructura(lit, tipoStruct);
    }

    private String obtenerTipoStructDestino(NodoAST dest) {
        if (dest instanceof NodoIdentificador id) {
            Simbolo s = tabla.resolver(id.nombre);
            return s != null ? s.tipo : null;
        }
        if (dest instanceof NodoAccesoAtributo attr) {
            String tipoBase = obtenerTipoStructDestino(attr.base);
            if (tipoBase == null) return null;
            Simbolo structDef = tipos.resolverStruct(tipoBase);
            if (structDef == null) return null;
            for (Simbolo at : structDef.atributosStruct) {
                if (at.nombre.equals(attr.nombreAtributo)) return at.tipo;
            }
            return null;
        }
        if (dest instanceof NodoAccesoArreglo acc) {
            return obtenerTipoStructDestino(acc.base);
        }
        return null;
    }

    private void validarLiteralEstructura(NodoLiteralEstructura lit, String nombreStruct) {
        Simbolo structDef = tipos.resolverStruct(nombreStruct);
        if (structDef == null) return; // ya reportado en Fase 2

        Set<String> vistos = new HashSet<>();

        for (NodoAsignAtributo asig : lit.asignaciones) {
            if (!vistos.add(asig.nombreAtributo)) {
                errores.reportar("Atributo '" + asig.nombreAtributo +
                        "' asignado más de una vez en el literal de '" + nombreStruct + "'", asig.linea);
                continue;
            }

            Simbolo attrDef = buscarAtributo(structDef, asig.nombreAtributo);
            if (attrDef == null) continue; // ya reportado en Fase 2 (atributo inexistente)

            if (asig.tamanoArreglo != null) {
                validarAtributoArreglo(asig, attrDef, nombreStruct);
            } else if (asig.valor instanceof NodoLiteralEstructura anidado) {
                validarAtributoStructAnidado(anidado, attrDef, nombreStruct, asig.linea);
            } else if (asig.valor != null) {
                validarAtributoEscalar(asig, attrDef, nombreStruct);
            }
        }
    }

    private Simbolo buscarAtributo(Simbolo structDef, String nombre) {
        for (Simbolo at : structDef.atributosStruct) {
            if (at.nombre.equals(nombre)) return at;
        }
        return null;
    }

    /**
     * Analisis Semantico: 
     *                      Valor incomptaible en el arreglo, agregar un valor de textum cuando es una rreglo de numerus series lista[4] : numerus {10, 20, "A", 40};
     *                      El tama;o del arreglo debe de ser numerus, series lista2[5.5] : numerus 
     * @param asig
     * @param attrDef
     * @param nombreStruct 
     */
    private void validarAtributoArreglo(NodoAsignAtributo asig, Simbolo attrDef, String nombreStruct) {
        if (!attrDef.esArreglo) {
            errores.reportar("El atributo '" + asig.nombreAtributo + "' de '" + nombreStruct +
                    "' no es un arreglo, no puede recibir 'Tipo[tamaño]'", asig.linea);
            return;
        }
        if (asig.tipoArregloReferenciado != null && !asig.tipoArregloReferenciado.equals(attrDef.tipo)) {
            errores.reportar("El atributo '" + asig.nombreAtributo + "' espera arreglos de tipo '" +
                    attrDef.tipo + "', se dio '" + asig.tipoArregloReferenciado + "'", asig.linea);
        }
        String tipoIndice = inferirTipo(asig.tamanoArreglo);
        if (tipoIndice != null && !tipoIndice.equals("numerus")) {
            errores.reportar("El tamaño del arreglo en '" + asig.nombreAtributo +
                    "' debe ser numerus", asig.linea);
        }
    }

    /** Caso: subestructura anidada literal, ej. direccion: { calle: "...", numero: 5 } */
    private void validarAtributoStructAnidado(NodoLiteralEstructura anidado, Simbolo attrDef,
                                               String nombreStruct, int linea) {
        if (!tipos.existeStruct(attrDef.tipo)) {
            errores.reportar("El atributo '" + attrDef.nombre + "' de '" + nombreStruct +
                    "' no es una estructura, no puede recibir un literal anidado", linea);
            return;
        }
        validarLiteralEstructura(anidado, attrDef.tipo); // recursión
    }

    /** Analisis semantico: En una declaracion de estructura se coloca un valor a una variable que espera otro valor*/
    private void validarAtributoEscalar(NodoAsignAtributo asig, Simbolo attrDef, String nombreStruct) {
        String tipoValor = inferirTipo(asig.valor);
        if (tipoValor == null) return;

        if (!VerificadorTipos.compatible(attrDef.tipo, tipoValor)) {
            errores.reportar("Atributo '" + asig.nombreAtributo + "' de '" + nombreStruct +
                    "' espera tipo '" + attrDef.tipo + "', se dio '" + tipoValor + "'", asig.linea);
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
    
    private void verificarRangoArreglo(NodoAccesoArreglo acc) {
        if (!(acc.base instanceof NodoIdentificador id)) {
            return;
        }

        Simbolo sim = tabla.resolver(id.nombre);
        if (sim == null || !sim.esArreglo || sim.tamanoArreglo == null) {
            return; // no es un arreglo o no se conoce su tamaño
        }

        Integer indiceConst = EvaluadorConstantes.evaluar(acc.indice);
        if (indiceConst != null && (indiceConst < 0 || indiceConst >= sim.tamanoArreglo)) {
            errores.reportar("Índice fuera de rango para '" + id.nombre +
                    "': tamaño declarado " + sim.tamanoArreglo + ", índice " + indiceConst,
                    acc.linea);
        }
    }
    
    /** analisis semantico: verificacion de valores colocaldos en arreglos esten en rangos adecuados
     * 
     * @param expr 
     */
    private void verificarExpresion(NodoAST expr) {
        if (expr == null) return;

        // Si es un acceso a arreglose verifica su rango
        if (expr instanceof NodoAccesoArreglo acc) {
            verificarRangoArreglo(acc);
            // revisar la base y el índice por si contienen más accesos
            verificarExpresion(acc.base);
            verificarExpresion(acc.indice);
            return;
        }

        // Si es una operación unaria, se revisa el operando
        if (expr instanceof NodoUnaria un) {
            verificarExpresion(un.operando);
            return;
        }

        // Si es binaria, se revisan ambos lados
        if (expr instanceof NodoBinaria bin) {
            verificarExpresion(bin.izquierda);
            verificarExpresion(bin.derecha);
            return;
        }

        // Si es llamada a función, se revizaon los argumentos argumentos
        if (expr instanceof NodoLlamadaFuncion call) {
            if (call.argumentos != null) {
                for (NodoAST arg : call.argumentos) {
                    verificarExpresion(arg);
                }
            }
            return;
        }

        // Para accesos a atributos, se revisa la base
        if (expr instanceof NodoAccesoAtributo attr) {
            verificarExpresion(attr.base);
            return;
        }

        // Para literales de estructura, revisamos cada asignación de atributo
        if (expr instanceof NodoLiteralEstructura lit) {
            for (NodoAsignAtributo asig : lit.asignaciones) {
                if (asig.valor != null) verificarExpresion(asig.valor);
                if (asig.tamanoArreglo != null) verificarExpresion(asig.tamanoArreglo);
            }
            return;
        }
    }

}
