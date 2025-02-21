package org.example.lesson_2

fun main() {

    val first = 3
    val second = 4
    val third = 3
    val fourth = 5

    val gPA = ((first + second + third + fourth) / NUMBER_OF_STUDENTS.toDouble())

    println(String.format("%.2f", gPA))

}

const val NUMBER_OF_STUDENTS = 4