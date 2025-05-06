package org.example.lesson_21

class Player(
    val name: String,
    var health: Int,
    val healthMax: Int = HUNDRED,
)

fun Player.isHealthy(): Boolean = (health == healthMax)

fun main() {
    val healingPotion: (Player) -> Unit = {
        it.health += FORTY
        if (it.health > it.healthMax) it.health = it.healthMax
    }

    val alex = Player("alex", 60)
    println(alex.isHealthy())

    healingPotion(alex)
    println(alex.isHealthy())
}

const val HUNDRED = 100
const val FORTY = 40
