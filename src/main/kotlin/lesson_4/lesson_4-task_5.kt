package org.example.lesson_4

fun main() {
    println("Наличие повреждений корпуса:")
    val isShipDamaged: Boolean = readln().toBoolean()

    println("Tекущий состав экипажа:")
    val crewNumber: Int = readln().toInt()

    println("Количество ящиков с провизией на борту:")
    val boxesNumber: Int = readln().toInt()

    println("Благоприятность метеоусловий:")
    val isWeatherGood: Boolean = readln().toBoolean()

    println("Корабль может выплывать:")
    val shipCanSail =
        println(
            (boxesNumber > MIN_NUMBER_OF_BOXES) &&
                (
                    (IS_SHIP_DAMAGED == isShipDamaged && crewNumber >= MIN_CREW_NUMBER && crewNumber <= MAX_CREW_NUMBER) ||
                        (crewNumber == MAX_CREW_NUMBER && isWeatherGood == IS_FAVORABLE_WEATHER)
                ),
        )
}

const val IS_SHIP_DAMAGED = false
const val MIN_CREW_NUMBER = 55
const val MAX_CREW_NUMBER = 70
const val MIN_NUMBER_OF_BOXES = 50
const val IS_FAVORABLE_WEATHER = true
