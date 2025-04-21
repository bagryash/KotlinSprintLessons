package org.example.lesson_17

class UserData(
    private var login: String,
    private var password: String,
) {
    var userLogin: String
        get() = login
        set(value) {
            login = value
            println("Логин успешно изменен")
        }

    var userPassword: String
        get() {
            var starPassword = ""
            for (i in password.iterator()) {
                starPassword += "*"
            }
            return starPassword
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user = UserData("alex", "47-2874*5398")

    println(user.userPassword)
    user.userPassword = "djfhjdhf93883"

    println(user.userLogin)
    user.userLogin = "Alex"
    println(user.userLogin)
}
