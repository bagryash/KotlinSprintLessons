package org.example.lesson_1

fun main() {
    val range = 1..9
    val number = (range).random()
    var userNumber: Int
    var counter = 5

    println("Введите число $range:")
    userNumber = readln().toInt()
    counter--
    while (counter > ZERO && userNumber != number) {
        println("Мимо! У Вас еще попыток: ${counter--}\nВведите число $range:")
        userNumber = readln().toInt()
    }

    if (userNumber == number) {
        println("Это была великолепная игра!")
    } else if (counter == ZERO) {
        println("Было загадано число $number")
    }
}

const val ZERO = 0
