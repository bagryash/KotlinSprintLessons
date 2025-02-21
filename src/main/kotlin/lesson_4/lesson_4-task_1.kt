package org.example.lesson_4

fun main() {

    val numberFreeTablesToday = 13
    val numberFreeTablesTomorrow = 9

    val tablesAvailableToday = !(NUMBER_OF_TABLES == numberFreeTablesToday)
    val tablesAvailableTomorrow = !(NUMBER_OF_TABLES == numberFreeTablesTomorrow)

    println("[Доступность столиков на сегодня: $tablesAvailableToday],\n[Доступность столиков на завтра: $tablesAvailableTomorrow].")

}
const val NUMBER_OF_TABLES = 13