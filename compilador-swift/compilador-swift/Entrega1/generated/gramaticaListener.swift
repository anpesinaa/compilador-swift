// Generated from grammar/gramatica.g4 by ANTLR 4.13.2
import Antlr4

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public protocol gramaticaListener: ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#programa}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func enterPrograma(_ ctx: gramaticaParser.ProgramaContext)
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#programa}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func exitPrograma(_ ctx: gramaticaParser.ProgramaContext)
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#vars}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func enterVars(_ ctx: gramaticaParser.VarsContext)
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#vars}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func exitVars(_ ctx: gramaticaParser.VarsContext)
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tipo}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func enterTipo(_ ctx: gramaticaParser.TipoContext)
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tipo}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func exitTipo(_ ctx: gramaticaParser.TipoContext)
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cuerpo}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func enterCuerpo(_ ctx: gramaticaParser.CuerpoContext)
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cuerpo}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func exitCuerpo(_ ctx: gramaticaParser.CuerpoContext)
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#estatuto}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func enterEstatuto(_ ctx: gramaticaParser.EstatutoContext)
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#estatuto}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func exitEstatuto(_ ctx: gramaticaParser.EstatutoContext)
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#asigna}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func enterAsigna(_ ctx: gramaticaParser.AsignaContext)
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#asigna}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func exitAsigna(_ ctx: gramaticaParser.AsignaContext)
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#imprime}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func enterImprime(_ ctx: gramaticaParser.ImprimeContext)
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#imprime}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func exitImprime(_ ctx: gramaticaParser.ImprimeContext)
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#ciclo}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func enterCiclo(_ ctx: gramaticaParser.CicloContext)
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ciclo}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func exitCiclo(_ ctx: gramaticaParser.CicloContext)
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#condicion}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func enterCondicion(_ ctx: gramaticaParser.CondicionContext)
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#condicion}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func exitCondicion(_ ctx: gramaticaParser.CondicionContext)
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#factor}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func enterFactor(_ ctx: gramaticaParser.FactorContext)
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#factor}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func exitFactor(_ ctx: gramaticaParser.FactorContext)
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#funcs}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func enterFuncs(_ ctx: gramaticaParser.FuncsContext)
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#funcs}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func exitFuncs(_ ctx: gramaticaParser.FuncsContext)
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expresion}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func enterExpresion(_ ctx: gramaticaParser.ExpresionContext)
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expresion}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func exitExpresion(_ ctx: gramaticaParser.ExpresionContext)
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#llamada}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func enterLlamada(_ ctx: gramaticaParser.LlamadaContext)
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#llamada}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func exitLlamada(_ ctx: gramaticaParser.LlamadaContext)
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#termino}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func enterTermino(_ ctx: gramaticaParser.TerminoContext)
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#termino}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func exitTermino(_ ctx: gramaticaParser.TerminoContext)
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func enterExp(_ ctx: gramaticaParser.ExpContext)
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func exitExp(_ ctx: gramaticaParser.ExpContext)
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cte}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func enterCte(_ ctx: gramaticaParser.CteContext)
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cte}.
	 - Parameters:
	   - ctx: the parse tree
	 */
	func exitCte(_ ctx: gramaticaParser.CteContext)
}
