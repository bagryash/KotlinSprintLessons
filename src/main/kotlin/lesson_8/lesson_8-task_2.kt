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

    for (i in arrayOfIngredients) {
        if (desiredIngredient == i) {
            println("Ингредиент $desiredIngredient в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}
