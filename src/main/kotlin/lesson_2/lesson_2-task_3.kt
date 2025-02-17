package org.example.lesson_2

import java.time.LocalDate

fun main() {

    val hourTrainDeparture = 9
    val minutesTrainDeparture = 39
    val travelTime = 457

    val departureTimeInMinutes = hourTrainDeparture * NUMBER_MINUTES_IN_HOUR + minutesTrainDeparture
    val daysOnRoad = (travelTime / (NUMBER_HOURS_IN_DAY * NUMBER_MINUTES_IN_HOUR)).toLong()
    val arrivalTimeInMinutes =
        departureTimeInMinutes + travelTime - daysOnRoad * NUMBER_HOURS_IN_DAY * NUMBER_MINUTES_IN_HOUR
    val hh = arrivalTimeInMinutes / NUMBER_MINUTES_IN_HOUR
    val mm = arrivalTimeInMinutes - hh * NUMBER_MINUTES_IN_HOUR
    val trainDepartureDay: LocalDate = LocalDate.now()
    val dayOfTrainArrival: LocalDate = trainDepartureDay.plusDays(daysOnRoad)

    println(hh)
    println(mm)
    println(dayOfTrainArrival)

}

const val NUMBER_HOURS_IN_DAY = 24
const val NUMBER_MINUTES_IN_HOUR = 60