package org.example.lesson_15

abstract class WeatherStationStats(
    val date: String,
    val location: String,
)

class Temperature(
    date: String,
    location: String,
    val daytimeTemperature: Int,
    val temperatureAtNight: Int,
) : WeatherStationStats(date, location)

class PrecipitationAmount(
    date: String,
    location: String,
    val precipitationAmount: Int?,
) : WeatherStationStats(date, location)

class WeatherServer {
    fun printData(data: WeatherStationStats) {
        println(
            """
            |Дата наблюдения: ${data.date}
            |Станция: ${data.location}
            """.trimMargin(),
        )
        when (data) {
            is Temperature ->
                println(
                    """
            |Температура днём: ${data.daytimeTemperature}
            |Температура ночью: ${data.temperatureAtNight}
                    """.trimMargin(),
                )

            is PrecipitationAmount ->
                println("Количество осадков: ${data.precipitationAmount}")
        }
    }
}

fun main() {
    val temperature070425 = Temperature("070425", "Центральное Поволжье", 22, 10)
    val precipitation070425 = PrecipitationAmount("070425", "Центральное Поволжье", null)

    val weatherServer = WeatherServer()
    weatherServer.printData(temperature070425)
    weatherServer.printData(precipitation070425)
}
