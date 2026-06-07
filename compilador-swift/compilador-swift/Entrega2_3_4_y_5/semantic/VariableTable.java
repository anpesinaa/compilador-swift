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
    int address;

    Variable(
            String name,
            String type,
            int address) {

        this.name = name;
        this.type = type;
        this.address = address;
    }
}

public class VariableTable {

    HashMap<String, Variable> variables = new HashMap<>();

    public void addVariable(
        String name,
        String type) {

    if (variables.containsKey(name)) {

        System.out.println(
                "ERROR: esta variable ya existe :( jeje: "
                        + name);

        return;
    }

    int address;

    if (type.equals("entero")) {

        address =
                VirtualMemory.globalInt++;

    } else {

        address =
                VirtualMemory.globalFloat++;
    }

    variables.put(
            name,
            new Variable(
                    name,
                    type,
                    address
            )
    );

    System.out.println(
            "Variable agregada :3: "
                    + name
                    + " : "
                    + type
                    + " -> "
                    + address
    );
    }

    public String getVariableType(String name) {

        if (variables.containsKey(name)) {

            return variables.get(name).type;
        }

        return null;
    }

    public Integer getVariableAddress(
        String name) {

    if (variables.containsKey(name)) {

        return variables
                .get(name)
                .address;
    }

    return null;
    }
}
