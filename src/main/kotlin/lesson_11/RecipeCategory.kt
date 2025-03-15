package org.example.lesson_11

import java.awt.Image

class RecipeCategory(
    val id: Int,
    val image: Image,
    val categoryName: String,
) {}

class Recipe(
    val id: Int,
    val image: Image,
    val category: String,
    val ingredientsList: List<String>,
    val methodOfPreparation: List<String>,
    var isInFavorites: Boolean = false
) {}


class Ingredient(
    val id: Int,
    var name: String,
    val volume: Int,
    val
) {}

