package org.example.lesson_22

data class Film(
    val name: String,
    val director: String,
    val starring: List<String>,
    val year: Int,
)

fun main() {
    val film =
        Film(
            "Бриллиантовая рука",
            "Леонид Гайдай",
            listOf(
                "Юрий Никулин",
                "Андрей Миронов",
                "Анатолий Папанов",
                "Светлана Светличная",
                "Нина Гребешкова",
                "Нонна Мордюкова",
            ),
            1969,
        )

    val (filmName, filmDirector, filmStarring, filmYear) = film

    println(filmName)
    println(filmDirector)
    println(filmStarring)
    println(filmYear)
}
