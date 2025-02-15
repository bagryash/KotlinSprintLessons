package org.example.lesson_1

fun main() {

    val hoursMinutesSeconds = String.format(
        "%02d:%02d:%02d",
        hours,
        minutes,
        seconds - (hours * 60 * 60) - (minutes * 60)
    )

    println(hoursMinutesSeconds)

}

const val seconds = 6480
const val hours = seconds / 60 / 60
const val minutes = seconds / 60 - hours * 60
