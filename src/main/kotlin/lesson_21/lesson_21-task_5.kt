package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String {
    var v = 0
    var k: String? = null

   forEach {
        if (it.value > v) {
            v = it.value
            k = it.key
        }
    }
    return k!!
}

fun main() {
    val experience =
        mapOf(
            "скорость" to 79,
            "удары" to 81,
            "передачи" to 77,
            "дриблинг" to 75,
            "защита" to 79,
            "физ подготовка" to 84,
        )

    experience.maxCategory()
}
