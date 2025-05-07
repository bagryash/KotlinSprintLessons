package org.example.lesson_22

class BookRegular(
    val title: String,
    val author: String,
)

data class BookData(
    val title: String,
    val author: String,
)

fun main() {
    val book1 = BookRegular("Географ глобус пропил", "А.В. Иванов")
    val book2 = BookData("Облако в штанах", "В.В. Маяковский")

    println(book1)
// у обычного класса распечатается строковое представление объекта по умолчанию
// тк метод toString() не переопределён и используется реализация метода по умолчанию (наследованная от класса Any)
// org.example.lesson_22.BookRegular@6e8cf4c6
    println(book2)
// у дата класса распечатается в стандартном виде c названием и значениями свойств
// BookData(title=Облако в штанах, author=В.В. Маяковский)
}
