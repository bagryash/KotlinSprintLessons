package org.example.lesson_17

class Ship(
    _name: String,
    _speedMax: Int,
    _shipsHomePort: String,
) {
    var name = _name
        set(value) {
            println("Невозможно переименовать корабль!")
        }
    private val speedMax = _speedMax
    private val shipsHomePort = _shipsHomePort
}

fun main() {
    val aurora = Ship("Аврора", 19, "Санкт-Петербург")

    aurora.name = "Варяг"
    println(aurora.name)
}
