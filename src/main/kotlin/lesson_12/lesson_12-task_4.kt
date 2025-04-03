package org.example.lesson_12

class WeatherWithTemperatureAndPrecipitation(
    daytimeTemperature: Int,
    temperatureAtNight: Int,
    isPrecipitation: Boolean,
) {
    val daytimeTemperatureCelsius = daytimeTemperature - TEMP_IN_KELVIN
    val temperatureAtNightCelsius = temperatureAtNight - TEMP_IN_KELVIN
    val isPrecipitation = isPrecipitation

    init {
        println(
            """
        |Температура днем: $daytimeTemperatureCelsius,
        |Температура ночью: $temperatureAtNightCelsius,
        |Осадки сегодня: $isPrecipitation
            """.trimMargin(),
        )
    }
}

fun main() {
    val weather19012025 = WeatherWithTemperatureAndPrecipitation(285, 278, true)
}

const val TEMP_IN_KELVIN = 273
