package org.example.lesson_5

fun main() {

    val numberOne = 4
    val numberTwo = 17

    println("Введите первое число от 0 до 42:")
    val userNumberOne = readln().toInt()
    println("Введите второе число от 0 до 42:")
    val userNumberTwo = readln().toInt()

    if (userNumberOne == numberOne)
        if (userNumberTwo == numberTwo) println("Поздравляем! Вы выиграли главный приз!")
        else println("Вы выиграли утешительный приз!")
    else if (userNumberOne == numberTwo)
        if (userNumberTwo == numberOne) println("Поздравляем! Вы выиграли главный приз!")
        else println("Вы выиграли утешительный приз!")
    else if (userNumberTwo == numberOne) println("Вы выиграли утешительный приз!")
    else if (userNumberTwo == numberTwo) println("Вы выиграли утешительный приз!")
    else println("Неудача!")

    when (userNumberOne) {
        numberOne -> when (userNumberTwo) {
            numberTwo -> println("Поздравляем! Вы выиграли главный приз!")
            else -> println("Вы выиграли утешительный приз!")
        }

        numberTwo -> when (userNumberTwo) {
            numberOne -> println("Поздравляем! Вы выиграли главный приз!")
            else -> println("Вы выиграли утешительный приз!")
        }

        else -> when (userNumberTwo) {
            numberOne -> println("Вы выиграли утешительный приз!")
            numberTwo -> println("Вы выиграли утешительный приз!")
            else -> println("Неудача!")
        }
    }
}



