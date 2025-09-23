package com.example.myapplication

fun reverse(str: String): String {
    var reversed = ""

    for (i in str.length - 1 downTo 0) {
        reversed += str[i]
    }

    return reversed
}


fun main() {
    println("Enter the string: ")

    val input = readLine().toString()
    val result = reverse(input)

    println("Reversed string: $result")
}



