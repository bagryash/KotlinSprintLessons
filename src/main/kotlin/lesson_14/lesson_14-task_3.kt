package org.example.lesson_14

import kotlin.math.PI

abstract class Figure(
    color: String,
) {
    open fun calculateAreaOfShape() = println("Площадь фигуры:")

    open fun calculatePerimeterOfShape() = println("Периметр:")
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {
    override fun calculateAreaOfShape() {
        super.calculateAreaOfShape()
        println(PI * radius * radius)
    }
}

class Rectangle(
    color: String,
    val length: Int,
    val width: Int,
) : Figure(color) {
    override fun calculateAreaOfShape() {
        super.calculateAreaOfShape()
        println(length * width)
    }
}

fun main() {
}
