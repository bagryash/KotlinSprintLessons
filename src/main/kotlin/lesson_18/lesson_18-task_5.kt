package org.example.lesson_18

import org.example.lesson_14.Circle

class Screen(
    val circle: String,
) {

    fun drawCircle(
        x: Int,
        y: Int,
    ) = println("Фигура $figure c координатами x: $x, $y")

    fun drawCircle(
        x: Float,
        y: Float,
    ) = println("Фигура $figure c координатами x: $x, $y")
}

fun main() {
}
