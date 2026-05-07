//
//  ParserTest.swift
//  compilador-swift
//
//  Created by Angela Pesina on 06/05/26.
//

import Foundation
import Antlr4

func testParser() {

    let input = """
    programa prueba;
    vars x : entero;

    inicio
    {
        x = 5;
    }
    fin
    """

    do {

        let inputStream = ANTLRInputStream(input)

        let lexer = try gramaticaLexer(inputStream)

        let tokens = CommonTokenStream(lexer)

        let parser = try gramaticaParser(tokens)

        let tree = try parser.programa()

        print(tree.toStringTree(parser))

    } catch {

        print("Error: \(error)")
    }
}
