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

    for (i in arrayOfIngredients) {
        println(i)
    }

    println("Введите ингредиент, который хотите заменить:")
    val deleteIngredient = readln()
    val indexOfDeleteIngredient = arrayOfIngredients.indexOf(deleteIngredient)

    if (deleteIngredient !in arrayOfIngredients) {
        println("Ингредиента $deleteIngredient нет в рецепте")
    } else {
        println("Введите ингредиент, который хотите добавить:")
        val newIngredient = readln()
        arrayOfIngredients[indexOfDeleteIngredient] = newIngredient
        val arrayInString = arrayOfIngredients.joinToString(prefix = "[", postfix = "]")
        println("Готово! Вы сохранили следующий список: $arrayInString")
    }
}
