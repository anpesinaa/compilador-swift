//
//  SemanticCube.java
//  compilador-swift
//
//  Created by Angela Pesina on 17/05/26.
//

import java.util.HashMap;

public class SemanticCube {

    HashMap<String, String> cube = new HashMap<>();

    public SemanticCube() {

        // SUMA

        cube.put("entero+entero", "entero");
        cube.put("entero+flotante", "flotante");
        cube.put("flotante+entero", "flotante");
        cube.put("flotante+flotante", "flotante");

        // RESTA

        cube.put("entero-entero", "entero");
        cube.put("entero-flotante", "flotante");
        cube.put("flotante-entero", "flotante");
        cube.put("flotante-flotante", "flotante");

        // MULT

        cube.put("entero*entero", "entero");
        cube.put("entero*flotante", "flotante");
        cube.put("flotante*entero", "flotante");
        cube.put("flotante*flotante", "flotante");

        // DIV

        cube.put("entero/entero", "flotante");
        cube.put("entero/flotante", "flotante");
        cube.put("flotante/entero", "flotante");
        cube.put("flotante/flotante", "flotante");

        // RELACIONALES

        cube.put("entero>entero", "bool");
        cube.put("entero<entero", "bool");
        cube.put("entero==entero", "bool");
        cube.put("entero!=entero", "bool");

        cube.put("flotante>flotante", "bool");
        cube.put("flotante<flotante", "bool");
        cube.put("flotante==flotante", "bool");
        cube.put("flotante!=flotante", "bool");
    }

    public String getResultType(
            String left,
            String op,
            String right) {

        return cube.get(left + op + right);
    }
}
