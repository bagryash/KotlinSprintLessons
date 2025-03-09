package org.example.lesson_8

fun main() {
    println("Введите размер массива:")
    val usersArraySize = readln().toInt()
    println("Введите ингредиенты(по одному):")
    val arrayOfIngredients =
        Array(usersArraySize) { index ->
            readln()
        }

    for (i in arrayOfIngredients) {
        print("$i, ")
    }
}
