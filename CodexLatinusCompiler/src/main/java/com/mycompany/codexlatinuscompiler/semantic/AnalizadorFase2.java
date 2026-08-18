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
public class AnalizadorFase2 {
    
    private final TablaSimbolos tabla;
    private final TablaTipos tipos;
    private final ManejadorErrores errores;
    private final AnalizadorContexto contexto;

    public AnalizadorFase2(TablaSimbolos tabla, TablaTipos tipos, ManejadorErrores errores, AnalizadorContexto contexto) {
        this.tabla = tabla;
        this.tipos = tipos;
        this.errores = errores;
        this.contexto = contexto;
    }
    
    public void analizar(NodoPrograma programa) {
        // Analizar funciones
        for (NodoFuncion f : programa.funciones) {
            analizarFuncion(f);
        }
        // Bloque principal (ámbito global)
        for (NodoAST sent : programa.sentenciasPrincipal) {
            analizarSentencia(sent);
        }
    }
    
    /*
    ratio numerus factorial(esto n: numerus) {
        VARIABILES_LOCAL>
            esto resultado: numerus 1;
        <
        dum (n > 0) {
            resultado = resultado * n;
            n = n - 1;
        } finis;
        reddere resultado;
    } finis;
    
    Analsis semantico: Parametros duplicados en funcion (esto x : numerus, esto x : numerus)
                       Funcion no ratio sin redere
    */
    private void analizarFuncion(NodoFuncion f) {
        tabla.entrarScope("Función: " + f.nombre);

        // Registrar parámetros
        for (NodoParametro p : f.parametros) {
            Simbolo s = new Simbolo();
            s.nombre = p.nombre;
            s.tipo = p.tipo;
            s.linea = p.linea;
            s.esParametro = true;
            if (!tabla.declarar(s)) {
                errores.reportar("Parámetro duplicado: '" + p.nombre + "'", p.linea);
            }
        }

        // Registrar variables locales
        for (NodoDeclaracion decl : f.variablesLocales) {
            registrarDeclaracionLocal(decl);
        }

        // Guardar contexto anterior
        boolean prevDentroDeFuncion = contexto.dentroDeFuncion;
        String prevTipoRetorno = contexto.tipoRetornoFuncion;
        contexto.dentroDeFuncion = true;
        contexto.tipoRetornoFuncion = f.tipoRetorno;

        // Cuerpo
        for (NodoAST sent : f.cuerpo) {
            analizarSentencia(sent);
        }

        // Verificar que una función con retorno tenga al menos un return
        if (f.tipoRetorno != null) {
            if (!buscarReturn(f.cuerpo)) {
                errores.reportar("La función '" + f.nombre + "' no tiene ningún 'reddere'", f.linea);
            }
        }

        // Restaurar contexto
        contexto.dentroDeFuncion = prevDentroDeFuncion;
        contexto.tipoRetornoFuncion = prevTipoRetorno;

        tabla.salirScope();
    }
    
    private boolean buscarReturn(List<NodoAST> sentencias) {
        for (NodoAST s : sentencias) {
            if (s instanceof NodoRetorno) return true;
            if (s instanceof NodoSi) {
                NodoSi si = (NodoSi) s;
                if (buscarReturn(si.bloqueSi)) return true;
                for (NodoAliterIf al : si.ramasAliter) {
                    if (buscarReturn(al.bloque)) return true;
                }
                if (si.bloqueAliterFinal != null && buscarReturn(si.bloqueAliterFinal)) return true;
            }
            if (s instanceof NodoDum && buscarReturn(((NodoDum) s).cuerpo)) return true;
            if (s instanceof NodoFacere && buscarReturn(((NodoFacere) s).cuerpo)) return true;
            if (s instanceof NodoPer && buscarReturn(((NodoPer) s).cuerpo)) return true;
        }
        return false;
    }
    
