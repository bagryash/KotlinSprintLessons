package org.example.lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateAndTimeOfEvent: String,
    val distanceToEarth: Double,
)

fun main() {
    val alphaCentauri =
        GalacticGuide(
            "Альфа Центавра",
            "Прилетел метеорит",
            "2023-10-25T17:03:00+02:00",
            4.36,
        )

    val (alphaCentauriName, alphaCentauriDescription, alphaCentauriDateAndTimeOfEvent, alphaCentauriDistanceToEarth) = alphaCentauri

    println(
        """
        Название места или события: $alphaCentauriName
        Описание места или события: $alphaCentauriDescription
        Дата и Время: $alphaCentauriDateAndTimeOfEvent
        Расстояние места до Земли,с.л.: $alphaCentauriDistanceToEarth
        """.trimIndent(),
    )
}
