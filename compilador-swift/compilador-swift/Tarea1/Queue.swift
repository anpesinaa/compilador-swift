//
//  Queue.swift
//  compilador-swift
//
//  Created by Angela Pesina on 07/04/26.
//

import Foundation

struct Queue<T> {
    private var items: [T] = []
    
    var isEmpty: Bool {
        return items.isEmpty
    }
    
    var count: Int {
        return items.count
    }
    
    mutating func enqueue(_ item: T) {
        items.append(item)
    }
    
    mutating func dequeue() -> T? {
        guard !items.isEmpty else { return nil }
        return items.removeFirst()
    }
    
    func peek() -> T? {
        return items.first
    }
    
    func display() {
        print("Queue:", items)
    }
}
