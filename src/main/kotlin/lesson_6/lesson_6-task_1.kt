package org.example.lesson_6

fun main() {
    println("Придумайте логин:")
    val userLogin = readln()

    println("Придумайте пароль:")
    val userPassword = readln()

    do {
        println("Введите Ваш логин:")
        val userEnterLogin = readln()

        println("Придумайте пароль:")
        val userEnterPassword = readln()
    } while ((userLogin != userEnterLogin) || (userPassword != userEnterPassword))

    println("Авторизация прошла успешно")
}
