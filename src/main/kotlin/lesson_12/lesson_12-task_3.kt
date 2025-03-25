package org.example.lesson_12

class WeatherWithTemperatureInKelvin {
    var daytimeTemperature: Int = TEMPERATURE_IN_KELVIN
    var temperatureAtNight: Int = TEMPERATURE_IN_KELVIN
    var isPrecipitation: Boolean = false

    fun printlnWeatherDayAndNight() =
        println(
            """
        |Температура днем: ${daytimeTemperature - TEMPERATURE_IN_KELVIN},
        |Температура ночью: ${temperatureAtNight - TEMPERATURE_IN_KELVIN},
        |Осадки сегодня: $isPrecipitation
            """.trimMargin(),
        )
}

fun main() {
    val weather19012025 = WeatherWithTemperatureInKelvin()
    weather19012025.daytimeTemperature = 285
    weather19012025.temperatureAtNight = 278
    weather19012025.printlnWeatherDayAndNight()
}

const val TEMPERATURE_IN_KELVIN = 273
