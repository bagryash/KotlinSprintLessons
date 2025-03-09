package org.example.lesson_9

fun main() {
    val quantityOfIngredientsList = listOf(2, 50, 15)

    println("Сколько порций вы хотите приготовить?:")
    val numberOfServings = readln().toInt()
    val quantityOfIngredientsForUser =
        quantityOfIngredientsList.map {
            it * numberOfServings
        }

    println(
        "На $numberOfServings порции вам понадобится: " +
            "Яиц – ${quantityOfIngredientsForUser[0]}," +
            " молока – ${quantityOfIngredientsForUser[1]}, " +
            "сливочного масла – ${quantityOfIngredientsForUser[2]},",
    )
}
