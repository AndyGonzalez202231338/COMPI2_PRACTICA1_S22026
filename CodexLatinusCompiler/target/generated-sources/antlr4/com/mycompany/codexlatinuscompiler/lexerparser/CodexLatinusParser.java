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
		EQ=27, NEQ=28, LE=29, GE=30, AND=31, OR=32, INC=33, DEC=34, LEER=35, ESCRIBIR=36, 
		LT=37, GT=38, PLUS=39, MINUS=40, MULT=41, DIV=42, ASSIGN=43, LPAREN=44, 
		RPAREN=45, LBRACE=46, RBRACE=47, LBRACK=48, RBRACK=49, SEMI=50, COLON=51, 
		COMMA=52, DOT=53, ID=54, NUM_LIT=55, DEC_LIT=56, TEXTO_LIT=57, CHAR_LIT=58, 
		COMMENT_LINE=59, COMMENT_BLOCK=60, WS=61;
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
			"'verum'", "'falsus'", "'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", 
			"'++'", "'--'", "'<<'", "'>>'", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", 
			"'='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "':'", "','", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VARIABILES_HDR", "VARIABILES_LOCAL_HDR", "MUNERA_HDR", "MAIOR_HDR", 
			"FINIS_PROGRAMA", "ESTO", "SERIES", "STRUCTURA", "FINIS_SENTENCIAS", 
			"SI", "ALITER", "DUM", "FACERE", "PER", "PERGE", "INTERRUMPE", "ACTIO", 
			"RATIO", "REDDERE", "NON", "NUMERUS", "TEXTUM", "DECIMALIS", "LITTERA", 
			"VERUM", "FALSUS", "EQ", "NEQ", "LE", "GE", "AND", "OR", "INC", "DEC", 
			"LEER", "ESCRIBIR", "LT", "GT", "PLUS", "MINUS", "MULT", "DIV", "ASSIGN", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COLON", 
			"COMMA", "DOT", "ID", "NUM_LIT", "DEC_LIT", "TEXTO_LIT", "CHAR_LIT", 
			"COMMENT_LINE", "COMMENT_BLOCK", "WS"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558464074931369408L) != 0)) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558463971851501568L) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014398509482176L) != 0)) {
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
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ESTO() { return getToken(CodexLatinusParser.ESTO, 0); }
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESTO) {
					{
					setState(172);
					match(ESTO);
					}
				}

				setState(175);
				match(ID);
				setState(176);
				match(COLON);
				setState(177);
				tipo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(SERIES);
				setState(179);
				match(ID);
				setState(180);
				match(COLON);
				setState(181);
				tipo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESTO) {
					{
					setState(182);
					match(ESTO);
					}
				}

				setState(185);
				match(ID);
				setState(186);
				match(COLON);
				setState(187);
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
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
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
			setState(190);
			match(ESTO);
			setState(191);
			match(ID);
			setState(192);
			match(COLON);
			setState(193);
			match(ID);
			setState(194);
			literalEstructura();
			setState(195);
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
			setState(197);
			match(LBRACE);
			setState(198);
			listaAsignAtributos();
			setState(199);
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
			setState(201);
			asignAtributo();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(202);
				match(COMMA);
				setState(203);
				asignAtributo();
				}
				}
				setState(208);
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
			setState(209);
			match(ID);
			setState(210);
			match(COLON);
			setState(211);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				literalEstructura();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(ID);
				setState(216);
				match(LBRACK);
				setState(217);
				expresion();
				setState(218);
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
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERUS:
			case TEXTUM:
			case DECIMALIS:
			case LITTERA:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				tipoPrimitivo();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
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
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0)) ) {
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
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				llamadaFuncion();
				setState(231);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				expresionUnaria();
				setState(234);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				condicional();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				cicloDum();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				cicloFacere();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(239);
				cicloPer();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(240);
				match(PERGE);
				setState(241);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(242);
				match(INTERRUMPE);
				setState(243);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(244);
				lectura();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(245);
				escritura();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(246);
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
			setState(249);
			match(REDDERE);
			setState(250);
			expresion();
			setState(251);
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
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				accesoAsignable();
				setState(254);
				match(ASSIGN);
				setState(255);
				expresion();
				setState(256);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				accesoAsignable();
				setState(259);
				match(ASSIGN);
				setState(260);
				literalEstructura();
				setState(261);
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
			setState(265);
			match(ID);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(266);
				match(LBRACK);
				setState(267);
				expresion();
				setState(268);
				match(RBRACK);
				}
			}

			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(272);
				match(DOT);
				setState(273);
				match(ID);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(274);
					match(LBRACK);
					setState(275);
					expresion();
					setState(276);
					match(RBRACK);
					}
				}

				}
				}
				setState(284);
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
			setState(285);
			match(SI);
			setState(286);
			match(LPAREN);
			setState(287);
			expresion();
			setState(288);
			match(RPAREN);
			setState(289);
			bloque();
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(290);
					match(ALITER);
					setState(291);
					match(LPAREN);
					setState(292);
					expresion();
					setState(293);
					match(RPAREN);
					setState(294);
					bloque();
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALITER) {
				{
				setState(301);
				match(ALITER);
				setState(302);
				bloque();
				}
			}

			setState(305);
			match(FINIS_SENTENCIAS);
			setState(306);
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
			setState(308);
			match(LBRACE);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558464074931369408L) != 0)) {
				{
				{
				setState(309);
				sentencia();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
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
			setState(317);
			match(DUM);
			setState(318);
			match(LPAREN);
			setState(319);
			expresion();
			setState(320);
			match(RPAREN);
			setState(321);
			match(LBRACE);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558464074931369408L) != 0)) {
				{
				{
				setState(322);
				sentencia();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(RBRACE);
			setState(329);
			match(FINIS_SENTENCIAS);
			setState(330);
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
			setState(332);
			match(FACERE);
			setState(333);
			match(LBRACE);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558464074931369408L) != 0)) {
				{
				{
				setState(334);
				sentencia();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			match(RBRACE);
			setState(341);
			match(DUM);
			setState(342);
			match(LPAREN);
			setState(343);
			expresion();
			setState(344);
			match(RPAREN);
			setState(345);
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
			setState(347);
			match(PER);
			setState(348);
			match(LPAREN);
			setState(349);
			declaracionVariable();
			setState(350);
			expresion();
			setState(351);
			match(SEMI);
			setState(352);
			expresion();
			setState(353);
			match(RPAREN);
			setState(354);
			match(LBRACE);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558464074931369408L) != 0)) {
				{
				{
				setState(355);
				sentencia();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
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
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(ACTIO);
				setState(364);
				match(ID);
				setState(365);
				match(LPAREN);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESTO) {
					{
					setState(366);
					listaParametros();
					}
				}

				setState(369);
				match(RPAREN);
				setState(370);
				match(LBRACE);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABILES_LOCAL_HDR) {
					{
					setState(371);
					match(VARIABILES_LOCAL_HDR);
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) {
						{
						{
						setState(372);
						declaracion();
						}
						}
						setState(377);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(378);
					match(RBRACK);
					}
				}

				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558464074931369408L) != 0)) {
					{
					{
					setState(381);
					sentencia();
					}
					}
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(387);
				match(RBRACE);
				setState(388);
				match(FINIS_SENTENCIAS);
				setState(389);
				match(SEMI);
				}
				break;
			case RATIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(RATIO);
				setState(391);
				tipo();
				setState(392);
				match(ID);
				setState(393);
				match(LPAREN);
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESTO) {
					{
					setState(394);
					listaParametros();
					}
				}

				setState(397);
				match(RPAREN);
				setState(398);
				match(LBRACE);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABILES_LOCAL_HDR) {
					{
					setState(399);
					match(VARIABILES_LOCAL_HDR);
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) {
						{
						{
						setState(400);
						declaracion();
						}
						}
						setState(405);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(406);
					match(RBRACK);
					}
				}

				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558464074931369408L) != 0)) {
					{
					{
					setState(409);
					sentencia();
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(415);
				match(RBRACE);
				setState(416);
				match(FINIS_SENTENCIAS);
				setState(417);
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
			setState(421);
			parametro();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(422);
				match(COMMA);
				setState(423);
				parametro();
				}
				}
				setState(428);
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
			setState(429);
			match(ESTO);
			setState(430);
			match(ID);
			setState(431);
			match(COLON);
			setState(432);
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
			setState(434);
			match(ID);
			setState(435);
			match(LPAREN);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558463971851501568L) != 0)) {
				{
				setState(436);
				listaExpresiones();
				}
			}

			setState(439);
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
			setState(441);
			expresion();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(442);
				match(COMMA);
				setState(443);
				expresion();
				}
				}
				setState(448);
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
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(449);
				match(ID);
				}
			}

			setState(452);
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
			setState(454);
			match(ESCRIBIR);
			{
			setState(455);
			expresion();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESCRIBIR) {
				{
				{
				setState(456);
				match(ESCRIBIR);
				setState(457);
				expresion();
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(463);
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
			setState(465);
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
			setState(467);
			expresionRelacional();
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(468);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(469);
				expresionRelacional();
				}
				}
				setState(474);
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
			setState(475);
			expresionAditiva();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 414330126336L) != 0)) {
				{
				{
				setState(476);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 414330126336L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(477);
				expresionAditiva();
				}
				}
				setState(482);
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
			setState(483);
			expresionMultiplicativa();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(484);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(485);
				expresionMultiplicativa();
				}
				}
				setState(490);
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
			setState(491);
			expresionUnaria();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(492);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(493);
				expresionUnaria();
				}
				}
				setState(498);
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
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(NON);
				setState(500);
				expresionUnaria();
				}
				break;
			case INC:
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(502);
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
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				primario();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(504);
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
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(LPAREN);
				setState(510);
				expresion();
				setState(511);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				llamadaFuncion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				accesoAsignable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(515);
				match(NUM_LIT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(516);
				match(DEC_LIT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(517);
				match(TEXTO_LIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(518);
				match(CHAR_LIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(519);
				match(VERUM);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(520);
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
		"\u0004\u0001=\u020c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\f\b\u00ab\t\b\u0001\t\u0003\t\u00ae\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b8\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00bd\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u00cd\b\f\n\f\f\f\u00d0\t\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00dd\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00e1\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00f8\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0108\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u010f\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0117\b\u0014\u0005\u0014\u0119\b\u0014\n\u0014\f\u0014\u011c\t\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u0129\b\u0015\n\u0015\f\u0015\u012c\t\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0130\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u0137\b\u0016\n\u0016\f\u0016\u013a\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u0144\b\u0017\n\u0017\f\u0017\u0147\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0150\b\u0018\n\u0018\f\u0018\u0153\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0165\b\u0019\n\u0019"+
		"\f\u0019\u0168\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0170\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u0176\b\u001a\n\u001a\f\u001a\u0179"+
		"\t\u001a\u0001\u001a\u0003\u001a\u017c\b\u001a\u0001\u001a\u0005\u001a"+
		"\u017f\b\u001a\n\u001a\f\u001a\u0182\t\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u018c\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u0192\b\u001a\n\u001a\f\u001a\u0195\t\u001a\u0001\u001a\u0003\u001a"+
		"\u0198\b\u001a\u0001\u001a\u0005\u001a\u019b\b\u001a\n\u001a\f\u001a\u019e"+
		"\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01a4"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01a9\b\u001b"+
		"\n\u001b\f\u001b\u01ac\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01b6"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u01bd\b\u001e\n\u001e\f\u001e\u01c0\t\u001e\u0001\u001f\u0003\u001f"+
		"\u01c3\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u01cb\b \n \f \u01ce\t \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\""+
		"\u0001\"\u0005\"\u01d7\b\"\n\"\f\"\u01da\t\"\u0001#\u0001#\u0001#\u0005"+
		"#\u01df\b#\n#\f#\u01e2\t#\u0001$\u0001$\u0001$\u0005$\u01e7\b$\n$\f$\u01ea"+
		"\t$\u0001%\u0001%\u0001%\u0005%\u01ef\b%\n%\f%\u01f2\t%\u0001&\u0001&"+
		"\u0001&\u0001&\u0001&\u0001&\u0003&\u01fa\b&\u0003&\u01fc\b&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u020a\b\'\u0001\'\u0000\u0000(\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLN\u0000\u0007\u0001\u0000\u0019\u001a\u0001\u0000\u0015"+
		"\u0018\u0001\u0000\u001f \u0002\u0000\u001b\u001e%&\u0001\u0000\'(\u0001"+
		"\u0000)*\u0001\u0000!\"\u022b\u0000Q\u0001\u0000\u0000\u0000\u0002Y\u0001"+
		"\u0000\u0000\u0000\u0004`\u0001\u0000\u0000\u0000\u0006g\u0001\u0000\u0000"+
		"\u0000\bu\u0001\u0000\u0000\u0000\n\u0085\u0001\u0000\u0000\u0000\f\u0087"+
		"\u0001\u0000\u0000\u0000\u000e\u009c\u0001\u0000\u0000\u0000\u0010\u00a9"+
		"\u0001\u0000\u0000\u0000\u0012\u00bc\u0001\u0000\u0000\u0000\u0014\u00be"+
		"\u0001\u0000\u0000\u0000\u0016\u00c5\u0001\u0000\u0000\u0000\u0018\u00c9"+
		"\u0001\u0000\u0000\u0000\u001a\u00d1\u0001\u0000\u0000\u0000\u001c\u00dc"+
		"\u0001\u0000\u0000\u0000\u001e\u00e0\u0001\u0000\u0000\u0000 \u00e2\u0001"+
		"\u0000\u0000\u0000\"\u00f7\u0001\u0000\u0000\u0000$\u00f9\u0001\u0000"+
		"\u0000\u0000&\u0107\u0001\u0000\u0000\u0000(\u0109\u0001\u0000\u0000\u0000"+
		"*\u011d\u0001\u0000\u0000\u0000,\u0134\u0001\u0000\u0000\u0000.\u013d"+
		"\u0001\u0000\u0000\u00000\u014c\u0001\u0000\u0000\u00002\u015b\u0001\u0000"+
		"\u0000\u00004\u01a3\u0001\u0000\u0000\u00006\u01a5\u0001\u0000\u0000\u0000"+
		"8\u01ad\u0001\u0000\u0000\u0000:\u01b2\u0001\u0000\u0000\u0000<\u01b9"+
		"\u0001\u0000\u0000\u0000>\u01c2\u0001\u0000\u0000\u0000@\u01c6\u0001\u0000"+
		"\u0000\u0000B\u01d1\u0001\u0000\u0000\u0000D\u01d3\u0001\u0000\u0000\u0000"+
		"F\u01db\u0001\u0000\u0000\u0000H\u01e3\u0001\u0000\u0000\u0000J\u01eb"+
		"\u0001\u0000\u0000\u0000L\u01fb\u0001\u0000\u0000\u0000N\u0209\u0001\u0000"+
		"\u0000\u0000PR\u0003\u0002\u0001\u0000QP\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SU\u0003\u0004\u0002\u0000"+
		"TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VW\u0003\u0006\u0003\u0000WX\u0005\u0000\u0000\u0001X\u0001\u0001"+
		"\u0000\u0000\u0000Y]\u0005\u0001\u0000\u0000Z\\\u0003\b\u0004\u0000[Z"+
		"\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^\u0003\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000`d\u0005\u0003\u0000\u0000ac\u00034\u001a\u0000ba\u0001"+
		"\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000e\u0005\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000gk\u0005\u0004\u0000\u0000hj\u0003\"\u0011\u0000ih\u0001\u0000"+
		"\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"no\u0005\u0005\u0000\u0000op\u00052\u0000\u0000p\u0007\u0001\u0000\u0000"+
		"\u0000qv\u0003\n\u0005\u0000rv\u0003\f\u0006\u0000sv\u0003\u000e\u0007"+
		"\u0000tv\u0003\u0014\n\u0000uq\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\t\u0001\u0000"+
		"\u0000\u0000wx\u0005\u0006\u0000\u0000xy\u00056\u0000\u0000yz\u00053\u0000"+
		"\u0000z|\u0003 \u0010\u0000{}\u0003B!\u0000|{\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u00052\u0000"+
		"\u0000\u007f\u0086\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0006\u0000"+
		"\u0000\u0081\u0082\u00056\u0000\u0000\u0082\u0083\u00053\u0000\u0000\u0083"+
		"\u0084\u0007\u0000\u0000\u0000\u0084\u0086\u00052\u0000\u0000\u0085w\u0001"+
		"\u0000\u0000\u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0086\u000b\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005\u0007\u0000\u0000\u0088\u0089\u0005"+
		"6\u0000\u0000\u0089\u008a\u00050\u0000\u0000\u008a\u008b\u0003B!\u0000"+
		"\u008b\u008c\u00051\u0000\u0000\u008c\u0098\u00053\u0000\u0000\u008d\u0092"+
		"\u0003\u001e\u000f\u0000\u008e\u008f\u0005.\u0000\u0000\u008f\u0090\u0003"+
		"<\u001e\u0000\u0090\u0091\u0005/\u0000\u0000\u0091\u0093\u0001\u0000\u0000"+
		"\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u0099\u0001\u0000\u0000\u0000\u0094\u0095\u0005.\u0000\u0000"+
		"\u0095\u0096\u0003<\u001e\u0000\u0096\u0097\u0005/\u0000\u0000\u0097\u0099"+
		"\u0001\u0000\u0000\u0000\u0098\u008d\u0001\u0000\u0000\u0000\u0098\u0094"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u00052\u0000\u0000\u009b\r\u0001\u0000\u0000\u0000\u009c\u009d\u0005"+
		"\b\u0000\u0000\u009d\u009e\u00056\u0000\u0000\u009e\u009f\u0005.\u0000"+
		"\u0000\u009f\u00a0\u0003\u0010\b\u0000\u00a0\u00a1\u0005/\u0000\u0000"+
		"\u00a1\u00a2\u0005\t\u0000\u0000\u00a2\u00a3\u00052\u0000\u0000\u00a3"+
		"\u000f\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003\u0012\t\u0000\u00a5\u00a6"+
		"\u00052\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u0011\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ae\u0005"+
		"\u0006\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0005"+
		"6\u0000\u0000\u00b0\u00b1\u00053\u0000\u0000\u00b1\u00bd\u0003\u001e\u000f"+
		"\u0000\u00b2\u00b3\u0005\u0007\u0000\u0000\u00b3\u00b4\u00056\u0000\u0000"+
		"\u00b4\u00b5\u00053\u0000\u0000\u00b5\u00bd\u0003\u001e\u000f\u0000\u00b6"+
		"\u00b8\u0005\u0006\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u00056\u0000\u0000\u00ba\u00bb\u00053\u0000\u0000\u00bb\u00bd\u0007"+
		"\u0000\u0000\u0000\u00bc\u00ad\u0001\u0000\u0000\u0000\u00bc\u00b2\u0001"+
		"\u0000\u0000\u0000\u00bc\u00b7\u0001\u0000\u0000\u0000\u00bd\u0013\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005\u0006\u0000\u0000\u00bf\u00c0\u0005"+
		"6\u0000\u0000\u00c0\u00c1\u00053\u0000\u0000\u00c1\u00c2\u00056\u0000"+
		"\u0000\u00c2\u00c3\u0003\u0016\u000b\u0000\u00c3\u00c4\u00052\u0000\u0000"+
		"\u00c4\u0015\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005.\u0000\u0000\u00c6"+
		"\u00c7\u0003\u0018\f\u0000\u00c7\u00c8\u0005/\u0000\u0000\u00c8\u0017"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ce\u0003\u001a\r\u0000\u00ca\u00cb\u0005"+
		"4\u0000\u0000\u00cb\u00cd\u0003\u001a\r\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u0019\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d2\u00056\u0000"+
		"\u0000\u00d2\u00d3\u00053\u0000\u0000\u00d3\u00d4\u0003\u001c\u000e\u0000"+
		"\u00d4\u001b\u0001\u0000\u0000\u0000\u00d5\u00dd\u0003B!\u0000\u00d6\u00dd"+
		"\u0003\u0016\u000b\u0000\u00d7\u00d8\u00056\u0000\u0000\u00d8\u00d9\u0005"+
		"0\u0000\u0000\u00d9\u00da\u0003B!\u0000\u00da\u00db\u00051\u0000\u0000"+
		"\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00d5\u0001\u0000\u0000\u0000"+
		"\u00dc\u00d6\u0001\u0000\u0000\u0000\u00dc\u00d7\u0001\u0000\u0000\u0000"+
		"\u00dd\u001d\u0001\u0000\u0000\u0000\u00de\u00e1\u0003 \u0010\u0000\u00df"+
		"\u00e1\u00056\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00df"+
		"\u0001\u0000\u0000\u0000\u00e1\u001f\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0007\u0001\u0000\u0000\u00e3!\u0001\u0000\u0000\u0000\u00e4\u00f8\u0003"+
		"\b\u0004\u0000\u00e5\u00f8\u0003&\u0013\u0000\u00e6\u00e7\u0003:\u001d"+
		"\u0000\u00e7\u00e8\u00052\u0000\u0000\u00e8\u00f8\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0003L&\u0000\u00ea\u00eb\u00052\u0000\u0000\u00eb\u00f8"+
		"\u0001\u0000\u0000\u0000\u00ec\u00f8\u0003*\u0015\u0000\u00ed\u00f8\u0003"+
		".\u0017\u0000\u00ee\u00f8\u00030\u0018\u0000\u00ef\u00f8\u00032\u0019"+
		"\u0000\u00f0\u00f1\u0005\u000f\u0000\u0000\u00f1\u00f8\u00052\u0000\u0000"+
		"\u00f2\u00f3\u0005\u0010\u0000\u0000\u00f3\u00f8\u00052\u0000\u0000\u00f4"+
		"\u00f8\u0003>\u001f\u0000\u00f5\u00f8\u0003@ \u0000\u00f6\u00f8\u0003"+
		"$\u0012\u0000\u00f7\u00e4\u0001\u0000\u0000\u0000\u00f7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00f7\u00e6\u0001\u0000\u0000\u0000\u00f7\u00e9\u0001\u0000"+
		"\u0000\u0000\u00f7\u00ec\u0001\u0000\u0000\u0000\u00f7\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f7\u00ee\u0001\u0000\u0000\u0000\u00f7\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f0\u0001\u0000\u0000\u0000\u00f7\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8#\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0005\u0013\u0000\u0000\u00fa\u00fb\u0003B!\u0000\u00fb"+
		"\u00fc\u00052\u0000\u0000\u00fc%\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003"+
		"(\u0014\u0000\u00fe\u00ff\u0005+\u0000\u0000\u00ff\u0100\u0003B!\u0000"+
		"\u0100\u0101\u00052\u0000\u0000\u0101\u0108\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0003(\u0014\u0000\u0103\u0104\u0005+\u0000\u0000\u0104\u0105\u0003"+
		"\u0016\u000b\u0000\u0105\u0106\u00052\u0000\u0000\u0106\u0108\u0001\u0000"+
		"\u0000\u0000\u0107\u00fd\u0001\u0000\u0000\u0000\u0107\u0102\u0001\u0000"+
		"\u0000\u0000\u0108\'\u0001\u0000\u0000\u0000\u0109\u010e\u00056\u0000"+
		"\u0000\u010a\u010b\u00050\u0000\u0000\u010b\u010c\u0003B!\u0000\u010c"+
		"\u010d\u00051\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u010a"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u011a"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u00055\u0000\u0000\u0111\u0116\u0005"+
		"6\u0000\u0000\u0112\u0113\u00050\u0000\u0000\u0113\u0114\u0003B!\u0000"+
		"\u0114\u0115\u00051\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116"+
		"\u0112\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"\u0119\u0001\u0000\u0000\u0000\u0118\u0110\u0001\u0000\u0000\u0000\u0119"+
		"\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b)\u0001\u0000\u0000\u0000\u011c\u011a"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0005\n\u0000\u0000\u011e\u011f\u0005"+
		",\u0000\u0000\u011f\u0120\u0003B!\u0000\u0120\u0121\u0005-\u0000\u0000"+
		"\u0121\u012a\u0003,\u0016\u0000\u0122\u0123\u0005\u000b\u0000\u0000\u0123"+
		"\u0124\u0005,\u0000\u0000\u0124\u0125\u0003B!\u0000\u0125\u0126\u0005"+
		"-\u0000\u0000\u0126\u0127\u0003,\u0016\u0000\u0127\u0129\u0001\u0000\u0000"+
		"\u0000\u0128\u0122\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000"+
		"\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000"+
		"\u0000\u012b\u012f\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0005\u000b\u0000\u0000\u012e\u0130\u0003,\u0016\u0000"+
		"\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0005\t\u0000\u0000\u0132"+
		"\u0133\u00052\u0000\u0000\u0133+\u0001\u0000\u0000\u0000\u0134\u0138\u0005"+
		".\u0000\u0000\u0135\u0137\u0003\"\u0011\u0000\u0136\u0135\u0001\u0000"+
		"\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000"+
		"\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013c\u0005/\u0000"+
		"\u0000\u013c-\u0001\u0000\u0000\u0000\u013d\u013e\u0005\f\u0000\u0000"+
		"\u013e\u013f\u0005,\u0000\u0000\u013f\u0140\u0003B!\u0000\u0140\u0141"+
		"\u0005-\u0000\u0000\u0141\u0145\u0005.\u0000\u0000\u0142\u0144\u0003\""+
		"\u0011\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000"+
		"\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000"+
		"\u0000\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0005/\u0000\u0000\u0149\u014a\u0005\t\u0000"+
		"\u0000\u014a\u014b\u00052\u0000\u0000\u014b/\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0005\r\u0000\u0000\u014d\u0151\u0005.\u0000\u0000\u014e\u0150"+
		"\u0003\"\u0011\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0153\u0001"+
		"\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001"+
		"\u0000\u0000\u0000\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u0151\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u0005/\u0000\u0000\u0155\u0156\u0005\f"+
		"\u0000\u0000\u0156\u0157\u0005,\u0000\u0000\u0157\u0158\u0003B!\u0000"+
		"\u0158\u0159\u0005-\u0000\u0000\u0159\u015a\u00052\u0000\u0000\u015a1"+
		"\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u000e\u0000\u0000\u015c\u015d"+
		"\u0005,\u0000\u0000\u015d\u015e\u0003\n\u0005\u0000\u015e\u015f\u0003"+
		"B!\u0000\u015f\u0160\u00052\u0000\u0000\u0160\u0161\u0003B!\u0000\u0161"+
		"\u0162\u0005-\u0000\u0000\u0162\u0166\u0005.\u0000\u0000\u0163\u0165\u0003"+
		"\"\u0011\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0165\u0168\u0001\u0000"+
		"\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000"+
		"\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0005/\u0000\u0000\u016a3\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0005\u0011\u0000\u0000\u016c\u016d\u00056\u0000\u0000\u016d"+
		"\u016f\u0005,\u0000\u0000\u016e\u0170\u00036\u001b\u0000\u016f\u016e\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0005-\u0000\u0000\u0172\u017b\u0005.\u0000"+
		"\u0000\u0173\u0177\u0005\u0002\u0000\u0000\u0174\u0176\u0003\b\u0004\u0000"+
		"\u0175\u0174\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000\u0000\u0000"+
		"\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000"+
		"\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000"+
		"\u017a\u017c\u00051\u0000\u0000\u017b\u0173\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0001\u0000\u0000\u0000\u017c\u0180\u0001\u0000\u0000\u0000\u017d"+
		"\u017f\u0003\"\u0011\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017f\u0182"+
		"\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0001\u0000\u0000\u0000\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u0180"+
		"\u0001\u0000\u0000\u0000\u0183\u0184\u0005/\u0000\u0000\u0184\u0185\u0005"+
		"\t\u0000\u0000\u0185\u01a4\u00052\u0000\u0000\u0186\u0187\u0005\u0012"+
		"\u0000\u0000\u0187\u0188\u0003\u001e\u000f\u0000\u0188\u0189\u00056\u0000"+
		"\u0000\u0189\u018b\u0005,\u0000\u0000\u018a\u018c\u00036\u001b\u0000\u018b"+
		"\u018a\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c"+
		"\u018d\u0001\u0000\u0000\u0000\u018d\u018e\u0005-\u0000\u0000\u018e\u0197"+
		"\u0005.\u0000\u0000\u018f\u0193\u0005\u0002\u0000\u0000\u0190\u0192\u0003"+
		"\b\u0004\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0192\u0195\u0001\u0000"+
		"\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000"+
		"\u0000\u0000\u0194\u0196\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000"+
		"\u0000\u0000\u0196\u0198\u00051\u0000\u0000\u0197\u018f\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u019c\u0001\u0000\u0000"+
		"\u0000\u0199\u019b\u0003\"\u0011\u0000\u019a\u0199\u0001\u0000\u0000\u0000"+
		"\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000"+
		"\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000"+
		"\u019e\u019c\u0001\u0000\u0000\u0000\u019f\u01a0\u0005/\u0000\u0000\u01a0"+
		"\u01a1\u0005\t\u0000\u0000\u01a1\u01a2\u00052\u0000\u0000\u01a2\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a3\u016b\u0001\u0000\u0000\u0000\u01a3\u0186"+
		"\u0001\u0000\u0000\u0000\u01a45\u0001\u0000\u0000\u0000\u01a5\u01aa\u0003"+
		"8\u001c\u0000\u01a6\u01a7\u00054\u0000\u0000\u01a7\u01a9\u00038\u001c"+
		"\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ab7\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ae\u0005\u0006\u0000\u0000\u01ae\u01af\u00056\u0000\u0000\u01af"+
		"\u01b0\u00053\u0000\u0000\u01b0\u01b1\u0003\u001e\u000f\u0000\u01b19\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b3\u00056\u0000\u0000\u01b3\u01b5\u0005,\u0000"+
		"\u0000\u01b4\u01b6\u0003<\u001e\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\u0005-\u0000\u0000\u01b8;\u0001\u0000\u0000\u0000\u01b9\u01be"+
		"\u0003B!\u0000\u01ba\u01bb\u00054\u0000\u0000\u01bb\u01bd\u0003B!\u0000"+
		"\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01c0\u0001\u0000\u0000\u0000"+
		"\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000"+
		"\u01bf=\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c3\u00056\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0005#\u0000\u0000\u01c5?\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005$"+
		"\u0000\u0000\u01c7\u01cc\u0003B!\u0000\u01c8\u01c9\u0005$\u0000\u0000"+
		"\u01c9\u01cb\u0003B!\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01ce"+
		"\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01cc"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d0\u00052\u0000\u0000\u01d0A\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0003D\"\u0000\u01d2C\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d8\u0003F#\u0000\u01d4\u01d5\u0007\u0002\u0000\u0000\u01d5\u01d7"+
		"\u0003F#\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d9E\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000"+
		"\u0000\u01db\u01e0\u0003H$\u0000\u01dc\u01dd\u0007\u0003\u0000\u0000\u01dd"+
		"\u01df\u0003H$\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e1G\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e8\u0003J%\u0000\u01e4\u01e5\u0007\u0004\u0000\u0000"+
		"\u01e5\u01e7\u0003J%\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7\u01ea"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9"+
		"\u0001\u0000\u0000\u0000\u01e9I\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001"+
		"\u0000\u0000\u0000\u01eb\u01f0\u0003L&\u0000\u01ec\u01ed\u0007\u0005\u0000"+
		"\u0000\u01ed\u01ef\u0003L&\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ef"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f0"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f1K\u0001\u0000\u0000\u0000\u01f2\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005\u0014\u0000\u0000\u01f4\u01fc"+
		"\u0003L&\u0000\u01f5\u01f6\u0007\u0006\u0000\u0000\u01f6\u01fc\u0003N"+
		"\'\u0000\u01f7\u01f9\u0003N\'\u0000\u01f8\u01fa\u0007\u0006\u0000\u0000"+
		"\u01f9\u01f8\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fc\u0001\u0000\u0000\u0000\u01fb\u01f3\u0001\u0000\u0000\u0000"+
		"\u01fb\u01f5\u0001\u0000\u0000\u0000\u01fb\u01f7\u0001\u0000\u0000\u0000"+
		"\u01fcM\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005,\u0000\u0000\u01fe\u01ff"+
		"\u0003B!\u0000\u01ff\u0200\u0005-\u0000\u0000\u0200\u020a\u0001\u0000"+
		"\u0000\u0000\u0201\u020a\u0003:\u001d\u0000\u0202\u020a\u0003(\u0014\u0000"+
		"\u0203\u020a\u00057\u0000\u0000\u0204\u020a\u00058\u0000\u0000\u0205\u020a"+
		"\u00059\u0000\u0000\u0206\u020a\u0005:\u0000\u0000\u0207\u020a\u0005\u0019"+
		"\u0000\u0000\u0208\u020a\u0005\u001a\u0000\u0000\u0209\u01fd\u0001\u0000"+
		"\u0000\u0000\u0209\u0201\u0001\u0000\u0000\u0000\u0209\u0202\u0001\u0000"+
		"\u0000\u0000\u0209\u0203\u0001\u0000\u0000\u0000\u0209\u0204\u0001\u0000"+
		"\u0000\u0000\u0209\u0205\u0001\u0000\u0000\u0000\u0209\u0206\u0001\u0000"+
		"\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u0208\u0001\u0000"+
		"\u0000\u0000\u020aO\u0001\u0000\u0000\u00001QT]dku|\u0085\u0092\u0098"+
		"\u00a9\u00ad\u00b7\u00bc\u00ce\u00dc\u00e0\u00f7\u0107\u010e\u0116\u011a"+
		"\u012a\u012f\u0138\u0145\u0151\u0166\u016f\u0177\u017b\u0180\u018b\u0193"+
		"\u0197\u019c\u01a3\u01aa\u01b5\u01be\u01c2\u01cc\u01d8\u01e0\u01e8\u01f0"+
		"\u01f9\u01fb\u0209";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}