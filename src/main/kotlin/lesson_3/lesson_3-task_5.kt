package org.example.lesson_3

fun main() {
    var playersMove = "D2-D4;0"
    val indicatorsOfMove = playersMove.split("-", ";")

    val startingPosition = indicatorsOfMove[0]
    val finalPosition = indicatorsOfMove[1]
    val moveNumber = indicatorsOfMove[2]

    println(startingPosition)
    println(finalPosition)
    println(moveNumber)
}
