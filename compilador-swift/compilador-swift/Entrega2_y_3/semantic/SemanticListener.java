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
    
    SemanticCube semanticCube =
            new SemanticCube();

    QuadrupleGenerator quadGenerator =
            new QuadrupleGenerator();
    
    @Override
    public void exitPrograma(
            gramaticaParser.ProgramaContext ctx) {

        quadGenerator.printQuadruples();
    }
    
    @Override
    public void exitFactor(
            gramaticaParser.FactorContext ctx) {

        if (ctx.cte() != null) {

            String value =
                    ctx.cte().getText();

            quadGenerator.pushOperand(value);

            if (value.contains(".")) {

                quadGenerator.pushType(
                        "flotante"
                );

            } else {

                quadGenerator.pushType(
                        "entero"
                );
            }

            System.out.println(
                    "PUSH OPERANDO -> " + value
            );
        }

        if (ctx.ID() != null) {

            String name =
                    ctx.ID().getText();

            quadGenerator.pushOperand(name);

            String type =
                    variableTable.getVariableType(name);

            if (type != null) {

                quadGenerator.pushType(type);
            }

            System.out.println(
                    "PUSH VARIABLE -> " + name
            );
        }
    }
    
    @Override
    public void exitTermino(
            gramaticaParser.TerminoContext ctx) {

        for (int i = 0; i < ctx.MULT().size(); i++) {

            quadGenerator.pushOperator("*");

            quadGenerator.generateOperation();

            System.out.println(
                    "CUADRUPLO * GENERADO"
            );
        }

        for (int i = 0; i < ctx.DIV().size(); i++) {

            quadGenerator.pushOperator("/");

            quadGenerator.generateOperation();

            System.out.println(
                    "CUADRUPLO / GENERADO"
            );
        }
    }
    
    @Override
    public void exitExp(
            gramaticaParser.ExpContext ctx) {

        for (int i = 0; i < ctx.PLUS().size(); i++) {

            quadGenerator.pushOperator("+");

            quadGenerator.generateOperation();

            System.out.println(
                    "CUADRUPLO + GENERADO"
            );
        }

        for (int i = 0; i < ctx.MINUS().size(); i++) {

            quadGenerator.pushOperator("-");

            quadGenerator.generateOperation();

            System.out.println(
                    "CUADRUPLO - GENERADO"
            );
        }
    }
    
    @Override
    public void exitAsigna(
            gramaticaParser.AsignaContext ctx) {

        String variable =
                ctx.ID().getText();

        quadGenerator.generateAssignment(
                variable
        );

        System.out.println(
                "ASIGNACION GENERADA -> " +
                variable
        );
    }
}
