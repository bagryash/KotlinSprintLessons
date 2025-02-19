package org.example.lesson_4

fun main() {

    var rP = 1
    var nS = rP - 1

    val day = 5

    rP = rP + day - 1
    nS = nS + day

    println(rP)
    println(rP % 2)

    println(
        "Упражнения для рук: " + (rP % 2 == 1) + "\nУпражнения для ног: " + (nS % 2 == 0) + " \nУпражнения для спины: " + (nS % 2 == 0) + " \nУпражнения для пресса: " + (rP % 2 == 1)
    )

}