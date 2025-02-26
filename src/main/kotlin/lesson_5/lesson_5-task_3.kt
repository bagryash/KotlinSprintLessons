package org.example.lesson_5

fun main() {
    val numberOne = 4
    val numberTwo = 17

    println("Введите первое число от 0 до 42:")
    val userNumberOne = readln().toInt()
    println("Введите второе число от 0 до 42:")
    val userNumberTwo = readln().toInt()

    when (userNumberOne) {
        numberOne ->
            if (userNumberTwo == numberTwo) {
                println("Поздравляем! Вы выиграли главный приз!")
            } else {
                println("Вы выиграли утешительный приз!")
            }

        numberTwo ->
            if (userNumberTwo == numberOne) {
                println("Поздравляем! Вы выиграли главный приз!")
            } else {
                println("Вы выиграли утешительный приз!")
            }

        else ->
            if (userNumberTwo == numberOne) {
                println("Вы выиграли утешительный приз!")
            } else if (userNumberTwo == numberTwo) {
                println("Вы выиграли утешительный приз!")
            } else {
                println("Неудача!")
            }
    }
}
