package org.example.lesson_7

fun main() {
    val range = 1..3
    val rangeLetter = 'a'..'z'
    val rangeNumber = 1..9
    var userPassword = ""

    for (i in range) {
        val randomNumber = (rangeNumber).random().toString()
        val randomLetter = (rangeLetter).random()
        userPassword = userPassword + randomNumber + randomLetter
    }

    println(userPassword)
}
