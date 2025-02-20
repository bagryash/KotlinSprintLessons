package org.example.lesson_1

fun main() {

    val secondsInSpace = 6480
    val hoursInSpace = secondsInSpace / NUMBER_OF_SECONDS_IN_MINUTE / NUMBER_OF_MINUTES_IN_HOUR
    val minutesInSpace = secondsInSpace / NUMBER_OF_SECONDS_IN_MINUTE - hoursInSpace * NUMBER_OF_SECONDS_IN_MINUTE

    val hoursMinutesSeconds = String.format(
        "%02d:%02d:%02d",
        hoursInSpace,
        minutesInSpace,
        secondsInSpace - (hoursInSpace * NUMBER_OF_MINUTES_IN_HOUR * NUMBER_OF_SECONDS_IN_MINUTE) - (minutesInSpace * NUMBER_OF_SECONDS_IN_MINUTE)
    )

    println(hoursMinutesSeconds)

}

const val NUMBER_OF_SECONDS_IN_MINUTE = 60
const val NUMBER_OF_MINUTES_IN_HOUR = 60




