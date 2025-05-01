package org.example.lesson_20

class GamePlayer(
    val name: String,
    var hasKey: Boolean = false,
) {
    fun takeKey() {
        hasKey = true
        println("Кюч теперь у тебя!")
    }
}

fun main() {
    val checkKey: (GamePlayer) -> Unit = { player: GamePlayer ->
        if (player.hasKey == true) {
            println("Игрок открыл дверь")
        } else {
            println("Дверь заперта")
        }
    }

    val player = GamePlayer("Паспарту")

    checkKey(player)

    player.takeKey()
    checkKey(player)
}
