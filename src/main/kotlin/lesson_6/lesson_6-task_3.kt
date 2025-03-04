package org.example.lesson_6

import java.lang.Thread.sleep

fun main() {
    println("Введите количество секунд")
    var seconds = readln().toInt()

    while (seconds > ZERO) {
        println("осталось секунд: $seconds")
        sleep(1000)
        seconds--
    }

    println("Время вышло")
}

const val ZERO = 0