    /**
     * Registrar declaraciones locales dentro de una funcion.
     * Analisis Semtantico: Variable local duplicada
     *                      Arreglo local duplicado
     *                      Variable struct local duplicada
     * @param decl 
     */
    private void registrarDeclaracionLocal(NodoDeclaracion decl) {
        if (decl instanceof NodoDeclaracionVariable d) {
            Simbolo s = new Simbolo();
            s.nombre = d.nombre;
            s.tipo = d.tipo;
            s.linea = d.linea;
            if (!tabla.declarar(s)) {
                errores.reportar("Variable local duplicada: '" + d.nombre + "'", d.linea);
            }
            if (d.valorInicial != null) analizarExpresion(d.valorInicial);
        } else if (decl instanceof NodoDeclaracionArray d) {
            Simbolo s = new Simbolo();
            s.nombre = d.nombre;
            s.tipo = d.tipo;
            s.esArreglo = true;
            s.linea = d.linea;
            if (!tabla.declarar(s)) {
                errores.reportar("Arreglo local duplicado: '" + d.nombre + "'", d.linea);
            }
            if (d.tamano != null) analizarExpresion(d.tamano);
            if (d.valoresIniciales != null) {
                for (NodoAST val : d.valoresIniciales) analizarExpresion(val);
            }
        } else if (decl instanceof NodoDeclaracionStructVar d) {
            Simbolo s = new Simbolo();
            s.nombre = d.nombre;
            s.tipo = d.tipoStruct;
            s.linea = d.linea;
            if (!tabla.declarar(s)) {
                errores.reportar("Variable struct local duplicada: '" + d.nombre + "'", d.linea);
            }
            if (d.valores != null) {
                analizarLiteralEstructura(d.valores, d.tipoStruct);
            }
        }
    }

    /*
    esto i: numerus 0;
    Analisis Semantico: "'perge' solo puede usarse dentro de un ciclo"
                        "'interrumpe' solo puede usarse dentro de un ciclo"
    */
    private void analizarSentencia(NodoAST nodo) {
        if (nodo == null) return;

        if (nodo instanceof NodoDeclaracionVariable ||
            nodo instanceof NodoDeclaracionArray ||
            nodo instanceof NodoDeclaracionStructVar) {
            registrarDeclaracionLocal((NodoDeclaracion) nodo);
            return;
        }

        if (nodo instanceof NodoAsignacion) {
            analizarAsignacion((NodoAsignacion) nodo);
            return;
        }
        if (nodo instanceof NodoLlamadaFuncion) {
            analizarLlamadaFuncion((NodoLlamadaFuncion) nodo);
            return;
        }
        if (nodo instanceof NodoSi) {
            analizarSi((NodoSi) nodo);
            return;
        }
        if (nodo instanceof NodoDum) {
            analizarDum((NodoDum) nodo);
            return;
        }
        if (nodo instanceof NodoFacere) {
            analizarFacere((NodoFacere) nodo);
            return;
        }
        if (nodo instanceof NodoPer) {
            analizarPer((NodoPer) nodo);
            return;
        }
        if (nodo instanceof NodoLectura) {
            analizarLectura((NodoLectura) nodo);
            return;
        }
        if (nodo instanceof NodoEscritura) {
            analizarEscritura((NodoEscritura) nodo);
            return;
        }
        if (nodo instanceof NodoRetorno) {
            analizarRetorno((NodoRetorno) nodo);
            return;
        }
        if (nodo instanceof NodoPerge) {
            if (!contexto.dentroDeCiclo) {
                errores.reportar("'perge' solo puede usarse dentro de un ciclo", nodo.linea);
            }
            return;
        }
        if (nodo instanceof NodoInterrumpe) {
            if (!contexto.dentroDeCiclo) {
                errores.reportar("'interrumpe' solo puede usarse dentro de un ciclo", nodo.linea);
            }
            return;
        }

        // Si es una expresión suelta
        if (nodo instanceof NodoUnaria || nodo instanceof NodoBinaria ||
            nodo instanceof NodoIdentificador || nodo instanceof NodoLiteral) {
            analizarExpresion(nodo);
        }
    }
    /*
        resultado = resultado * n;
        Analisis semantico: Destino de asignación no válido
                            No se pudo determinar el tipo de estructura para la asignación
    */
    private void analizarAsignacion(NodoAsignacion nodo) {
        NodoAST dest = nodo.destino;
        if (dest instanceof NodoIdentificador) {
            resolverIdentificador((NodoIdentificador) dest);
        } else if (dest instanceof NodoAccesoArreglo) {
            analizarAccesoArreglo((NodoAccesoArreglo) dest);
        } else if (dest instanceof NodoAccesoAtributo) {
            analizarAccesoAtributo((NodoAccesoAtributo) dest);
        } else {
            errores.reportar("Destino de asignación no válido", nodo.linea);
        }

        if (nodo.valor instanceof NodoLiteralEstructura) {
            String tipoStruct = obtenerTipoStructDestino(dest);
            if (tipoStruct != null) {
                analizarLiteralEstructura((NodoLiteralEstructura) nodo.valor, tipoStruct);
            } else {
                errores.reportar("No se pudo determinar el tipo de estructura para la asignación", nodo.linea);
            }
        } else {
            analizarExpresion(nodo.valor);
        }
    }
    
