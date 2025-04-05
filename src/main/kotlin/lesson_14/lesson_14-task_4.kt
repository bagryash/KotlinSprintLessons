package org.example.lesson_14

abstract class SpaceObject(
    val name: String,
    val hasAtmosphere: Boolean,
    val isSuitableForLanding: Boolean,
)

class Planet(
    _name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    val moonList: MutableSet<Moon> = mutableSetOf(),
) : SpaceObject(_name, hasAtmosphere, isSuitableForLanding) {
    val planetName = _name

    fun createMoon(
        name: String,
        planet: String = planetName,
        hasAtmosphere: Boolean,
        isSuitableForLanding: Boolean,
    ): Moon {
        val newMoon = Moon(name, planet, hasAtmosphere, isSuitableForLanding)
        moonList += newMoon
        return newMoon
    }


}

class Moon(
    name: String,
    val planet: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
) : SpaceObject(name, hasAtmosphere, isSuitableForLanding)

fun main() {
}
