package org.example.lesson_5

fun main() {
    val numbers = mutableListOf((0..42).random(), (0..42).random(), (0..42).random())

    println("Введите три числа от 0 до 42")
    val userNumber = mutableListOf(readln(), readln(), readln())

    val intersection = numbers.intersect(userNumber)

    when (intersection.size) {
        0 -> println(ZERO_COINCIDENCE)
        1 -> println(ONE_COINCIDENCE)
        2 -> println(TWO_COINCIDENCE)
        3 -> println(THREE_COINCIDENCE)
    }
}

const val ZERO_COINCIDENCE = "Вы не угадали ни одного числа!"
const val ONE_COINCIDENCE = "Вы выиграли утешительный приз!"
const val TWO_COINCIDENCE = "Вы выиграли крупный приз!"
const val THREE_COINCIDENCE = "Поздравляем! Вы выиграли джекпот!!!"
