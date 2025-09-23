package com.example.myapplication.Hometasks

class Box<T>(private val value: T) {

    fun getValue(): T {
        return value
    }

    fun <R> map(new: (T) -> R): Box<R> = Box(new(value))
}

fun main() {
    //Int -> String
    val intBox = Box(459)
    val stringBox: Box<String> = intBox.map { it.toString() }
    println("String value: ${stringBox.getValue()}")

    //Int -> Boolean
    val boolBox: Box<Boolean> = intBox.map { it > 0 }
    println("Boolean value: ${boolBox.getValue()}")
}