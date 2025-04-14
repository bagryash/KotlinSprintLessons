package org.example.lesson_16

class Circle(
    private val radius: Float,
) {
    fun calculateCircumference(): Float = TWO * PI * radius

    fun calculateArea(): Float = PI * radius * radius
}

fun main() {
    val circle = Circle(53.6f)

    println("Длина окружности: " + circle.calculateCircumference())
    println("Площадь круга: " + circle.calculateArea())
}

private const val PI = 3.14f
private const val TWO = 2
