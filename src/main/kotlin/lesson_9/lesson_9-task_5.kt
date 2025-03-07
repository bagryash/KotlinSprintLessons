package org.example.lesson_9

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
    val firstIngredient =
        usersIngredientsList[0].capitalize()
    usersIngredientsList[0] = firstIngredient
    println(usersIngredientsList)
}
