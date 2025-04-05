package org.example.lesson_14

import kotlin.math.PI

abstract class Figure(
    val color: String,
) {
    open fun calculateArea(): Double = 0.0

    open fun calculatePerimeter(): Double = 0.0
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun calculateArea(): Double = PI * radius * radius

    override fun calculatePerimeter(): Double = NUMBER_TWO * PI * radius
}

class Rectangle(
    color: String,
    val length: Double,
    val width: Double,
) : Figure(color) {
    override fun calculateArea(): Double = length * width

    override fun calculatePerimeter(): Double = NUMBER_TWO * (length + width)
}

fun main() {
    val figureList = mutableListOf<Figure>()
    val whiteCircle = Circle("белый", 10.0)

    val blackCircle = Circle("черный", 4.4)
    figureList += blackCircle

    val whiteRectangle = Rectangle("белый", 23.7, 4.0)
    figureList += whiteRectangle
    val blackRectangle = Rectangle("черный", 2.7, 44.44)
    figureList += blackRectangle

    var sumOfPerimetersAllBlackPieces = 0.0
    var sumOfAreasAllWhitePieces = 0.0

    figureList.forEach {
        if (it.color == "черный") {
            sumOfPerimetersAllBlackPieces += it.calculatePerimeter()
        } else {
            sumOfAreasAllWhitePieces += it.calculateArea()
        }
    }

    println("Сумма периметров всех черных фигур: " + sumOfPerimetersAllBlackPieces)
    println("Сумма площадей всех белых фигур:" + sumOfAreasAllWhitePieces)
}

const val NUMBER_TWO = 2
