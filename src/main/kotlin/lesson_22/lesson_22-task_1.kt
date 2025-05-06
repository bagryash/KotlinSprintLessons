package org.example.lesson_22

class RegularBook(
    val title: String,
    val author: String,
)

data class DataBook(
    val title: String,
    val author: String,
)

fun main() {
    val book1 = RegularBook("Евгений Онегин", "А.С. Пушкин")
    val book2 = RegularBook("Евгений Онегин", "А.С. Пушкин")

    val dataBook = DataBook("Преступление и наказание", "Ф.M. Достоевский")
    val dataBook2 = DataBook("Преступление и наказание", "Ф.M. Достоевский")

    println(book1 == book2) // здесь сравниваются ссылки на объекты
    println(dataBook == dataBook2) // здесь сравниваются значения
}
