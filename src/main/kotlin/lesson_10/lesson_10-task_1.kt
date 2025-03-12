package org.example.lesson_10

import java.lang.Thread.sleep

fun main() {
    println("Бросает человек")
    sleep(1000)
    val x = throwDice()
    sleep(THAU)
    println("Бросает машина")
    sleep(THAU)
    val y = throwDice()
    sleep(THAU)
    if (x > y) println("Победило человечество!")
    else if (y > x) println("Победила машина!")
    else println("Победила дружба!")
}

fun throwDice(): Int {
    val cubeRange = 1..6
    val meaningOfFirstCube = (cubeRange).random()
    println(meaningOfFirstCube)
    val meaningOfSecondCube = (cubeRange).random()
    println(meaningOfSecondCube)
    val sum = meaningOfFirstCube + meaningOfSecondCube
    return sum
}

const val THAU: Long = 1000
