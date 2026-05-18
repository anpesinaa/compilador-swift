//
//  SemanticListener.java
//  compilador-swift
//
//  Created by Angela Pesina on 17/05/26.
//

public class SemanticListener extends gramaticaBaseListener {

    VariableTable variableTable = new VariableTable();
    FunctionDirectory functionDirectory = new FunctionDirectory();

    @Override
    public void enterVars(gramaticaParser.VarsContext ctx) {

        for (int i = 0; i < ctx.ID().size(); i++) {

            String name = ctx.ID(i).getText();

            String type = ctx.tipo(i).getText();

            variableTable.addVariable(name, type);
        }
    }
    
    @Override
    public void enterFuncs(gramaticaParser.FuncsContext ctx) {

        if (ctx.ID() != null && !ctx.ID().isEmpty()) {

            String name = ctx.ID(0).getText();

            String type;

            if (ctx.NULA() != null) {

                type = "nula";

            } else {

                type = ctx.tipo(0).getText();
            }

            functionDirectory.addFunction(name, type);
        }
    }
}
