package com.example.myapplication

fun main() {
    val numbers = listOf(1,3,7,15,67,102)
    for(number in numbers) {
        if (number % 2 == 0) {
            println(number)
        }
    }
}

