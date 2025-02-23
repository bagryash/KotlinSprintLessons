package org.example.lesson_5

fun main() {

    var yearNow = 2025

    println("Введите Ваш год рождения:")
    val usersYearOfBirth = readln().toInt()

    if (yearNow - usersYearOfBirth >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ запрещен")
    }

}

const val AGE_OF_MAJORITY = 18
