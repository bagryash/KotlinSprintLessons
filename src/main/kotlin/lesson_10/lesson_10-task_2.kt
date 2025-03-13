package org.example.lesson_10

fun main() {
    println("Придумайте логин")
    val userLogin = readln()

    println("Придумайте логин")
    val userPassword = readln()

    if (checkLength(userLogin) && checkLength(userPassword) == true) {
        println("Привет")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun checkLength(data: String): Boolean = data.length >= MINIMUM_NUMBER_OF_CHARACTERS

const val MINIMUM_NUMBER_OF_CHARACTERS = 4
