package org.example.lesson_7

fun main() {
    println("Введите длину пароля(не менее 6 символов):")
    var numberOfCharactersInPassword = readln().toInt()

    while (numberOfCharactersInPassword < 6) {
        println("Введите длину пароля(не менее 6 символов):")
         numberOfCharactersInPassword = readln().toInt()
    }

    val range = 1..3
    val rangeCapitalLetters = 'A'..'Z'
    val rangeLowercaseLetters = 'a'..'z'
    val rangeNumber = 1..9

    var password = ""
    var random = ""

    for (i in 1..numberOfCharactersInPassword) {
        val randomCharactersInPassword = (range).random()
        when (randomCharactersInPassword) {
            1 -> random = (rangeCapitalLetters).random().toString()
            2 -> random = (rangeLowercaseLetters).random().toString()
            3 -> random = (rangeNumber).random().toString()
        }
        password = password + random
    }

    println(password)
}
