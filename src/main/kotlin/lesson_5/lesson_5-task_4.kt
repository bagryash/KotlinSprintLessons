package org.example.lesson_5

import java.lang.Thread.sleep

fun main() {
    val userName = "Zaphod"
    val userPassword = "PanGalactic"

    println(
        """ |Внимание, пассажир.
            |Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "$SPACESHIP_NAME".
            |
            |Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. 
            |Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь.
            |
            |Да, вперед, пожалуйста, вводите свои данные...
        """.trimMargin(),
    )

    println("Ваше имя:")
    val userEnteredName = readln()

    if (userEnteredName == userName) {
        println("Ваш пароль:")
        val userEnteredPassword = readln()
        if (userEnteredPassword == userPassword) {
            sleep(1000)
            println(
                """|Ваши данные проверены, и о, чудо, они верны... "
                   |Пользователь "$userName", вам разрешено входить на борт корабля "$SPACESHIP_NAME". 
                   |Хотя мне всё равно... 
                   |Ну вперед, войдите... Если вам так уж надо, в конце концов... 
                   |
                   |Надеюсь, вам понравится пребывание здесь больше, чем мне.", 
                """.trimMargin(),
            )
        } else {
            println("Неверный пароль!")
        }
    } else {
        println("Пожалуйста зарегистрируйтесь!")
    }
}

const val SPACESHIP_NAME = "Heart of Gold"
