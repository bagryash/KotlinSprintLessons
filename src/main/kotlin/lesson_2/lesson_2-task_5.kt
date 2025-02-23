package org.example.lesson_2

import kotlin.math.pow

fun main() {
    var userDeposit = 70000
    var depositInterestRate = 16.7
    var depositTerm = 20
    var numberOfPeriods = depositTerm

    val total = userDeposit * ((ONE + depositInterestRate / HUNDRED).pow(numberOfPeriods))
    println(String.format("%.3f", total))
}

const val ONE = 1
