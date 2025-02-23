package org.example.Lesson_5

import kotlin.random.Random

fun main() {

    val sumForCheck = (1..10).random()
    println("Введите для проверки 2 простых числа, сумма которых равно $sumForCheck")

    println("Первое число:")
    val numberOne = readln().toInt()
    println("Второе число:")
    val numberTwo = readln().toInt()

    if (numberOne + numberTwo == sumForCheck) println("Добро пожаловать!")
    else println("Доступ запрещен.")

}
