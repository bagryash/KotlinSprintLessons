package org.example.lesson_21

class Player(
    val name: String,
    var health: Int,
    val healthMax: Int = HUNDRED,
)

fun Player.isHealthy(): Boolean {
    return if (health == healthMax) true
    else false
}


fun main() {


}

const val HUNDRED = 100