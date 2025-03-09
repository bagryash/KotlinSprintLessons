package org.example.lesson_9

fun main() {
    val listOfIngredients =
        listOf(
            "Мука",
            "Молоко",
            "Яйца",
            "Сахар",
            "Соль",
            "Растительное масло",
            "Сода",
        )

    println("В рецепте есть следующие ингредиенты: ")
    for (i in listOfIngredients) {
        println(i)
    }
}
