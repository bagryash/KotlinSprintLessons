package org.example.lesson_12

class WeatherInDay() {
    var daytimeTemperature: Int = 25
    var temperatureAtNight: Int = 10
    var isPrecipitation: Boolean = false

    fun printlnWeatherInDay() = println(
        """
        |Температура днем: $daytimeTemperature,
        |Температура ночью: $temperatureAtNight,
        |Осадки сегодня: $isPrecipitation
    """.trimMargin()
    )
}


fun main() {
    val weather16012025 = WeatherInDay()
    weather16012025.daytimeTemperature = 4
    weather16012025.temperatureAtNight = -2
    weather16012025.isPrecipitation = true
    weather16012025.printlnWeatherInDay()

    val weather17012025 = WeatherInDay()
    weather17012025.daytimeTemperature = 3
    weather17012025.temperatureAtNight = -3
    weather17012025.isPrecipitation = true
    weather17012025.printlnWeatherInDay()

}