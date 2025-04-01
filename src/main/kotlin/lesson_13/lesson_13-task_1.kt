package org.example.lesson_13

class PhoneDirectory(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {
    val inessaPhone = PhoneDirectory("Инесса", 88002500890, null)
}
