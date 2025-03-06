package org.example.lesson_7

import org.example.lesson_2.ONE
import java.lang.Thread.sleep

fun main() {
    println("Введите количество секунд для таймера:")
    var numberOfSeconds = readln().toInt()

    for (i in ONE..numberOfSeconds) {
        println("Осталось секунд: ${numberOfSeconds--}")
        sleep(1000)
    }

    println("Время вышло")
}

