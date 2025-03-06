package org.example.lesson_7

fun main() {
    println("Введите число, конец диапазона")
    val userNumber = readln().toInt()

    val range = 0..userNumber step 2

    for (i in range) {
        val even = i
        println(even)
    }
}
