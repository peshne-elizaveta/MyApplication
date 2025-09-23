package com.example.myapplication

class Rectangle (
    var width: Double,
    var height: Double
) {
    fun area(): Double = width * height
}

fun main() {
    val square = Rectangle(25.6, 13.8)
    val myArea = square.area()
    println("Area = $myArea")
}




