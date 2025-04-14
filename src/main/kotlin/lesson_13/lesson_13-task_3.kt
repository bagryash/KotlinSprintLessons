package org.example.lesson_13

class TelephoneDirectoryWithAllRecords(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() =
        println(
            "- Имя: $name\n" +
                "- Номер: $phoneNumber\n" +
                "- Компания: ${company ?: "не указано"}",
        )
}

fun main() {
    val contactsList = mutableListOf<TelephoneDirectoryWithAllRecords>()

    val inessaPhone = TelephoneDirectoryWithAllRecords("Инесса", 88002500890, null)
    contactsList += inessaPhone
    val tigranPhone = TelephoneDirectoryWithAllRecords("Тигран", 88002509639, "Яндекс")
    contactsList += tigranPhone
    val artemyPhone = TelephoneDirectoryWithAllRecords("Артемий", 84959261800, "Студия Лебедева")
    contactsList += artemyPhone
    val evgeniyPhone = TelephoneDirectoryWithAllRecords("Евгений", 88007008811, null)
    contactsList += evgeniyPhone
    val dmitryPhone = TelephoneDirectoryWithAllRecords("Дмитрий", 848001006427, "null")
    contactsList += dmitryPhone

    val allCompanyList: MutableSet<String> =
        contactsList
            .mapNotNull {
                it.company
            }.toMutableSet()

    println("Список всех компаний:")
    allCompanyList.forEach {
        println(it)
    }
}
