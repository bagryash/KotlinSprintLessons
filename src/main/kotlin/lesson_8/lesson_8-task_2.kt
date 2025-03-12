package org.example.lesson_8

fun main() {
    val arrayOfIngredients =
        arrayOf(
            "Свинина",
            "Говядина",
            "Морковь",
            "Капуста",
            "Лук репчатый",
            "Свекла",
            "Картошка",
            "Перец горошком",
            "Лавровый лист",
            "Петрушка",
            "Укроп",
            "Соль",
            "Вода",
        )

    println("Введите игредиент, который хотите найти:")
    val desiredIngredient = readln()
    var isIngredientInArray = false
    for (i in arrayOfIngredients) {
        if (desiredIngredient == i) {
            isIngredientInArray = true
        }
    }
    if (isIngredientInArray == true) {
        println("Ингредиент $desiredIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
