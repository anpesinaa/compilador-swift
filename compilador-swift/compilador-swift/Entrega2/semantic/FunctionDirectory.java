//
//  FunctionDirectory.java
//  compilador-swift
//
//  Created by Angela Pesina on 17/05/26.
//

import java.util.HashMap;

class Function {

    String name;
    String returnType;

    Function(String name, String returnType) {

        this.name = name;
        this.returnType = returnType;
    }
}

public class FunctionDirectory {

    HashMap<String, Function> functions = new HashMap<>();

    public void addFunction(String name, String returnType) {

        if (functions.containsKey(name)) {

            System.out.println("ERROR: esta función ya existe jejej:  " + name);

        } else {

            functions.put(name, new Function(name, returnType));

            System.out.println("Función agregada :3: " + name);
        }
    }
}
