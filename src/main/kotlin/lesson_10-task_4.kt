package org.example.lesson_10

import java.lang.Thread.sleep

fun main() {
    var numberHumansWins = 0
    do {
        if (play() == 0) numberHumansWins++
    } while (continuePlaying() != false)
    println("Вы выиграли в $numberHumansWins играх")
}

fun throwDice(): Int {
    val cubeRange = 1..6
    val meaningOfCube = (cubeRange).random()
    println(meaningOfCube)
    return meaningOfCube
}

fun play(): Int {
    println("Бросает человек:")
    sleep(SLEEP_TIME)
    val humanDiceSum = throwDice() + throwDice()
    sleep(SLEEP_TIME)
    println("Бросает машина:")
    val robotDiceSum = throwDice() + throwDice()
    sleep(SLEEP_TIME)
    val gameResult: Int

    if (humanDiceSum > robotDiceSum) {
        println("Победило человечество!")
        gameResult = 0
    } else if (humanDiceSum < robotDiceSum) {
        println("Победила машина!")
        gameResult = 1
    } else {
        println("Победила дружба!")
        gameResult = 2
    }
    return gameResult
}

fun continuePlaying(): Boolean {
    println("Вы еще хотите играть (да/нет)?:")
    val userResponse =
        if (readln() == "да") {
            true
        } else {
            false
        }
    return userResponse
}

const val SLEEP_TIME = 1000L
