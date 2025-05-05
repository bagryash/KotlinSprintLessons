package org.example.lesson_21

fun main() {
    fun List<Int>.evenNumbersSum(list: List<Int>): Int {
        var sumOfEvenNumbers = 0
        list.forEach {
            if (it % 2 == 0) sumOfEvenNumbers += it
        }
        return sumOfEvenNumbers
    }

    val listOfInt = listOf(1, 32, 5, 56, 61, 89, 80)
    println(listOfInt.evenNumbersSum(listOfInt))

}