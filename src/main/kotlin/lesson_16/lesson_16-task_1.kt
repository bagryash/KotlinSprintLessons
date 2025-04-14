package org.example.lesson_16

class PlayingCube {
    private val range = 1..6
    private val number = (range).random()

    fun getNumber() = println(number)
}

fun main() {
    val cube = PlayingCube()
    cube.getNumber()
}
