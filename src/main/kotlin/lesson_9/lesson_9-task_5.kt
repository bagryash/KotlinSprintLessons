package org.example.lesson_9

import java.util.*

fun main() {
    val range = 1..5
    println("Введите ингредиенты по одному:")
    val usersIngredientsSet = mutableSetOf<String>()
    for (i in range) {
        val ingredient = readln()
        usersIngredientsSet.add(ingredient)
    }
    val usersIngredientsList = usersIngredientsSet.toMutableList()
    usersIngredientsList.sort()
    for (i in range) {
        if (i == 1) print((usersIngredientsList[i-1].replaceFirstChar {
            if (it.isLowerCase()) it.titlecase(Locale.getDefault())
            else it.toString() }))
        else print(", " + usersIngredientsList[i-1])
    }
}
