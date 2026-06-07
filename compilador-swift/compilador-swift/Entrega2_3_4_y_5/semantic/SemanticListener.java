//
//  SemanticListener.java
//  compilador-swift
//
//  Created by Angela Pesina on 17/05/26.
//

public class SemanticListener extends gramaticaBaseListener {

    ConstantTable constantTable = new ConstantTable();
    VariableTable variableTable = new VariableTable();
    FunctionDirectory functionDirectory = new FunctionDirectory();
    
    public ConstantTable getConstantTable() {

        return constantTable;
    }

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

            String value = ctx.cte().getText();

            int address =
                    constantTable.getAddress(
                            value
                    );

            quadGenerator.pushOperand(
                    String.valueOf(address)
            );

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
                    "PUSH CONSTANTE -> "
                    + value
                    + " ["
                    + address
                    + "]"
            );
        }

        if (ctx.ID() != null) {

            String name =
                    ctx.ID().getText();

            Integer address =
                    variableTable.getVariableAddress(name);

            if (address != null) {

                quadGenerator.pushOperand(
                        String.valueOf(address)
                );

                String type =
                        variableTable.getVariableType(name);

                quadGenerator.pushType(type);

                System.out.println(
                    "PUSH VARIABLE -> "
                    + name
                    + " ["
                    + address
                    + "]"
            );
            }
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

        Integer address =
                variableTable.getVariableAddress(
                        variable
                );

        quadGenerator.generateAssignment(
                String.valueOf(address)
        );

        System.out.println(
                "ASIGNACION GENERADA -> "
                + variable
                + " ["
                + address
                + "]"
        );
    }

     @Override
    public void exitExpresion(
            gramaticaParser.ExpresionContext ctx) {

        if(ctx.getChildCount() == 3){

            String op = ctx.getChild(1).getText();

            if(
                op.equals(">") ||
                op.equals("<") ||
                op.equals("==") ||
                op.equals("!=")
            ){

                quadGenerator.pushOperator(op);

                quadGenerator.generateOperation();

                System.out.println(
                    "CUADRUPLO " + op + " GENERADO"
                );
            }
        }
    }


    @Override
    public void exitRetorno(
            gramaticaParser.RetornoContext ctx) {

        quadGenerator.generateReturn();

        System.out.println(
                "RETURN GENERADO"
        );
    }

    @Override
public void exitCondicion(
        gramaticaParser.CondicionContext ctx) {

    quadGenerator.generateGoToF();

    int pending =
            quadGenerator
            .getJumpStack()
            .pop();

    quadGenerator.fillJump(
            pending,
            quadGenerator
                    .getQuadruples()
                    .size()
    );

    System.out.println(
            "IF GENERADO"
    );
    }

    @Override
    public void enterCiclo(
            gramaticaParser.CicloContext ctx) {

        quadGenerator.markLoopStart();
    }

    @Override
    public void exitCiclo(
            gramaticaParser.CicloContext ctx) {

        quadGenerator.generateGoToF();

        quadGenerator.closeWhile();

        System.out.println(
                "WHILE GENERADO"
        );
    }

    public QuadrupleGenerator getQuadGenerator() {

        return quadGenerator;
    }
}
