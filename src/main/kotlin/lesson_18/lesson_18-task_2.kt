package org.example.lesson_18

abstract class Dice(
    val numberOfFaces: Int,
    val range: IntRange = ONE..numberOfFaces,
) {
    open fun rollDice() = println()
}

class FourSidedDice : Dice(4) {
    override fun rollDice() = println((range).random())
}

class HexagonalDice : Dice(6) {
    override fun rollDice() = println((range).random())
}

class OctahedralDice : Dice(8) {
    override fun rollDice() = println((range).random())
}

fun main() {
    val dice4: Dice = FourSidedDice()
    val dice6: Dice = HexagonalDice()
    val dice8: Dice = OctahedralDice()

    val diceList: List<Dice> = listOf(dice4, dice6, dice8)

    diceList.forEach { it.rollDice() }
}

const val ONE = 1
