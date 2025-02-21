package org.example.lesson_4

fun main() {

    val numberFreeTablesToday = 13
    val numberFreeTablesTomorrow = 9

    val isTablesAvailableToday = !(NUMBER_OF_TABLES == numberFreeTablesToday)
    val isTablesAvailableTomorrow = !(NUMBER_OF_TABLES == numberFreeTablesTomorrow)

    println("[Доступность столиков на сегодня: $isTablesAvailableToday],\n[Доступность столиков на завтра: $isTablesAvailableTomorrow].")

}
const val NUMBER_OF_TABLES = 13