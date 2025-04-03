package org.example.lesson_12

class Weather(
    val daytimeTemperature: Int,
    val temperatureAtNight: Int,
    val isPrecipitation: Boolean,
)

fun main() {
    val rangeDaytimeTemperature = 8..18
    val rangeTemperatureAtNight = 1..6
    val rangeDays = 1..30

    var weatherList = mutableListOf<Weather>()

    for (i in rangeDays) {
        val weather =
            Weather(
                daytimeTemperature = (rangeDaytimeTemperature).random(),
                temperatureAtNight = (rangeTemperatureAtNight).random(),
                isPrecipitation = listOf(true, false).random(),
            )
        weatherList += weather
    }

    val averageDaytimeTemperature = weatherList.map { it.daytimeTemperature }.average()
    val averageTemperatureAtNight = weatherList.map { it.temperatureAtNight }.average()
    val numberOfDaysWitPrecipitation = weatherList.map { it.isPrecipitation }.filter { it == true }.size

    println(
        """
        |Средняя дневная температура за месяц: $averageDaytimeTemperature
        |Средняя ночная температура за месяц: $averageTemperatureAtNight
        |Кодичество дней с осадками: $numberOfDaysWitPrecipitation
        """.trimMargin(),
    )
}
