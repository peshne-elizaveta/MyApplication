package com.example.myapplication

open class Payment(
    val amount: Double,
) {
    open fun process() {
        println("Processing payment $amount")
    }
}

class Credit_card_payment(amount: Double): Payment(amount) {
    override fun process() {
        println("Paid $amount with credit card")
    }
}

class Paypal_payment(amount: Double): Payment(amount) {
    override fun process() {
        println("Paid $amount via PayPal")
    }
}

class Bank_transfer_payment(amount: Double): Payment(amount) {
    override fun process() {
        println("Paid $amount via bank transfer")
    }
}

fun make_transaction(payment: Payment) {
    payment.process()
}

fun main() {
    val payments = listOf(
        Credit_card_payment(333.7),
        Paypal_payment(206.5),
        Bank_transfer_payment(358.4),
        Payment(53.0)
    )

    for (p in payments) {
        make_transaction(p)
    }
}
