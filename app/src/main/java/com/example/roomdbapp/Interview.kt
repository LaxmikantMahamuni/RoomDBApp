package com.example.roomdbapp

fun main() {
    print("Hello Word")

    val myString = "Hello Word"

    myString.reverse()
}

fun String.reverse():String {
    return this.split(" ").get(0)
}

