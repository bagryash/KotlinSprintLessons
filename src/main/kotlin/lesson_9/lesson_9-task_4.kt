package org.example.lesson_9

fun main() {
    println("Введите 5 ингредиентов, перечисленных через \", \"")
    val usersIngredients = readln()
    val usersIngredientsList = usersIngredients.split(", ")
    val sortedProducts = usersIngredientsList.sorted()
    println(sortedProducts)
}
