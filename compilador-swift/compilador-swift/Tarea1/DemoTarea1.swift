//
//  DemoTarea1.swift
//  compilador-swift
//
//  Created by Angela Pesina on 07/04/26.
//

import Foundation

struct DemoTarea1 {
    
    static func run() {
        print("========== DEMO TAREA 1 ==========\n")
        
        probarStack()
        probarQueue()
        probarHashTable()
        
        print("========== FIN DE LA DEMO ==========")
    }
    
    static func probarStack() {
        print("PRUEBAS DE STACK")
        
        var stack = Stack<Int>()
        
        print("Stack vacía:", stack.isEmpty)
        print("Cantidad inicial:", stack.count)
        
        stack.push(10)
        stack.push(20)
        stack.push(30)
        
        stack.display()
        
        print("Elemento en la cima con peek():", stack.peek() as Any)
        print("Cantidad después de push:", stack.count)
        
        print("Pop 1:", stack.pop() as Any)
        print("Pop 2:", stack.pop() as Any)
        
        stack.display()
        
        print("Cantidad actual:", stack.count)
        print("¿Sigue vacía?:", stack.isEmpty)
        
        print("Pop 3:", stack.pop() as Any)
        print("Pop en stack vacía:", stack.pop() as Any)
        
        print("Stack vacía al final:", stack.isEmpty)
        print("")
    }
    
    static func probarQueue() {
        print(" PRUEBAS DE QUEUE")
        
        var queue = Queue<String>()
        
        print("Queue vacía:", queue.isEmpty)
        print("Cantidad inicial:", queue.count)
        
        queue.enqueue("A")
        queue.enqueue("B")
        queue.enqueue("C")
        
        queue.display()
        
        print("Primer elemento con peek():", queue.peek() as Any)
        print("Cantidad después de enqueue:", queue.count)
        
        print("Dequeue 1:", queue.dequeue() as Any)
        print("Dequeue 2:", queue.dequeue() as Any)
        
        queue.display()
        
        print("Cantidad actual:", queue.count)
        print("¿Sigue vacía?:", queue.isEmpty)
        
        print("Dequeue 3:", queue.dequeue() as Any)
        print("Dequeue en queue vacía:", queue.dequeue() as Any)
        
        print("Queue vacía al final:", queue.isEmpty)
        print("")
    }
    
    static func probarHashTable() {
        print("PRUEBAS DE HASH TABLE")
        
        var tabla = Hash<String, Int>()
        
        print("Tabla vacía:", tabla.isEmpty)
        print("Cantidad inicial:", tabla.count)
        
        tabla.insert(key: "uno", value: 1)
        tabla.insert(key: "dos", value: 2)
        tabla.insert(key: "tres", value: 3)
        
        tabla.display()
        
        print("Cantidad después de insert:", tabla.count)
        print("Buscar clave 'dos':", tabla.get(key: "dos") as Any)
        print("Buscar clave inexistente 'cuatro':", tabla.get(key: "cuatro") as Any)
        
        print("¿Contiene la clave 'tres'?:", tabla.contains(key: "tres"))
        print("¿Contiene la clave 'cinco'?:", tabla.contains(key: "cinco"))
        
        tabla.update(key: "dos", value: 22)
        print("Valor actualizado de 'dos':", tabla.get(key: "dos") as Any)
        
        print("Eliminar clave 'uno':", tabla.remove(key: "uno") as Any)
        print("Eliminar clave inexistente 'seis':", tabla.remove(key: "seis") as Any)
        
        tabla.display()
        
        print("Cantidad final:", tabla.count)
        print("Tabla vacía al final:", tabla.isEmpty)
        print("")
    }
}
