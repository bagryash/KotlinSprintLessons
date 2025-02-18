package org.example.lesson_4

fun main() {

    val sunnyWeather: Boolean = true
    val openAwning: Boolean = true
    val airHumidity: Int = 20
    val timeOfYear: String = "зима"

    val sunnyWeatherToday: Boolean = true
    val openAwningNow: Boolean = true
    val airHumidityNow: Int = 20
    val timeOfYearNow: String = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                ((sunnyWeather == sunnyWeatherToday) and (openAwning == openAwningNow) and (airHumidity == airHumidityNow) and (timeOfYear != timeOfYearNow))
    )

}