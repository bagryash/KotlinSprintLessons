package org.example.lesson_11

class User {
}


class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String?
) {
    fun printUser() {
        println("$id, $login, $password, $email, $bio")
    }

    fun setBio() {
        println("Введите ваше био")
        bio = readln()
    }

    fun changePassword(){
        println("Введите ваш пароль:")
        val userEnterPassword = readln()
        if ( userEnterPassword == password) {
            println("Введите новый пароль")
            password = readln()
            println("Ваш пароль успешно изменен!")
        } else println("Вы ввели неверный пароль!")
    }
}