package org.example.lesson_18

abstract class Tamagotchi(
    val name: String,
    val food: String,
) {
    fun sleep() = println("$name -> спит")

    fun eatFood() = println("$name -> ест $food")
}

class Dog(
    name: String,
) : Tamagotchi(name, food = "кости")

class Cat(
    name: String,
) : Tamagotchi(name, food = "рыба")

class Fox(
    name: String,
) : Tamagotchi(name, food = "ягоды")

fun main() {
    val dog: Tamagotchi = Dog("Шарик")
    val cat: Tamagotchi = Cat("Барсик>")
    val fox: Tamagotchi = Fox("Рыжик")

    val animalList = listOf(dog, cat, fox)

    animalList.forEach { it.sleep() }

    animalList.forEach { it.eatFood() }
}
