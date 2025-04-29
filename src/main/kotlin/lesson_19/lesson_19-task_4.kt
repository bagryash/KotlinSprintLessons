package org.example.lesson_19

enum class Patron {
    BLUE,
    GREEN,
    RED,
}

fun getDamage(patron: Patron): Int =
    when (patron) {
        Patron.BLUE -> FIVE
        Patron.GREEN -> TEN
        Patron.RED -> TWENTY
    }

class Tank(
    var patronTypeInTank: Patron? = null,
) {
    fun loadCannon(patronType: Patron): Patron? {
        println("Подобарли патроны $patronType")
        patronTypeInTank = patronType
        return patronTypeInTank
    }

    fun startShooting(patron: Patron = patronTypeInTank!!) = println("Выстрел! Нанесён ущерб ${getDamage(patron)}")
}

fun main() {
    val tank = Tank()

    tank.loadCannon(Patron.BLUE)
    tank.startShooting()

    tank.loadCannon(Patron.GREEN)
    tank.startShooting()

    tank.loadCannon(Patron.RED)
    tank.startShooting()
}

const val FIVE = 5
const val TEN = 10
const val TWENTY = 20
