package org.example.lesson_21

import java.util.*

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


}
