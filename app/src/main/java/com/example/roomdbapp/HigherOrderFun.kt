package com.example.roomdbapp

fun add(a: Int, b: Int): Int {
    return a + b
}

fun higherOrder(x: Int, y: Int, doAdd: (Int, Int) -> Int): Int {
    return doAdd(x, y)
}

fun main() {
    val result = higherOrder(10, 20, ::add)
}