// Generated from com/mycompany/codexlatinuscompiler/lexerparser/CodexLatinus.g4 by ANTLR 4.13.2
package com.mycompany.codexlatinuscompiler.lexerparser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CodexLatinusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABILES_HDR=1, VARIABILES_LOCAL_HDR=2, MUNERA_HDR=3, MAIOR_HDR=4, FINIS_PROGRAMA=5, 
		ESTO=6, SERIES=7, STRUCTURA=8, FINIS_SENTENCIAS=9, SI=10, ALITER=11, DUM=12, 
		FACERE=13, PER=14, PERGE=15, INTERRUMPE=16, ACTIO=17, RATIO=18, REDDERE=19, 
		NON=20, NUMERUS=21, TEXTUM=22, DECIMALIS=23, LITTERA=24, VERUM=25, FALSUS=26, 
		BOOL=27, EQ=28, NEQ=29, LE=30, GE=31, AND=32, OR=33, INC=34, DEC=35, LEER=36, 
		ESCRIBIR=37, LT=38, GT=39, PLUS=40, MINUS=41, MULT=42, DIV=43, ASSIGN=44, 
		LPAREN=45, RPAREN=46, LBRACE=47, RBRACE=48, LBRACK=49, RBRACK=50, SEMI=51, 
		COLON=52, COMMA=53, DOT=54, ID=55, NUM_LIT=56, DEC_LIT=57, TEXTO_LIT=58, 
		CHAR_LIT=59, COMMENT_LINE=60, COMMENT_BLOCK=61, WS=62;
	public static final int
		RULE_programa = 0, RULE_seccionVariables = 1, RULE_seccionFunciones = 2, 
		RULE_seccionPrincipal = 3, RULE_declaracion = 4, RULE_declaracionVariable = 5, 
		RULE_declaracionArray = 6, RULE_declaracionStructDef = 7, RULE_listaAtributos = 8, 
		RULE_atributo = 9, RULE_declaracionStructVar = 10, RULE_literalEstructura = 11, 
		RULE_listaAsignAtributos = 12, RULE_asignAtributo = 13, RULE_valorAtributo = 14, 
		RULE_tipo = 15, RULE_tipoPrimitivo = 16, RULE_sentencia = 17, RULE_retorno = 18, 
		RULE_asignacion = 19, RULE_accesoAsignable = 20, RULE_condicional = 21, 
		RULE_bloque = 22, RULE_cicloDum = 23, RULE_cicloFacere = 24, RULE_cicloPer = 25, 
		RULE_funcion = 26, RULE_listaParametros = 27, RULE_parametro = 28, RULE_llamadaFuncion = 29, 
		RULE_listaExpresiones = 30, RULE_lectura = 31, RULE_escritura = 32, RULE_expresion = 33, 
		RULE_expresionLogica = 34, RULE_expresionRelacional = 35, RULE_expresionAditiva = 36, 
		RULE_expresionMultiplicativa = 37, RULE_expresionUnaria = 38, RULE_primario = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "seccionVariables", "seccionFunciones", "seccionPrincipal", 
			"declaracion", "declaracionVariable", "declaracionArray", "declaracionStructDef", 
			"listaAtributos", "atributo", "declaracionStructVar", "literalEstructura", 
			"listaAsignAtributos", "asignAtributo", "valorAtributo", "tipo", "tipoPrimitivo", 
			"sentencia", "retorno", "asignacion", "accesoAsignable", "condicional", 
			"bloque", "cicloDum", "cicloFacere", "cicloPer", "funcion", "listaParametros", 
			"parametro", "llamadaFuncion", "listaExpresiones", "lectura", "escritura", 
			"expresion", "expresionLogica", "expresionRelacional", "expresionAditiva", 
			"expresionMultiplicativa", "expresionUnaria", "primario"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'VARIABILES>'", "'VARIABILES['", "'MUNERA>'", "'MAIOR>'", "'FINIS'", 
			"'esto'", "'series'", "'structura'", "'finis'", "'si'", "'aliter'", "'dum'", 
			"'facere'", "'per'", "'perge'", "'interrumpe'", "'actio'", "'ratio'", 
			"'reddere'", "'non'", "'numerus'", "'textum'", "'decimalis'", "'littera'", 
			"'verum'", "'falsus'", "'bool'", "'=='", "'!='", "'<='", "'>='", "'&&'", 
			"'||'", "'++'", "'--'", "'<<'", "'>>'", "'<'", "'>'", "'+'", "'-'", "'*'", 
			"'/'", "'='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "':'", 
			"','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VARIABILES_HDR", "VARIABILES_LOCAL_HDR", "MUNERA_HDR", "MAIOR_HDR", 
			"FINIS_PROGRAMA", "ESTO", "SERIES", "STRUCTURA", "FINIS_SENTENCIAS", 
			"SI", "ALITER", "DUM", "FACERE", "PER", "PERGE", "INTERRUMPE", "ACTIO", 
			"RATIO", "REDDERE", "NON", "NUMERUS", "TEXTUM", "DECIMALIS", "LITTERA", 
			"VERUM", "FALSUS", "BOOL", "EQ", "NEQ", "LE", "GE", "AND", "OR", "INC", 
			"DEC", "LEER", "ESCRIBIR", "LT", "GT", "PLUS", "MINUS", "MULT", "DIV", 
			"ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COLON", "COMMA", "DOT", "ID", "NUM_LIT", "DEC_LIT", "TEXTO_LIT", 
			"CHAR_LIT", "COMMENT_LINE", "COMMENT_BLOCK", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CodexLatinus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CodexLatinusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public SeccionPrincipalContext seccionPrincipal() {
			return getRuleContext(SeccionPrincipalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CodexLatinusParser.EOF, 0); }
		public SeccionVariablesContext seccionVariables() {
			return getRuleContext(SeccionVariablesContext.class,0);
		}
		public SeccionFuncionesContext seccionFunciones() {
			return getRuleContext(SeccionFuncionesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES_HDR) {
				{
				setState(80);
				seccionVariables();
				}
			}

			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUNERA_HDR) {
				{
				setState(83);
				seccionFunciones();
				}
			}

			setState(86);
			seccionPrincipal();
			setState(87);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeccionVariablesContext extends ParserRuleContext {
		public TerminalNode VARIABILES_HDR() { return getToken(CodexLatinusParser.VARIABILES_HDR, 0); }
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public SeccionVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seccionVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterSeccionVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitSeccionVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitSeccionVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccionVariablesContext seccionVariables() throws RecognitionException {
		SeccionVariablesContext _localctx = new SeccionVariablesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_seccionVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(VARIABILES_HDR);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) {
				{
				{
				setState(90);
				declaracion();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeccionFuncionesContext extends ParserRuleContext {
		public TerminalNode MUNERA_HDR() { return getToken(CodexLatinusParser.MUNERA_HDR, 0); }
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public SeccionFuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seccionFunciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterSeccionFunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitSeccionFunciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitSeccionFunciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccionFuncionesContext seccionFunciones() throws RecognitionException {
		SeccionFuncionesContext _localctx = new SeccionFuncionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_seccionFunciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(MUNERA_HDR);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTIO || _la==RATIO) {
				{
				{
				setState(97);
				funcion();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeccionPrincipalContext extends ParserRuleContext {
		public TerminalNode MAIOR_HDR() { return getToken(CodexLatinusParser.MAIOR_HDR, 0); }
		public TerminalNode FINIS_PROGRAMA() { return getToken(CodexLatinusParser.FINIS_PROGRAMA, 0); }
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SeccionPrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seccionPrincipal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterSeccionPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitSeccionPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitSeccionPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccionPrincipalContext seccionPrincipal() throws RecognitionException {
		SeccionPrincipalContext _localctx = new SeccionPrincipalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_seccionPrincipal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(MAIOR_HDR);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116930348783629760L) != 0)) {
				{
				{
				setState(104);
				sentencia();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(FINIS_PROGRAMA);
			setState(111);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public DeclaracionVariableContext declaracionVariable() {
			return getRuleContext(DeclaracionVariableContext.class,0);
		}
		public DeclaracionArrayContext declaracionArray() {
			return getRuleContext(DeclaracionArrayContext.class,0);
		}
		public DeclaracionStructDefContext declaracionStructDef() {
			return getRuleContext(DeclaracionStructDefContext.class,0);
		}
		public DeclaracionStructVarContext declaracionStructVar() {
			return getRuleContext(DeclaracionStructVarContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				declaracionVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				declaracionArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				declaracionStructDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				declaracionStructVar();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionVariableContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public TipoPrimitivoContext tipoPrimitivo() {
			return getRuleContext(TipoPrimitivoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode VERUM() { return getToken(CodexLatinusParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(CodexLatinusParser.FALSUS, 0); }
		public DeclaracionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterDeclaracionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitDeclaracionVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitDeclaracionVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionVariableContext declaracionVariable() throws RecognitionException {
		DeclaracionVariableContext _localctx = new DeclaracionVariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracionVariable);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(ESTO);
				setState(120);
				match(ID);
				setState(121);
				match(COLON);
				setState(122);
				tipoPrimitivo();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116930142624546816L) != 0)) {
					{
					setState(123);
					expresion();
					}
				}

				setState(126);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(ESTO);
				setState(129);
				match(ID);
				setState(130);
				match(COLON);
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==VERUM || _la==FALSUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionArrayContext extends ParserRuleContext {
		public TerminalNode SERIES() { return getToken(CodexLatinusParser.SERIES, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(CodexLatinusParser.LBRACK, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(CodexLatinusParser.RBRACK, 0); }
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public ListaExpresionesContext listaExpresiones() {
			return getRuleContext(ListaExpresionesContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public DeclaracionArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterDeclaracionArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitDeclaracionArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitDeclaracionArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionArrayContext declaracionArray() throws RecognitionException {
		DeclaracionArrayContext _localctx = new DeclaracionArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracionArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(SERIES);
			setState(136);
			match(ID);
			setState(137);
			match(LBRACK);
			setState(138);
			expresion();
			setState(139);
			match(RBRACK);
			setState(140);
			match(COLON);
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERUS:
			case TEXTUM:
			case DECIMALIS:
			case LITTERA:
			case BOOL:
			case ID:
				{
				setState(141);
				tipo();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(142);
					match(LBRACE);
					setState(143);
					listaExpresiones();
					setState(144);
					match(RBRACE);
					}
				}

				}
				break;
			case LBRACE:
				{
				setState(148);
				match(LBRACE);
				setState(149);
				listaExpresiones();
				setState(150);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(154);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionStructDefContext extends ParserRuleContext {
		public TerminalNode STRUCTURA() { return getToken(CodexLatinusParser.STRUCTURA, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public ListaAtributosContext listaAtributos() {
			return getRuleContext(ListaAtributosContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public TerminalNode FINIS_SENTENCIAS() { return getToken(CodexLatinusParser.FINIS_SENTENCIAS, 0); }
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public DeclaracionStructDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionStructDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterDeclaracionStructDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitDeclaracionStructDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitDeclaracionStructDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionStructDefContext declaracionStructDef() throws RecognitionException {
		DeclaracionStructDefContext _localctx = new DeclaracionStructDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracionStructDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(STRUCTURA);
			setState(157);
			match(ID);
			setState(158);
			match(LBRACE);
			setState(159);
			listaAtributos();
			setState(160);
			match(RBRACE);
			setState(161);
			match(FINIS_SENTENCIAS);
			setState(162);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaAtributosContext extends ParserRuleContext {
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CodexLatinusParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CodexLatinusParser.SEMI, i);
		}
		public ListaAtributosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaAtributos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterListaAtributos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitListaAtributos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitListaAtributos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaAtributosContext listaAtributos() throws RecognitionException {
		ListaAtributosContext _localctx = new ListaAtributosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaAtributos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTO || _la==SERIES) {
				{
				{
				setState(164);
				atributo();
				setState(165);
				match(SEMI);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtributoContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SERIES() { return getToken(CodexLatinusParser.SERIES, 0); }
		public TerminalNode VERUM() { return getToken(CodexLatinusParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(CodexLatinusParser.FALSUS, 0); }
		public AtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitAtributo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitAtributo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoContext atributo() throws RecognitionException {
		AtributoContext _localctx = new AtributoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atributo);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(ESTO);
				setState(173);
				match(ID);
				setState(174);
				match(COLON);
				setState(175);
				tipo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(SERIES);
				setState(177);
				match(ID);
				setState(178);
				match(COLON);
				setState(179);
				tipo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(ESTO);
				setState(181);
				match(ID);
				setState(182);
				match(COLON);
				setState(183);
				_la = _input.LA(1);
				if ( !(_la==VERUM || _la==FALSUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionStructVarContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusParser.ESTO, 0); }
		public List<TerminalNode> ID() { return getTokens(CodexLatinusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public LiteralEstructuraContext literalEstructura() {
			return getRuleContext(LiteralEstructuraContext.class,0);
		}
		public DeclaracionStructVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionStructVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterDeclaracionStructVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitDeclaracionStructVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitDeclaracionStructVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionStructVarContext declaracionStructVar() throws RecognitionException {
		DeclaracionStructVarContext _localctx = new DeclaracionStructVarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracionStructVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ESTO);
			setState(187);
			match(ID);
			setState(188);
			match(COLON);
			setState(189);
			match(ID);
			setState(190);
			literalEstructura();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralEstructuraContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public ListaAsignAtributosContext listaAsignAtributos() {
			return getRuleContext(ListaAsignAtributosContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public LiteralEstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalEstructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterLiteralEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitLiteralEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitLiteralEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralEstructuraContext literalEstructura() throws RecognitionException {
		LiteralEstructuraContext _localctx = new LiteralEstructuraContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literalEstructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(LBRACE);
			setState(193);
			listaAsignAtributos();
			setState(194);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaAsignAtributosContext extends ParserRuleContext {
		public List<AsignAtributoContext> asignAtributo() {
			return getRuleContexts(AsignAtributoContext.class);
		}
		public AsignAtributoContext asignAtributo(int i) {
			return getRuleContext(AsignAtributoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodexLatinusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodexLatinusParser.COMMA, i);
		}
		public ListaAsignAtributosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaAsignAtributos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterListaAsignAtributos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitListaAsignAtributos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitListaAsignAtributos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaAsignAtributosContext listaAsignAtributos() throws RecognitionException {
		ListaAsignAtributosContext _localctx = new ListaAsignAtributosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listaAsignAtributos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			asignAtributo();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(197);
				match(COMMA);
				setState(198);
				asignAtributo();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignAtributoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public ValorAtributoContext valorAtributo() {
			return getRuleContext(ValorAtributoContext.class,0);
		}
		public AsignAtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignAtributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterAsignAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitAsignAtributo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitAsignAtributo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignAtributoContext asignAtributo() throws RecognitionException {
		AsignAtributoContext _localctx = new AsignAtributoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_asignAtributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(ID);
			setState(205);
			match(COLON);
			setState(206);
			valorAtributo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorAtributoContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public LiteralEstructuraContext literalEstructura() {
			return getRuleContext(LiteralEstructuraContext.class,0);
		}
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(CodexLatinusParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CodexLatinusParser.RBRACK, 0); }
		public ValorAtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorAtributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterValorAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitValorAtributo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitValorAtributo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorAtributoContext valorAtributo() throws RecognitionException {
		ValorAtributoContext _localctx = new ValorAtributoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valorAtributo);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				literalEstructura();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(ID);
				setState(211);
				match(LBRACK);
				setState(212);
				expresion();
				setState(213);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoPrimitivoContext tipoPrimitivo() {
			return getRuleContext(TipoPrimitivoContext.class,0);
		}
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERUS:
			case TEXTUM:
			case DECIMALIS:
			case LITTERA:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				tipoPrimitivo();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoPrimitivoContext extends ParserRuleContext {
		public TerminalNode NUMERUS() { return getToken(CodexLatinusParser.NUMERUS, 0); }
		public TerminalNode TEXTUM() { return getToken(CodexLatinusParser.TEXTUM, 0); }
		public TerminalNode DECIMALIS() { return getToken(CodexLatinusParser.DECIMALIS, 0); }
		public TerminalNode LITTERA() { return getToken(CodexLatinusParser.LITTERA, 0); }
		public TerminalNode BOOL() { return getToken(CodexLatinusParser.BOOL, 0); }
		public TipoPrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoPrimitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterTipoPrimitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitTipoPrimitivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitTipoPrimitivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoPrimitivoContext tipoPrimitivo() throws RecognitionException {
		TipoPrimitivoContext _localctx = new TipoPrimitivoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipoPrimitivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 165675008L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public ExpresionUnariaContext expresionUnaria() {
			return getRuleContext(ExpresionUnariaContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CicloDumContext cicloDum() {
			return getRuleContext(CicloDumContext.class,0);
		}
		public CicloFacereContext cicloFacere() {
			return getRuleContext(CicloFacereContext.class,0);
		}
		public CicloPerContext cicloPer() {
			return getRuleContext(CicloPerContext.class,0);
		}
		public TerminalNode PERGE() { return getToken(CodexLatinusParser.PERGE, 0); }
		public TerminalNode INTERRUMPE() { return getToken(CodexLatinusParser.INTERRUMPE, 0); }
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public EscrituraContext escritura() {
			return getRuleContext(EscrituraContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sentencia);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				llamadaFuncion();
				setState(226);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				expresionUnaria();
				setState(229);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				condicional();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				cicloDum();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(233);
				cicloFacere();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				cicloPer();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(235);
				match(PERGE);
				setState(236);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(237);
				match(INTERRUMPE);
				setState(238);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(239);
				lectura();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(240);
				escritura();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(241);
				retorno();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode REDDERE() { return getToken(CodexLatinusParser.REDDERE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(REDDERE);
			setState(245);
			expresion();
			setState(246);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public AccesoAsignableContext accesoAsignable() {
			return getRuleContext(AccesoAsignableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CodexLatinusParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public LiteralEstructuraContext literalEstructura() {
			return getRuleContext(LiteralEstructuraContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_asignacion);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				accesoAsignable();
				setState(249);
				match(ASSIGN);
				setState(250);
				expresion();
				setState(251);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				accesoAsignable();
				setState(254);
				match(ASSIGN);
				setState(255);
				literalEstructura();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccesoAsignableContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CodexLatinusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusParser.ID, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(CodexLatinusParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CodexLatinusParser.LBRACK, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CodexLatinusParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CodexLatinusParser.RBRACK, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CodexLatinusParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CodexLatinusParser.DOT, i);
		}
		public AccesoAsignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesoAsignable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterAccesoAsignable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitAccesoAsignable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitAccesoAsignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesoAsignableContext accesoAsignable() throws RecognitionException {
		AccesoAsignableContext _localctx = new AccesoAsignableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_accesoAsignable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ID);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(260);
				match(LBRACK);
				setState(261);
				expresion();
				setState(262);
				match(RBRACK);
				}
			}

			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(266);
				match(DOT);
				setState(267);
				match(ID);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(268);
					match(LBRACK);
					setState(269);
					expresion();
					setState(270);
					match(RBRACK);
					}
				}

				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(CodexLatinusParser.SI, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(CodexLatinusParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CodexLatinusParser.LPAREN, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CodexLatinusParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CodexLatinusParser.RPAREN, i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode FINIS_SENTENCIAS() { return getToken(CodexLatinusParser.FINIS_SENTENCIAS, 0); }
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public List<TerminalNode> ALITER() { return getTokens(CodexLatinusParser.ALITER); }
		public TerminalNode ALITER(int i) {
			return getToken(CodexLatinusParser.ALITER, i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condicional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(SI);
			setState(280);
			match(LPAREN);
			setState(281);
			expresion();
			setState(282);
			match(RPAREN);
			setState(283);
			bloque();
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(284);
					match(ALITER);
					setState(285);
					match(LPAREN);
					setState(286);
					expresion();
					setState(287);
					match(RPAREN);
					setState(288);
					bloque();
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALITER) {
				{
				setState(295);
				match(ALITER);
				setState(296);
				bloque();
				}
			}

			setState(299);
			match(FINIS_SENTENCIAS);
			setState(300);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(LBRACE);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116930348783629760L) != 0)) {
				{
				{
				setState(303);
				sentencia();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CicloDumContext extends ParserRuleContext {
		public TerminalNode DUM() { return getToken(CodexLatinusParser.DUM, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodexLatinusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public TerminalNode FINIS_SENTENCIAS() { return getToken(CodexLatinusParser.FINIS_SENTENCIAS, 0); }
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public CicloDumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloDum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterCicloDum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitCicloDum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitCicloDum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloDumContext cicloDum() throws RecognitionException {
		CicloDumContext _localctx = new CicloDumContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cicloDum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(DUM);
			setState(312);
			match(LPAREN);
			setState(313);
			expresion();
			setState(314);
			match(RPAREN);
			setState(315);
			match(LBRACE);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116930348783629760L) != 0)) {
				{
				{
				setState(316);
				sentencia();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			match(RBRACE);
			setState(323);
			match(FINIS_SENTENCIAS);
			setState(324);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CicloFacereContext extends ParserRuleContext {
		public TerminalNode FACERE() { return getToken(CodexLatinusParser.FACERE, 0); }
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public TerminalNode DUM() { return getToken(CodexLatinusParser.DUM, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodexLatinusParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public CicloFacereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloFacere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterCicloFacere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitCicloFacere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitCicloFacere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloFacereContext cicloFacere() throws RecognitionException {
		CicloFacereContext _localctx = new CicloFacereContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cicloFacere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(FACERE);
			setState(327);
			match(LBRACE);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116930348783629760L) != 0)) {
				{
				{
				setState(328);
				sentencia();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			match(RBRACE);
			setState(335);
			match(DUM);
			setState(336);
			match(LPAREN);
			setState(337);
			expresion();
			setState(338);
			match(RPAREN);
			setState(339);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CicloPerContext extends ParserRuleContext {
		public TerminalNode PER() { return getToken(CodexLatinusParser.PER, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusParser.LPAREN, 0); }
		public DeclaracionVariableContext declaracionVariable() {
			return getRuleContext(DeclaracionVariableContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public TerminalNode RPAREN() { return getToken(CodexLatinusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public CicloPerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloPer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterCicloPer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitCicloPer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitCicloPer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloPerContext cicloPer() throws RecognitionException {
		CicloPerContext _localctx = new CicloPerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cicloPer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(PER);
			setState(342);
			match(LPAREN);
			setState(343);
			declaracionVariable();
			setState(344);
			expresion();
			setState(345);
			match(SEMI);
			setState(346);
			expresion();
			setState(347);
			match(RPAREN);
			setState(348);
			match(LBRACE);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116930348783629760L) != 0)) {
				{
				{
				setState(349);
				sentencia();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode ACTIO() { return getToken(CodexLatinusParser.ACTIO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodexLatinusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public TerminalNode FINIS_SENTENCIAS() { return getToken(CodexLatinusParser.FINIS_SENTENCIAS, 0); }
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public TerminalNode VARIABILES_LOCAL_HDR() { return getToken(CodexLatinusParser.VARIABILES_LOCAL_HDR, 0); }
		public TerminalNode RBRACK() { return getToken(CodexLatinusParser.RBRACK, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public TerminalNode RATIO() { return getToken(CodexLatinusParser.RATIO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funcion);
		int _la;
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(ACTIO);
				setState(358);
				match(ID);
				setState(359);
				match(LPAREN);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESTO) {
					{
					setState(360);
					listaParametros();
					}
				}

				setState(363);
				match(RPAREN);
				setState(364);
				match(LBRACE);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABILES_LOCAL_HDR) {
					{
					setState(365);
					match(VARIABILES_LOCAL_HDR);
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) {
						{
						{
						setState(366);
						declaracion();
						}
						}
						setState(371);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(372);
					match(RBRACK);
					}
				}

				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116930348783629760L) != 0)) {
					{
					{
					setState(375);
					sentencia();
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381);
				match(RBRACE);
				setState(382);
				match(FINIS_SENTENCIAS);
				setState(383);
				match(SEMI);
				}
				break;
			case RATIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(RATIO);
				setState(385);
				tipo();
				setState(386);
				match(ID);
				setState(387);
				match(LPAREN);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESTO) {
					{
					setState(388);
					listaParametros();
					}
				}

				setState(391);
				match(RPAREN);
				setState(392);
				match(LBRACE);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABILES_LOCAL_HDR) {
					{
					setState(393);
					match(VARIABILES_LOCAL_HDR);
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) {
						{
						{
						setState(394);
						declaracion();
						}
						}
						setState(399);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(400);
					match(RBRACK);
					}
				}

				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116930348783629760L) != 0)) {
					{
					{
					setState(403);
					sentencia();
					}
					}
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(409);
				match(RBRACE);
				setState(410);
				match(FINIS_SENTENCIAS);
				setState(411);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodexLatinusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodexLatinusParser.COMMA, i);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitListaParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitListaParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			parametro();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(416);
				match(COMMA);
				setState(417);
				parametro();
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(ESTO);
			setState(424);
			match(ID);
			setState(425);
			match(COLON);
			setState(426);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaFuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodexLatinusParser.RPAREN, 0); }
		public ListaExpresionesContext listaExpresiones() {
			return getRuleContext(ListaExpresionesContext.class,0);
		}
		public LlamadaFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterLlamadaFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitLlamadaFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitLlamadaFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaFuncionContext llamadaFuncion() throws RecognitionException {
		LlamadaFuncionContext _localctx = new LlamadaFuncionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_llamadaFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(ID);
			setState(429);
			match(LPAREN);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116930142624546816L) != 0)) {
				{
				setState(430);
				listaExpresiones();
				}
			}

			setState(433);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaExpresionesContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodexLatinusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodexLatinusParser.COMMA, i);
		}
		public ListaExpresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpresiones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterListaExpresiones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitListaExpresiones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitListaExpresiones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaExpresionesContext listaExpresiones() throws RecognitionException {
		ListaExpresionesContext _localctx = new ListaExpresionesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_listaExpresiones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			expresion();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(436);
				match(COMMA);
				setState(437);
				expresion();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LecturaContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(CodexLatinusParser.LEER, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterLectura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitLectura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitLectura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_lectura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(443);
				match(ID);
				}
			}

			setState(446);
			match(LEER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscrituraContext extends ParserRuleContext {
		public List<TerminalNode> ESCRIBIR() { return getTokens(CodexLatinusParser.ESCRIBIR); }
		public TerminalNode ESCRIBIR(int i) {
			return getToken(CodexLatinusParser.ESCRIBIR, i);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public EscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterEscritura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitEscritura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitEscritura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscrituraContext escritura() throws RecognitionException {
		EscrituraContext _localctx = new EscrituraContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_escritura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(ESCRIBIR);
			{
			setState(449);
			expresion();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESCRIBIR) {
				{
				{
				setState(450);
				match(ESCRIBIR);
				setState(451);
				expresion();
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(457);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionLogicaContext expresionLogica() {
			return getRuleContext(ExpresionLogicaContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			expresionLogica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionLogicaContext extends ParserRuleContext {
		public List<ExpresionRelacionalContext> expresionRelacional() {
			return getRuleContexts(ExpresionRelacionalContext.class);
		}
		public ExpresionRelacionalContext expresionRelacional(int i) {
			return getRuleContext(ExpresionRelacionalContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CodexLatinusParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CodexLatinusParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(CodexLatinusParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CodexLatinusParser.OR, i);
		}
		public ExpresionLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterExpresionLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitExpresionLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitExpresionLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionLogicaContext expresionLogica() throws RecognitionException {
		ExpresionLogicaContext _localctx = new ExpresionLogicaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expresionLogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			expresionRelacional();
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(462);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(463);
				expresionRelacional();
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionRelacionalContext extends ParserRuleContext {
		public List<ExpresionAditivaContext> expresionAditiva() {
			return getRuleContexts(ExpresionAditivaContext.class);
		}
		public ExpresionAditivaContext expresionAditiva(int i) {
			return getRuleContext(ExpresionAditivaContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(CodexLatinusParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(CodexLatinusParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(CodexLatinusParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(CodexLatinusParser.NEQ, i);
		}
		public List<TerminalNode> LT() { return getTokens(CodexLatinusParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CodexLatinusParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CodexLatinusParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CodexLatinusParser.GT, i);
		}
		public List<TerminalNode> LE() { return getTokens(CodexLatinusParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(CodexLatinusParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(CodexLatinusParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(CodexLatinusParser.GE, i);
		}
		public ExpresionRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterExpresionRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitExpresionRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitExpresionRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionRelacionalContext expresionRelacional() throws RecognitionException {
		ExpresionRelacionalContext _localctx = new ExpresionRelacionalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expresionRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			expresionAditiva();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 828660252672L) != 0)) {
				{
				{
				setState(470);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 828660252672L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(471);
				expresionAditiva();
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionAditivaContext extends ParserRuleContext {
		public List<ExpresionMultiplicativaContext> expresionMultiplicativa() {
			return getRuleContexts(ExpresionMultiplicativaContext.class);
		}
		public ExpresionMultiplicativaContext expresionMultiplicativa(int i) {
			return getRuleContext(ExpresionMultiplicativaContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CodexLatinusParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CodexLatinusParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CodexLatinusParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CodexLatinusParser.MINUS, i);
		}
		public ExpresionAditivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionAditiva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterExpresionAditiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitExpresionAditiva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitExpresionAditiva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionAditivaContext expresionAditiva() throws RecognitionException {
		ExpresionAditivaContext _localctx = new ExpresionAditivaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expresionAditiva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			expresionMultiplicativa();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(478);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(479);
				expresionMultiplicativa();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionMultiplicativaContext extends ParserRuleContext {
		public List<ExpresionUnariaContext> expresionUnaria() {
			return getRuleContexts(ExpresionUnariaContext.class);
		}
		public ExpresionUnariaContext expresionUnaria(int i) {
			return getRuleContext(ExpresionUnariaContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CodexLatinusParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CodexLatinusParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CodexLatinusParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CodexLatinusParser.DIV, i);
		}
		public ExpresionMultiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionMultiplicativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterExpresionMultiplicativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitExpresionMultiplicativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitExpresionMultiplicativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionMultiplicativaContext expresionMultiplicativa() throws RecognitionException {
		ExpresionMultiplicativaContext _localctx = new ExpresionMultiplicativaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expresionMultiplicativa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			expresionUnaria();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(486);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(487);
				expresionUnaria();
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionUnariaContext extends ParserRuleContext {
		public TerminalNode NON() { return getToken(CodexLatinusParser.NON, 0); }
		public ExpresionUnariaContext expresionUnaria() {
			return getRuleContext(ExpresionUnariaContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CodexLatinusParser.MINUS, 0); }
		public PrimarioContext primario() {
			return getRuleContext(PrimarioContext.class,0);
		}
		public TerminalNode INC() { return getToken(CodexLatinusParser.INC, 0); }
		public TerminalNode DEC() { return getToken(CodexLatinusParser.DEC, 0); }
		public ExpresionUnariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionUnaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterExpresionUnaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitExpresionUnaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitExpresionUnaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionUnariaContext expresionUnaria() throws RecognitionException {
		ExpresionUnariaContext _localctx = new ExpresionUnariaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expresionUnaria);
		int _la;
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(NON);
				setState(494);
				expresionUnaria();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				match(MINUS);
				setState(496);
				expresionUnaria();
				}
				break;
			case INC:
			case DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(498);
				primario();
				}
				break;
			case VERUM:
			case FALSUS:
			case LPAREN:
			case ID:
			case NUM_LIT:
			case DEC_LIT:
			case TEXTO_LIT:
			case CHAR_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(499);
				primario();
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(500);
					_la = _input.LA(1);
					if ( !(_la==INC || _la==DEC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CodexLatinusParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodexLatinusParser.RPAREN, 0); }
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public AccesoAsignableContext accesoAsignable() {
			return getRuleContext(AccesoAsignableContext.class,0);
		}
		public TerminalNode NUM_LIT() { return getToken(CodexLatinusParser.NUM_LIT, 0); }
		public TerminalNode DEC_LIT() { return getToken(CodexLatinusParser.DEC_LIT, 0); }
		public TerminalNode TEXTO_LIT() { return getToken(CodexLatinusParser.TEXTO_LIT, 0); }
		public TerminalNode CHAR_LIT() { return getToken(CodexLatinusParser.CHAR_LIT, 0); }
		public TerminalNode VERUM() { return getToken(CodexLatinusParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(CodexLatinusParser.FALSUS, 0); }
		public PrimarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterPrimario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitPrimario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitPrimario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimarioContext primario() throws RecognitionException {
		PrimarioContext _localctx = new PrimarioContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_primario);
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(LPAREN);
				setState(506);
				expresion();
				setState(507);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				llamadaFuncion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				accesoAsignable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				match(NUM_LIT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(512);
				match(DEC_LIT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(513);
				match(TEXTO_LIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(514);
				match(CHAR_LIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(515);
				match(VERUM);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(516);
				match(FALSUS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u0208\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0003\u0000R\b\u0000\u0001\u0000\u0003\u0000U\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\\\b\u0001"+
		"\n\u0001\f\u0001_\t\u0001\u0001\u0002\u0001\u0002\u0005\u0002c\b\u0002"+
		"\n\u0002\f\u0002f\t\u0002\u0001\u0003\u0001\u0003\u0005\u0003j\b\u0003"+
		"\n\u0003\f\u0003m\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004v\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005}\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0086\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0093\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0099\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00a8\b\b\n\b"+
		"\f\b\u00ab\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b9\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00c8\b\f\n\f\f\f\u00cb\t"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d8\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00dc\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00f3\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0102\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0109\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0111\b\u0014\u0005\u0014\u0113\b\u0014\n\u0014"+
		"\f\u0014\u0116\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u0123\b\u0015\n\u0015\f\u0015\u0126\t\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u012a\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u0131\b\u0016\n\u0016\f\u0016"+
		"\u0134\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u013e\b\u0017\n\u0017"+
		"\f\u0017\u0141\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u014a\b\u0018\n\u0018"+
		"\f\u0018\u014d\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u015f\b\u0019\n\u0019\f\u0019\u0162\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u016a"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0170"+
		"\b\u001a\n\u001a\f\u001a\u0173\t\u001a\u0001\u001a\u0003\u001a\u0176\b"+
		"\u001a\u0001\u001a\u0005\u001a\u0179\b\u001a\n\u001a\f\u001a\u017c\t\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0186\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u018c\b\u001a\n\u001a\f\u001a\u018f"+
		"\t\u001a\u0001\u001a\u0003\u001a\u0192\b\u001a\u0001\u001a\u0005\u001a"+
		"\u0195\b\u001a\n\u001a\f\u001a\u0198\t\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u019e\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u01a3\b\u001b\n\u001b\f\u001b\u01a6\t\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u01b0\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u01b7\b\u001e\n\u001e\f\u001e\u01ba"+
		"\t\u001e\u0001\u001f\u0003\u001f\u01bd\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0005 \u01c5\b \n \f \u01c8\t \u0001 \u0001"+
		" \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0005\"\u01d1\b\"\n\"\f\"\u01d4"+
		"\t\"\u0001#\u0001#\u0001#\u0005#\u01d9\b#\n#\f#\u01dc\t#\u0001$\u0001"+
		"$\u0001$\u0005$\u01e1\b$\n$\f$\u01e4\t$\u0001%\u0001%\u0001%\u0005%\u01e9"+
		"\b%\n%\f%\u01ec\t%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u01f6\b&\u0003&\u01f8\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0206"+
		"\b\'\u0001\'\u0000\u0000(\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLN\u0000\u0007"+
		"\u0001\u0000\u0019\u001a\u0002\u0000\u0015\u0018\u001b\u001b\u0001\u0000"+
		" !\u0002\u0000\u001c\u001f&\'\u0001\u0000()\u0001\u0000*+\u0001\u0000"+
		"\"#\u0226\u0000Q\u0001\u0000\u0000\u0000\u0002Y\u0001\u0000\u0000\u0000"+
		"\u0004`\u0001\u0000\u0000\u0000\u0006g\u0001\u0000\u0000\u0000\bu\u0001"+
		"\u0000\u0000\u0000\n\u0085\u0001\u0000\u0000\u0000\f\u0087\u0001\u0000"+
		"\u0000\u0000\u000e\u009c\u0001\u0000\u0000\u0000\u0010\u00a9\u0001\u0000"+
		"\u0000\u0000\u0012\u00b8\u0001\u0000\u0000\u0000\u0014\u00ba\u0001\u0000"+
		"\u0000\u0000\u0016\u00c0\u0001\u0000\u0000\u0000\u0018\u00c4\u0001\u0000"+
		"\u0000\u0000\u001a\u00cc\u0001\u0000\u0000\u0000\u001c\u00d7\u0001\u0000"+
		"\u0000\u0000\u001e\u00db\u0001\u0000\u0000\u0000 \u00dd\u0001\u0000\u0000"+
		"\u0000\"\u00f2\u0001\u0000\u0000\u0000$\u00f4\u0001\u0000\u0000\u0000"+
		"&\u0101\u0001\u0000\u0000\u0000(\u0103\u0001\u0000\u0000\u0000*\u0117"+
		"\u0001\u0000\u0000\u0000,\u012e\u0001\u0000\u0000\u0000.\u0137\u0001\u0000"+
		"\u0000\u00000\u0146\u0001\u0000\u0000\u00002\u0155\u0001\u0000\u0000\u0000"+
		"4\u019d\u0001\u0000\u0000\u00006\u019f\u0001\u0000\u0000\u00008\u01a7"+
		"\u0001\u0000\u0000\u0000:\u01ac\u0001\u0000\u0000\u0000<\u01b3\u0001\u0000"+
		"\u0000\u0000>\u01bc\u0001\u0000\u0000\u0000@\u01c0\u0001\u0000\u0000\u0000"+
		"B\u01cb\u0001\u0000\u0000\u0000D\u01cd\u0001\u0000\u0000\u0000F\u01d5"+
		"\u0001\u0000\u0000\u0000H\u01dd\u0001\u0000\u0000\u0000J\u01e5\u0001\u0000"+
		"\u0000\u0000L\u01f7\u0001\u0000\u0000\u0000N\u0205\u0001\u0000\u0000\u0000"+
		"PR\u0003\u0002\u0001\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RT\u0001\u0000\u0000\u0000SU\u0003\u0004\u0002\u0000TS\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0003"+
		"\u0006\u0003\u0000WX\u0005\u0000\u0000\u0001X\u0001\u0001\u0000\u0000"+
		"\u0000Y]\u0005\u0001\u0000\u0000Z\\\u0003\b\u0004\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^\u0003\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000`d\u0005\u0003\u0000\u0000ac\u00034\u001a\u0000ba\u0001\u0000\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000e\u0005\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"gk\u0005\u0004\u0000\u0000hj\u0003\"\u0011\u0000ih\u0001\u0000\u0000\u0000"+
		"jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005\u0005"+
		"\u0000\u0000op\u00053\u0000\u0000p\u0007\u0001\u0000\u0000\u0000qv\u0003"+
		"\n\u0005\u0000rv\u0003\f\u0006\u0000sv\u0003\u000e\u0007\u0000tv\u0003"+
		"\u0014\n\u0000uq\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\t\u0001\u0000\u0000\u0000"+
		"wx\u0005\u0006\u0000\u0000xy\u00057\u0000\u0000yz\u00054\u0000\u0000z"+
		"|\u0003 \u0010\u0000{}\u0003B!\u0000|{\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u00053\u0000\u0000"+
		"\u007f\u0086\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0006\u0000\u0000"+
		"\u0081\u0082\u00057\u0000\u0000\u0082\u0083\u00054\u0000\u0000\u0083\u0084"+
		"\u0007\u0000\u0000\u0000\u0084\u0086\u00053\u0000\u0000\u0085w\u0001\u0000"+
		"\u0000\u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0086\u000b\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005\u0007\u0000\u0000\u0088\u0089\u00057\u0000"+
		"\u0000\u0089\u008a\u00051\u0000\u0000\u008a\u008b\u0003B!\u0000\u008b"+
		"\u008c\u00052\u0000\u0000\u008c\u0098\u00054\u0000\u0000\u008d\u0092\u0003"+
		"\u001e\u000f\u0000\u008e\u008f\u0005/\u0000\u0000\u008f\u0090\u0003<\u001e"+
		"\u0000\u0090\u0091\u00050\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000"+
		"\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0099\u0001\u0000\u0000\u0000\u0094\u0095\u0005/\u0000\u0000\u0095"+
		"\u0096\u0003<\u001e\u0000\u0096\u0097\u00050\u0000\u0000\u0097\u0099\u0001"+
		"\u0000\u0000\u0000\u0098\u008d\u0001\u0000\u0000\u0000\u0098\u0094\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"3\u0000\u0000\u009b\r\u0001\u0000\u0000\u0000\u009c\u009d\u0005\b\u0000"+
		"\u0000\u009d\u009e\u00057\u0000\u0000\u009e\u009f\u0005/\u0000\u0000\u009f"+
		"\u00a0\u0003\u0010\b\u0000\u00a0\u00a1\u00050\u0000\u0000\u00a1\u00a2"+
		"\u0005\t\u0000\u0000\u00a2\u00a3\u00053\u0000\u0000\u00a3\u000f\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0003\u0012\t\u0000\u00a5\u00a6\u00053"+
		"\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u0011\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0006"+
		"\u0000\u0000\u00ad\u00ae\u00057\u0000\u0000\u00ae\u00af\u00054\u0000\u0000"+
		"\u00af\u00b9\u0003\u001e\u000f\u0000\u00b0\u00b1\u0005\u0007\u0000\u0000"+
		"\u00b1\u00b2\u00057\u0000\u0000\u00b2\u00b3\u00054\u0000\u0000\u00b3\u00b9"+
		"\u0003\u001e\u000f\u0000\u00b4\u00b5\u0005\u0006\u0000\u0000\u00b5\u00b6"+
		"\u00057\u0000\u0000\u00b6\u00b7\u00054\u0000\u0000\u00b7\u00b9\u0007\u0000"+
		"\u0000\u0000\u00b8\u00ac\u0001\u0000\u0000\u0000\u00b8\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b9\u0013\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005\u0006\u0000\u0000\u00bb\u00bc\u00057\u0000"+
		"\u0000\u00bc\u00bd\u00054\u0000\u0000\u00bd\u00be\u00057\u0000\u0000\u00be"+
		"\u00bf\u0003\u0016\u000b\u0000\u00bf\u0015\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0005/\u0000\u0000\u00c1\u00c2\u0003\u0018\f\u0000\u00c2\u00c3"+
		"\u00050\u0000\u0000\u00c3\u0017\u0001\u0000\u0000\u0000\u00c4\u00c9\u0003"+
		"\u001a\r\u0000\u00c5\u00c6\u00055\u0000\u0000\u00c6\u00c8\u0003\u001a"+
		"\r\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000"+
		"\u0000\u00ca\u0019\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u00057\u0000\u0000\u00cd\u00ce\u00054\u0000\u0000\u00ce"+
		"\u00cf\u0003\u001c\u000e\u0000\u00cf\u001b\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d8\u0003B!\u0000\u00d1\u00d8\u0003\u0016\u000b\u0000\u00d2\u00d3\u0005"+
		"7\u0000\u0000\u00d3\u00d4\u00051\u0000\u0000\u00d4\u00d5\u0003B!\u0000"+
		"\u00d5\u00d6\u00052\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d7\u00d1\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d8\u001d\u0001\u0000\u0000\u0000\u00d9"+
		"\u00dc\u0003 \u0010\u0000\u00da\u00dc\u00057\u0000\u0000\u00db\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u001f\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0007\u0001\u0000\u0000\u00de!\u0001\u0000"+
		"\u0000\u0000\u00df\u00f3\u0003\b\u0004\u0000\u00e0\u00f3\u0003&\u0013"+
		"\u0000\u00e1\u00e2\u0003:\u001d\u0000\u00e2\u00e3\u00053\u0000\u0000\u00e3"+
		"\u00f3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003L&\u0000\u00e5\u00e6\u0005"+
		"3\u0000\u0000\u00e6\u00f3\u0001\u0000\u0000\u0000\u00e7\u00f3\u0003*\u0015"+
		"\u0000\u00e8\u00f3\u0003.\u0017\u0000\u00e9\u00f3\u00030\u0018\u0000\u00ea"+
		"\u00f3\u00032\u0019\u0000\u00eb\u00ec\u0005\u000f\u0000\u0000\u00ec\u00f3"+
		"\u00053\u0000\u0000\u00ed\u00ee\u0005\u0010\u0000\u0000\u00ee\u00f3\u0005"+
		"3\u0000\u0000\u00ef\u00f3\u0003>\u001f\u0000\u00f0\u00f3\u0003@ \u0000"+
		"\u00f1\u00f3\u0003$\u0012\u0000\u00f2\u00df\u0001\u0000\u0000\u0000\u00f2"+
		"\u00e0\u0001\u0000\u0000\u0000\u00f2\u00e1\u0001\u0000\u0000\u0000\u00f2"+
		"\u00e4\u0001\u0000\u0000\u0000\u00f2\u00e7\u0001\u0000\u0000\u0000\u00f2"+
		"\u00e8\u0001\u0000\u0000\u0000\u00f2\u00e9\u0001\u0000\u0000\u0000\u00f2"+
		"\u00ea\u0001\u0000\u0000\u0000\u00f2\u00eb\u0001\u0000\u0000\u0000\u00f2"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f2\u00ef\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3"+
		"#\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0013\u0000\u0000\u00f5\u00f6"+
		"\u0003B!\u0000\u00f6\u00f7\u00053\u0000\u0000\u00f7%\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0003(\u0014\u0000\u00f9\u00fa\u0005,\u0000\u0000\u00fa"+
		"\u00fb\u0003B!\u0000\u00fb\u00fc\u00053\u0000\u0000\u00fc\u0102\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0003(\u0014\u0000\u00fe\u00ff\u0005,\u0000"+
		"\u0000\u00ff\u0100\u0003\u0016\u000b\u0000\u0100\u0102\u0001\u0000\u0000"+
		"\u0000\u0101\u00f8\u0001\u0000\u0000\u0000\u0101\u00fd\u0001\u0000\u0000"+
		"\u0000\u0102\'\u0001\u0000\u0000\u0000\u0103\u0108\u00057\u0000\u0000"+
		"\u0104\u0105\u00051\u0000\u0000\u0105\u0106\u0003B!\u0000\u0106\u0107"+
		"\u00052\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u0104\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u0114\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u00056\u0000\u0000\u010b\u0110\u00057\u0000"+
		"\u0000\u010c\u010d\u00051\u0000\u0000\u010d\u010e\u0003B!\u0000\u010e"+
		"\u010f\u00052\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010c"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113"+
		"\u0001\u0000\u0000\u0000\u0112\u010a\u0001\u0000\u0000\u0000\u0113\u0116"+
		"\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0001\u0000\u0000\u0000\u0115)\u0001\u0000\u0000\u0000\u0116\u0114\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0005\n\u0000\u0000\u0118\u0119\u0005-"+
		"\u0000\u0000\u0119\u011a\u0003B!\u0000\u011a\u011b\u0005.\u0000\u0000"+
		"\u011b\u0124\u0003,\u0016\u0000\u011c\u011d\u0005\u000b\u0000\u0000\u011d"+
		"\u011e\u0005-\u0000\u0000\u011e\u011f\u0003B!\u0000\u011f\u0120\u0005"+
		".\u0000\u0000\u0120\u0121\u0003,\u0016\u0000\u0121\u0123\u0001\u0000\u0000"+
		"\u0000\u0122\u011c\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000"+
		"\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000"+
		"\u0000\u0125\u0129\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0005\u000b\u0000\u0000\u0128\u012a\u0003,\u0016\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0005\t\u0000\u0000\u012c"+
		"\u012d\u00053\u0000\u0000\u012d+\u0001\u0000\u0000\u0000\u012e\u0132\u0005"+
		"/\u0000\u0000\u012f\u0131\u0003\"\u0011\u0000\u0130\u012f\u0001\u0000"+
		"\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0001\u0000"+
		"\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0136\u00050\u0000"+
		"\u0000\u0136-\u0001\u0000\u0000\u0000\u0137\u0138\u0005\f\u0000\u0000"+
		"\u0138\u0139\u0005-\u0000\u0000\u0139\u013a\u0003B!\u0000\u013a\u013b"+
		"\u0005.\u0000\u0000\u013b\u013f\u0005/\u0000\u0000\u013c\u013e\u0003\""+
		"\u0011\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000"+
		"\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000"+
		"\u0000\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u00050\u0000\u0000\u0143\u0144\u0005\t\u0000"+
		"\u0000\u0144\u0145\u00053\u0000\u0000\u0145/\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0005\r\u0000\u0000\u0147\u014b\u0005/\u0000\u0000\u0148\u014a"+
		"\u0003\"\u0011\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014d\u0001"+
		"\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001"+
		"\u0000\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u014b\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u00050\u0000\u0000\u014f\u0150\u0005\f"+
		"\u0000\u0000\u0150\u0151\u0005-\u0000\u0000\u0151\u0152\u0003B!\u0000"+
		"\u0152\u0153\u0005.\u0000\u0000\u0153\u0154\u00053\u0000\u0000\u01541"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u000e\u0000\u0000\u0156\u0157"+
		"\u0005-\u0000\u0000\u0157\u0158\u0003\n\u0005\u0000\u0158\u0159\u0003"+
		"B!\u0000\u0159\u015a\u00053\u0000\u0000\u015a\u015b\u0003B!\u0000\u015b"+
		"\u015c\u0005.\u0000\u0000\u015c\u0160\u0005/\u0000\u0000\u015d\u015f\u0003"+
		"\"\u0011\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f\u0162\u0001\u0000"+
		"\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000"+
		"\u0000\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0163\u0164\u00050\u0000\u0000\u01643\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0005\u0011\u0000\u0000\u0166\u0167\u00057\u0000\u0000\u0167"+
		"\u0169\u0005-\u0000\u0000\u0168\u016a\u00036\u001b\u0000\u0169\u0168\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0005.\u0000\u0000\u016c\u0175\u0005/\u0000"+
		"\u0000\u016d\u0171\u0005\u0002\u0000\u0000\u016e\u0170\u0003\b\u0004\u0000"+
		"\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000"+
		"\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000"+
		"\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000"+
		"\u0174\u0176\u00052\u0000\u0000\u0175\u016d\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0001\u0000\u0000\u0000\u0176\u017a\u0001\u0000\u0000\u0000\u0177"+
		"\u0179\u0003\"\u0011\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179\u017c"+
		"\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b"+
		"\u0001\u0000\u0000\u0000\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u017a"+
		"\u0001\u0000\u0000\u0000\u017d\u017e\u00050\u0000\u0000\u017e\u017f\u0005"+
		"\t\u0000\u0000\u017f\u019e\u00053\u0000\u0000\u0180\u0181\u0005\u0012"+
		"\u0000\u0000\u0181\u0182\u0003\u001e\u000f\u0000\u0182\u0183\u00057\u0000"+
		"\u0000\u0183\u0185\u0005-\u0000\u0000\u0184\u0186\u00036\u001b\u0000\u0185"+
		"\u0184\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0001\u0000\u0000\u0000\u0187\u0188\u0005.\u0000\u0000\u0188\u0191"+
		"\u0005/\u0000\u0000\u0189\u018d\u0005\u0002\u0000\u0000\u018a\u018c\u0003"+
		"\b\u0004\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000"+
		"\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000"+
		"\u0000\u0000\u018e\u0190\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000"+
		"\u0000\u0000\u0190\u0192\u00052\u0000\u0000\u0191\u0189\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0196\u0001\u0000\u0000"+
		"\u0000\u0193\u0195\u0003\"\u0011\u0000\u0194\u0193\u0001\u0000\u0000\u0000"+
		"\u0195\u0198\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0199\u0001\u0000\u0000\u0000"+
		"\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u019a\u00050\u0000\u0000\u019a"+
		"\u019b\u0005\t\u0000\u0000\u019b\u019c\u00053\u0000\u0000\u019c\u019e"+
		"\u0001\u0000\u0000\u0000\u019d\u0165\u0001\u0000\u0000\u0000\u019d\u0180"+
		"\u0001\u0000\u0000\u0000\u019e5\u0001\u0000\u0000\u0000\u019f\u01a4\u0003"+
		"8\u001c\u0000\u01a0\u01a1\u00055\u0000\u0000\u01a1\u01a3\u00038\u001c"+
		"\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a57\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0005\u0006\u0000\u0000\u01a8\u01a9\u00057\u0000\u0000\u01a9"+
		"\u01aa\u00054\u0000\u0000\u01aa\u01ab\u0003\u001e\u000f\u0000\u01ab9\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ad\u00057\u0000\u0000\u01ad\u01af\u0005-\u0000"+
		"\u0000\u01ae\u01b0\u0003<\u001e\u0000\u01af\u01ae\u0001\u0000\u0000\u0000"+
		"\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0005.\u0000\u0000\u01b2;\u0001\u0000\u0000\u0000\u01b3\u01b8"+
		"\u0003B!\u0000\u01b4\u01b5\u00055\u0000\u0000\u01b5\u01b7\u0003B!\u0000"+
		"\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7\u01ba\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000"+
		"\u01b9=\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bd\u00057\u0000\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bc\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0005$\u0000\u0000\u01bf?\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005%"+
		"\u0000\u0000\u01c1\u01c6\u0003B!\u0000\u01c2\u01c3\u0005%\u0000\u0000"+
		"\u01c3\u01c5\u0003B!\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c5\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000\u01c8\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c9\u01ca\u00053\u0000\u0000\u01caA\u0001\u0000"+
		"\u0000\u0000\u01cb\u01cc\u0003D\"\u0000\u01ccC\u0001\u0000\u0000\u0000"+
		"\u01cd\u01d2\u0003F#\u0000\u01ce\u01cf\u0007\u0002\u0000\u0000\u01cf\u01d1"+
		"\u0003F#\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d3E\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d5\u01da\u0003H$\u0000\u01d6\u01d7\u0007\u0003\u0000\u0000\u01d7"+
		"\u01d9\u0003H$\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001"+
		"\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001"+
		"\u0000\u0000\u0000\u01dbG\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000"+
		"\u0000\u0000\u01dd\u01e2\u0003J%\u0000\u01de\u01df\u0007\u0004\u0000\u0000"+
		"\u01df\u01e1\u0003J%\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e3I\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e5\u01ea\u0003L&\u0000\u01e6\u01e7\u0007\u0005\u0000"+
		"\u0000\u01e7\u01e9\u0003L&\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea"+
		"\u01eb\u0001\u0000\u0000\u0000\u01ebK\u0001\u0000\u0000\u0000\u01ec\u01ea"+
		"\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005\u0014\u0000\u0000\u01ee\u01f8"+
		"\u0003L&\u0000\u01ef\u01f0\u0005)\u0000\u0000\u01f0\u01f8\u0003L&\u0000"+
		"\u01f1\u01f2\u0007\u0006\u0000\u0000\u01f2\u01f8\u0003N\'\u0000\u01f3"+
		"\u01f5\u0003N\'\u0000\u01f4\u01f6\u0007\u0006\u0000\u0000\u01f5\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f8"+
		"\u0001\u0000\u0000\u0000\u01f7\u01ed\u0001\u0000\u0000\u0000\u01f7\u01ef"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f1\u0001\u0000\u0000\u0000\u01f7\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f8M\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005"+
		"-\u0000\u0000\u01fa\u01fb\u0003B!\u0000\u01fb\u01fc\u0005.\u0000\u0000"+
		"\u01fc\u0206\u0001\u0000\u0000\u0000\u01fd\u0206\u0003:\u001d\u0000\u01fe"+
		"\u0206\u0003(\u0014\u0000\u01ff\u0206\u00058\u0000\u0000\u0200\u0206\u0005"+
		"9\u0000\u0000\u0201\u0206\u0005:\u0000\u0000\u0202\u0206\u0005;\u0000"+
		"\u0000\u0203\u0206\u0005\u0019\u0000\u0000\u0204\u0206\u0005\u001a\u0000"+
		"\u0000\u0205\u01f9\u0001\u0000\u0000\u0000\u0205\u01fd\u0001\u0000\u0000"+
		"\u0000\u0205\u01fe\u0001\u0000\u0000\u0000\u0205\u01ff\u0001\u0000\u0000"+
		"\u0000\u0205\u0200\u0001\u0000\u0000\u0000\u0205\u0201\u0001\u0000\u0000"+
		"\u0000\u0205\u0202\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000"+
		"\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0206O\u0001\u0000\u0000\u0000"+
		"/QT]dku|\u0085\u0092\u0098\u00a9\u00b8\u00c9\u00d7\u00db\u00f2\u0101\u0108"+
		"\u0110\u0114\u0124\u0129\u0132\u013f\u014b\u0160\u0169\u0171\u0175\u017a"+
		"\u0185\u018d\u0191\u0196\u019d\u01a4\u01af\u01b8\u01bc\u01c6\u01d2\u01da"+
		"\u01e2\u01ea\u01f5\u01f7\u0205";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}