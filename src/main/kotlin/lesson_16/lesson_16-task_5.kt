package org.example.Lesson_16

class Player(
    val nave: String,
    private var health: Int = HEALTH_MAX,
    private var impactForce: Int = IMPACT_FORCE,
) {
    var powerOfTreatment = POWER_OF_TREATMENT

    fun setHealthAfterImpact() {
        println("Ты пропустил удар! -${impactForce}hp")
        health -= impactForce
        if (health <= NUMBER_ZERO) setImpactForceInDeath()
    }

    fun setHealthAfterTreatment() {
        if (health > NUMBER_ZERO) {
            println("Тебя подлечили! +${powerOfTreatment}hp")
            health += powerOfTreatment
            if (health > HEALTH_MAX) health = HEALTH_MAX
        }
    }

    private fun setImpactForceInDeath() {
        impactForce = NUMBER_ZERO
        health = NUMBER_ZERO
        powerOfTreatment = NUMBER_ZERO
    }
}

fun main() {
    val alex = Player("Alex")

    println("Fight!")

    while (alex.powerOfTreatment > 0) {
        alex.setHealthAfterImpact()
        alex.setHealthAfterTreatment()
    }

    println("GAME OVER")
}

const val HEALTH_MAX = 100
const val NUMBER_ZERO = 0
const val IMPACT_FORCE = 20
const val POWER_OF_TREATMENT = 10
