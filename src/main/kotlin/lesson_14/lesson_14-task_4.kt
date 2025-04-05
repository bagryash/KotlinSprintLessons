package org.example.lesson_14

abstract class SpaceObject(
    val name: String,
    val hasAtmosphere: Boolean,
    val isSuitableForLanding: Boolean,
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    val moonList: MutableSet<Moon> = mutableSetOf(),
) : SpaceObject(name, hasAtmosphere, isSuitableForLanding) {
    val planetName = name

    fun createMoon(
        name: String,
        hasAtmosphere: Boolean,
        isSuitableForLanding: Boolean,
        planet: String = planetName,
    ): Moon {
        val newMoon = Moon(name, hasAtmosphere, isSuitableForLanding, planet)
        moonList += newMoon
        return newMoon
    }

    fun printInfo() {
        print("Планета $planetName ")
        if (moonList.isNotEmpty()) {
            print("имеет спутники ")
            moonList.forEach { (print(it.name + " ")) }
        } else {
            println("не имеет спутников")
        }
    }

}

class Moon(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    val planet: String,
) : SpaceObject(name, hasAtmosphere, isSuitableForLanding)

fun main() {
    val mars = Planet("Марс", true, true)

    mars.createMoon("Фобос", false, false)
    mars.createMoon("Деймос", false, false)

    mars.printInfo()
}
