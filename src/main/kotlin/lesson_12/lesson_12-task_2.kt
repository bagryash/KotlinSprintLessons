package org.example.lesson_12

class WeatherDayAndNight(
    var daytimeTemperature: Int,
    var temperatureAtNight: Int,
    var isPrecipitation: Boolean,
) {

    fun printlnWeatherDayAndNight() = println(
        """
        |Температура днем: $daytimeTemperature,
        |Температура ночью: $temperatureAtNight,
        |Осадки сегодня: $isPrecipitation
    """.trimMargin()
    )
}

fun main() {
    val weather15012025 = WeatherDayAndNight(0, -4, true)
    weather15012025.printlnWeatherDayAndNight()
}