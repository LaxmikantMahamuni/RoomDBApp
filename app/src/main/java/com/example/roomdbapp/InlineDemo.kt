package com.example.roomdbapp

fun loop(n: Long) {
    for (i in 0..n) {

    }
}

fun runAndCalculateTime(fn: () -> Unit) {
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time taken for execution: ${end - start}")
}

fun main() {
    runAndCalculateTime {
        loop(10000000)
    }
}