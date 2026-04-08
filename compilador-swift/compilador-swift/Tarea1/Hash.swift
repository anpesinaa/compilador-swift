//
//  Hash.swift
//  compilador-swift
//
//  Created by Angela Pesina on 07/04/26.
//

import Foundation

struct Hash<Key: Hashable, Value> {
    private var items: [Key: Value] = [:]
    
    var isEmpty: Bool {
        return items.isEmpty
    }
    
    var count: Int {
        return items.count
    }
    
    mutating func insert(key: Key, value: Value) {
        items[key] = value
    }
    
    func get(key: Key) -> Value? {
        return items[key]
    }
    
    mutating func update(key: Key, value: Value) {
        items[key] = value
    }
    
    mutating func remove(key: Key) -> Value? {
        return items.removeValue(forKey: key)
    }
    
    func contains(key: Key) -> Bool {
        return items[key] != nil
    }
    
    func display() {
        print("HashTable:", items)
    }
}
