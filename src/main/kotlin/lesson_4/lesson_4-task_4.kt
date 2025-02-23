package org.example.lesson_4

fun main() {
    var day = 5
    val isEven = day % 2 == 0

    println(
        "Упражнения для рук:    " + !isEven +
            "\nУпражнения для ног:    " + isEven +
            "\nУпражнения для спины:  " + isEven +
            "\nУпражнения для пресса: " + !isEven,
    )
}
