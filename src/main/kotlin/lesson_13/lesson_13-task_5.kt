package org.example.lesson_13

class ContactPhoneBook(
    val name: String,
    val phoneNumber: Long?,
    var company: String?,
) {
    init {
        phoneNumber ?: println("Вы не ввели номер телефона. Контакт не добавлен")
    }
}

fun main() {
    val phoneBook = mutableListOf<ContactPhoneBook>()

    println("Введите последовательно имя контакта, номер телефона и его компанию:")

    try {
        val contactPhone =
            ContactPhoneBook(
                readln(),
                readln().toLong(),
                readln(),
            )
    } catch (e: NumberFormatException) {
        println(e::class.simpleName)
    }
}
