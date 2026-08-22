/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.translator;

import com.mycompany.codexlatinuscompiler.ast.NodoAST;
import com.mycompany.codexlatinuscompiler.ast.NodoAccesoArreglo;
import com.mycompany.codexlatinuscompiler.ast.NodoAccesoAtributo;
import com.mycompany.codexlatinuscompiler.ast.NodoAliterIf;
import com.mycompany.codexlatinuscompiler.ast.NodoAsignAtributo;
import com.mycompany.codexlatinuscompiler.ast.NodoAsignacion;
import com.mycompany.codexlatinuscompiler.ast.NodoAtributoStruct;
import com.mycompany.codexlatinuscompiler.ast.NodoBinaria;
import com.mycompany.codexlatinuscompiler.ast.NodoDeclaracion;
import com.mycompany.codexlatinuscompiler.ast.NodoDeclaracionArray;
import com.mycompany.codexlatinuscompiler.ast.NodoDeclaracionStructDef;
import com.mycompany.codexlatinuscompiler.ast.NodoDeclaracionStructVar;
import com.mycompany.codexlatinuscompiler.ast.NodoDeclaracionVariable;
import com.mycompany.codexlatinuscompiler.ast.NodoDum;
import com.mycompany.codexlatinuscompiler.ast.NodoEscritura;
import com.mycompany.codexlatinuscompiler.ast.NodoFacere;
import com.mycompany.codexlatinuscompiler.ast.NodoFuncion;
import com.mycompany.codexlatinuscompiler.ast.NodoIdentificador;
import com.mycompany.codexlatinuscompiler.ast.NodoInterrumpe;
import com.mycompany.codexlatinuscompiler.ast.NodoLectura;
import com.mycompany.codexlatinuscompiler.ast.NodoLiteral;
import com.mycompany.codexlatinuscompiler.ast.NodoLiteralEstructura;
import com.mycompany.codexlatinuscompiler.ast.NodoLlamadaFuncion;
import com.mycompany.codexlatinuscompiler.ast.NodoParametro;
import com.mycompany.codexlatinuscompiler.ast.NodoPer;
import com.mycompany.codexlatinuscompiler.ast.NodoPerge;
import com.mycompany.codexlatinuscompiler.ast.NodoPrograma;
import com.mycompany.codexlatinuscompiler.ast.NodoRetorno;
import com.mycompany.codexlatinuscompiler.ast.NodoSi;
import com.mycompany.codexlatinuscompiler.ast.NodoUnaria;

/**
 *
 * @author andy
 */
public class TraductorPigLatin {
    private final StringBuilder sb = new StringBuilder();
    private int indent = 0;
    
    public String traducir(NodoPrograma programa) {
        sb.setLength(0);
        indent = 0;

        if (!programa.variablesGlobales.isEmpty()) {
            emitirHeader("VARIABILES");
            for (NodoDeclaracion d : programa.variablesGlobales) {
                traducirDeclaracion(d);
            }
            sb.append("\n");
        }

        if (!programa.funciones.isEmpty()) {
            emitirHeader("MUNERA");
            for (NodoFuncion f : programa.funciones) {
                traducirFuncion(f);
            }
            sb.append("\n");
        }

        emitirHeader("MAIOR");
        for (NodoAST s : programa.sentenciasPrincipal) {
            traducirSentencia(s);
        }

        String finisPrograma = PalabraReservada.FINIS_PROGRAMA.getTraducido();
        sb.append(finisPrograma).append(";\n");

        return sb.toString();
    }
    
    private void emitirHeader(String headerBase) {
        String traducido = PalabraReservada.traducir(headerBase);
        sb.append(traducido).append(">\n");
    }
    
    private void traducirDeclaracion(NodoDeclaracion d) {
        if (d instanceof NodoDeclaracionVariable v) {
            traducirDeclaracionVariable(v);
        } else if (d instanceof NodoDeclaracionArray a) {
            traducirDeclaracionArray(a);
        } else if (d instanceof NodoDeclaracionStructDef sd) {
            traducirDeclaracionStructDef(sd);
        } else if (d instanceof NodoDeclaracionStructVar sv) {
            traducirDeclaracionStructVar(sv);
        }
    }
    
