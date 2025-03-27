package org.example.lesson_12

class Weather(
    val daytimeTemperature: Int,
    val temperatureAtNight: Int,
    val isPrecipitation: Boolean,
)

fun main() {
    val rangeTemperature = -3..10
    val rangeDays = 1..30
    val range = true..false

    var weatherList = mutableListOf<Weather>()

    for (i in rangeDays) {
        val weather =
            Weather(
                daytimeTemperature = (rangeTemperature).random(),
                temperatureAtNight = (rangeTemperature).random(),
                isPrecipitation = listOf(true, false).random(),
            )
    }
    val averageDaytimeTemperature = weatherList.map { it.daytimeTemperature }.average()

    println(averageDaytimeTemperature)
}
