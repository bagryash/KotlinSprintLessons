package org.example.lesson_20

class Player(
    val name: String,
    var health: Int,
    val healthMax: Int = HUNDRED,
)

fun main() {
    val healingPotion: (Player) -> Unit = {
        it.health += FIFTEEN
        if (it.health > it.healthMax) it.health = it.healthMax
    }
    val player = Player("alex", 60)

    healingPotion(player)

    println(player.health)

}

const val HUNDRED = 100
const val FIFTEEN = 15
