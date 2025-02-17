package org.example.lesson_3

fun main() {

//    val userName = "Иван"
//    val goodText = "Добрый"
//    val dayText = "день"
//    val nightText = "вечер"
//
//    var greetingsText = println("$goodText $dayText, $userName!")
//    greetingsText = println("$goodText $nightText, $userName!")

    val userName = "Иван"
    val timesOfDayText = "день"
    val goodText = "Добрый $timesOfDayText, $userName"
    var greetingsText = println(goodText)

    val nightText = "вечер"
    greetingsText = println(goodText)

}