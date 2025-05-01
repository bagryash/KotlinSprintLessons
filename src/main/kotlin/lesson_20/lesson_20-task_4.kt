package org.example.lesson_20

fun main() {
    val list = listOf("Влево", "Вправо", "Вперёд", "Назад")

    val lambdaList = list.map { { println("Нажат элемент $it") } }

    for (i in lambdaList.indices) {
        if (i % 2 != 0) lambdaList[i].invoke()
    }
}
