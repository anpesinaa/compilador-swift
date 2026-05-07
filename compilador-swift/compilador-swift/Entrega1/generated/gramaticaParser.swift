// Generated from grammar/gramatica.g4 by ANTLR 4.13.2
import Antlr4

open class gramaticaParser: Parser {

	internal static var _decisionToDFA: [DFA] = {
          var decisionToDFA = [DFA]()
          let length = gramaticaParser._ATN.getNumberOfDecisions()
          for i in 0..<length {
            decisionToDFA.append(DFA(gramaticaParser._ATN.getDecisionState(i)!, i))
           }
           return decisionToDFA
     }()

	internal static let _sharedContextCache = PredictionContextCache()

	public
	enum Tokens: Int {
		case EOF = -1, PROGRAMA = 1, VARS = 2, INICIO = 3, FIN = 4, ENTERO = 5, 
                 FLOTANTE = 6, ESCRIBE = 7, MIENTRAS = 8, HAZ = 9, SI = 10, 
                 SINO = 11, NULA = 12, SEMICOLON = 13, COLON = 14, COMMA = 15, 
                 LPAREN = 16, RPAREN = 17, LBRACE = 18, RBRACE = 19, LBRACKET = 20, 
                 RBRACKET = 21, PLUS = 22, MINUS = 23, MULT = 24, DIV = 25, 
                 ASSIGN = 26, GREATER = 27, LESS = 28, NOT_EQUAL = 29, EQUAL_EQUAL = 30, 
                 ID = 31, CTE_INT = 32, CTE_FLOAT = 33, LETRERO = 34, WS = 35
	}

	public
	static let RULE_programa = 0, RULE_vars = 1, RULE_tipo = 2, RULE_cuerpo = 3, 
            RULE_estatuto = 4, RULE_asigna = 5, RULE_imprime = 6, RULE_ciclo = 7, 
            RULE_condicion = 8, RULE_factor = 9, RULE_funcs = 10, RULE_expresion = 11, 
            RULE_llamada = 12, RULE_termino = 13, RULE_exp = 14, RULE_cte = 15

	public
	static let ruleNames: [String] = [
		"programa", "vars", "tipo", "cuerpo", "estatuto", "asigna", "imprime", 
		"ciclo", "condicion", "factor", "funcs", "expresion", "llamada", "termino", 
		"exp", "cte"
	]

	private static let _LITERAL_NAMES: [String?] = [
		nil, "'programa'", "'vars'", "'inicio'", "'fin'", "'entero'", "'flotante'", 
		"'escribe'", "'mientras'", "'haz'", "'si'", "'sino'", "'nula'", "';'", 
		"':'", "','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'+'", "'-'", 
		"'*'", "'/'", "'='", "'>'", "'<'", "'!='", "'=='"
	]
	private static let _SYMBOLIC_NAMES: [String?] = [
		nil, "PROGRAMA", "VARS", "INICIO", "FIN", "ENTERO", "FLOTANTE", "ESCRIBE", 
		"MIENTRAS", "HAZ", "SI", "SINO", "NULA", "SEMICOLON", "COLON", "COMMA", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "PLUS", 
		"MINUS", "MULT", "DIV", "ASSIGN", "GREATER", "LESS", "NOT_EQUAL", "EQUAL_EQUAL", 
		"ID", "CTE_INT", "CTE_FLOAT", "LETRERO", "WS"
	]
	public
	static let VOCABULARY = Vocabulary(_LITERAL_NAMES, _SYMBOLIC_NAMES)

	override open
	func getGrammarFileName() -> String { return "gramatica.g4" }

	override open
	func getRuleNames() -> [String] { return gramaticaParser.ruleNames }

	override open
	func getSerializedATN() -> [Int] { return gramaticaParser._serializedATN }

	override open
	func getATN() -> ATN { return gramaticaParser._ATN }


	override open
	func getVocabulary() -> Vocabulary {
	    return gramaticaParser.VOCABULARY
	}

