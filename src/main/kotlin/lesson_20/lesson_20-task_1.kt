package org.example.lesson_1

fun main() {
    val splashScreen: (String) -> String = { userName: String ->
        "С наступающим Новым Годом, $userName!"
    }

    println(splashScreen("Alex"))
}