    private void traducirDeclaracionVariable(NodoDeclaracionVariable v) {
        indentar();
        sb.append(PalabraReservada.ESTO.getTraducido()).append(" ")
          .append(traducirId(v.nombre)).append(" : ")
          .append(traducirTipo(v.tipo));

        if (v.valorInicial != null) {
            sb.append(" ");
            traducirExpresion(v.valorInicial);
        }
        sb.append(";\n");
    }
    
    private void traducirDeclaracionArray(NodoDeclaracionArray a) {
        indentar();
        sb.append(PalabraReservada.SERIES.getTraducido()).append(" ")
          .append(traducirId(a.nombre)).append("[");
        traducirExpresion(a.tamano);
        sb.append("] : ");

        if (a.tipo != null) {
            sb.append(traducirTipo(a.tipo));
        }

        if (a.valoresIniciales != null) {
            sb.append(" {");
            for (int i = 0; i < a.valoresIniciales.size(); i++) {
                if (i > 0) sb.append(", ");
                NodoAST val = a.valoresIniciales.get(i);
                if (val instanceof NodoLiteralEstructura lit) {
                    traducirLiteralEstructura(lit);
                } else {
                    traducirExpresion(val);
                }
            }
            sb.append("}");
        }
        sb.append(";\n");
    }
    
    private void traducirDeclaracionStructDef(NodoDeclaracionStructDef sd) {
        indentar();
        sb.append(PalabraReservada.STRUCTURA.getTraducido()).append(" ")
          .append(traducirId(sd.nombre)).append(" {\n");
        indent++;
        for (int i = 0; i < sd.atributos.size(); i++) {
            NodoAtributoStruct attr = sd.atributos.get(i);
            indentar();
            if (attr.esArreglo) {
                sb.append(PalabraReservada.SERIES.getTraducido());
            } else {
                sb.append(PalabraReservada.ESTO.getTraducido());
            }
            sb.append(" ").append(traducirId(attr.nombre)).append(": ")
              .append(traducirTipo(attr.tipo));
            if (i < sd.atributos.size() - 1) sb.append(",");
            sb.append("\n");
        }
        indent--;
        indentar();
        sb.append("} ").append(PalabraReservada.FINIS_BLOQUE.getTraducido()).append(";\n");
    }
    
    
    private void traducirDeclaracionStructVar(NodoDeclaracionStructVar sv) {
        indentar();
        sb.append(PalabraReservada.ESTO.getTraducido()).append(" ")
          .append(traducirId(sv.nombre)).append(" : ")
          .append(traducirId(sv.tipoStruct)).append(" ");
        traducirLiteralEstructura(sv.valores);
        sb.append("\n");
    }
    
    private void traducirLiteralEstructura(NodoLiteralEstructura lit) {
        sb.append("{");
        for (int i = 0; i < lit.asignaciones.size(); i++) {
            if (i > 0) sb.append(", ");
            NodoAsignAtributo asig = lit.asignaciones.get(i);
            sb.append(traducirId(asig.nombreAtributo)).append(": ");
            if (asig.tamanoArreglo != null) {
                sb.append(traducirId(asig.tipoArregloReferenciado)).append("[");
                traducirExpresion(asig.tamanoArreglo);
                sb.append("]");
            } else if (asig.valor instanceof NodoLiteralEstructura anidado) {
                traducirLiteralEstructura(anidado);
            } else {
                traducirExpresion(asig.valor);
            }
        }
        sb.append("}");
    }

