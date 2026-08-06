// Generated from com/mycompany/codexlatinuscompiler/lexerparser/CodexLatinus.g4 by ANTLR 4.13.2
package com.mycompany.codexlatinuscompiler.lexerparser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CodexLatinusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CodexLatinusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(CodexLatinusParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#seccionVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeccionVariables(CodexLatinusParser.SeccionVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#seccionFunciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeccionFunciones(CodexLatinusParser.SeccionFuncionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#seccionPrincipal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeccionPrincipal(CodexLatinusParser.SeccionPrincipalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(CodexLatinusParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#declaracionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionVariable(CodexLatinusParser.DeclaracionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#declaracionArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionArray(CodexLatinusParser.DeclaracionArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#declaracionStructDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionStructDef(CodexLatinusParser.DeclaracionStructDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#listaAtributos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaAtributos(CodexLatinusParser.ListaAtributosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#atributo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributo(CodexLatinusParser.AtributoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#declaracionStructVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionStructVar(CodexLatinusParser.DeclaracionStructVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#literalEstructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralEstructura(CodexLatinusParser.LiteralEstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#listaAsignAtributos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaAsignAtributos(CodexLatinusParser.ListaAsignAtributosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#asignAtributo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignAtributo(CodexLatinusParser.AsignAtributoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#valorAtributo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorAtributo(CodexLatinusParser.ValorAtributoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(CodexLatinusParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#tipoPrimitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoPrimitivo(CodexLatinusParser.TipoPrimitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(CodexLatinusParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(CodexLatinusParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#accesoAsignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesoAsignable(CodexLatinusParser.AccesoAsignableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(CodexLatinusParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(CodexLatinusParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#cicloDum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloDum(CodexLatinusParser.CicloDumContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#cicloFacere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloFacere(CodexLatinusParser.CicloFacereContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#cicloPer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloPer(CodexLatinusParser.CicloPerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(CodexLatinusParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#listaParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametros(CodexLatinusParser.ListaParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(CodexLatinusParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(CodexLatinusParser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#listaExpresiones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaExpresiones(CodexLatinusParser.ListaExpresionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#lectura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLectura(CodexLatinusParser.LecturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#escritura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscritura(CodexLatinusParser.EscrituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(CodexLatinusParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#expresionLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionLogica(CodexLatinusParser.ExpresionLogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#expresionRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionRelacional(CodexLatinusParser.ExpresionRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#expresionAditiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionAditiva(CodexLatinusParser.ExpresionAditivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#expresionMultiplicativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionMultiplicativa(CodexLatinusParser.ExpresionMultiplicativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#expresionUnaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionUnaria(CodexLatinusParser.ExpresionUnariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimario(CodexLatinusParser.PrimarioContext ctx);
}