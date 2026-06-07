//
//  Quadruple.java
//  compilador-swift
//
//  Created by Angela Pesina on 24/05/26.
//


public class Quadruple {

    String op;

    String left;

    String right;

    String result;

    public Quadruple(
            String op,
            String left,
            String right,
            String result) {

        this.op = op;
        this.left = left;
        this.right = right;
        this.result = result;
    }

    @Override
    public String toString() {

        return "(" +
                op + ", " +
                left + ", " +
                right + ", " +
                result + ")";
    }
}
