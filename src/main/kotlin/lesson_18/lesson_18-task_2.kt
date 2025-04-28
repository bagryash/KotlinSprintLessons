package org.example.lesson_18

abstract class Dice(
    numberOfFaces: Int,
) {
    val range: IntRange = ONE..numberOfFaces

    fun rollDice() = println((range).random())
}

class FourSidedDice : Dice(4)

class HexagonalDice : Dice(6)

class OctahedralDice : Dice(8)

fun main() {
    val dice4: Dice = FourSidedDice()
    val dice6: Dice = HexagonalDice()
    val dice8: Dice = OctahedralDice()

    val diceList: List<Dice> = listOf(dice4, dice6, dice8)

    diceList.forEach { it.rollDice() }
}

const val ONE = 1
