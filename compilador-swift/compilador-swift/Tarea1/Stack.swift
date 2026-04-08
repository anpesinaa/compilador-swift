//
//  Stack.swift
//  compilador-swift
//
//  Created by Angela Pesina on 07/04/26.
//

import Foundation

struct Stack<T> {
    private var items: [T] = []
    
    var isEmpty: Bool {
        return items.isEmpty
    }
    
    var count: Int {
        return items.count
    }
    
    mutating func push(_ item: T) {
        items.append(item)
    }
    
    mutating func pop() -> T? {
        return items.popLast()
    }
    
    func peek() -> T? {
        return items.last
    }
    
    func display() {
        print("Stack:", items)
    }
}
