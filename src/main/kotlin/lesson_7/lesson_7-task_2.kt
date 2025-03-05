package org.example.lesson_7

fun main() {
    do {
        val range = 1000..9999
        val codeFromSms = (range).random()
        println("Ваш код авторизации: $codeFromSms")
        println("Введите код из смс")
        val userEnterCode = readln().toInt()
    } while (userEnterCode != codeFromSms)

    println("Добро пожаловать!")
}