    /****   FUNCIONES   ****/
    private void traducirFuncion(NodoFuncion f) {
        indentar();
        if (f.tipoRetorno == null) {
            sb.append(PalabraReservada.ACTIO.getTraducido());
        } else {
            sb.append(PalabraReservada.RATIO.getTraducido()).append(" ")
              .append(traducirTipo(f.tipoRetorno));
        }
        sb.append(" ").append(traducirId(f.nombre)).append("(");

        for (int i = 0; i < f.parametros.size(); i++) {
            if (i > 0) sb.append(", ");
            NodoParametro p = f.parametros.get(i);
            sb.append(PalabraReservada.ESTO.getTraducido()).append(" ")
              .append(traducirId(p.nombre)).append(" : ")
              .append(traducirTipo(p.tipo));
        }
        sb.append(") {\n");
        indent++;

        if (!f.variablesLocales.isEmpty()) {
            indentar();
            sb.append("VARIABILES[\n");
            indent++;
            for (NodoDeclaracion d : f.variablesLocales) traducirDeclaracion(d);
            indent--;
            indentar();
            sb.append("]\n");
        }

        for (NodoAST s : f.cuerpo) traducirSentencia(s);

        indent--;
        indentar();
        sb.append("} ").append(PalabraReservada.FINIS_BLOQUE.getTraducido()).append(";\n");
    }
    
    
    /****   SENTENCIAS  ****/
    private void traducirSentencia(NodoAST nodo) {
        if (nodo == null) return;

        if (nodo instanceof NodoDeclaracion d) {
            traducirDeclaracion(d);
        } else if (nodo instanceof NodoAsignacion a) {
            traducirAsignacion(a);
        } else if (nodo instanceof NodoSi si) {
            traducirSi(si);
        } else if (nodo instanceof NodoDum d) {
            traducirDum(d);
        } else if (nodo instanceof NodoFacere f) {
            traducirFacere(f);
        } else if (nodo instanceof NodoPer p) {
            traducirPer(p);
        } else if (nodo instanceof NodoRetorno r) {
            indentar();
            sb.append(PalabraReservada.REDDERE.getTraducido()).append(" ");
            traducirExpresion(r.valor);
            sb.append(";\n");
        } else if (nodo instanceof NodoLectura l) {
            indentar();
            if (l.nombreVariable != null) sb.append(traducirId(l.nombreVariable)).append(" ");
            sb.append("%OINK_OINK\n");
        } else if (nodo instanceof NodoEscritura e) {
            indentar();
            for (int i = 0; i < e.valores.size(); i++) {
                if (i > 0) sb.append(" %OINK ");
                traducirExpresion(e.valores.get(i));
            }
            sb.append(";\n");
        } else if (nodo instanceof NodoPerge) {
            indentar();
            sb.append(PalabraReservada.PERGE.getTraducido()).append(";\n");
        } else if (nodo instanceof NodoInterrumpe) {
            indentar();
            sb.append(PalabraReservada.INTERRUMPE.getTraducido()).append(";\n");
        } else if (nodo instanceof NodoLlamadaFuncion call) {
            indentar();
            traducirLlamadaFuncion(call);
            sb.append(";\n");
        } else {
            // expresionUnaria SEMI suelta
            indentar();
            traducirExpresion(nodo);
            sb.append(";\n");
        }
    }
    
    private void traducirAsignacion(NodoAsignacion a) {
        indentar();
        traducirExpresion(a.destino);
        sb.append(" = ");
        if (a.valor instanceof NodoLiteralEstructura lit) {
            traducirLiteralEstructura(lit);
        } else {
            traducirExpresion(a.valor);
        }
        sb.append(";\n");
    }
    
    private void traducirSi(NodoSi si) {
        indentar();
        sb.append(PalabraReservada.SI.getTraducido()).append(" (");
        traducirExpresion(si.condicion);
        sb.append(") {\n");
        indent++;
        for (NodoAST s : si.bloqueSi) traducirSentencia(s);
        indent--;

        for (NodoAliterIf al : si.ramasAliter) {
            indentar();
            sb.append("} ").append(PalabraReservada.ALITER.getTraducido()).append(" (");
            traducirExpresion(al.condicion);
            sb.append(") {\n");
            indent++;
            for (NodoAST s : al.bloque) traducirSentencia(s);
            indent--;
        }

        if (si.bloqueAliterFinal != null) {
            indentar();
            sb.append("} ").append(PalabraReservada.ALITER.getTraducido()).append(" {\n");
            indent++;
            for (NodoAST s : si.bloqueAliterFinal) traducirSentencia(s);
            indent--;
        }

        indentar();
        sb.append("} ").append(PalabraReservada.FINIS_BLOQUE.getTraducido()).append(";\n");
    }

    private void traducirDum(NodoDum d) {
        indentar();
        sb.append(PalabraReservada.DUM.getTraducido()).append(" (");
        traducirExpresion(d.condicion);
        sb.append(") {\n");
        indent++;
        for (NodoAST s : d.cuerpo) traducirSentencia(s);
        indent--;
        indentar();
        sb.append("} ").append(PalabraReservada.FINIS_BLOQUE.getTraducido()).append(";\n");
    }
    
    private void traducirFacere(NodoFacere f) {
        indentar();
        sb.append(PalabraReservada.FACERE.getTraducido()).append(" {\n");
        indent++;
        for (NodoAST s : f.cuerpo) traducirSentencia(s);
        indent--;
        indentar();
        sb.append("} ").append(PalabraReservada.DUM.getTraducido()).append(" (");
        traducirExpresion(f.condicion);
        sb.append(");\n");
    }
    
