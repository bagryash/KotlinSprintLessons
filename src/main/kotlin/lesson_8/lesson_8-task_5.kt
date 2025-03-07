package org.example.lesson_8

fun main() {
    println("введите размер массива:")
    val usersArraySize = readln().toInt()
    val arrayOfIngredients =
        Array(usersArraySize) { index ->
            readln()
        }

    for (i in arrayOfIngredients) {
        print("$i, ")
    }
}