	override public
	init(_ input:TokenStream) throws {
	    RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION)
		try super.init(input)
		_interp = ParserATNSimulator(self,gramaticaParser._ATN,gramaticaParser._decisionToDFA, gramaticaParser._sharedContextCache)
	}


	public class ProgramaContext: ParserRuleContext {
			open
			func PROGRAMA() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.PROGRAMA.rawValue, 0)
			}
			open
			func ID() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.ID.rawValue, 0)
			}
			open
			func SEMICOLON() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.SEMICOLON.rawValue, 0)
			}
			open
			func vars() -> VarsContext? {
				return getRuleContext(VarsContext.self, 0)
			}
			open
			func funcs() -> FuncsContext? {
				return getRuleContext(FuncsContext.self, 0)
			}
			open
			func INICIO() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.INICIO.rawValue, 0)
			}
			open
			func cuerpo() -> CuerpoContext? {
				return getRuleContext(CuerpoContext.self, 0)
			}
			open
			func FIN() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.FIN.rawValue, 0)
			}
			open
			func EOF() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.EOF.rawValue, 0)
			}
		override open
		func getRuleIndex() -> Int {
			return gramaticaParser.RULE_programa
		}
		override open
		func enterRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.enterPrograma(self)
			}
		}
		override open
		func exitRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.exitPrograma(self)
			}
		}
	}
	@discardableResult
	 open func programa() throws -> ProgramaContext {
		var _localctx: ProgramaContext
		_localctx = ProgramaContext(_ctx, getState())
		try enterRule(_localctx, 0, gramaticaParser.RULE_programa)
		defer {
	    		try! exitRule()
	    }
		do {
		 	try enterOuterAlt(_localctx, 1)
		 	setState(32)
		 	try match(gramaticaParser.Tokens.PROGRAMA.rawValue)
		 	setState(33)
		 	try match(gramaticaParser.Tokens.ID.rawValue)
		 	setState(34)
		 	try match(gramaticaParser.Tokens.SEMICOLON.rawValue)
		 	setState(35)
		 	try vars()
		 	setState(36)
		 	try funcs()
		 	setState(37)
		 	try match(gramaticaParser.Tokens.INICIO.rawValue)
		 	setState(38)
		 	try cuerpo()
		 	setState(39)
		 	try match(gramaticaParser.Tokens.FIN.rawValue)
		 	setState(40)
		 	try match(gramaticaParser.Tokens.EOF.rawValue)

		}
		catch ANTLRException.recognition(let re) {
			_localctx.exception = re
			_errHandler.reportError(self, re)
			try _errHandler.recover(self, re)
		}

		return _localctx
	}

	public class VarsContext: ParserRuleContext {
			open
			func VARS() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.VARS.rawValue, 0)
			}
			open
			func ID() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.ID.rawValue, 0)
			}
			open
			func COLON() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.COLON.rawValue, 0)
			}
			open
			func tipo() -> TipoContext? {
				return getRuleContext(TipoContext.self, 0)
			}
			open
			func SEMICOLON() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.SEMICOLON.rawValue, 0)
			}
		override open
		func getRuleIndex() -> Int {
			return gramaticaParser.RULE_vars
		}
		override open
		func enterRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.enterVars(self)
			}
		}
		override open
		func exitRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.exitVars(self)
			}
		}
	}
	@discardableResult
	 open func vars() throws -> VarsContext {
		var _localctx: VarsContext
		_localctx = VarsContext(_ctx, getState())
		try enterRule(_localctx, 2, gramaticaParser.RULE_vars)
		defer {
	    		try! exitRule()
	    }
		do {
		 	try enterOuterAlt(_localctx, 1)
		 	setState(42)
		 	try match(gramaticaParser.Tokens.VARS.rawValue)
		 	setState(43)
		 	try match(gramaticaParser.Tokens.ID.rawValue)
		 	setState(44)
		 	try match(gramaticaParser.Tokens.COLON.rawValue)
		 	setState(45)
		 	try tipo()
		 	setState(46)
		 	try match(gramaticaParser.Tokens.SEMICOLON.rawValue)

		}
		catch ANTLRException.recognition(let re) {
			_localctx.exception = re
			_errHandler.reportError(self, re)
			try _errHandler.recover(self, re)
		}

		return _localctx
	}

	public class TipoContext: ParserRuleContext {
			open
			func ENTERO() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.ENTERO.rawValue, 0)
			}
			open
			func FLOTANTE() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.FLOTANTE.rawValue, 0)
			}
		override open
		func getRuleIndex() -> Int {
			return gramaticaParser.RULE_tipo
		}
		override open
		func enterRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.enterTipo(self)
			}
		}
		override open
		func exitRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.exitTipo(self)
			}
		}
	}
	@discardableResult
	 open func tipo() throws -> TipoContext {
		var _localctx: TipoContext
		_localctx = TipoContext(_ctx, getState())
		try enterRule(_localctx, 4, gramaticaParser.RULE_tipo)
		var _la: Int = 0
		defer {
	    		try! exitRule()
	    }
		do {
		 	try enterOuterAlt(_localctx, 1)
		 	setState(48)
		 	_la = try _input.LA(1)
		 	if (!(_la == gramaticaParser.Tokens.ENTERO.rawValue || _la == gramaticaParser.Tokens.FLOTANTE.rawValue)) {
		 	try _errHandler.recoverInline(self)
		 	}
		 	else {
		 		_errHandler.reportMatch(self)
		 		try consume()
		 	}

		}
		catch ANTLRException.recognition(let re) {
			_localctx.exception = re
			_errHandler.reportError(self, re)
			try _errHandler.recover(self, re)
		}

		return _localctx
	}

	public class CuerpoContext: ParserRuleContext {
			open
			func LBRACE() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.LBRACE.rawValue, 0)
			}
			open
			func RBRACE() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.RBRACE.rawValue, 0)
			}
			open
			func estatuto() -> [EstatutoContext] {
				return getRuleContexts(EstatutoContext.self)
			}
			open
			func estatuto(_ i: Int) -> EstatutoContext? {
				return getRuleContext(EstatutoContext.self, i)
			}
		override open
		func getRuleIndex() -> Int {
			return gramaticaParser.RULE_cuerpo
		}
		override open
		func enterRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.enterCuerpo(self)
			}
		}
		override open
		func exitRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.exitCuerpo(self)
			}
		}
	}
	@discardableResult
	 open func cuerpo() throws -> CuerpoContext {
		var _localctx: CuerpoContext
		_localctx = CuerpoContext(_ctx, getState())
		try enterRule(_localctx, 6, gramaticaParser.RULE_cuerpo)
		var _la: Int = 0
		defer {
	    		try! exitRule()
	    }
		do {
		 	try enterOuterAlt(_localctx, 1)
		 	setState(50)
		 	try match(gramaticaParser.Tokens.LBRACE.rawValue)
		 	setState(54)
		 	try _errHandler.sync(self)
		 	_la = try _input.LA(1)
		 	while (((Int64(_la) & ~0x3f) == 0 && ((Int64(1) << _la) & 2148533632) != 0)) {
		 		setState(51)
		 		try estatuto()


		 		setState(56)
		 		try _errHandler.sync(self)
		 		_la = try _input.LA(1)
		 	}
		 	setState(57)
		 	try match(gramaticaParser.Tokens.RBRACE.rawValue)

		}
		catch ANTLRException.recognition(let re) {
			_localctx.exception = re
			_errHandler.reportError(self, re)
			try _errHandler.recover(self, re)
		}

		return _localctx
	}

	public class EstatutoContext: ParserRuleContext {
			open
			func asigna() -> AsignaContext? {
				return getRuleContext(AsignaContext.self, 0)
			}
			open
			func condicion() -> CondicionContext? {
				return getRuleContext(CondicionContext.self, 0)
			}
			open
			func ciclo() -> CicloContext? {
				return getRuleContext(CicloContext.self, 0)
			}
			open
			func llamada() -> LlamadaContext? {
				return getRuleContext(LlamadaContext.self, 0)
			}
			open
			func SEMICOLON() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.SEMICOLON.rawValue, 0)
			}
			open
			func imprime() -> ImprimeContext? {
				return getRuleContext(ImprimeContext.self, 0)
			}
			open
			func LBRACKET() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.LBRACKET.rawValue, 0)
			}
			open
			func estatuto() -> EstatutoContext? {
				return getRuleContext(EstatutoContext.self, 0)
			}
			open
			func RBRACKET() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.RBRACKET.rawValue, 0)
			}
		override open
		func getRuleIndex() -> Int {
			return gramaticaParser.RULE_estatuto
		}
		override open
		func enterRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.enterEstatuto(self)
			}
		}
		override open
		func exitRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.exitEstatuto(self)
			}
		}
	}
	@discardableResult
	 open func estatuto() throws -> EstatutoContext {
		var _localctx: EstatutoContext
		_localctx = EstatutoContext(_ctx, getState())
		try enterRule(_localctx, 8, gramaticaParser.RULE_estatuto)
		defer {
	    		try! exitRule()
	    }
		do {
		 	setState(70)
		 	try _errHandler.sync(self)
		 	switch(try getInterpreter().adaptivePredict(_input,1, _ctx)) {
		 	case 1:
		 		try enterOuterAlt(_localctx, 1)
		 		setState(59)
		 		try asigna()

		 		break
		 	case 2:
		 		try enterOuterAlt(_localctx, 2)
		 		setState(60)
		 		try condicion()

		 		break
		 	case 3:
		 		try enterOuterAlt(_localctx, 3)
		 		setState(61)
		 		try ciclo()

		 		break
		 	case 4:
		 		try enterOuterAlt(_localctx, 4)
		 		setState(62)
		 		try llamada()
		 		setState(63)
		 		try match(gramaticaParser.Tokens.SEMICOLON.rawValue)

		 		break
		 	case 5:
		 		try enterOuterAlt(_localctx, 5)
		 		setState(65)
		 		try imprime()

		 		break
		 	case 6:
		 		try enterOuterAlt(_localctx, 6)
		 		setState(66)
		 		try match(gramaticaParser.Tokens.LBRACKET.rawValue)
		 		setState(67)
		 		try estatuto()
		 		setState(68)
		 		try match(gramaticaParser.Tokens.RBRACKET.rawValue)

		 		break
		 	default: break
		 	}
		}
		catch ANTLRException.recognition(let re) {
			_localctx.exception = re
			_errHandler.reportError(self, re)
			try _errHandler.recover(self, re)
		}

		return _localctx
	}

	public class AsignaContext: ParserRuleContext {
			open
			func ID() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.ID.rawValue, 0)
			}
			open
			func ASSIGN() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.ASSIGN.rawValue, 0)
			}
			open
			func expresion() -> ExpresionContext? {
				return getRuleContext(ExpresionContext.self, 0)
			}
			open
			func SEMICOLON() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.SEMICOLON.rawValue, 0)
			}
		override open
		func getRuleIndex() -> Int {
			return gramaticaParser.RULE_asigna
		}
		override open
		func enterRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.enterAsigna(self)
			}
		}
		override open
		func exitRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.exitAsigna(self)
			}
		}
	}
	@discardableResult
	 open func asigna() throws -> AsignaContext {
		var _localctx: AsignaContext
		_localctx = AsignaContext(_ctx, getState())
		try enterRule(_localctx, 10, gramaticaParser.RULE_asigna)
		defer {
	    		try! exitRule()
	    }
		do {
		 	try enterOuterAlt(_localctx, 1)
		 	setState(72)
		 	try match(gramaticaParser.Tokens.ID.rawValue)
		 	setState(73)
		 	try match(gramaticaParser.Tokens.ASSIGN.rawValue)
		 	setState(74)
		 	try expresion()
		 	setState(75)
		 	try match(gramaticaParser.Tokens.SEMICOLON.rawValue)

		}
		catch ANTLRException.recognition(let re) {
			_localctx.exception = re
			_errHandler.reportError(self, re)
			try _errHandler.recover(self, re)
		}

		return _localctx
	}

	public class ImprimeContext: ParserRuleContext {
			open
			func ESCRIBE() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.ESCRIBE.rawValue, 0)
			}
			open
			func LPAREN() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.LPAREN.rawValue, 0)
			}
			open
			func RPAREN() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.RPAREN.rawValue, 0)
			}
			open
			func SEMICOLON() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.SEMICOLON.rawValue, 0)
			}
			open
			func expresion() -> [ExpresionContext] {
				return getRuleContexts(ExpresionContext.self)
			}
			open
			func expresion(_ i: Int) -> ExpresionContext? {
				return getRuleContext(ExpresionContext.self, i)
			}
			open
			func LETRERO() -> [TerminalNode] {
				return getTokens(gramaticaParser.Tokens.LETRERO.rawValue)
			}
			open
			func LETRERO(_ i:Int) -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.LETRERO.rawValue, i)
			}
			open
			func COMMA() -> [TerminalNode] {
				return getTokens(gramaticaParser.Tokens.COMMA.rawValue)
			}
			open
			func COMMA(_ i:Int) -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.COMMA.rawValue, i)
			}
		override open
		func getRuleIndex() -> Int {
			return gramaticaParser.RULE_imprime
		}
		override open
		func enterRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.enterImprime(self)
			}
		}
		override open
		func exitRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.exitImprime(self)
			}
		}
	}
	@discardableResult
	 open func imprime() throws -> ImprimeContext {
		var _localctx: ImprimeContext
		_localctx = ImprimeContext(_ctx, getState())
		try enterRule(_localctx, 12, gramaticaParser.RULE_imprime)
		var _la: Int = 0
		defer {
	    		try! exitRule()
	    }
		do {
		 	try enterOuterAlt(_localctx, 1)
		 	setState(77)
		 	try match(gramaticaParser.Tokens.ESCRIBE.rawValue)
		 	setState(78)
		 	try match(gramaticaParser.Tokens.LPAREN.rawValue)
		 	setState(81)
		 	try _errHandler.sync(self)
		 	switch (gramaticaParser.Tokens(rawValue: try _input.LA(1))!) {
		 	case .LPAREN:fallthrough
		 	case .PLUS:fallthrough
		 	case .MINUS:fallthrough
		 	case .ID:fallthrough
		 	case .CTE_INT:fallthrough
		 	case .CTE_FLOAT:
		 		setState(79)
		 		try expresion()

		 		break

		 	case .LETRERO:
		 		setState(80)
		 		try match(gramaticaParser.Tokens.LETRERO.rawValue)

		 		break
		 	default:
		 		throw ANTLRException.recognition(e: NoViableAltException(self))
		 	}
		 	setState(90)
		 	try _errHandler.sync(self)
		 	_la = try _input.LA(1)
		 	while (_la == gramaticaParser.Tokens.COMMA.rawValue) {
		 		setState(83)
		 		try match(gramaticaParser.Tokens.COMMA.rawValue)
		 		setState(86)
		 		try _errHandler.sync(self)
		 		switch (gramaticaParser.Tokens(rawValue: try _input.LA(1))!) {
		 		case .LPAREN:fallthrough
		 		case .PLUS:fallthrough
		 		case .MINUS:fallthrough
		 		case .ID:fallthrough
		 		case .CTE_INT:fallthrough
		 		case .CTE_FLOAT:
		 			setState(84)
		 			try expresion()

		 			break

		 		case .LETRERO:
		 			setState(85)
		 			try match(gramaticaParser.Tokens.LETRERO.rawValue)

		 			break
		 		default:
		 			throw ANTLRException.recognition(e: NoViableAltException(self))
		 		}


		 		setState(92)
		 		try _errHandler.sync(self)
		 		_la = try _input.LA(1)
		 	}
		 	setState(93)
		 	try match(gramaticaParser.Tokens.RPAREN.rawValue)
		 	setState(94)
		 	try match(gramaticaParser.Tokens.SEMICOLON.rawValue)

		}
		catch ANTLRException.recognition(let re) {
			_localctx.exception = re
			_errHandler.reportError(self, re)
			try _errHandler.recover(self, re)
		}

		return _localctx
	}

	public class CicloContext: ParserRuleContext {
			open
			func MIENTRAS() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.MIENTRAS.rawValue, 0)
			}
			open
			func LPAREN() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.LPAREN.rawValue, 0)
			}
			open
			func expresion() -> ExpresionContext? {
				return getRuleContext(ExpresionContext.self, 0)
			}
			open
			func RPAREN() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.RPAREN.rawValue, 0)
			}
			open
			func HAZ() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.HAZ.rawValue, 0)
			}
			open
			func cuerpo() -> CuerpoContext? {
				return getRuleContext(CuerpoContext.self, 0)
			}
			open
			func SEMICOLON() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.SEMICOLON.rawValue, 0)
			}
		override open
		func getRuleIndex() -> Int {
			return gramaticaParser.RULE_ciclo
		}
		override open
		func enterRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.enterCiclo(self)
			}
		}
		override open
		func exitRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.exitCiclo(self)
			}
		}
	}
	@discardableResult
	 open func ciclo() throws -> CicloContext {
		var _localctx: CicloContext
		_localctx = CicloContext(_ctx, getState())
		try enterRule(_localctx, 14, gramaticaParser.RULE_ciclo)
		defer {
	    		try! exitRule()
	    }
		do {
		 	try enterOuterAlt(_localctx, 1)
		 	setState(96)
		 	try match(gramaticaParser.Tokens.MIENTRAS.rawValue)
		 	setState(97)
		 	try match(gramaticaParser.Tokens.LPAREN.rawValue)
		 	setState(98)
		 	try expresion()
		 	setState(99)
		 	try match(gramaticaParser.Tokens.RPAREN.rawValue)
		 	setState(100)
		 	try match(gramaticaParser.Tokens.HAZ.rawValue)
		 	setState(101)
		 	try cuerpo()
		 	setState(102)
		 	try match(gramaticaParser.Tokens.SEMICOLON.rawValue)

		}
		catch ANTLRException.recognition(let re) {
			_localctx.exception = re
			_errHandler.reportError(self, re)
			try _errHandler.recover(self, re)
		}

		return _localctx
	}

	public class CondicionContext: ParserRuleContext {
			open
			func SI() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.SI.rawValue, 0)
			}
			open
			func LPAREN() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.LPAREN.rawValue, 0)
			}
			open
			func expresion() -> ExpresionContext? {
				return getRuleContext(ExpresionContext.self, 0)
			}
			open
			func RPAREN() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.RPAREN.rawValue, 0)
			}
			open
			func cuerpo() -> [CuerpoContext] {
				return getRuleContexts(CuerpoContext.self)
			}
			open
			func cuerpo(_ i: Int) -> CuerpoContext? {
				return getRuleContext(CuerpoContext.self, i)
			}
			open
			func SEMICOLON() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.SEMICOLON.rawValue, 0)
			}
			open
			func SINO() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.SINO.rawValue, 0)
			}
		override open
		func getRuleIndex() -> Int {
			return gramaticaParser.RULE_condicion
		}
		override open
		func enterRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.enterCondicion(self)
			}
		}
		override open
		func exitRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.exitCondicion(self)
			}
		}
	}
	@discardableResult
	 open func condicion() throws -> CondicionContext {
		var _localctx: CondicionContext
		_localctx = CondicionContext(_ctx, getState())
		try enterRule(_localctx, 16, gramaticaParser.RULE_condicion)
		var _la: Int = 0
		defer {
	    		try! exitRule()
	    }
		do {
		 	try enterOuterAlt(_localctx, 1)
		 	setState(104)
		 	try match(gramaticaParser.Tokens.SI.rawValue)
		 	setState(105)
		 	try match(gramaticaParser.Tokens.LPAREN.rawValue)
		 	setState(106)
		 	try expresion()
		 	setState(107)
		 	try match(gramaticaParser.Tokens.RPAREN.rawValue)
		 	setState(108)
		 	try cuerpo()
		 	setState(111)
		 	try _errHandler.sync(self)
		 	_la = try _input.LA(1)
		 	if (_la == gramaticaParser.Tokens.SINO.rawValue) {
		 		setState(109)
		 		try match(gramaticaParser.Tokens.SINO.rawValue)
		 		setState(110)
		 		try cuerpo()

		 	}

		 	setState(113)
		 	try match(gramaticaParser.Tokens.SEMICOLON.rawValue)

		}
		catch ANTLRException.recognition(let re) {
			_localctx.exception = re
			_errHandler.reportError(self, re)
			try _errHandler.recover(self, re)
		}

		return _localctx
	}

	public class FactorContext: ParserRuleContext {
			open
			func LPAREN() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.LPAREN.rawValue, 0)
			}
			open
			func expresion() -> ExpresionContext? {
				return getRuleContext(ExpresionContext.self, 0)
			}
			open
			func RPAREN() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.RPAREN.rawValue, 0)
			}
			open
			func ID() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.ID.rawValue, 0)
			}
			open
			func cte() -> CteContext? {
				return getRuleContext(CteContext.self, 0)
			}
			open
			func PLUS() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.PLUS.rawValue, 0)
			}
			open
			func MINUS() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.MINUS.rawValue, 0)
			}
			open
			func llamada() -> LlamadaContext? {
				return getRuleContext(LlamadaContext.self, 0)
			}
		override open
		func getRuleIndex() -> Int {
			return gramaticaParser.RULE_factor
		}
		override open
		func enterRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.enterFactor(self)
			}
		}
		override open
		func exitRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.exitFactor(self)
			}
		}
	}
	@discardableResult
	 open func factor() throws -> FactorContext {
		var _localctx: FactorContext
		_localctx = FactorContext(_ctx, getState())
		try enterRule(_localctx, 18, gramaticaParser.RULE_factor)
		var _la: Int = 0
		defer {
	    		try! exitRule()
	    }
		do {
		 	setState(127)
		 	try _errHandler.sync(self)
		 	switch(try getInterpreter().adaptivePredict(_input,8, _ctx)) {
		 	case 1:
		 		try enterOuterAlt(_localctx, 1)
		 		setState(115)
		 		try match(gramaticaParser.Tokens.LPAREN.rawValue)
		 		setState(116)
		 		try expresion()
		 		setState(117)
		 		try match(gramaticaParser.Tokens.RPAREN.rawValue)

		 		break
		 	case 2:
		 		try enterOuterAlt(_localctx, 2)
		 		setState(120)
		 		try _errHandler.sync(self)
		 		_la = try _input.LA(1)
		 		if (_la == gramaticaParser.Tokens.PLUS.rawValue || _la == gramaticaParser.Tokens.MINUS.rawValue) {
		 			setState(119)
		 			_la = try _input.LA(1)
		 			if (!(_la == gramaticaParser.Tokens.PLUS.rawValue || _la == gramaticaParser.Tokens.MINUS.rawValue)) {
		 			try _errHandler.recoverInline(self)
		 			}
		 			else {
		 				_errHandler.reportMatch(self)
		 				try consume()
		 			}

		 		}

		 		setState(124)
		 		try _errHandler.sync(self)
		 		switch (gramaticaParser.Tokens(rawValue: try _input.LA(1))!) {
		 		case .ID:
		 			setState(122)
		 			try match(gramaticaParser.Tokens.ID.rawValue)

		 			break
		 		case .CTE_INT:fallthrough
		 		case .CTE_FLOAT:
		 			setState(123)
		 			try cte()

		 			break
		 		default:
		 			throw ANTLRException.recognition(e: NoViableAltException(self))
		 		}

		 		break
		 	case 3:
		 		try enterOuterAlt(_localctx, 3)
		 		setState(126)
		 		try llamada()

		 		break
		 	default: break
		 	}
		}
		catch ANTLRException.recognition(let re) {
			_localctx.exception = re
			_errHandler.reportError(self, re)
			try _errHandler.recover(self, re)
		}

		return _localctx
	}

	public class FuncsContext: ParserRuleContext {
			open
			func ID() -> [TerminalNode] {
				return getTokens(gramaticaParser.Tokens.ID.rawValue)
			}
			open
			func ID(_ i:Int) -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.ID.rawValue, i)
			}
			open
			func LPAREN() -> [TerminalNode] {
				return getTokens(gramaticaParser.Tokens.LPAREN.rawValue)
			}
			open
			func LPAREN(_ i:Int) -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.LPAREN.rawValue, i)
			}
			open
			func RPAREN() -> [TerminalNode] {
				return getTokens(gramaticaParser.Tokens.RPAREN.rawValue)
			}
			open
			func RPAREN(_ i:Int) -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.RPAREN.rawValue, i)
			}
			open
			func LBRACE() -> [TerminalNode] {
				return getTokens(gramaticaParser.Tokens.LBRACE.rawValue)
			}
			open
			func LBRACE(_ i:Int) -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.LBRACE.rawValue, i)
			}
			open
			func vars() -> [VarsContext] {
				return getRuleContexts(VarsContext.self)
			}
			open
			func vars(_ i: Int) -> VarsContext? {
				return getRuleContext(VarsContext.self, i)
			}
			open
			func cuerpo() -> [CuerpoContext] {
				return getRuleContexts(CuerpoContext.self)
			}
			open
			func cuerpo(_ i: Int) -> CuerpoContext? {
				return getRuleContext(CuerpoContext.self, i)
			}
			open
			func RBRACE() -> [TerminalNode] {
				return getTokens(gramaticaParser.Tokens.RBRACE.rawValue)
			}
			open
			func RBRACE(_ i:Int) -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.RBRACE.rawValue, i)
			}
			open
			func SEMICOLON() -> [TerminalNode] {
				return getTokens(gramaticaParser.Tokens.SEMICOLON.rawValue)
			}
			open
			func SEMICOLON(_ i:Int) -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.SEMICOLON.rawValue, i)
			}
			open
			func NULA() -> [TerminalNode] {
				return getTokens(gramaticaParser.Tokens.NULA.rawValue)
			}
			open
			func NULA(_ i:Int) -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.NULA.rawValue, i)
			}
			open
			func tipo() -> [TipoContext] {
				return getRuleContexts(TipoContext.self)
			}
			open
			func tipo(_ i: Int) -> TipoContext? {
				return getRuleContext(TipoContext.self, i)
			}
			open
			func COLON() -> [TerminalNode] {
				return getTokens(gramaticaParser.Tokens.COLON.rawValue)
			}
			open
			func COLON(_ i:Int) -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.COLON.rawValue, i)
			}
			open
			func COMMA() -> [TerminalNode] {
				return getTokens(gramaticaParser.Tokens.COMMA.rawValue)
			}
			open
			func COMMA(_ i:Int) -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.COMMA.rawValue, i)
			}
		override open
		func getRuleIndex() -> Int {
			return gramaticaParser.RULE_funcs
		}
		override open
		func enterRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.enterFuncs(self)
			}
		}
		override open
		func exitRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.exitFuncs(self)
			}
		}
	}
	@discardableResult
	 open func funcs() throws -> FuncsContext {
		var _localctx: FuncsContext
		_localctx = FuncsContext(_ctx, getState())
		try enterRule(_localctx, 20, gramaticaParser.RULE_funcs)
		var _la: Int = 0
		defer {
	    		try! exitRule()
	    }
		do {
		 	try enterOuterAlt(_localctx, 1)
		 	setState(158)
		 	try _errHandler.sync(self)
		 	_la = try _input.LA(1)
		 	while (((Int64(_la) & ~0x3f) == 0 && ((Int64(1) << _la) & 4192) != 0)) {
		 		setState(131)
		 		try _errHandler.sync(self)
		 		switch (gramaticaParser.Tokens(rawValue: try _input.LA(1))!) {
		 		case .NULA:
		 			setState(129)
		 			try match(gramaticaParser.Tokens.NULA.rawValue)

		 			break
		 		case .ENTERO:fallthrough
		 		case .FLOTANTE:
		 			setState(130)
		 			try tipo()

		 			break
		 		default:
		 			throw ANTLRException.recognition(e: NoViableAltException(self))
		 		}
		 		setState(133)
		 		try match(gramaticaParser.Tokens.ID.rawValue)
		 		setState(134)
		 		try match(gramaticaParser.Tokens.LPAREN.rawValue)
		 		setState(147)
		 		try _errHandler.sync(self)
		 		_la = try _input.LA(1)
		 		if (_la == gramaticaParser.Tokens.ID.rawValue) {
		 			setState(135)
		 			try match(gramaticaParser.Tokens.ID.rawValue)
		 			setState(136)
		 			try match(gramaticaParser.Tokens.COLON.rawValue)
		 			setState(137)
		 			try tipo()
		 			setState(144)
		 			try _errHandler.sync(self)
		 			_la = try _input.LA(1)
		 			while (_la == gramaticaParser.Tokens.COMMA.rawValue) {
		 				setState(138)
		 				try match(gramaticaParser.Tokens.COMMA.rawValue)
		 				setState(139)
		 				try match(gramaticaParser.Tokens.ID.rawValue)
		 				setState(140)
		 				try match(gramaticaParser.Tokens.COLON.rawValue)
		 				setState(141)
		 				try tipo()


		 				setState(146)
		 				try _errHandler.sync(self)
		 				_la = try _input.LA(1)
		 			}

		 		}

		 		setState(149)
		 		try match(gramaticaParser.Tokens.RPAREN.rawValue)
		 		setState(150)
		 		try match(gramaticaParser.Tokens.LBRACE.rawValue)
		 		setState(151)
		 		try vars()
		 		setState(152)
		 		try cuerpo()
		 		setState(153)
		 		try match(gramaticaParser.Tokens.RBRACE.rawValue)
		 		setState(154)
		 		try match(gramaticaParser.Tokens.SEMICOLON.rawValue)


		 		setState(160)
		 		try _errHandler.sync(self)
		 		_la = try _input.LA(1)
		 	}

		}
		catch ANTLRException.recognition(let re) {
			_localctx.exception = re
			_errHandler.reportError(self, re)
			try _errHandler.recover(self, re)
		}

		return _localctx
	}

	public class ExpresionContext: ParserRuleContext {
			open
			func exp() -> [ExpContext] {
				return getRuleContexts(ExpContext.self)
			}
			open
			func exp(_ i: Int) -> ExpContext? {
				return getRuleContext(ExpContext.self, i)
			}
			open
			func GREATER() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.GREATER.rawValue, 0)
			}
			open
			func LESS() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.LESS.rawValue, 0)
			}
			open
			func NOT_EQUAL() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.NOT_EQUAL.rawValue, 0)
			}
			open
			func EQUAL_EQUAL() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.EQUAL_EQUAL.rawValue, 0)
			}
		override open
		func getRuleIndex() -> Int {
			return gramaticaParser.RULE_expresion
		}
		override open
		func enterRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.enterExpresion(self)
			}
		}
		override open
		func exitRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.exitExpresion(self)
			}
		}
	}
	@discardableResult
	 open func expresion() throws -> ExpresionContext {
		var _localctx: ExpresionContext
		_localctx = ExpresionContext(_ctx, getState())
		try enterRule(_localctx, 22, gramaticaParser.RULE_expresion)
		var _la: Int = 0
		defer {
	    		try! exitRule()
	    }
		do {
		 	try enterOuterAlt(_localctx, 1)
		 	setState(161)
		 	try exp()
		 	setState(164)
		 	try _errHandler.sync(self)
		 	_la = try _input.LA(1)
		 	if (((Int64(_la) & ~0x3f) == 0 && ((Int64(1) << _la) & 2013265920) != 0)) {
		 		setState(162)
		 		_la = try _input.LA(1)
		 		if (!(((Int64(_la) & ~0x3f) == 0 && ((Int64(1) << _la) & 2013265920) != 0))) {
		 		try _errHandler.recoverInline(self)
		 		}
		 		else {
		 			_errHandler.reportMatch(self)
		 			try consume()
		 		}
		 		setState(163)
		 		try exp()

		 	}


		}
		catch ANTLRException.recognition(let re) {
			_localctx.exception = re
			_errHandler.reportError(self, re)
			try _errHandler.recover(self, re)
		}

		return _localctx
	}

	public class LlamadaContext: ParserRuleContext {
			open
			func ID() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.ID.rawValue, 0)
			}
			open
			func LPAREN() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.LPAREN.rawValue, 0)
			}
			open
			func RPAREN() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.RPAREN.rawValue, 0)
			}
			open
			func expresion() -> [ExpresionContext] {
				return getRuleContexts(ExpresionContext.self)
			}
			open
			func expresion(_ i: Int) -> ExpresionContext? {
				return getRuleContext(ExpresionContext.self, i)
			}
			open
			func COMMA() -> [TerminalNode] {
				return getTokens(gramaticaParser.Tokens.COMMA.rawValue)
			}
			open
			func COMMA(_ i:Int) -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.COMMA.rawValue, i)
			}
		override open
		func getRuleIndex() -> Int {
			return gramaticaParser.RULE_llamada
		}
		override open
		func enterRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.enterLlamada(self)
			}
		}
		override open
		func exitRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.exitLlamada(self)
			}
		}
	}
	@discardableResult
	 open func llamada() throws -> LlamadaContext {
		var _localctx: LlamadaContext
		_localctx = LlamadaContext(_ctx, getState())
		try enterRule(_localctx, 24, gramaticaParser.RULE_llamada)
		var _la: Int = 0
		defer {
	    		try! exitRule()
	    }
		do {
		 	try enterOuterAlt(_localctx, 1)
		 	setState(166)
		 	try match(gramaticaParser.Tokens.ID.rawValue)
		 	setState(167)
		 	try match(gramaticaParser.Tokens.LPAREN.rawValue)
		 	setState(176)
		 	try _errHandler.sync(self)
		 	_la = try _input.LA(1)
		 	if (((Int64(_la) & ~0x3f) == 0 && ((Int64(1) << _la) & 15045033984) != 0)) {
		 		setState(168)
		 		try expresion()
		 		setState(173)
		 		try _errHandler.sync(self)
		 		_la = try _input.LA(1)
		 		while (_la == gramaticaParser.Tokens.COMMA.rawValue) {
		 			setState(169)
		 			try match(gramaticaParser.Tokens.COMMA.rawValue)
		 			setState(170)
		 			try expresion()


		 			setState(175)
		 			try _errHandler.sync(self)
		 			_la = try _input.LA(1)
		 		}

		 	}

		 	setState(178)
		 	try match(gramaticaParser.Tokens.RPAREN.rawValue)

		}
		catch ANTLRException.recognition(let re) {
			_localctx.exception = re
			_errHandler.reportError(self, re)
			try _errHandler.recover(self, re)
		}

		return _localctx
	}

	public class TerminoContext: ParserRuleContext {
			open
			func factor() -> [FactorContext] {
				return getRuleContexts(FactorContext.self)
			}
			open
			func factor(_ i: Int) -> FactorContext? {
				return getRuleContext(FactorContext.self, i)
			}
			open
			func MULT() -> [TerminalNode] {
				return getTokens(gramaticaParser.Tokens.MULT.rawValue)
			}
			open
			func MULT(_ i:Int) -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.MULT.rawValue, i)
			}
			open
			func DIV() -> [TerminalNode] {
				return getTokens(gramaticaParser.Tokens.DIV.rawValue)
			}
			open
			func DIV(_ i:Int) -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.DIV.rawValue, i)
			}
		override open
		func getRuleIndex() -> Int {
			return gramaticaParser.RULE_termino
		}
		override open
		func enterRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.enterTermino(self)
			}
		}
		override open
		func exitRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.exitTermino(self)
			}
		}
	}
	@discardableResult
	 open func termino() throws -> TerminoContext {
		var _localctx: TerminoContext
		_localctx = TerminoContext(_ctx, getState())
		try enterRule(_localctx, 26, gramaticaParser.RULE_termino)
		var _la: Int = 0
		defer {
	    		try! exitRule()
	    }
		do {
		 	try enterOuterAlt(_localctx, 1)
		 	setState(180)
		 	try factor()
		 	setState(185)
		 	try _errHandler.sync(self)
		 	_la = try _input.LA(1)
		 	while (_la == gramaticaParser.Tokens.MULT.rawValue || _la == gramaticaParser.Tokens.DIV.rawValue) {
		 		setState(181)
		 		_la = try _input.LA(1)
		 		if (!(_la == gramaticaParser.Tokens.MULT.rawValue || _la == gramaticaParser.Tokens.DIV.rawValue)) {
		 		try _errHandler.recoverInline(self)
		 		}
		 		else {
		 			_errHandler.reportMatch(self)
		 			try consume()
		 		}
		 		setState(182)
		 		try factor()


		 		setState(187)
		 		try _errHandler.sync(self)
		 		_la = try _input.LA(1)
		 	}

		}
		catch ANTLRException.recognition(let re) {
			_localctx.exception = re
			_errHandler.reportError(self, re)
			try _errHandler.recover(self, re)
		}

		return _localctx
	}

	public class ExpContext: ParserRuleContext {
			open
			func termino() -> [TerminoContext] {
				return getRuleContexts(TerminoContext.self)
			}
			open
			func termino(_ i: Int) -> TerminoContext? {
				return getRuleContext(TerminoContext.self, i)
			}
			open
			func PLUS() -> [TerminalNode] {
				return getTokens(gramaticaParser.Tokens.PLUS.rawValue)
			}
			open
			func PLUS(_ i:Int) -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.PLUS.rawValue, i)
			}
			open
			func MINUS() -> [TerminalNode] {
				return getTokens(gramaticaParser.Tokens.MINUS.rawValue)
			}
			open
			func MINUS(_ i:Int) -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.MINUS.rawValue, i)
			}
		override open
		func getRuleIndex() -> Int {
			return gramaticaParser.RULE_exp
		}
		override open
		func enterRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.enterExp(self)
			}
		}
		override open
		func exitRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.exitExp(self)
			}
		}
	}
	@discardableResult
	 open func exp() throws -> ExpContext {
		var _localctx: ExpContext
		_localctx = ExpContext(_ctx, getState())
		try enterRule(_localctx, 28, gramaticaParser.RULE_exp)
		var _la: Int = 0
		defer {
	    		try! exitRule()
	    }
		do {
		 	try enterOuterAlt(_localctx, 1)
		 	setState(188)
		 	try termino()
		 	setState(193)
		 	try _errHandler.sync(self)
		 	_la = try _input.LA(1)
		 	while (_la == gramaticaParser.Tokens.PLUS.rawValue || _la == gramaticaParser.Tokens.MINUS.rawValue) {
		 		setState(189)
		 		_la = try _input.LA(1)
		 		if (!(_la == gramaticaParser.Tokens.PLUS.rawValue || _la == gramaticaParser.Tokens.MINUS.rawValue)) {
		 		try _errHandler.recoverInline(self)
		 		}
		 		else {
		 			_errHandler.reportMatch(self)
		 			try consume()
		 		}
		 		setState(190)
		 		try termino()


		 		setState(195)
		 		try _errHandler.sync(self)
		 		_la = try _input.LA(1)
		 	}

		}
		catch ANTLRException.recognition(let re) {
			_localctx.exception = re
			_errHandler.reportError(self, re)
			try _errHandler.recover(self, re)
		}

		return _localctx
	}

	public class CteContext: ParserRuleContext {
			open
			func CTE_INT() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.CTE_INT.rawValue, 0)
			}
			open
			func CTE_FLOAT() -> TerminalNode? {
				return getToken(gramaticaParser.Tokens.CTE_FLOAT.rawValue, 0)
			}
		override open
		func getRuleIndex() -> Int {
			return gramaticaParser.RULE_cte
		}
		override open
		func enterRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.enterCte(self)
			}
		}
		override open
		func exitRule(_ listener: ParseTreeListener) {
			if let listener = listener as? gramaticaListener {
				listener.exitCte(self)
			}
		}
	}
	@discardableResult
	 open func cte() throws -> CteContext {
		var _localctx: CteContext
		_localctx = CteContext(_ctx, getState())
		try enterRule(_localctx, 30, gramaticaParser.RULE_cte)
		var _la: Int = 0
		defer {
	    		try! exitRule()
	    }
		do {
		 	try enterOuterAlt(_localctx, 1)
		 	setState(196)
		 	_la = try _input.LA(1)
		 	if (!(_la == gramaticaParser.Tokens.CTE_INT.rawValue || _la == gramaticaParser.Tokens.CTE_FLOAT.rawValue)) {
		 	try _errHandler.recoverInline(self)
		 	}
		 	else {
		 		_errHandler.reportMatch(self)
		 		try consume()
		 	}

		}
		catch ANTLRException.recognition(let re) {
			_localctx.exception = re
			_errHandler.reportError(self, re)
			try _errHandler.recover(self, re)
		}

		return _localctx
	}

	static let _serializedATN:[Int] = [
		4,1,35,199,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,2,7,
		7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,7,14,
		2,15,7,15,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,
		1,1,1,2,1,2,1,3,1,3,5,3,53,8,3,10,3,12,3,56,9,3,1,3,1,3,1,4,1,4,1,4,1,
		4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,3,4,71,8,4,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,
		6,1,6,3,6,82,8,6,1,6,1,6,1,6,3,6,87,8,6,5,6,89,8,6,10,6,12,6,92,9,6,1,
		6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,8,1,8,
		3,8,112,8,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,3,9,121,8,9,1,9,1,9,3,9,125,8,
		9,1,9,3,9,128,8,9,1,10,1,10,3,10,132,8,10,1,10,1,10,1,10,1,10,1,10,1,10,
		1,10,1,10,1,10,5,10,143,8,10,10,10,12,10,146,9,10,3,10,148,8,10,1,10,1,
		10,1,10,1,10,1,10,1,10,1,10,5,10,157,8,10,10,10,12,10,160,9,10,1,11,1,
		11,1,11,3,11,165,8,11,1,12,1,12,1,12,1,12,1,12,5,12,172,8,12,10,12,12,
		12,175,9,12,3,12,177,8,12,1,12,1,12,1,13,1,13,1,13,5,13,184,8,13,10,13,
		12,13,187,9,13,1,14,1,14,1,14,5,14,192,8,14,10,14,12,14,195,9,14,1,15,
		1,15,1,15,0,0,16,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,0,5,1,0,5,
		6,1,0,22,23,1,0,27,30,1,0,24,25,1,0,32,33,205,0,32,1,0,0,0,2,42,1,0,0,
		0,4,48,1,0,0,0,6,50,1,0,0,0,8,70,1,0,0,0,10,72,1,0,0,0,12,77,1,0,0,0,14,
		96,1,0,0,0,16,104,1,0,0,0,18,127,1,0,0,0,20,158,1,0,0,0,22,161,1,0,0,0,
		24,166,1,0,0,0,26,180,1,0,0,0,28,188,1,0,0,0,30,196,1,0,0,0,32,33,5,1,
		0,0,33,34,5,31,0,0,34,35,5,13,0,0,35,36,3,2,1,0,36,37,3,20,10,0,37,38,
		5,3,0,0,38,39,3,6,3,0,39,40,5,4,0,0,40,41,5,0,0,1,41,1,1,0,0,0,42,43,5,
		2,0,0,43,44,5,31,0,0,44,45,5,14,0,0,45,46,3,4,2,0,46,47,5,13,0,0,47,3,
		1,0,0,0,48,49,7,0,0,0,49,5,1,0,0,0,50,54,5,18,0,0,51,53,3,8,4,0,52,51,
		1,0,0,0,53,56,1,0,0,0,54,52,1,0,0,0,54,55,1,0,0,0,55,57,1,0,0,0,56,54,
		1,0,0,0,57,58,5,19,0,0,58,7,1,0,0,0,59,71,3,10,5,0,60,71,3,16,8,0,61,71,
		3,14,7,0,62,63,3,24,12,0,63,64,5,13,0,0,64,71,1,0,0,0,65,71,3,12,6,0,66,
		67,5,20,0,0,67,68,3,8,4,0,68,69,5,21,0,0,69,71,1,0,0,0,70,59,1,0,0,0,70,
		60,1,0,0,0,70,61,1,0,0,0,70,62,1,0,0,0,70,65,1,0,0,0,70,66,1,0,0,0,71,
		9,1,0,0,0,72,73,5,31,0,0,73,74,5,26,0,0,74,75,3,22,11,0,75,76,5,13,0,0,
		76,11,1,0,0,0,77,78,5,7,0,0,78,81,5,16,0,0,79,82,3,22,11,0,80,82,5,34,
		0,0,81,79,1,0,0,0,81,80,1,0,0,0,82,90,1,0,0,0,83,86,5,15,0,0,84,87,3,22,
		11,0,85,87,5,34,0,0,86,84,1,0,0,0,86,85,1,0,0,0,87,89,1,0,0,0,88,83,1,
		0,0,0,89,92,1,0,0,0,90,88,1,0,0,0,90,91,1,0,0,0,91,93,1,0,0,0,92,90,1,
		0,0,0,93,94,5,17,0,0,94,95,5,13,0,0,95,13,1,0,0,0,96,97,5,8,0,0,97,98,
		5,16,0,0,98,99,3,22,11,0,99,100,5,17,0,0,100,101,5,9,0,0,101,102,3,6,3,
		0,102,103,5,13,0,0,103,15,1,0,0,0,104,105,5,10,0,0,105,106,5,16,0,0,106,
		107,3,22,11,0,107,108,5,17,0,0,108,111,3,6,3,0,109,110,5,11,0,0,110,112,
		3,6,3,0,111,109,1,0,0,0,111,112,1,0,0,0,112,113,1,0,0,0,113,114,5,13,0,
		0,114,17,1,0,0,0,115,116,5,16,0,0,116,117,3,22,11,0,117,118,5,17,0,0,118,
		128,1,0,0,0,119,121,7,1,0,0,120,119,1,0,0,0,120,121,1,0,0,0,121,124,1,
		0,0,0,122,125,5,31,0,0,123,125,3,30,15,0,124,122,1,0,0,0,124,123,1,0,0,
		0,125,128,1,0,0,0,126,128,3,24,12,0,127,115,1,0,0,0,127,120,1,0,0,0,127,
		126,1,0,0,0,128,19,1,0,0,0,129,132,5,12,0,0,130,132,3,4,2,0,131,129,1,
		0,0,0,131,130,1,0,0,0,132,133,1,0,0,0,133,134,5,31,0,0,134,147,5,16,0,
		0,135,136,5,31,0,0,136,137,5,14,0,0,137,144,3,4,2,0,138,139,5,15,0,0,139,
		140,5,31,0,0,140,141,5,14,0,0,141,143,3,4,2,0,142,138,1,0,0,0,143,146,
		1,0,0,0,144,142,1,0,0,0,144,145,1,0,0,0,145,148,1,0,0,0,146,144,1,0,0,
		0,147,135,1,0,0,0,147,148,1,0,0,0,148,149,1,0,0,0,149,150,5,17,0,0,150,
		151,5,18,0,0,151,152,3,2,1,0,152,153,3,6,3,0,153,154,5,19,0,0,154,155,
		5,13,0,0,155,157,1,0,0,0,156,131,1,0,0,0,157,160,1,0,0,0,158,156,1,0,0,
		0,158,159,1,0,0,0,159,21,1,0,0,0,160,158,1,0,0,0,161,164,3,28,14,0,162,
		163,7,2,0,0,163,165,3,28,14,0,164,162,1,0,0,0,164,165,1,0,0,0,165,23,1,
		0,0,0,166,167,5,31,0,0,167,176,5,16,0,0,168,173,3,22,11,0,169,170,5,15,
		0,0,170,172,3,22,11,0,171,169,1,0,0,0,172,175,1,0,0,0,173,171,1,0,0,0,
		173,174,1,0,0,0,174,177,1,0,0,0,175,173,1,0,0,0,176,168,1,0,0,0,176,177,
		1,0,0,0,177,178,1,0,0,0,178,179,5,17,0,0,179,25,1,0,0,0,180,185,3,18,9,
		0,181,182,7,3,0,0,182,184,3,18,9,0,183,181,1,0,0,0,184,187,1,0,0,0,185,
		183,1,0,0,0,185,186,1,0,0,0,186,27,1,0,0,0,187,185,1,0,0,0,188,193,3,26,
		13,0,189,190,7,1,0,0,190,192,3,26,13,0,191,189,1,0,0,0,192,195,1,0,0,0,
		193,191,1,0,0,0,193,194,1,0,0,0,194,29,1,0,0,0,195,193,1,0,0,0,196,197,
		7,4,0,0,197,31,1,0,0,0,18,54,70,81,86,90,111,120,124,127,131,144,147,158,
		164,173,176,185,193
	]

	public
	static let _ATN = try! ATNDeserializer().deserialize(_serializedATN)
}
