//
//  ContentView.swift
//  compilador-swift
//
//  Created by Angela Pesina on 07/04/26.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        VStack {
            Text("Hello, world!")
        }
        .onAppear {
            testParser()
        }
    }
}
