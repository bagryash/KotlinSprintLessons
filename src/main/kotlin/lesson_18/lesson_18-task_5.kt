package org.example.lesson_18

class Screen {
    val circle: String = "круг"
    val square: String = "квадрат"
    val point: String = "точка"

    fun drawCircle(
        x: Int,
        y: Int,
    ) = println("Фигура $circle c координатами x: $x, $y")

    fun drawCircle(
        x: Float,
        y: Float,
    ) = println("Фигура $circle c координатами x: $x, у:  $y")

    fun drawSquare(
        x: Int,
        y: Int,
    ) = println("Фигура $square c координатами x: $x, у:  $y")

    fun drawSquare(
        x: Float,
        y: Float,
    ) = println("Фигура $square c координатами x: $x, у: $y")

    fun drawPoint(
        x: Int,
        y: Int,
    ) = println("Фигура $point c координатами x: $x, у:  $y")

    fun drawPoint(
        x: Float,
        y: Float,
    ) = println("Фигура $point c координатами x: $x, у: $y")
}

fun main() {
    val screen = Screen()
    screen.drawPoint(100, 50)
    screen.drawPoint(100.0f, 50.0f)
}
