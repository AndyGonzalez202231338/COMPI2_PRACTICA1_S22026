// Generated from com/mycompany/codexlatinuscompiler/lexerparser/CodexLatinus.g4 by ANTLR 4.13.2
package com.mycompany.codexlatinuscompiler.lexerparser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CodexLatinusParser}.
 */
public interface CodexLatinusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(CodexLatinusParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(CodexLatinusParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#seccionVariables}.
	 * @param ctx the parse tree
	 */
	void enterSeccionVariables(CodexLatinusParser.SeccionVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#seccionVariables}.
	 * @param ctx the parse tree
	 */
	void exitSeccionVariables(CodexLatinusParser.SeccionVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#seccionFunciones}.
	 * @param ctx the parse tree
	 */
	void enterSeccionFunciones(CodexLatinusParser.SeccionFuncionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#seccionFunciones}.
	 * @param ctx the parse tree
	 */
	void exitSeccionFunciones(CodexLatinusParser.SeccionFuncionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#seccionPrincipal}.
	 * @param ctx the parse tree
	 */
	void enterSeccionPrincipal(CodexLatinusParser.SeccionPrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#seccionPrincipal}.
	 * @param ctx the parse tree
	 */
	void exitSeccionPrincipal(CodexLatinusParser.SeccionPrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(CodexLatinusParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(CodexLatinusParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionVariable(CodexLatinusParser.DeclaracionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionVariable(CodexLatinusParser.DeclaracionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#declaracionArray}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionArray(CodexLatinusParser.DeclaracionArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#declaracionArray}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionArray(CodexLatinusParser.DeclaracionArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#declaracionStructDef}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionStructDef(CodexLatinusParser.DeclaracionStructDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#declaracionStructDef}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionStructDef(CodexLatinusParser.DeclaracionStructDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#listaAtributos}.
	 * @param ctx the parse tree
	 */
	void enterListaAtributos(CodexLatinusParser.ListaAtributosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#listaAtributos}.
	 * @param ctx the parse tree
	 */
	void exitListaAtributos(CodexLatinusParser.ListaAtributosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#atributo}.
	 * @param ctx the parse tree
	 */
	void enterAtributo(CodexLatinusParser.AtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#atributo}.
	 * @param ctx the parse tree
	 */
	void exitAtributo(CodexLatinusParser.AtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#declaracionStructVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionStructVar(CodexLatinusParser.DeclaracionStructVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#declaracionStructVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionStructVar(CodexLatinusParser.DeclaracionStructVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#literalEstructura}.
	 * @param ctx the parse tree
	 */
	void enterLiteralEstructura(CodexLatinusParser.LiteralEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#literalEstructura}.
	 * @param ctx the parse tree
	 */
	void exitLiteralEstructura(CodexLatinusParser.LiteralEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#listaAsignAtributos}.
	 * @param ctx the parse tree
	 */
	void enterListaAsignAtributos(CodexLatinusParser.ListaAsignAtributosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#listaAsignAtributos}.
	 * @param ctx the parse tree
	 */
	void exitListaAsignAtributos(CodexLatinusParser.ListaAsignAtributosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#asignAtributo}.
	 * @param ctx the parse tree
	 */
	void enterAsignAtributo(CodexLatinusParser.AsignAtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#asignAtributo}.
	 * @param ctx the parse tree
	 */
	void exitAsignAtributo(CodexLatinusParser.AsignAtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#valorAtributo}.
	 * @param ctx the parse tree
	 */
	void enterValorAtributo(CodexLatinusParser.ValorAtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#valorAtributo}.
	 * @param ctx the parse tree
	 */
	void exitValorAtributo(CodexLatinusParser.ValorAtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(CodexLatinusParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(CodexLatinusParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#tipoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void enterTipoPrimitivo(CodexLatinusParser.TipoPrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#tipoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void exitTipoPrimitivo(CodexLatinusParser.TipoPrimitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(CodexLatinusParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(CodexLatinusParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(CodexLatinusParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(CodexLatinusParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#accesoAsignable}.
	 * @param ctx the parse tree
	 */
	void enterAccesoAsignable(CodexLatinusParser.AccesoAsignableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#accesoAsignable}.
	 * @param ctx the parse tree
	 */
	void exitAccesoAsignable(CodexLatinusParser.AccesoAsignableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(CodexLatinusParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(CodexLatinusParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#cicloDum}.
	 * @param ctx the parse tree
	 */
	void enterCicloDum(CodexLatinusParser.CicloDumContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#cicloDum}.
	 * @param ctx the parse tree
	 */
	void exitCicloDum(CodexLatinusParser.CicloDumContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#cicloFacere}.
	 * @param ctx the parse tree
	 */
	void enterCicloFacere(CodexLatinusParser.CicloFacereContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#cicloFacere}.
	 * @param ctx the parse tree
	 */
	void exitCicloFacere(CodexLatinusParser.CicloFacereContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#cicloPer}.
	 * @param ctx the parse tree
	 */
	void enterCicloPer(CodexLatinusParser.CicloPerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#cicloPer}.
	 * @param ctx the parse tree
	 */
	void exitCicloPer(CodexLatinusParser.CicloPerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(CodexLatinusParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(CodexLatinusParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(CodexLatinusParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(CodexLatinusParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(CodexLatinusParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(CodexLatinusParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(CodexLatinusParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(CodexLatinusParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#listaExpresiones}.
	 * @param ctx the parse tree
	 */
	void enterListaExpresiones(CodexLatinusParser.ListaExpresionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#listaExpresiones}.
	 * @param ctx the parse tree
	 */
	void exitListaExpresiones(CodexLatinusParser.ListaExpresionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#lectura}.
	 * @param ctx the parse tree
	 */
	void enterLectura(CodexLatinusParser.LecturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#lectura}.
	 * @param ctx the parse tree
	 */
	void exitLectura(CodexLatinusParser.LecturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#escritura}.
	 * @param ctx the parse tree
	 */
	void enterEscritura(CodexLatinusParser.EscrituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#escritura}.
	 * @param ctx the parse tree
	 */
	void exitEscritura(CodexLatinusParser.EscrituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(CodexLatinusParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(CodexLatinusParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#expresionLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpresionLogica(CodexLatinusParser.ExpresionLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#expresionLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpresionLogica(CodexLatinusParser.ExpresionLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#expresionRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpresionRelacional(CodexLatinusParser.ExpresionRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#expresionRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpresionRelacional(CodexLatinusParser.ExpresionRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#expresionAditiva}.
	 * @param ctx the parse tree
	 */
	void enterExpresionAditiva(CodexLatinusParser.ExpresionAditivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#expresionAditiva}.
	 * @param ctx the parse tree
	 */
	void exitExpresionAditiva(CodexLatinusParser.ExpresionAditivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#expresionMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterExpresionMultiplicativa(CodexLatinusParser.ExpresionMultiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#expresionMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitExpresionMultiplicativa(CodexLatinusParser.ExpresionMultiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#expresionUnaria}.
	 * @param ctx the parse tree
	 */
	void enterExpresionUnaria(CodexLatinusParser.ExpresionUnariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#expresionUnaria}.
	 * @param ctx the parse tree
	 */
	void exitExpresionUnaria(CodexLatinusParser.ExpresionUnariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#primario}.
	 * @param ctx the parse tree
	 */
	void enterPrimario(CodexLatinusParser.PrimarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#primario}.
	 * @param ctx the parse tree
	 */
	void exitPrimario(CodexLatinusParser.PrimarioContext ctx);
}