    private String obtenerTipoStructDestino(NodoAST dest) {
        if (dest instanceof NodoIdentificador id) {
            Simbolo s = tabla.resolver(id.nombre);
            return s != null ? s.tipo : null;
        }

        if (dest instanceof NodoAccesoAtributo attr) {
            Simbolo base = resolverBaseAcceso(attr.base);
            if (base == null || base.tipo == null) return null;
            Simbolo structDef = tipos.resolverStruct(base.tipo);
            if (structDef == null) return null;
            for (Simbolo at : structDef.atributosStruct) {
                if (at.nombre.equals(attr.nombreAtributo)) return at.tipo;
            }
            return null;
        }

        if (dest instanceof NodoAccesoArreglo acc) {
            Simbolo base = resolverBaseAcceso(acc.base);
            return base != null ? base.tipo : null;
        }

        return null;
    }
    
    /*
    nombres[0] = "Andy Gonzalez";
    */
    private void analizarAccesoArreglo(NodoAccesoArreglo nodo) {
        if (nodo.base instanceof NodoIdentificador) {
            resolverIdentificador((NodoIdentificador) nodo.base);
        } else if (nodo.base instanceof NodoAccesoAtributo) {
            analizarAccesoAtributo((NodoAccesoAtributo) nodo.base);
        } else {
            errores.reportar("Base de arreglo no válida", nodo.linea);
        }
        analizarExpresion(nodo.indice);
    }
    
