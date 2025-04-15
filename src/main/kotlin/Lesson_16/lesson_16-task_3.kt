package org.example.Lesson_16

class User(
    private val userLogin: String,
    private val userPassword: String,
) {
    fun checkPassword(password: String): Boolean = password == userPassword
}

fun main() {
    val userAlex = User("alex@mail.mail", "85.)-3+63)94")

    fun enterPassword(): String = readln()

    if (userAlex.checkPassword(enterPassword()) == true) {
        println("Добро пожаловать!")
    } else {
        println("Вход запрещен")
    }
}
