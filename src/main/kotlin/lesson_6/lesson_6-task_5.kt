package org.example.lesson_6

fun main() {
    val sumForCheck = (1..10).random()
    println("Введите для проверки 2 простых числа, сумма которых равно $sumForCheck")
    var counter = 3

    println("Первое число:")
    var numberOne = readln().toInt()
    println("Второе число:")
    var numberTwo = readln().toInt()
    counter--

    while (numberOne + numberTwo != sumForCheck && counter > ZERO) {
        println("У вас еще попыток: $counter")
        println("Первое число:")
        numberOne = readln().toInt()
        println("Второе число:")
        numberTwo = readln().toInt()
        counter--
    }

    if (numberOne + numberTwo == sumForCheck) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}

