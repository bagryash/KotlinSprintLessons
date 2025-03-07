package org.example.lesson_8

fun main() {
    val numberOfViewsDays = intArrayOf(13, 23, 34, 45, 23, 45, 46)
    var numberOfViewsWeek = 0

    for (i in numberOfViewsDays) {
        numberOfViewsWeek = numberOfViewsWeek + i
    }
    println(numberOfViewsWeek)
}
