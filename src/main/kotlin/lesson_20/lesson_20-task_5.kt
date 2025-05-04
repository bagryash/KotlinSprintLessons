package org.example.lesson_20

class Robot(
    name: String,
) {
    fun setModifier(
        phrase: String,
        invertedPhrase: (String) -> String = { it.reversed() },
    ): String = invertedPhrase(phrase)

    val robotBenderPhrases =
        listOf(
            "Вы можете сказать, что я болтаю ерунду. Зато какую!",
            "Мне так стыдно. Я хочу, чтобы все умерли",
            "Грабить один банк три раза подряд?! Я восхищаюсь твоим стилем, Роберто!",
            "Не бейте меня!... Я предам кого угодно!",
            "Выше нос, кусок мяса!",
        )
}

fun main() {
    val bender = Robot("Bender")

    fun say(phrase: String): String {
        println(phrase)
        return phrase
    }

    say(bender.setModifier((bender.robotBenderPhrases).random()))
}
