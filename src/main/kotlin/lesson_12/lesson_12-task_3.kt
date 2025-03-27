package org.example.lesson_12

class WeatherWithTemperatureInKelvin(
    daytimeTemperature: Int,
    temperatureAtNight: Int,
    isPrecipitation: Boolean,
) {
    val daytimeTemperatureCelsius = daytimeTemperature - TEMPERATURE_IN_KELVIN
    val temperatureAtNightCelsius = temperatureAtNight - TEMPERATURE_IN_KELVIN
    val isPrecipitation = isPrecipitation

    fun printlnWeatherDayAndNight() =
        println(
            """
        |Температура днем: $daytimeTemperatureCelsius},
        |Температура ночью: $temperatureAtNightCelsius,
        |Осадки сегодня: $isPrecipitation
            """.trimMargin(),
        )
}

fun main() {
    val weather19012025 = WeatherWithTemperatureInKelvin(285, 278, true)
    weather19012025.printlnWeatherDayAndNight()
}

const val TEMPERATURE_IN_KELVIN = 273
