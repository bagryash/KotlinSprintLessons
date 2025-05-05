package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String {
    var skillMax = 0
    var numberOfExperience: String? = null
    forEach {
        if (it.value > skillMax) {
            skillMax = it.value
            numberOfExperience = it.key
        }
    }
    return numberOfExperience!!
}

fun main() {
    val experience =
        mapOf(
            "скорость" to 79,
            "удары" to 84,
            "передачи" to 77,
            "дриблинг" to 75,
            "защита" to 79,
            "физ подготовка" to 84,
        )

    println(experience.maxCategory())
}
