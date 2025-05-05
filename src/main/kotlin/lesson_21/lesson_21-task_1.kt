package org.example.lesson_21

import java.util.*
import kotlin.collections.List

fun main() {
    fun String.vowelCount(string: String): Int {
        var count = 0
        for (i in string.lowercase(Locale.getDefault())) {
            if (i == 'a' ||
                i == 'e' ||
                i == 'i' ||
                i == 'o' ||
                i == 'y' ||
                i == 'u'
            ) {
                count++
            }
        }
        return count
    }

    val helloWorld = "Hello KOTLIN"

    println(helloWorld.vowelCount(helloWorld))



    fun List<Int>.evenNumbersSum(list: List<Int>): Int {
        var sumOfEvenNumbers = 0
        list.forEach {
            if (it % 2 == 0) sumOfEvenNumbers += it
        }
        return sumOfEvenNumbers
    }

    val listOfInt = listOf(1, 3, 5, 56, 681, 89, 801)
    println(listOfInt.evenNumbersSum(listOfInt))

}
