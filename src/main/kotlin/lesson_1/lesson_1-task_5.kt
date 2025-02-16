package org.example.lesson_1

fun main() {

    val hoursMinutesSeconds = String.format(
        "%02d:%02d:%02d",
        HOURS,
        MINUTES,
        SECONDS - (HOURS * 60 * 60) - (MINUTES * 60)
    )

    println(hoursMinutesSeconds)

}

const val SECONDS = 6480
const val HOURS = SECONDS / 60 / 60
const val MINUTES = SECONDS / 60 - HOURS * 60

