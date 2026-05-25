//
//  QuadrupleGenerator.java
//  compilador-swift
//
//  Created by Angela Pesina on 24/05/26.
//

import java.util.*;

public class QuadrupleGenerator {

    private Stack<String> operandStack = new Stack<>();

    private Stack<String> operatorStack = new Stack<>();

    private Stack<String> typeStack = new Stack<>();

    private Queue<Quadruple> quadruples =
            new LinkedList<>();

    private int tempCounter = 0;

    // ==========================
    // PUSHES
    // ==========================

    public void pushOperand(String operand) {

        operandStack.push(operand);
    }

    public void pushOperator(String operator) {

        operatorStack.push(operator);
    }

    public void pushType(String type) {

        typeStack.push(type);
    }

    // ==========================
    // TEMPORALES
    // ==========================

    public String newTemp() {

        tempCounter++;

        return "t" + tempCounter;
    }

    // ==========================
    // OPERACIONES
    // ==========================

    public void generateOperation() {

        if (operandStack.size() < 2 ||
                operatorStack.isEmpty()) {

            return;
        }

        String right =
                operandStack.pop();

        String left =
                operandStack.pop();

        String oper =
                operatorStack.pop();

        if (!typeStack.isEmpty()) {
            typeStack.pop();
        }

        if (!typeStack.isEmpty()) {
            typeStack.pop();
        }

        String temp = newTemp();

        quadruples.add(

                new Quadruple(
                        oper,
                        left,
                        right,
                        temp
                )
        );

        operandStack.push(temp);

        typeStack.push("entero");
    }

    // ==========================
    // ASIGNACION
    // ==========================

    public void generateAssignment(
            String variable) {

        if (operandStack.isEmpty()) {

            return;
        }

        String value =
                operandStack.pop();

        quadruples.add(

                       new Quadruple(
                           "=",
                           value,
                           "NA",
                           variable
                       )
        );
    }

    // ==========================
    // PRINT
    // ==========================

    public void generatePrint(
            String value) {

        quadruples.add(

                       new Quadruple(
                           "PRINT",
                           value,
                           "-",
                           "-"
                       )
        );
    }

    // ==========================
    // GETTERS
    // ==========================

    public Queue<Quadruple> getQuadruples() {

        return quadruples;
    }

    public Stack<String> getOperandStack() {

        return operandStack;
    }

    public Stack<String> getOperatorStack() {

        return operatorStack;
    }

    public Stack<String> getTypeStack() {

        return typeStack;
    }

    // ==========================
    // LIMPIAR
    // ==========================

    public void reset() {

        operandStack.clear();

        operatorStack.clear();

        typeStack.clear();

        quadruples.clear();

        tempCounter = 0;
    }

    // ==========================
    // IMPRIMIR
    // ==========================

    public void printQuadruples() {

        System.out.println(
                "\n===== CUADRUPLOS ====="
        );

        int index = 1;

        for (Quadruple q : quadruples) {

            System.out.println(
                    index + ". " + q
            );

            index++;
        }
    }
}
