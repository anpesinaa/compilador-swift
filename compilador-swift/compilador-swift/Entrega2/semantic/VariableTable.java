//
//  VariableTable.java
//  compilador-swift
//
//  Created by Angela Pesina on 17/05/26.
//

import java.util.HashMap;

class Variable {

    String name;
    String type;

    Variable(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

public class VariableTable {

    HashMap<String, Variable> variables = new HashMap<>();

    public void addVariable(String name, String type) {

        if (variables.containsKey(name)) {

            System.out.println("ERROR: esta variable ya existe :( jeje: " + name);

        } else {

            variables.put(name, new Variable(name, type));

            System.out.println("Variable agregada :3: " + name + " : " + type);
        }
    }
}