    private void traducirPer(NodoPer p) {
        indentar();
        sb.append(PalabraReservada.PER.getTraducido()).append(" (");
        sb.append(PalabraReservada.ESTO.getTraducido()).append(" ")
          .append(traducirId(p.inicializacion.nombre)).append(" : ")
          .append(traducirTipo(p.inicializacion.tipo));
        if (p.inicializacion.valorInicial != null) {
            sb.append(" ");
            traducirExpresion(p.inicializacion.valorInicial);
        }
        sb.append("; ");
        traducirExpresion(p.condicion);
        sb.append("; ");

        if (p.incremento instanceof NodoAsignacion asigInc) {
            traducirExpresion(asigInc.destino);
            sb.append(" = ");
            traducirExpresion(asigInc.valor);
        } else {
            traducirExpresion(p.incremento);
        }

        sb.append(") {\n");
        indent++;
        for (NodoAST s : p.cuerpo) traducirSentencia(s);
        indent--;
        indentar();
        sb.append("}\n");
    }
    
    /****   expresiones ****/
    private void traducirExpresion(NodoAST expr) {
        if (expr == null) return;

        if (expr instanceof NodoLiteral lit) {
            traducirLiteral(lit);
        } else if (expr instanceof NodoIdentificador id) {
            sb.append(traducirId(id.nombre));
        } else if (expr instanceof NodoBinaria b) {
            traducirExpresion(b.izquierda);
            sb.append(" ").append(b.operador).append(" ");
            traducirExpresion(b.derecha);
        } else if (expr instanceof NodoUnaria u) {
            String opTraducido = u.operador.equals("non")
                    ? PalabraReservada.NON.getTraducido()
                    : u.operador;
            if (u.esPrefijo) {
                sb.append(opTraducido);
                if (u.operador.equals("non")) sb.append(" ");
                traducirExpresion(u.operando);
            } else {
                traducirExpresion(u.operando);
                sb.append(u.operador);
            }
        } else if (expr instanceof NodoAccesoArreglo acc) {
            traducirExpresion(acc.base);
            sb.append("[");
            traducirExpresion(acc.indice);
            sb.append("]");
        } else if (expr instanceof NodoAccesoAtributo attr) {
            traducirExpresion(attr.base);
            sb.append(".").append(traducirId(attr.nombreAtributo));
        } else if (expr instanceof NodoLlamadaFuncion call) {
            traducirLlamadaFuncion(call);
        }
    }
    
    private void traducirLiteral(NodoLiteral lit) {
        if ("textum".equals(lit.tipoInferido)) {
            sb.append("\"").append(PigLatinUtil.convertirTexto((String) lit.valor)).append("\"");
        } else if ("littera".equals(lit.tipoInferido)) {
            sb.append("'").append(lit.valor).append("'");
        } else if ("booleano".equals(lit.tipoInferido)) {
            boolean val = (Boolean) lit.valor;
            sb.append(val ? PalabraReservada.VERUM.getTraducido() : PalabraReservada.FALSUS.getTraducido());
        } else {
            sb.append(lit.valor); // numerus, decimalis
        }
    }

    private void traducirLlamadaFuncion(NodoLlamadaFuncion call) {
        sb.append(traducirId(call.nombre)).append("(");
        for (int i = 0; i < call.argumentos.size(); i++) {
            if (i > 0) sb.append(", ");
            traducirExpresion(call.argumentos.get(i));
        }
        sb.append(")");
    }
    
    /**
     * Identificadores de usuario: siempre pasan por la Ley de Vocales/Consonantes.
     * @param nombre
     * @return 
     */
    private String traducirId(String nombre) {
        return PigLatinUtil.convertirPalabra(nombre);
    }
    
    /**
     * Un tipo puede ser palabra reservada (numerus, textum...) o el nombre de una struct (identificador).
     * @param tipo
     * @return 
     */
    private String traducirTipo(String tipo) {
        String reservada = PalabraReservada.traducir(tipo);
        if (reservada != null) return reservada;
        if ("booleano".equals(tipo)) return PalabraReservada.BOOL.getTraducido();
        return traducirId(tipo); // nombre de struct definida por el usuario
    }
    
    private void indentar() {
        for (int i = 0; i < indent; i++) sb.append("    ");
    }
    
}
