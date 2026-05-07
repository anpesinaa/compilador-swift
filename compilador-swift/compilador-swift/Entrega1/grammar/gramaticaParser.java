// Generated from gramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, VARS=2, INICIO=3, FIN=4, ENTERO=5, FLOTANTE=6, ESCRIBE=7, 
		MIENTRAS=8, HAZ=9, SI=10, SINO=11, NULA=12, SEMICOLON=13, COLON=14, COMMA=15, 
		LPAREN=16, RPAREN=17, LBRACE=18, RBRACE=19, LBRACKET=20, RBRACKET=21, 
		PLUS=22, MINUS=23, MULT=24, DIV=25, ASSIGN=26, GREATER=27, LESS=28, NOT_EQUAL=29, 
		EQUAL_EQUAL=30, ID=31, CTE_INT=32, CTE_FLOAT=33, LETRERO=34, WS=35;
	public static final int
		RULE_programa = 0, RULE_vars = 1, RULE_tipo = 2, RULE_cuerpo = 3, RULE_estatuto = 4, 
		RULE_asigna = 5, RULE_imprime = 6, RULE_ciclo = 7, RULE_condicion = 8, 
		RULE_factor = 9, RULE_funcs = 10, RULE_expresion = 11, RULE_llamada = 12, 
		RULE_termino = 13, RULE_exp = 14, RULE_cte = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "vars", "tipo", "cuerpo", "estatuto", "asigna", "imprime", 
			"ciclo", "condicion", "factor", "funcs", "expresion", "llamada", "termino", 
			"exp", "cte"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'vars'", "'inicio'", "'fin'", "'entero'", "'flotante'", 
			"'escribe'", "'mientras'", "'haz'", "'si'", "'sino'", "'nula'", "';'", 
			"':'", "','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'+'", "'-'", 
			"'*'", "'/'", "'='", "'>'", "'<'", "'!='", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "VARS", "INICIO", "FIN", "ENTERO", "FLOTANTE", "ESCRIBE", 
			"MIENTRAS", "HAZ", "SI", "SINO", "NULA", "SEMICOLON", "COLON", "COMMA", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "PLUS", 
			"MINUS", "MULT", "DIV", "ASSIGN", "GREATER", "LESS", "NOT_EQUAL", "EQUAL_EQUAL", 
			"ID", "CTE_INT", "CTE_FLOAT", "LETRERO", "WS"
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
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(gramaticaParser.PROGRAMA, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public FuncsContext funcs() {
			return getRuleContext(FuncsContext.class,0);
		}
		public TerminalNode INICIO() { return getToken(gramaticaParser.INICIO, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public TerminalNode FIN() { return getToken(gramaticaParser.FIN, 0); }
		public TerminalNode EOF() { return getToken(gramaticaParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(PROGRAMA);
			setState(33);
			match(ID);
			setState(34);
			match(SEMICOLON);
			setState(35);
			vars();
			setState(36);
			funcs();
			setState(37);
			match(INICIO);
			setState(38);
			cuerpo();
			setState(39);
			match(FIN);
			setState(40);
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
	public static class VarsContext extends ParserRuleContext {
		public TerminalNode VARS() { return getToken(gramaticaParser.VARS, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(VARS);
			setState(43);
			match(ID);
			setState(44);
			match(COLON);
			setState(45);
			tipo();
			setState(46);
			match(SEMICOLON);
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
		public TerminalNode ENTERO() { return getToken(gramaticaParser.ENTERO, 0); }
		public TerminalNode FLOTANTE() { return getToken(gramaticaParser.FLOTANTE, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==FLOTANTE) ) {
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
	public static class CuerpoContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(gramaticaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(gramaticaParser.RBRACE, 0); }
		public List<EstatutoContext> estatuto() {
			return getRuleContexts(EstatutoContext.class);
		}
		public EstatutoContext estatuto(int i) {
			return getRuleContext(EstatutoContext.class,i);
		}
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCuerpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCuerpo(this);
		}
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(LBRACE);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2148533632L) != 0)) {
				{
				{
				setState(51);
				estatuto();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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
	public static class EstatutoContext extends ParserRuleContext {
		public AsignaContext asigna() {
			return getRuleContext(AsignaContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public ImprimeContext imprime() {
			return getRuleContext(ImprimeContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(gramaticaParser.LBRACKET, 0); }
		public EstatutoContext estatuto() {
			return getRuleContext(EstatutoContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(gramaticaParser.RBRACKET, 0); }
		public EstatutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estatuto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEstatuto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEstatuto(this);
		}
	}

	public final EstatutoContext estatuto() throws RecognitionException {
		EstatutoContext _localctx = new EstatutoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_estatuto);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				asigna();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				condicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				ciclo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				llamada();
				setState(63);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				imprime();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				match(LBRACKET);
				setState(67);
				estatuto();
				setState(68);
				match(RBRACKET);
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
	public static class AsignaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public AsignaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asigna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAsigna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAsigna(this);
		}
	}

	public final AsignaContext asigna() throws RecognitionException {
		AsignaContext _localctx = new AsignaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asigna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(ID);
			setState(73);
			match(ASSIGN);
			setState(74);
			expresion();
			setState(75);
			match(SEMICOLON);
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
	public static class ImprimeContext extends ParserRuleContext {
		public TerminalNode ESCRIBE() { return getToken(gramaticaParser.ESCRIBE, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> LETRERO() { return getTokens(gramaticaParser.LETRERO); }
		public TerminalNode LETRERO(int i) {
			return getToken(gramaticaParser.LETRERO, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gramaticaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gramaticaParser.COMMA, i);
		}
		public ImprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterImprime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitImprime(this);
		}
	}

	public final ImprimeContext imprime() throws RecognitionException {
		ImprimeContext _localctx = new ImprimeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_imprime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ESCRIBE);
			setState(78);
			match(LPAREN);
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case PLUS:
			case MINUS:
			case ID:
			case CTE_INT:
			case CTE_FLOAT:
				{
				setState(79);
				expresion();
				}
				break;
			case LETRERO:
				{
				setState(80);
				match(LETRERO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(83);
				match(COMMA);
				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
				case PLUS:
				case MINUS:
				case ID:
				case CTE_INT:
				case CTE_FLOAT:
					{
					setState(84);
					expresion();
					}
					break;
				case LETRERO:
					{
					setState(85);
					match(LETRERO);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(RPAREN);
			setState(94);
			match(SEMICOLON);
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
	public static class CicloContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(gramaticaParser.MIENTRAS, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public TerminalNode HAZ() { return getToken(gramaticaParser.HAZ, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCiclo(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ciclo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(MIENTRAS);
			setState(97);
			match(LPAREN);
			setState(98);
			expresion();
			setState(99);
			match(RPAREN);
			setState(100);
			match(HAZ);
			setState(101);
			cuerpo();
			setState(102);
			match(SEMICOLON);
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
	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(gramaticaParser.SI, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public List<CuerpoContext> cuerpo() {
			return getRuleContexts(CuerpoContext.class);
		}
		public CuerpoContext cuerpo(int i) {
			return getRuleContext(CuerpoContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public TerminalNode SINO() { return getToken(gramaticaParser.SINO, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(SI);
			setState(105);
			match(LPAREN);
			setState(106);
			expresion();
			setState(107);
			match(RPAREN);
			setState(108);
			cuerpo();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(109);
				match(SINO);
				setState(110);
				cuerpo();
				}
			}

			setState(113);
			match(SEMICOLON);
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
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(gramaticaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(gramaticaParser.MINUS, 0); }
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(LPAREN);
				setState(116);
				expresion();
				setState(117);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(119);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(124);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(122);
					match(ID);
					}
					break;
				case CTE_INT:
				case CTE_FLOAT:
					{
					setState(123);
					cte();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				llamada();
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
	public static class FuncsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(gramaticaParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(gramaticaParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(gramaticaParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(gramaticaParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(gramaticaParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(gramaticaParser.LBRACE, i);
		}
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
		}
		public List<CuerpoContext> cuerpo() {
			return getRuleContexts(CuerpoContext.class);
		}
		public CuerpoContext cuerpo(int i) {
			return getRuleContext(CuerpoContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(gramaticaParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(gramaticaParser.RBRACE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(gramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gramaticaParser.SEMICOLON, i);
		}
		public List<TerminalNode> NULA() { return getTokens(gramaticaParser.NULA); }
		public TerminalNode NULA(int i) {
			return getToken(gramaticaParser.NULA, i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(gramaticaParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(gramaticaParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gramaticaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gramaticaParser.COMMA, i);
		}
		public FuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFuncs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFuncs(this);
		}
	}

	public final FuncsContext funcs() throws RecognitionException {
		FuncsContext _localctx = new FuncsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4192L) != 0)) {
				{
				{
				setState(131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NULA:
					{
					setState(129);
					match(NULA);
					}
					break;
				case ENTERO:
				case FLOTANTE:
					{
					setState(130);
					tipo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(133);
				match(ID);
				setState(134);
				match(LPAREN);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(135);
					match(ID);
					setState(136);
					match(COLON);
					setState(137);
					tipo();
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(138);
						match(COMMA);
						setState(139);
						match(ID);
						setState(140);
						match(COLON);
						setState(141);
						tipo();
						}
						}
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(149);
				match(RPAREN);
				setState(150);
				match(LBRACE);
				setState(151);
				vars();
				setState(152);
				cuerpo();
				setState(153);
				match(RBRACE);
				setState(154);
				match(SEMICOLON);
				}
				}
				setState(160);
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
	public static class ExpresionContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode GREATER() { return getToken(gramaticaParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(gramaticaParser.LESS, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(gramaticaParser.NOT_EQUAL, 0); }
		public TerminalNode EQUAL_EQUAL() { return getToken(gramaticaParser.EQUAL_EQUAL, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			exp();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013265920L) != 0)) {
				{
				setState(162);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013265920L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(163);
				exp();
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
	public static class LlamadaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gramaticaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gramaticaParser.COMMA, i);
		}
		public LlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLlamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLlamada(this);
		}
	}

	public final LlamadaContext llamada() throws RecognitionException {
		LlamadaContext _localctx = new LlamadaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_llamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ID);
			setState(167);
			match(LPAREN);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15045033984L) != 0)) {
				{
				setState(168);
				expresion();
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(169);
					match(COMMA);
					setState(170);
					expresion();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(178);
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
	public static class TerminoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(gramaticaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(gramaticaParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(gramaticaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(gramaticaParser.DIV, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			factor();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(181);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				factor();
				}
				}
				setState(187);
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
	public static class ExpContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(gramaticaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(gramaticaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(gramaticaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(gramaticaParser.MINUS, i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			termino();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(189);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
				termino();
				}
				}
				setState(195);
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
	public static class CteContext extends ParserRuleContext {
		public TerminalNode CTE_INT() { return getToken(gramaticaParser.CTE_INT, 0); }
		public TerminalNode CTE_FLOAT() { return getToken(gramaticaParser.CTE_FLOAT, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCte(this);
		}
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==CTE_INT || _la==CTE_FLOAT) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001#\u00c7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0005\u00035\b\u0003\n\u0003\f\u00038\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004G\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006R\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"W\b\u0006\u0005\u0006Y\b\u0006\n\u0006\f\u0006\\\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bp\b\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\ty\b\t\u0001\t\u0001\t\u0003\t}\b\t\u0001"+
		"\t\u0003\t\u0080\b\t\u0001\n\u0001\n\u0003\n\u0084\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u008f"+
		"\b\n\n\n\f\n\u0092\t\n\u0003\n\u0094\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u009d\b\n\n\n\f\n\u00a0\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00a5\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00ac\b\f\n\f\f\f\u00af\t\f\u0003\f\u00b1\b"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00b8\b\r\n\r\f\r\u00bb"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00c0\b\u000e\n\u000e"+
		"\f\u000e\u00c3\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000"+
		"\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e\u0000\u0005\u0001\u0000\u0005\u0006\u0001\u0000\u0016"+
		"\u0017\u0001\u0000\u001b\u001e\u0001\u0000\u0018\u0019\u0001\u0000 !\u00cd"+
		"\u0000 \u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000\u00040"+
		"\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\bF\u0001\u0000"+
		"\u0000\u0000\nH\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000e"+
		"`\u0001\u0000\u0000\u0000\u0010h\u0001\u0000\u0000\u0000\u0012\u007f\u0001"+
		"\u0000\u0000\u0000\u0014\u009e\u0001\u0000\u0000\u0000\u0016\u00a1\u0001"+
		"\u0000\u0000\u0000\u0018\u00a6\u0001\u0000\u0000\u0000\u001a\u00b4\u0001"+
		"\u0000\u0000\u0000\u001c\u00bc\u0001\u0000\u0000\u0000\u001e\u00c4\u0001"+
		"\u0000\u0000\u0000 !\u0005\u0001\u0000\u0000!\"\u0005\u001f\u0000\u0000"+
		"\"#\u0005\r\u0000\u0000#$\u0003\u0002\u0001\u0000$%\u0003\u0014\n\u0000"+
		"%&\u0005\u0003\u0000\u0000&\'\u0003\u0006\u0003\u0000\'(\u0005\u0004\u0000"+
		"\u0000()\u0005\u0000\u0000\u0001)\u0001\u0001\u0000\u0000\u0000*+\u0005"+
		"\u0002\u0000\u0000+,\u0005\u001f\u0000\u0000,-\u0005\u000e\u0000\u0000"+
		"-.\u0003\u0004\u0002\u0000./\u0005\r\u0000\u0000/\u0003\u0001\u0000\u0000"+
		"\u000001\u0007\u0000\u0000\u00001\u0005\u0001\u0000\u0000\u000026\u0005"+
		"\u0012\u0000\u000035\u0003\b\u0004\u000043\u0001\u0000\u0000\u000058\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"79\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\u0013\u0000"+
		"\u0000:\u0007\u0001\u0000\u0000\u0000;G\u0003\n\u0005\u0000<G\u0003\u0010"+
		"\b\u0000=G\u0003\u000e\u0007\u0000>?\u0003\u0018\f\u0000?@\u0005\r\u0000"+
		"\u0000@G\u0001\u0000\u0000\u0000AG\u0003\f\u0006\u0000BC\u0005\u0014\u0000"+
		"\u0000CD\u0003\b\u0004\u0000DE\u0005\u0015\u0000\u0000EG\u0001\u0000\u0000"+
		"\u0000F;\u0001\u0000\u0000\u0000F<\u0001\u0000\u0000\u0000F=\u0001\u0000"+
		"\u0000\u0000F>\u0001\u0000\u0000\u0000FA\u0001\u0000\u0000\u0000FB\u0001"+
		"\u0000\u0000\u0000G\t\u0001\u0000\u0000\u0000HI\u0005\u001f\u0000\u0000"+
		"IJ\u0005\u001a\u0000\u0000JK\u0003\u0016\u000b\u0000KL\u0005\r\u0000\u0000"+
		"L\u000b\u0001\u0000\u0000\u0000MN\u0005\u0007\u0000\u0000NQ\u0005\u0010"+
		"\u0000\u0000OR\u0003\u0016\u000b\u0000PR\u0005\"\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000QP\u0001\u0000\u0000\u0000RZ\u0001\u0000\u0000\u0000SV\u0005"+
		"\u000f\u0000\u0000TW\u0003\u0016\u000b\u0000UW\u0005\"\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000"+
		"XS\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000]^\u0005\u0011\u0000\u0000^_\u0005\r\u0000\u0000_\r\u0001"+
		"\u0000\u0000\u0000`a\u0005\b\u0000\u0000ab\u0005\u0010\u0000\u0000bc\u0003"+
		"\u0016\u000b\u0000cd\u0005\u0011\u0000\u0000de\u0005\t\u0000\u0000ef\u0003"+
		"\u0006\u0003\u0000fg\u0005\r\u0000\u0000g\u000f\u0001\u0000\u0000\u0000"+
		"hi\u0005\n\u0000\u0000ij\u0005\u0010\u0000\u0000jk\u0003\u0016\u000b\u0000"+
		"kl\u0005\u0011\u0000\u0000lo\u0003\u0006\u0003\u0000mn\u0005\u000b\u0000"+
		"\u0000np\u0003\u0006\u0003\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0005\r\u0000\u0000r\u0011\u0001"+
		"\u0000\u0000\u0000st\u0005\u0010\u0000\u0000tu\u0003\u0016\u000b\u0000"+
		"uv\u0005\u0011\u0000\u0000v\u0080\u0001\u0000\u0000\u0000wy\u0007\u0001"+
		"\u0000\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y|\u0001"+
		"\u0000\u0000\u0000z}\u0005\u001f\u0000\u0000{}\u0003\u001e\u000f\u0000"+
		"|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000"+
		"\u0000\u0000~\u0080\u0003\u0018\f\u0000\u007fs\u0001\u0000\u0000\u0000"+
		"\u007fx\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0013"+
		"\u0001\u0000\u0000\u0000\u0081\u0084\u0005\f\u0000\u0000\u0082\u0084\u0003"+
		"\u0004\u0002\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"\u001f\u0000\u0000\u0086\u0093\u0005\u0010\u0000\u0000\u0087\u0088\u0005"+
		"\u001f\u0000\u0000\u0088\u0089\u0005\u000e\u0000\u0000\u0089\u0090\u0003"+
		"\u0004\u0002\u0000\u008a\u008b\u0005\u000f\u0000\u0000\u008b\u008c\u0005"+
		"\u001f\u0000\u0000\u008c\u008d\u0005\u000e\u0000\u0000\u008d\u008f\u0003"+
		"\u0004\u0002\u0000\u008e\u008a\u0001\u0000\u0000\u0000\u008f\u0092\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0093\u0087\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\u0011\u0000\u0000\u0096\u0097\u0005\u0012\u0000\u0000\u0097\u0098\u0003"+
		"\u0002\u0001\u0000\u0098\u0099\u0003\u0006\u0003\u0000\u0099\u009a\u0005"+
		"\u0013\u0000\u0000\u009a\u009b\u0005\r\u0000\u0000\u009b\u009d\u0001\u0000"+
		"\u0000\u0000\u009c\u0083\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u0015\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a4\u0003\u001c\u000e\u0000\u00a2\u00a3\u0007\u0002"+
		"\u0000\u0000\u00a3\u00a5\u0003\u001c\u000e\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u0017\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005\u001f\u0000\u0000\u00a7\u00b0\u0005\u0010"+
		"\u0000\u0000\u00a8\u00ad\u0003\u0016\u000b\u0000\u00a9\u00aa\u0005\u000f"+
		"\u0000\u0000\u00aa\u00ac\u0003\u0016\u000b\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00a8\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0005\u0011\u0000\u0000\u00b3\u0019\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b9\u0003\u0012\t\u0000\u00b5\u00b6\u0007\u0003\u0000"+
		"\u0000\u00b6\u00b8\u0003\u0012\t\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u001b\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00c1\u0003\u001a\r\u0000\u00bd"+
		"\u00be\u0007\u0001\u0000\u0000\u00be\u00c0\u0003\u001a\r\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u001d"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0007\u0004\u0000\u0000\u00c5\u001f\u0001\u0000\u0000\u0000\u00126FQ"+
		"VZox|\u007f\u0083\u0090\u0093\u009e\u00a4\u00ad\u00b0\u00b9\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}