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

    println("Введите ингредиент, который хотите найти:")
    val desiredIngredient = readln()
    val y = arrayOfIngredients.indexOf(desiredIngredient)
    println(y)
    val x = desiredIngredient in arrayOfIngredients
    println(x)

    if (x == true) println()
    else println()

}


