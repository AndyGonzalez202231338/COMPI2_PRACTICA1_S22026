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
		RULE_tipo = 15, RULE_tipoPrimitivo = 16, RULE_sentencia = 17, RULE_asignacion = 18, 
		RULE_accesoAsignable = 19, RULE_condicional = 20, RULE_bloque = 21, RULE_cicloDum = 22, 
		RULE_cicloFacere = 23, RULE_cicloPer = 24, RULE_funcion = 25, RULE_listaParametros = 26, 
		RULE_parametro = 27, RULE_llamadaFuncion = 28, RULE_listaExpresiones = 29, 
		RULE_lectura = 30, RULE_escritura = 31, RULE_expresion = 32, RULE_expresionLogica = 33, 
		RULE_expresionRelacional = 34, RULE_expresionAditiva = 35, RULE_expresionMultiplicativa = 36, 
		RULE_expresionUnaria = 37, RULE_primario = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "seccionVariables", "seccionFunciones", "seccionPrincipal", 
			"declaracion", "declaracionVariable", "declaracionArray", "declaracionStructDef", 
			"listaAtributos", "atributo", "declaracionStructVar", "literalEstructura", 
			"listaAsignAtributos", "asignAtributo", "valorAtributo", "tipo", "tipoPrimitivo", 
			"sentencia", "asignacion", "accesoAsignable", "condicional", "bloque", 
			"cicloDum", "cicloFacere", "cicloPer", "funcion", "listaParametros", 
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
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES_HDR) {
				{
				setState(78);
				seccionVariables();
				}
			}

			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUNERA_HDR) {
				{
				setState(81);
				seccionFunciones();
				}
			}

			setState(84);
			seccionPrincipal();
			setState(85);
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
			setState(87);
			match(VARIABILES_HDR);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) {
				{
				{
				setState(88);
				declaracion();
				}
				}
				setState(93);
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
			setState(94);
			match(MUNERA_HDR);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTIO || _la==RATIO) {
				{
				{
				setState(95);
				funcion();
				}
				}
				setState(100);
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
			setState(101);
			match(MAIOR_HDR);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014501588825536L) != 0)) {
				{
				{
				setState(102);
				sentencia();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(FINIS_PROGRAMA);
			setState(109);
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
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				declaracionVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				declaracionArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				declaracionStructDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ESTO);
			setState(118);
			match(ID);
			setState(119);
			match(COLON);
			setState(120);
			tipoPrimitivo();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558463971851501568L) != 0)) {
				{
				setState(121);
				expresion();
				}
			}

			setState(124);
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
	public static class DeclaracionArrayContext extends ParserRuleContext {
		public TerminalNode SERIES() { return getToken(CodexLatinusParser.SERIES, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(CodexLatinusParser.LBRACK, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(CodexLatinusParser.RBRACK, 0); }
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
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
			setState(126);
			match(SERIES);
			setState(127);
			match(ID);
			setState(128);
			match(LBRACK);
			setState(129);
			expresion();
			setState(130);
			match(RBRACK);
			setState(131);
			match(COLON);
			setState(132);
			tipo();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(133);
				match(LBRACE);
				setState(134);
				listaExpresiones();
				setState(135);
				match(RBRACE);
				}
			}

			setState(139);
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
			setState(141);
			match(STRUCTURA);
			setState(142);
			match(ID);
			setState(143);
			match(LBRACE);
			setState(144);
			listaAtributos();
			setState(145);
			match(RBRACE);
			setState(146);
			match(FINIS_SENTENCIAS);
			setState(147);
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
		public List<TerminalNode> COMMA() { return getTokens(CodexLatinusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodexLatinusParser.COMMA, i);
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
			setState(149);
			atributo();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(150);
				match(COMMA);
				setState(151);
				atributo();
				}
				}
				setState(156);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO) {
				{
				setState(157);
				match(ESTO);
				}
			}

			setState(160);
			match(ID);
			setState(161);
			match(COLON);
			setState(162);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(ESTO);
			setState(165);
			match(ID);
			setState(166);
			match(COLON);
			setState(167);
			match(ID);
			setState(168);
			literalEstructura();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(169);
				match(SEMI);
				}
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
			setState(172);
			match(LBRACE);
			setState(173);
			listaAsignAtributos();
			setState(174);
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
			setState(176);
			asignAtributo();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(177);
				match(COMMA);
				setState(178);
				asignAtributo();
				}
				}
				setState(183);
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
			setState(184);
			match(ID);
			setState(185);
			match(COLON);
			setState(186);
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
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				literalEstructura();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(ID);
				setState(191);
				match(LBRACK);
				setState(192);
				expresion();
				setState(193);
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
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERUS:
			case TEXTUM:
			case DECIMALIS:
			case LITTERA:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				tipoPrimitivo();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
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
			setState(201);
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
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				llamadaFuncion();
				setState(206);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				condicional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				cicloDum();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				cicloFacere();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(211);
				cicloPer();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(212);
				match(PERGE);
				setState(213);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(214);
				match(INTERRUMPE);
				setState(215);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(216);
				lectura();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(217);
				escritura();
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
	public static class AsignacionContext extends ParserRuleContext {
		public AccesoAsignableContext accesoAsignable() {
			return getRuleContext(AccesoAsignableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CodexLatinusParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			accesoAsignable();
			setState(221);
			match(ASSIGN);
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON:
			case VERUM:
			case FALSUS:
			case INC:
			case DEC:
			case LPAREN:
			case ID:
			case NUM_LIT:
			case DEC_LIT:
			case TEXTO_LIT:
			case CHAR_LIT:
				{
				setState(222);
				expresion();
				}
				break;
			case LBRACE:
				{
				setState(223);
				literalEstructura();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(226);
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
		enterRule(_localctx, 38, RULE_accesoAsignable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ID);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(229);
				match(LBRACK);
				setState(230);
				expresion();
				setState(231);
				match(RBRACK);
				}
			}

			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(235);
				match(DOT);
				setState(236);
				match(ID);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(237);
					match(LBRACK);
					setState(238);
					expresion();
					setState(239);
					match(RBRACK);
					}
				}

				}
				}
				setState(247);
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
		enterRule(_localctx, 40, RULE_condicional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(SI);
			setState(249);
			match(LPAREN);
			setState(250);
			expresion();
			setState(251);
			match(RPAREN);
			setState(252);
			bloque();
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					match(ALITER);
					setState(254);
					match(LPAREN);
					setState(255);
					expresion();
					setState(256);
					match(RPAREN);
					setState(257);
					bloque();
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALITER) {
				{
				setState(264);
				match(ALITER);
				setState(265);
				bloque();
				}
			}

			setState(268);
			match(FINIS_SENTENCIAS);
			setState(269);
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
		enterRule(_localctx, 42, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(LBRACE);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014501588825536L) != 0)) {
				{
				{
				setState(272);
				sentencia();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
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
		enterRule(_localctx, 44, RULE_cicloDum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(DUM);
			setState(281);
			match(LPAREN);
			setState(282);
			expresion();
			setState(283);
			match(RPAREN);
			setState(284);
			match(LBRACE);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014501588825536L) != 0)) {
				{
				{
				setState(285);
				sentencia();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			match(RBRACE);
			setState(292);
			match(FINIS_SENTENCIAS);
			setState(293);
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
		enterRule(_localctx, 46, RULE_cicloFacere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(FACERE);
			setState(296);
			match(LBRACE);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014501588825536L) != 0)) {
				{
				{
				setState(297);
				sentencia();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(RBRACE);
			setState(304);
			match(DUM);
			setState(305);
			match(LPAREN);
			setState(306);
			expresion();
			setState(307);
			match(RPAREN);
			setState(308);
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
		enterRule(_localctx, 48, RULE_cicloPer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(PER);
			setState(311);
			match(LPAREN);
			setState(312);
			declaracionVariable();
			setState(313);
			expresion();
			setState(314);
			match(SEMI);
			setState(315);
			expresion();
			setState(316);
			match(RPAREN);
			setState(317);
			match(LBRACE);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014501588825536L) != 0)) {
				{
				{
				setState(318);
				sentencia();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
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
		public List<TerminalNode> SEMI() { return getTokens(CodexLatinusParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CodexLatinusParser.SEMI, i);
		}
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
		public List<DeclaracionVariableContext> declaracionVariable() {
			return getRuleContexts(DeclaracionVariableContext.class);
		}
		public DeclaracionVariableContext declaracionVariable(int i) {
			return getRuleContext(DeclaracionVariableContext.class,i);
		}
		public TerminalNode RATIO() { return getToken(CodexLatinusParser.RATIO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode REDDERE() { return getToken(CodexLatinusParser.REDDERE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
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
		enterRule(_localctx, 50, RULE_funcion);
		int _la;
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(ACTIO);
				setState(327);
				match(ID);
				setState(328);
				match(LPAREN);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESTO) {
					{
					setState(329);
					listaParametros();
					}
				}

				setState(332);
				match(RPAREN);
				setState(333);
				match(LBRACE);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABILES_LOCAL_HDR) {
					{
					setState(334);
					match(VARIABILES_LOCAL_HDR);
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ESTO) {
						{
						{
						setState(335);
						declaracionVariable();
						}
						}
						setState(340);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(341);
					match(RBRACK);
					}
				}

				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014501588825536L) != 0)) {
					{
					{
					setState(344);
					sentencia();
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(350);
				match(RBRACE);
				setState(351);
				match(FINIS_SENTENCIAS);
				setState(352);
				match(SEMI);
				}
				break;
			case RATIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(RATIO);
				setState(354);
				tipo();
				setState(355);
				match(ID);
				setState(356);
				match(LPAREN);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESTO) {
					{
					setState(357);
					listaParametros();
					}
				}

				setState(360);
				match(RPAREN);
				setState(361);
				match(LBRACE);
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABILES_LOCAL_HDR) {
					{
					setState(362);
					match(VARIABILES_LOCAL_HDR);
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ESTO) {
						{
						{
						setState(363);
						declaracionVariable();
						}
						}
						setState(368);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(369);
					match(RBRACK);
					}
				}

				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014501588825536L) != 0)) {
					{
					{
					setState(372);
					sentencia();
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(378);
				match(REDDERE);
				setState(379);
				expresion();
				setState(380);
				match(SEMI);
				setState(381);
				match(RBRACE);
				setState(382);
				match(FINIS_SENTENCIAS);
				setState(383);
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
		enterRule(_localctx, 52, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			parametro();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(388);
				match(COMMA);
				setState(389);
				parametro();
				}
				}
				setState(394);
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
		enterRule(_localctx, 54, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(ESTO);
			setState(396);
			match(ID);
			setState(397);
			match(COLON);
			setState(398);
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
		enterRule(_localctx, 56, RULE_llamadaFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(ID);
			setState(401);
			match(LPAREN);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558463971851501568L) != 0)) {
				{
				setState(402);
				listaExpresiones();
				}
			}

			setState(405);
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
		enterRule(_localctx, 58, RULE_listaExpresiones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			expresion();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(408);
				match(COMMA);
				setState(409);
				expresion();
				}
				}
				setState(414);
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
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
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
		enterRule(_localctx, 60, RULE_lectura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(LEER);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(416);
				match(ID);
				}
			}

			setState(419);
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
		enterRule(_localctx, 62, RULE_escritura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(ESCRIBIR);
			{
			setState(422);
			expresion();
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESCRIBIR) {
				{
				{
				setState(423);
				match(ESCRIBIR);
				setState(424);
				expresion();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(430);
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
		enterRule(_localctx, 64, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
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
		enterRule(_localctx, 66, RULE_expresionLogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			expresionRelacional();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(435);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(436);
				expresionRelacional();
				}
				}
				setState(441);
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
		enterRule(_localctx, 68, RULE_expresionRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			expresionAditiva();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 414330126336L) != 0)) {
				{
				{
				setState(443);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 414330126336L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(444);
				expresionAditiva();
				}
				}
				setState(449);
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
		enterRule(_localctx, 70, RULE_expresionAditiva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			expresionMultiplicativa();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(451);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(452);
				expresionMultiplicativa();
				}
				}
				setState(457);
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
		enterRule(_localctx, 72, RULE_expresionMultiplicativa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			expresionUnaria();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(459);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(460);
				expresionUnaria();
				}
				}
				setState(465);
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
		enterRule(_localctx, 74, RULE_expresionUnaria);
		int _la;
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				match(NON);
				setState(467);
				expresionUnaria();
				}
				break;
			case INC:
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(469);
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
				setState(470);
				primario();
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(471);
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
		enterRule(_localctx, 76, RULE_primario);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(LPAREN);
				setState(477);
				expresion();
				setState(478);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				llamadaFuncion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				accesoAsignable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				match(NUM_LIT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(483);
				match(DEC_LIT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(484);
				match(TEXTO_LIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(485);
				match(CHAR_LIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(486);
				match(VERUM);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(487);
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
		"\u0004\u0001=\u01eb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0003\u0000"+
		"P\b\u0000\u0001\u0000\u0003\u0000S\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0005\u0001Z\b\u0001\n\u0001\f\u0001]\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u0002a\b\u0002\n\u0002\f\u0002d\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0005\u0003h\b\u0003\n\u0003\f\u0003k\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004t\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005{\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u008a\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u0099\b\b\n\b\f\b\u009c\t\b\u0001\t\u0003\t"+
		"\u009f\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00ab\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00b4\b\f\n\f\f\f\u00b7\t"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c4\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00c8\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00db\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00e1\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00ea\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00f2\b\u0013\u0005\u0013\u00f4\b"+
		"\u0013\n\u0013\f\u0013\u00f7\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0104\b\u0014\n\u0014\f\u0014\u0107"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u010b\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u0112\b\u0015"+
		"\n\u0015\f\u0015\u0115\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u011f"+
		"\b\u0016\n\u0016\f\u0016\u0122\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u012b\b\u0017"+
		"\n\u0017\f\u0017\u012e\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0140\b\u0018\n\u0018\f\u0018\u0143\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u014b\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0151\b\u0019\n\u0019\f\u0019\u0154\t\u0019\u0001\u0019\u0003\u0019\u0157"+
		"\b\u0019\u0001\u0019\u0005\u0019\u015a\b\u0019\n\u0019\f\u0019\u015d\t"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0167\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u016d\b\u0019\n\u0019\f\u0019"+
		"\u0170\t\u0019\u0001\u0019\u0003\u0019\u0173\b\u0019\u0001\u0019\u0005"+
		"\u0019\u0176\b\u0019\n\u0019\f\u0019\u0179\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0182\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0187\b"+
		"\u001a\n\u001a\f\u001a\u018a\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0194\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u019b\b\u001d\n\u001d\f\u001d\u019e\t\u001d\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u01a2\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01aa\b\u001f\n\u001f\f\u001f"+
		"\u01ad\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0005!\u01b6\b!\n!\f!\u01b9\t!\u0001\"\u0001\"\u0001\"\u0005\"\u01be"+
		"\b\"\n\"\f\"\u01c1\t\"\u0001#\u0001#\u0001#\u0005#\u01c6\b#\n#\f#\u01c9"+
		"\t#\u0001$\u0001$\u0001$\u0005$\u01ce\b$\n$\f$\u01d1\t$\u0001%\u0001%"+
		"\u0001%\u0001%\u0001%\u0001%\u0003%\u01d9\b%\u0003%\u01db\b%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u01e9\b&\u0001&\u0000\u0000\'\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJL\u0000\u0006\u0001\u0000\u0015\u0018\u0001\u0000\u001f \u0002\u0000"+
		"\u001b\u001e%&\u0001\u0000\'(\u0001\u0000)*\u0001\u0000!\"\u0205\u0000"+
		"O\u0001\u0000\u0000\u0000\u0002W\u0001\u0000\u0000\u0000\u0004^\u0001"+
		"\u0000\u0000\u0000\u0006e\u0001\u0000\u0000\u0000\bs\u0001\u0000\u0000"+
		"\u0000\nu\u0001\u0000\u0000\u0000\f~\u0001\u0000\u0000\u0000\u000e\u008d"+
		"\u0001\u0000\u0000\u0000\u0010\u0095\u0001\u0000\u0000\u0000\u0012\u009e"+
		"\u0001\u0000\u0000\u0000\u0014\u00a4\u0001\u0000\u0000\u0000\u0016\u00ac"+
		"\u0001\u0000\u0000\u0000\u0018\u00b0\u0001\u0000\u0000\u0000\u001a\u00b8"+
		"\u0001\u0000\u0000\u0000\u001c\u00c3\u0001\u0000\u0000\u0000\u001e\u00c7"+
		"\u0001\u0000\u0000\u0000 \u00c9\u0001\u0000\u0000\u0000\"\u00da\u0001"+
		"\u0000\u0000\u0000$\u00dc\u0001\u0000\u0000\u0000&\u00e4\u0001\u0000\u0000"+
		"\u0000(\u00f8\u0001\u0000\u0000\u0000*\u010f\u0001\u0000\u0000\u0000,"+
		"\u0118\u0001\u0000\u0000\u0000.\u0127\u0001\u0000\u0000\u00000\u0136\u0001"+
		"\u0000\u0000\u00002\u0181\u0001\u0000\u0000\u00004\u0183\u0001\u0000\u0000"+
		"\u00006\u018b\u0001\u0000\u0000\u00008\u0190\u0001\u0000\u0000\u0000:"+
		"\u0197\u0001\u0000\u0000\u0000<\u019f\u0001\u0000\u0000\u0000>\u01a5\u0001"+
		"\u0000\u0000\u0000@\u01b0\u0001\u0000\u0000\u0000B\u01b2\u0001\u0000\u0000"+
		"\u0000D\u01ba\u0001\u0000\u0000\u0000F\u01c2\u0001\u0000\u0000\u0000H"+
		"\u01ca\u0001\u0000\u0000\u0000J\u01da\u0001\u0000\u0000\u0000L\u01e8\u0001"+
		"\u0000\u0000\u0000NP\u0003\u0002\u0001\u0000ON\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QS\u0003\u0004\u0002"+
		"\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TU\u0003\u0006\u0003\u0000UV\u0005\u0000\u0000\u0001V\u0001"+
		"\u0001\u0000\u0000\u0000W[\u0005\u0001\u0000\u0000XZ\u0003\b\u0004\u0000"+
		"YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\\u0003\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000^b\u0005\u0003\u0000\u0000_a\u00032\u0019\u0000`_\u0001"+
		"\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000c\u0005\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000ei\u0005\u0004\u0000\u0000fh\u0003\"\u0011\u0000gf\u0001\u0000"+
		"\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"lm\u0005\u0005\u0000\u0000mn\u00052\u0000\u0000n\u0007\u0001\u0000\u0000"+
		"\u0000ot\u0003\n\u0005\u0000pt\u0003\f\u0006\u0000qt\u0003\u000e\u0007"+
		"\u0000rt\u0003\u0014\n\u0000so\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\t\u0001\u0000"+
		"\u0000\u0000uv\u0005\u0006\u0000\u0000vw\u00056\u0000\u0000wx\u00053\u0000"+
		"\u0000xz\u0003 \u0010\u0000y{\u0003@ \u0000zy\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u00052\u0000\u0000"+
		"}\u000b\u0001\u0000\u0000\u0000~\u007f\u0005\u0007\u0000\u0000\u007f\u0080"+
		"\u00056\u0000\u0000\u0080\u0081\u00050\u0000\u0000\u0081\u0082\u0003@"+
		" \u0000\u0082\u0083\u00051\u0000\u0000\u0083\u0084\u00053\u0000\u0000"+
		"\u0084\u0089\u0003\u001e\u000f\u0000\u0085\u0086\u0005.\u0000\u0000\u0086"+
		"\u0087\u0003:\u001d\u0000\u0087\u0088\u0005/\u0000\u0000\u0088\u008a\u0001"+
		"\u0000\u0000\u0000\u0089\u0085\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"2\u0000\u0000\u008c\r\u0001\u0000\u0000\u0000\u008d\u008e\u0005\b\u0000"+
		"\u0000\u008e\u008f\u00056\u0000\u0000\u008f\u0090\u0005.\u0000\u0000\u0090"+
		"\u0091\u0003\u0010\b\u0000\u0091\u0092\u0005/\u0000\u0000\u0092\u0093"+
		"\u0005\t\u0000\u0000\u0093\u0094\u00052\u0000\u0000\u0094\u000f\u0001"+
		"\u0000\u0000\u0000\u0095\u009a\u0003\u0012\t\u0000\u0096\u0097\u00054"+
		"\u0000\u0000\u0097\u0099\u0003\u0012\t\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0011\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009f\u0005\u0006\u0000"+
		"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u00056\u0000\u0000"+
		"\u00a1\u00a2\u00053\u0000\u0000\u00a2\u00a3\u0003\u001e\u000f\u0000\u00a3"+
		"\u0013\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0006\u0000\u0000\u00a5"+
		"\u00a6\u00056\u0000\u0000\u00a6\u00a7\u00053\u0000\u0000\u00a7\u00a8\u0005"+
		"6\u0000\u0000\u00a8\u00aa\u0003\u0016\u000b\u0000\u00a9\u00ab\u00052\u0000"+
		"\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u0015\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005.\u0000\u0000"+
		"\u00ad\u00ae\u0003\u0018\f\u0000\u00ae\u00af\u0005/\u0000\u0000\u00af"+
		"\u0017\u0001\u0000\u0000\u0000\u00b0\u00b5\u0003\u001a\r\u0000\u00b1\u00b2"+
		"\u00054\u0000\u0000\u00b2\u00b4\u0003\u001a\r\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u0019\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005"+
		"6\u0000\u0000\u00b9\u00ba\u00053\u0000\u0000\u00ba\u00bb\u0003\u001c\u000e"+
		"\u0000\u00bb\u001b\u0001\u0000\u0000\u0000\u00bc\u00c4\u0003@ \u0000\u00bd"+
		"\u00c4\u0003\u0016\u000b\u0000\u00be\u00bf\u00056\u0000\u0000\u00bf\u00c0"+
		"\u00050\u0000\u0000\u00c0\u00c1\u0003@ \u0000\u00c1\u00c2\u00051\u0000"+
		"\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00bc\u0001\u0000\u0000"+
		"\u0000\u00c3\u00bd\u0001\u0000\u0000\u0000\u00c3\u00be\u0001\u0000\u0000"+
		"\u0000\u00c4\u001d\u0001\u0000\u0000\u0000\u00c5\u00c8\u0003 \u0010\u0000"+
		"\u00c6\u00c8\u00056\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c8\u001f\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0007\u0000\u0000\u0000\u00ca!\u0001\u0000\u0000\u0000\u00cb\u00db"+
		"\u0003\b\u0004\u0000\u00cc\u00db\u0003$\u0012\u0000\u00cd\u00ce\u0003"+
		"8\u001c\u0000\u00ce\u00cf\u00052\u0000\u0000\u00cf\u00db\u0001\u0000\u0000"+
		"\u0000\u00d0\u00db\u0003(\u0014\u0000\u00d1\u00db\u0003,\u0016\u0000\u00d2"+
		"\u00db\u0003.\u0017\u0000\u00d3\u00db\u00030\u0018\u0000\u00d4\u00d5\u0005"+
		"\u000f\u0000\u0000\u00d5\u00db\u00052\u0000\u0000\u00d6\u00d7\u0005\u0010"+
		"\u0000\u0000\u00d7\u00db\u00052\u0000\u0000\u00d8\u00db\u0003<\u001e\u0000"+
		"\u00d9\u00db\u0003>\u001f\u0000\u00da\u00cb\u0001\u0000\u0000\u0000\u00da"+
		"\u00cc\u0001\u0000\u0000\u0000\u00da\u00cd\u0001\u0000\u0000\u0000\u00da"+
		"\u00d0\u0001\u0000\u0000\u0000\u00da\u00d1\u0001\u0000\u0000\u0000\u00da"+
		"\u00d2\u0001\u0000\u0000\u0000\u00da\u00d3\u0001\u0000\u0000\u0000\u00da"+
		"\u00d4\u0001\u0000\u0000\u0000\u00da\u00d6\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"#\u0001\u0000\u0000\u0000\u00dc\u00dd\u0003&\u0013\u0000\u00dd\u00e0\u0005"+
		"+\u0000\u0000\u00de\u00e1\u0003@ \u0000\u00df\u00e1\u0003\u0016\u000b"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u00052\u0000\u0000"+
		"\u00e3%\u0001\u0000\u0000\u0000\u00e4\u00e9\u00056\u0000\u0000\u00e5\u00e6"+
		"\u00050\u0000\u0000\u00e6\u00e7\u0003@ \u0000\u00e7\u00e8\u00051\u0000"+
		"\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00f5\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u00055\u0000\u0000\u00ec\u00f1\u00056\u0000\u0000\u00ed"+
		"\u00ee\u00050\u0000\u0000\u00ee\u00ef\u0003@ \u0000\u00ef\u00f0\u0005"+
		"1\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f3\u00eb\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\'\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0005\n\u0000\u0000\u00f9\u00fa\u0005,\u0000\u0000"+
		"\u00fa\u00fb\u0003@ \u0000\u00fb\u00fc\u0005-\u0000\u0000\u00fc\u0105"+
		"\u0003*\u0015\u0000\u00fd\u00fe\u0005\u000b\u0000\u0000\u00fe\u00ff\u0005"+
		",\u0000\u0000\u00ff\u0100\u0003@ \u0000\u0100\u0101\u0005-\u0000\u0000"+
		"\u0101\u0102\u0003*\u0015\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103"+
		"\u00fd\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105"+
		"\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u010a\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0005\u000b\u0000\u0000\u0109\u010b\u0003*\u0015\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0005\t\u0000\u0000\u010d\u010e\u0005"+
		"2\u0000\u0000\u010e)\u0001\u0000\u0000\u0000\u010f\u0113\u0005.\u0000"+
		"\u0000\u0110\u0112\u0003\"\u0011\u0000\u0111\u0110\u0001\u0000\u0000\u0000"+
		"\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000"+
		"\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0117\u0005/\u0000\u0000\u0117"+
		"+\u0001\u0000\u0000\u0000\u0118\u0119\u0005\f\u0000\u0000\u0119\u011a"+
		"\u0005,\u0000\u0000\u011a\u011b\u0003@ \u0000\u011b\u011c\u0005-\u0000"+
		"\u0000\u011c\u0120\u0005.\u0000\u0000\u011d\u011f\u0003\"\u0011\u0000"+
		"\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000"+
		"\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000"+
		"\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0005/\u0000\u0000\u0124\u0125\u0005\t\u0000\u0000\u0125"+
		"\u0126\u00052\u0000\u0000\u0126-\u0001\u0000\u0000\u0000\u0127\u0128\u0005"+
		"\r\u0000\u0000\u0128\u012c\u0005.\u0000\u0000\u0129\u012b\u0003\"\u0011"+
		"\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000"+
		"\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000"+
		"\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0005/\u0000\u0000\u0130\u0131\u0005\f\u0000\u0000"+
		"\u0131\u0132\u0005,\u0000\u0000\u0132\u0133\u0003@ \u0000\u0133\u0134"+
		"\u0005-\u0000\u0000\u0134\u0135\u00052\u0000\u0000\u0135/\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0005\u000e\u0000\u0000\u0137\u0138\u0005,\u0000"+
		"\u0000\u0138\u0139\u0003\n\u0005\u0000\u0139\u013a\u0003@ \u0000\u013a"+
		"\u013b\u00052\u0000\u0000\u013b\u013c\u0003@ \u0000\u013c\u013d\u0005"+
		"-\u0000\u0000\u013d\u0141\u0005.\u0000\u0000\u013e\u0140\u0003\"\u0011"+
		"\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000"+
		"\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000"+
		"\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0005/\u0000\u0000\u01451\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0005\u0011\u0000\u0000\u0147\u0148\u00056\u0000\u0000\u0148\u014a"+
		"\u0005,\u0000\u0000\u0149\u014b\u00034\u001a\u0000\u014a\u0149\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0005-\u0000\u0000\u014d\u0156\u0005.\u0000\u0000"+
		"\u014e\u0152\u0005\u0002\u0000\u0000\u014f\u0151\u0003\n\u0005\u0000\u0150"+
		"\u014f\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152"+
		"\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153"+
		"\u0155\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155"+
		"\u0157\u00051\u0000\u0000\u0156\u014e\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0001\u0000\u0000\u0000\u0157\u015b\u0001\u0000\u0000\u0000\u0158\u015a"+
		"\u0003\"\u0011\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u015d\u0001"+
		"\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001"+
		"\u0000\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015b\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0005/\u0000\u0000\u015f\u0160\u0005\t"+
		"\u0000\u0000\u0160\u0182\u00052\u0000\u0000\u0161\u0162\u0005\u0012\u0000"+
		"\u0000\u0162\u0163\u0003\u001e\u000f\u0000\u0163\u0164\u00056\u0000\u0000"+
		"\u0164\u0166\u0005,\u0000\u0000\u0165\u0167\u00034\u001a\u0000\u0166\u0165"+
		"\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0001\u0000\u0000\u0000\u0168\u0169\u0005-\u0000\u0000\u0169\u0172\u0005"+
		".\u0000\u0000\u016a\u016e\u0005\u0002\u0000\u0000\u016b\u016d\u0003\n"+
		"\u0005\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000"+
		"\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000"+
		"\u0000\u0000\u016f\u0171\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000"+
		"\u0000\u0000\u0171\u0173\u00051\u0000\u0000\u0172\u016a\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0177\u0001\u0000\u0000"+
		"\u0000\u0174\u0176\u0003\"\u0011\u0000\u0175\u0174\u0001\u0000\u0000\u0000"+
		"\u0176\u0179\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000"+
		"\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u017b\u0005\u0013\u0000\u0000"+
		"\u017b\u017c\u0003@ \u0000\u017c\u017d\u00052\u0000\u0000\u017d\u017e"+
		"\u0005/\u0000\u0000\u017e\u017f\u0005\t\u0000\u0000\u017f\u0180\u0005"+
		"2\u0000\u0000\u0180\u0182\u0001\u0000\u0000\u0000\u0181\u0146\u0001\u0000"+
		"\u0000\u0000\u0181\u0161\u0001\u0000\u0000\u0000\u01823\u0001\u0000\u0000"+
		"\u0000\u0183\u0188\u00036\u001b\u0000\u0184\u0185\u00054\u0000\u0000\u0185"+
		"\u0187\u00036\u001b\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u018a"+
		"\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0001\u0000\u0000\u0000\u01895\u0001\u0000\u0000\u0000\u018a\u0188\u0001"+
		"\u0000\u0000\u0000\u018b\u018c\u0005\u0006\u0000\u0000\u018c\u018d\u0005"+
		"6\u0000\u0000\u018d\u018e\u00053\u0000\u0000\u018e\u018f\u0003\u001e\u000f"+
		"\u0000\u018f7\u0001\u0000\u0000\u0000\u0190\u0191\u00056\u0000\u0000\u0191"+
		"\u0193\u0005,\u0000\u0000\u0192\u0194\u0003:\u001d\u0000\u0193\u0192\u0001"+
		"\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0001"+
		"\u0000\u0000\u0000\u0195\u0196\u0005-\u0000\u0000\u01969\u0001\u0000\u0000"+
		"\u0000\u0197\u019c\u0003@ \u0000\u0198\u0199\u00054\u0000\u0000\u0199"+
		"\u019b\u0003@ \u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019e\u0001"+
		"\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001"+
		"\u0000\u0000\u0000\u019d;\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000"+
		"\u0000\u0000\u019f\u01a1\u0005#\u0000\u0000\u01a0\u01a2\u00056\u0000\u0000"+
		"\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4\u00052\u0000\u0000\u01a4"+
		"=\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005$\u0000\u0000\u01a6\u01ab\u0003"+
		"@ \u0000\u01a7\u01a8\u0005$\u0000\u0000\u01a8\u01aa\u0003@ \u0000\u01a9"+
		"\u01a7\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab"+
		"\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ae\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae"+
		"\u01af\u00052\u0000\u0000\u01af?\u0001\u0000\u0000\u0000\u01b0\u01b1\u0003"+
		"B!\u0000\u01b1A\u0001\u0000\u0000\u0000\u01b2\u01b7\u0003D\"\u0000\u01b3"+
		"\u01b4\u0007\u0001\u0000\u0000\u01b4\u01b6\u0003D\"\u0000\u01b5\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8C\u0001"+
		"\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bf\u0003"+
		"F#\u0000\u01bb\u01bc\u0007\u0002\u0000\u0000\u01bc\u01be\u0003F#\u0000"+
		"\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000"+
		"\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c0E\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c7\u0003H$\u0000\u01c3\u01c4\u0007\u0003\u0000\u0000\u01c4\u01c6\u0003"+
		"H$\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000"+
		"\u0000\u01c8G\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cf\u0003J%\u0000\u01cb\u01cc\u0007\u0004\u0000\u0000\u01cc\u01ce"+
		"\u0003J%\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000"+
		"\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d0I\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d3\u0005\u0014\u0000\u0000\u01d3\u01db\u0003J%\u0000\u01d4"+
		"\u01d5\u0007\u0005\u0000\u0000\u01d5\u01db\u0003L&\u0000\u01d6\u01d8\u0003"+
		"L&\u0000\u01d7\u01d9\u0007\u0005\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01db\u0001\u0000\u0000"+
		"\u0000\u01da\u01d2\u0001\u0000\u0000\u0000\u01da\u01d4\u0001\u0000\u0000"+
		"\u0000\u01da\u01d6\u0001\u0000\u0000\u0000\u01dbK\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0005,\u0000\u0000\u01dd\u01de\u0003@ \u0000\u01de\u01df"+
		"\u0005-\u0000\u0000\u01df\u01e9\u0001\u0000\u0000\u0000\u01e0\u01e9\u0003"+
		"8\u001c\u0000\u01e1\u01e9\u0003&\u0013\u0000\u01e2\u01e9\u00057\u0000"+
		"\u0000\u01e3\u01e9\u00058\u0000\u0000\u01e4\u01e9\u00059\u0000\u0000\u01e5"+
		"\u01e9\u0005:\u0000\u0000\u01e6\u01e9\u0005\u0019\u0000\u0000\u01e7\u01e9"+
		"\u0005\u001a\u0000\u0000\u01e8\u01dc\u0001\u0000\u0000\u0000\u01e8\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e1\u0001\u0000\u0000\u0000\u01e8\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e3\u0001\u0000\u0000\u0000\u01e8\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9M\u0001"+
		"\u0000\u0000\u0000.OR[bisz\u0089\u009a\u009e\u00aa\u00b5\u00c3\u00c7\u00da"+
		"\u00e0\u00e9\u00f1\u00f5\u0105\u010a\u0113\u0120\u012c\u0141\u014a\u0152"+
		"\u0156\u015b\u0166\u016e\u0172\u0177\u0181\u0188\u0193\u019c\u01a1\u01ab"+
		"\u01b7\u01bf\u01c7\u01cf\u01d8\u01da\u01e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}