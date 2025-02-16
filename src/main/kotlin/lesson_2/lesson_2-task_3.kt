package org.example.lesson_2

import java.time.LocalDate

fun main() {

    val hourTrainDeparture = 9
    val minutesTrainDeparture = 39
    val travelTime = 457

    val departureTimeInMinutes = hourTrainDeparture * 60 + minutesTrainDeparture
    val daysOnRoad = (travelTime / NUMBER_MINUTES_IN_DAY).toLong()
    val arrivalTimeInMinutes = departureTimeInMinutes + travelTime - daysOnRoad * NUMBER_MINUTES_IN_DAY
    val hh = arrivalTimeInMinutes  / 60
    val mm = arrivalTimeInMinutes  - hh * 60
    val trainDepartureDay: LocalDate = LocalDate.now()
    val dayOfTrainArrival: LocalDate = trainDepartureDay.plusDays(daysOnRoad)

    println(hh)
    println(mm)
    println(dayOfTrainArrival)

}

const val NUMBER_MINUTES_IN_DAY = 24 * 60