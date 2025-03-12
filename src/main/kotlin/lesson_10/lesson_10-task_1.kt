package org.example.lesson_10

import java.lang.Thread.sleep

fun main() {
    println("Бросает человек:")
    sleep(THOUSAND)
    val humanDiceSum = throwDice() + throwDice()
    sleep(THOUSAND)
    println("Бросает машина:")
    val robotDiceSum = throwDice() + throwDice()
    sleep(THOUSAND)

    if (humanDiceSum > robotDiceSum) {
        println("Победило человечество!")
    } else if (humanDiceSum < robotDiceSum) {
        println("Победила машина!")
    } else {
        println("Победила дружба!")
    }
}

fun throwDice(): Int {
    val cubeRange = 1..6
    val meaningOfFirstCube = (cubeRange).random()
    println(meaningOfFirstCube)
    return meaningOfFirstCube
}

const val THOUSAND = 1000L
