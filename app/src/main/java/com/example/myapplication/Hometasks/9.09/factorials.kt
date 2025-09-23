package com.example.myapplication

fun factorial(n: Int): Long {
    require(n >= 0)
    var res = 1L
    for (i in 2..n) res *= i
    return res
}

fun main() {
    println(factorial(9)) // 362880
}
