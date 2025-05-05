package org.example.lesson_21

fun main() {
    fun List<Int>.evenNumbersSum(): Int {
        var sumOfEvenNumbers = 0
       forEach {
            if (it % 2 == 0) sumOfEvenNumbers += it
        }
        return sumOfEvenNumbers
    }

    val listOfInt = listOf(1, 32, 5, 56, 61, 89, 80)
    println(listOfInt.evenNumbersSum())

}