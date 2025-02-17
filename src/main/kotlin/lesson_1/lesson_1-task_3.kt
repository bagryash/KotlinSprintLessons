package org.example.lesson_1

fun main() {

    val year = 1961

    var hour: String
    var minute: String

    hour = "09"
    minute = "07"

    println("""$year 
    |$hour
    |$minute
    """.trimMargin(),
    )

    hour = "10"
    minute = "55"

    println("$hour:$minute")

}