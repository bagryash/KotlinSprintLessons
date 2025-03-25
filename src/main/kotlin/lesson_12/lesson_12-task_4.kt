package org.example.lesson_12

class WeatherWithTemperatureAndPrecipitation(
    var daytimeTemperature: Int,
    var temperatureAtNight: Int,
    var isPrecipitation: Boolean,
) {
    init {
        println(
            """
        |Температура днем: ${daytimeTemperature - TEMPERATURE_IN_KELVIN},
        |Температура ночью: ${temperatureAtNight - TEMPERATURE_IN_KELVIN},
        |Осадки сегодня: $isPrecipitation
            """.trimMargin(),
        )
    }
}

fun main() {
    val weather19012025 = WeatherWithTemperatureAndPrecipitation(285, 278, true)
}

const val TEMPERATURE_IN_KELVIN = 273
