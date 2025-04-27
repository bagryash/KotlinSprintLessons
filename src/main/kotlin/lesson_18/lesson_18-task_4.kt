package org.example.lesson_18

import kotlin.math.pow

abstract class Box {
    open fun squre() = 0.0
}

class RectangularBox(
    val length: Double,
    val width: Double,
    val height: Double,
) : Box() {
    override fun squre() = 2 * (length * width + length * height + height * width)
}

class CubeBox(
    val length: Double,
) : Box() {
    override fun squre() = 6 * (length.pow(2))
}

fun main() {
    val box1: Box = RectangularBox(10.0, 20.0, 15.0)
    val box2: Box = CubeBox(20.0)
    val box3: Box = RectangularBox(20.0, 25.0, 40.0)
    val box4: Box = CubeBox(50.0)

    val boxList = listOf(box1, box2, box3, box4)

    boxList.forEach {
        println(it.squre())
    }
}
