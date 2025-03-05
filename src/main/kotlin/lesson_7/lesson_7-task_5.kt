package org.example.lesson_7

fun main() {
    println("Введите длину пароля(не менее 6 символов):")
    var numberOfCharactersInPassword = readln().toInt()

    while (numberOfCharactersInPassword < SIX) {
        println("Введите длину пароля(не менее $SIX символов):")
        numberOfCharactersInPassword = readln().toInt()
    }

    val range = 1..3
    val rangeCapitalLetters = 'A'..'Z'
    val rangeLowercaseLetters = 'a'..'z'
    val rangeNumber = 1..9

    var password = ""
    var randomCharacters = ""

    for (i in 1..numberOfCharactersInPassword) {
        val randomCharactersInPassword = (range).random()
        when (randomCharactersInPassword) {
            1 -> randomCharacters = (rangeCapitalLetters).random().toString()
            2 -> randomCharacters = (rangeLowercaseLetters).random().toString()
            3 -> randomCharacters = (rangeNumber).random().toString()
        }
        password = password + randomCharacters
    }

    println(password)
}

const val SIX = 6
