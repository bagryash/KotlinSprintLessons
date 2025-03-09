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

    println("Введите ингредиент, который хотите найти:")
    val desiredIngredient = readln()
    if (arrayOfIngredients.contains(desiredIngredient)) {
        println("Ингредиент $desiredIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