    /*
     mi_selva.animales[1] = { nombre: "Perro", apodo: "Canis" };
    */
    private void analizarAccesoAtributo(NodoAccesoAtributo nodo) {
        Simbolo base = resolverBaseAcceso(nodo.base);
        if (base == null) return;

        Simbolo structDef = tipos.resolverStruct(base.tipo);
        if (structDef == null) {
            errores.reportar("El tipo '" + base.tipo + "' no es una estructura", nodo.linea);
            return;
        }

        boolean encontrado = false;
        for (Simbolo at : structDef.atributosStruct) {
            if (at.nombre.equals(nodo.nombreAtributo)) {
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            errores.reportar("La estructura '" + base.tipo + "' no tiene el atributo '" +
                             nodo.nombreAtributo + "'", nodo.linea);
        }
    }
    
    private Simbolo resolverBaseAcceso(NodoAST base) {
        if (base instanceof NodoIdentificador id) {
            return tabla.resolver(id.nombre);
        }

        if (base instanceof NodoAccesoAtributo attr) {
            Simbolo baseDeAttr = resolverBaseAcceso(attr.base);
            if (baseDeAttr == null || baseDeAttr.tipo == null) return null;

            Simbolo structDef = tipos.resolverStruct(baseDeAttr.tipo);
            if (structDef == null) return null;

            for (Simbolo at : structDef.atributosStruct) {
                if (at.nombre.equals(attr.nombreAtributo)) {
                    Simbolo resultado = new Simbolo();
                    resultado.tipo = at.tipo;
                    resultado.esArreglo = at.esArreglo;
                    return resultado; 
                }
            }
            return null;
        }

        if (base instanceof NodoAccesoArreglo acc) {
            analizarExpresion(acc.indice);
            return resolverBaseAcceso(acc.base); 
        }

        return null;
    }
    
    /*
    esto mi_personaje : Persona { nombre: "Andy", edad: 23 };
    */
    private void analizarLiteralEstructura(NodoLiteralEstructura lit, String nombreStruct) {
        Simbolo structDef = tipos.resolverStruct(nombreStruct);
        if (structDef == null) {
            errores.reportar("Estructura '" + nombreStruct + "' no definida", lit.linea);
            return;
        }

        for (Simbolo attrDef : structDef.atributosStruct) {
            boolean encontrado = false;
            for (NodoAsignAtributo asig : lit.asignaciones) {
                if (asig.nombreAtributo.equals(attrDef.nombre)) {
                    encontrado = true;
                    if (asig.valor != null) analizarExpresion(asig.valor);
                    else if (asig.tamanoArreglo != null) analizarExpresion(asig.tamanoArreglo);
                    break;
                }
            }
            if (!encontrado) {
                errores.reportar("Falta el atributo '" + attrDef.nombre + "' en la estructura '" +
                                 nombreStruct + "'", lit.linea);
            }
        }

        for (NodoAsignAtributo asig : lit.asignaciones) {
            boolean encontrado = false;
            for (Simbolo attrDef : structDef.atributosStruct) {
                if (asig.nombreAtributo.equals(attrDef.nombre)) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                errores.reportar("Atributo '" + asig.nombreAtributo + "' no existe en la estructura '" +
                                 nombreStruct + "'", asig.linea);
            }
        }
    }
    
    /*
        Llamar a una variable o funcion que no habia sido declarado
        Analisis Semantico: Identificador no declarado
    */
    private void resolverIdentificador(NodoIdentificador id) {
        if (tabla.resolver(id.nombre) == null) {
            errores.reportar("Identificador no declarado: '" + id.nombre + "'", id.linea);
        }
    }
    
    /*
    resultado * n
    n * factorial(n - 1);
    */
    private void analizarExpresion(NodoAST expr) {
        if (expr == null) return;
        if (expr instanceof NodoIdentificador) resolverIdentificador((NodoIdentificador) expr);
        else if (expr instanceof NodoBinaria) {
            NodoBinaria b = (NodoBinaria) expr;
            analizarExpresion(b.izquierda);
            analizarExpresion(b.derecha);
        } else if (expr instanceof NodoUnaria) {
            analizarExpresion(((NodoUnaria) expr).operando);
        } else if (expr instanceof NodoAccesoArreglo) {
            analizarAccesoArreglo((NodoAccesoArreglo) expr);
        } else if (expr instanceof NodoAccesoAtributo) {
            analizarAccesoAtributo((NodoAccesoAtributo) expr);
        } else if (expr instanceof NodoLlamadaFuncion) {
            analizarLlamadaFuncion((NodoLlamadaFuncion) expr);
        }
    }
    
    /*
        calcularPoder(fuerza);
        Analisis semantico: Función no declarada cuando se llama una funcion que no ha sido declarada antes
                            La funcion pide un argunmento pero se llama a la funcion sin nada o vacio.
    */
    private void analizarLlamadaFuncion(NodoLlamadaFuncion nodo) {
        Simbolo func = tabla.resolver(nodo.nombre);
        if (func == null || !func.esFuncion) {
            errores.reportar("Función no declarada: '" + nodo.nombre + "'", nodo.linea);
            return;
        }

        int esperados = func.parametros != null ? func.parametros.size() : 0;
        int dados = nodo.argumentos != null ? nodo.argumentos.size() : 0;
        if (esperados != dados) {
            errores.reportar("La función '" + nodo.nombre + "' espera " + esperados +
                             " argumentos, pero se dieron " + dados, nodo.linea);
        }

        if (nodo.argumentos != null) {
            for (NodoAST arg : nodo.argumentos) analizarExpresion(arg);
        }
    }
    
    /*
    si (edad >= 18) {
        cifrado = verum;
    } finis;
    */
    private void analizarSi(NodoSi nodo) {
        analizarExpresion(nodo.condicion);
        analizarBloque(nodo.bloqueSi, "Bloque si");
        for (NodoAliterIf al : nodo.ramasAliter) {
            analizarExpresion(al.condicion);
            analizarBloque(al.bloque, "Bloque aliter");
        }
        if (nodo.bloqueAliterFinal != null) {
            analizarBloque(nodo.bloqueAliterFinal, "Bloque aliter");
        }
    }
    
    /*
    dum (x < 100) {
        x = x + 1;
    } finis;
    */
    private void analizarDum(NodoDum nodo) {
        analizarExpresion(nodo.condicion);
        boolean prev = contexto.dentroDeCiclo;
        contexto.dentroDeCiclo = true;
        analizarBloque(nodo.cuerpo, "Cuerpo dum");
        contexto.dentroDeCiclo = prev;
    }
    
    /*
    facere {
        x = x + 1;
    } dum (x < 100) finis;
    */
    private void analizarFacere(NodoFacere nodo) {
        boolean prev = contexto.dentroDeCiclo;
        contexto.dentroDeCiclo = true;
        analizarBloque(nodo.cuerpo, "Cuerpo facere");
        contexto.dentroDeCiclo = prev;
        analizarExpresion(nodo.condicion);
    }
    
    /*
    per (esto i: numerus 0; i < 10; i = i + 1) {
        >> i;
    }
    */
    private void analizarPer(NodoPer nodo) {
        tabla.entrarScope("Ciclo per (" + nodo.inicializacion.nombre + ")");

        // Inicialización
        if (nodo.inicializacion != null) {
            Simbolo s = new Simbolo();
            s.nombre = nodo.inicializacion.nombre;
            s.tipo = nodo.inicializacion.tipo;
            s.linea = nodo.inicializacion.linea;
            if (!tabla.declarar(s)) {
                errores.reportar("Variable de inicialización duplicada en 'per': '" +
                                 nodo.inicializacion.nombre + "'", nodo.inicializacion.linea);
            }
            if (nodo.inicializacion.valorInicial != null) {
                analizarExpresion(nodo.inicializacion.valorInicial);
            }
        }

        if (nodo.condicion != null) analizarExpresion(nodo.condicion);
        if (nodo.incremento != null) analizarExpresion(nodo.incremento);

        boolean prev = contexto.dentroDeCiclo;
        contexto.dentroDeCiclo = true;
        analizarBloque(nodo.cuerpo, "Cuerpo pere");
        contexto.dentroDeCiclo = prev;

        tabla.salirScope();
    }
    
    /*
    {
        esto temp: numerus 0;
        temp = a;
        a = b;
        b = temp;
    }
    */
    private void analizarBloque(List<NodoAST> sentencias, String descripcion) {
        if (sentencias == null || sentencias.isEmpty()) return;
        tabla.entrarScope(descripcion);
        for (NodoAST sent : sentencias){
            analizarSentencia(sent);
        }
        tabla.salirScope();
    }
    
    /**
     * edad << sin descalarlo antes 
     * Analisis semantico: Variable no declarada en lectura:
     * @param nodo 
     */
    private void analizarLectura(NodoLectura nodo) {
        if (nodo.nombreVariable != null) {
            if (tabla.resolver(nodo.nombreVariable) == null) {
                errores.reportar("Variable no declarada en lectura: '" + nodo.nombreVariable + "'", nodo.linea);
            }
        }
    }

    private void analizarEscritura(NodoEscritura nodo) {
        for (NodoAST val : nodo.valores) {
            analizarExpresion(val);
        }
    }
    /**
     * Analizar los retornos para funcionas actio o ratio
     * Analisis Semantico: "'reddere' fuera de una función"
     *                      "Función 'actio' no puede retornar un valor"
     *                      "La función debe retornar un valor de tipo '"
     * @param nodo 
     */
    private void analizarRetorno(NodoRetorno nodo) {
        if (!contexto.dentroDeFuncion) {
            errores.reportar("'reddere' fuera de una función", nodo.linea);
            return;
        }

        if (contexto.tipoRetornoFuncion == null) {
            if (nodo.valor != null) {
                errores.reportar("Función 'actio' no puede retornar un valor", nodo.linea);
            }
        } else {
            if (nodo.valor == null) {
                errores.reportar("La función debe retornar un valor de tipo '" +
                                 contexto.tipoRetornoFuncion + "'", nodo.linea);
            } else {
                analizarExpresion(nodo.valor);
            }
        }
    }

    
}
