package org.example.lesson_6

import java.lang.Thread.sleep

fun main() {
    println("Введите количество секунд")
    var seconds = readln().toInt()

    while (seconds > ZERO) {
        sleep(1000)
        seconds--
    }

    println("Прошло $seconds секунд")
}

const val ZERO = 0
