package org.example.lesson_4

fun main() {

    var armsAndAbs = 0
    var legsAndBack = armsAndAbs + 1

    var day = 5

    armsAndAbs += day
    legsAndBack += day

    println(
        "Упражнения для рук:    " + (armsAndAbs % 2 != 0) + "\nУпражнения для ног:    " + (legsAndBack % 2 != 0) + " \nУпражнения для спины:  " + (legsAndBack % 2 != 0) + " \nУпражнения для пресса: " + (armsAndAbs % 2 != 0)
    )

}