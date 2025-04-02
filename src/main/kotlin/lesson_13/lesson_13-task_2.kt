package org.example.lesson_13

class PhoneDirectoryWithPrint(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printInfo() =
        println(
                "- Имя: $name\n" +
                "- Номер: $phoneNumber\n" +
                "- Компания: ${company ?: "не указано"}",
        )
}

fun main() {
    val inessaPhone = PhoneDirectoryWithPrint("Инесса", 88002500890)
    inessaPhone.printInfo()
}
