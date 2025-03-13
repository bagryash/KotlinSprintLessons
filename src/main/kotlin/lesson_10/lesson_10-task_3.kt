package org.example.lesson_10

fun main() {
    println("Введите длину пароля")
    val passwordLength = readln().toInt()
    println(generatePassword(passwordLength))
}

fun generatePassword(passwordLength: Int): String {
    val numberRange = 0..9
    val symbolRange = ' '..'/'
    val range = 0..1
    var password = ""
    var randomSymbol = ""

    for (i in 1..passwordLength) {
        val randomCharactersInPassword = (range).random()
        when (randomCharactersInPassword) {
            0 -> randomSymbol = (numberRange).random().toString()
            1 -> randomSymbol = (symbolRange).random().toString()
        }
        password += randomSymbol
    }
    return password
}
