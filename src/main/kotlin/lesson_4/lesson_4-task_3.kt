package org.example.lesson_4

fun main() {

    val isSunnyWeatherToday: Boolean = true
    val isOpenTentNow: Boolean = true
    val airHumidityNow: Int = 20
    val timeOfYearNow: String = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                ((IS_SUNNY_WEATHER == isSunnyWeatherToday) and (IS_OPEN_TENT == isOpenTentNow) and (AIR_HUMIDITY == airHumidityNow) and (SEASON_OF_YEAR != timeOfYearNow))
    )

}

const val IS_SUNNY_WEATHER: Boolean = true
const val IS_OPEN_TENT: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val SEASON_OF_YEAR: String = "зима"