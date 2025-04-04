package org.example.lesson_13

class PhoneBookContact(
    val name: String,
    val phoneNumber: Long?,
    var company: String?,
)

class PhoneBook(
    val contacts: MutableList<PhoneBookContact> = mutableListOf(),
) {
    fun addContact(
        _name: String = readln(),
        _phoneNumber: Long? = readln().toLongOrNull(),
        _company: String? = readln(),
    ) {
        val newContact = PhoneBookContact(_name, _phoneNumber, _company)
        if (_company == "") newContact.company = null
        if (_phoneNumber == null) {
            println("Вы не ввели номер телефона. Контакт не добавлен")
        } else {
            contacts += newContact
        }
    }
}

fun main() {
    val phoneBook = PhoneBook()

    val newContact = phoneBook.addContact()

    phoneBook.contacts.forEach {
        println(it.name)
        println(it.phoneNumber)
        println(it.company)
    }
}
