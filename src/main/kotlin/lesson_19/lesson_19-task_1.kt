package org.example.lesson_19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {
    println("В аквариуме есть рыбы:")
    for (i in Fish.values()) println(i)
}
