package org.example.lesson_11

class RecipeCategory(
    val id:Int,
    val category: String,
) {
}

class Recipe(
    val id:Int,
    val ingredients: List<String>,
    val category : String,
) {
}


class Ingredient(
    val id:Int,
    val ingredientName : String,
    val quantity : Int,
) {
}

