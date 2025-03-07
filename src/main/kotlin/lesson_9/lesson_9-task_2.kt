package org.example.lesson_9

fun main() {
    val listOfIngredients = mutableListOf("Яйца", "соль", "сливочное масло")
    println("В рецепте есть базовые ингредиенты: $listOfIngredients")

    println("Желаете добавить еще?")
    val usersAnswer = readln()
    if (usersAnswer.equals(YES, ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        listOfIngredients.add(newIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
    }
}

const val YES = "да"
