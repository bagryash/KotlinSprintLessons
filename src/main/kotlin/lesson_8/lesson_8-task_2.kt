package org.example.lesson_8

fun main() {
    var arrayOfIngredients =
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
    var y = false

    for (i in arrayOfIngredients) {
        val x = desiredIngredient == i
        if (x == true) {
            y = true
        }
    }
    if (y == true) {
        println("Ингредиент $desiredIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
