package org.example.Lesson_16

class User(
    val userLogin: String,
    private val userPassword: String,
) {
    fun getPassword() = userPassword
}

fun main() {
    val userAlex = User("alex@mail.mail", "85.)-3+63)94")

    fun checkLoginPassword() {
        val login = readln()
        if (login == userAlex.userLogin) {
            println("Введите пароль:")
            val password = readln()
            if (password == userAlex.getPassword()) {
            }
        }
    }
}
