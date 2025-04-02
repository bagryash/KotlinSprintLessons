package org.example.lesson_13

class PhoneBookContact(
    val name: String,
    val phoneNumber: Long?,
    var company: String?,
) {
    init {
        phoneNumber ?: println("Вы не ввели номер телефона. Контакт не добавлен")
    }
}

fun main() {
    val phoneBook = mutableListOf<PhoneBookContact>()

    println("Введите последовательно имя контакта, номер телефона и его компанию:")
    val contactPhone =
        PhoneBookContact(
            readln(),
            readln().toLongOrNull(),
            readln(),
        )
    if (contactPhone.company == "") contactPhone.company = null
    if (contactPhone.phoneNumber != null) phoneBook += contactPhone

    phoneBook.forEach {
        println(it.name)
        println(it.phoneNumber)
        println(it.company)
    }

}
