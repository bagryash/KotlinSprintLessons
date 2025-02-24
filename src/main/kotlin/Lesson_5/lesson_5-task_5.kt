package org.example.lesson_5

fun main() {


    val numbers = mutableListOf((0..42).random(), (0..42).random(),(1..10).random()  )
    println("Введите три числа от 0 до 42")

val userNumber = mutableListOf(readln(), readln(), readln())

    println("Введите первое число от 0 до 42:")
    val userNumberOne = readln().toInt()
    println("Введите второе число от 0 до 42:")
    val userNumberTwo = readln().toInt()
    println("Введите третье число от 0 до 42:")
    val userNumberThree = readln().toInt()

    when (userNumberOne) {
        numbers[0] ->
            if ((userNumberTwo == numbers[1]) and (userNumberThree == numbers[2])) {
                println(THREE)
            }  else if ((userNumberTwo == numbers[2]) and (userNumberThree == numbers[1])){
                println(THREE)
            } else if  ((userNumberTwo == numbers[1]) ||  (userNumberThree == numbers[2])){
                println(TWO)
            }  else if  ((userNumberTwo == numbers[2]) ||  (userNumberThree == numbers[1])) {
                println(TWO)
            } else println("Вы не угадали ни одного числа!")

        numbers[1] ->
            if ((userNumberTwo == numbers[0]) and (userNumberThree == numbers[2])) {
                println(THREE)
            }  else if ((userNumberTwo == numbers[2]) and (userNumberThree == numbers[0])){
                println(THREE)
            } else if  ((userNumberTwo == numbers[0]) ||  (userNumberThree == numbers[2])){
                println(TWO)
            }  else if  ((userNumberTwo == numbers[2]) ||  (userNumberThree == numbers[0])) {
                println(TWO)
            } else println("Вы не угадали ни одного числа!")



        numbers[2] ->
            if ((userNumberTwo == numbers[0]) and (userNumberThree == numbers[1])) {
                println(THREE)
            }  else if ((userNumberTwo == numbers[1]) and (userNumberThree == numbers[0])){
                println(THREE)
            } else if  ((userNumberTwo == numbers[0]) ||  (userNumberThree == numbers[1])){
                println(TWO)
            }  else if  ((userNumberTwo == numbers[1]) ||  (userNumberThree == numbers[0])) {
                println(TWO)
            } else println("Вы не угадали ни одного числа!")

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

const val THREE = "Поздравляем! Вы выиграли джекпот!!!"
const val TWO =  "Вы выиграли крупный приз!"
const val ONE =  "Вы выиграли утешительный приз!"
const val ZERO =  "Вы не угадали ни одного числа!"
