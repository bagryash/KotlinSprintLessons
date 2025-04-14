package org.example.Lesson_16

class User(
    val userLogin: String,
    private val userPassword: String,
) {
    fun getPassword() = userPassword
}

fun main() {
    val userAlex = User("alex@mail.mail", "85.)-3+63)94")

    fun checkCredentials(
        login: String = readln(),
        password: String = readln(),
    ): Boolean = login == userAlex.userLogin && password == userAlex.getPassword()

    println("Введите по очереди логин и пароль:")
    if (checkCredentials() == true) println("Добро пожаловать!")
    else println("Доступ запрещен")
}
