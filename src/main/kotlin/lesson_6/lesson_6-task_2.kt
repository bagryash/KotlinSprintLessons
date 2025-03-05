package org.example.lesson_6

import java.lang.Thread.sleep

fun main() {
    println("Введите количество секунд")
    val seconds = readln().toLong()

    sleep(seconds * THOUSAND)

    println("Прошло $seconds секунд")
}

const val THOUSAND = 1000
