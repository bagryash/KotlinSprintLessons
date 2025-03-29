package org.example.lesson_11

import java.awt.Image

class RecipeCategory(
    val id: Int,
    var image: Image,
    var categoryName: String,
    var description : String,
    var recipeList : List<Recipe>
) {}

class Recipe(
    val id: Int,
    var image: Image,
    var category: String,
    var ingredientsList: List<Ingredient>,
    var methodOfPreparation: List<String>,
    var isInFavorites: Boolean = false
) {}

class Ingredient(
    val id: Int,
    var name: String,
    val quantity : Int
) {}

