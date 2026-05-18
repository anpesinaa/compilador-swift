//
//  SemanticTest.java
//  compilador-swift
//
//  Created by Angela Pesina on 17/05/26.
//

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SemanticTest {

    public static void main(String[] args) throws Exception {

        CharStream input = CharStreams.fromFileName("../tests/test2.txt");

        gramaticaLexer lexer = new gramaticaLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        gramaticaParser parser = new gramaticaParser(tokens);

        ParseTree tree = parser.programa();

        ParseTreeWalker walker = new ParseTreeWalker();

        SemanticListener listener = new SemanticListener();

        walker.walk(listener, tree);
    }
}
