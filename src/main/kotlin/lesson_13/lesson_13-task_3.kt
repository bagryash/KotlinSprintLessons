package org.example.lesson_13

class TelephoneDirectoryWithAllRecords(
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



fun main() {
    val contactsList = mutableListOf<TelephoneDirectoryWithAllRecords>()

    val inessaPhone = TelephoneDirectoryWithAllRecords("Инесса", 88002500890, null)
    contactsList += inessaPhone
    val tigranPhone = TelephoneDirectoryWithAllRecords("Тигран", 88002509639, "Яндекс")
    contactsList += tigranPhone
    val artemyPhone = TelephoneDirectoryWithAllRecords("Артемий", 84959261800, "Студия Лебедева")
    contactsList += artemyPhone
    val evgeniyPhone = TelephoneDirectoryWithAllRecords("Артемий", 88007008811, null)
    contactsList += evgeniyPhone
    val dmitryPhone = TelephoneDirectoryWithAllRecords("Артемий", 848001006427, "null")
    contactsList += dmitryPhone
}
