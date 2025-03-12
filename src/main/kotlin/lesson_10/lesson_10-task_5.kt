package org.example.lesson_10

fun main() {
    println("Введите ваш логин")
    val userEnterLogin = readln()
    println("Введите ваш логин")
    val userEnterPassword = readln()

    val result: Map<String, Int>? = giveListOfGoods(performAuthorization(userEnterLogin, userEnterPassword))
    result ?: println("Вы ввели неправильный логин или пароль")
    if (result != null) println(result)
}

fun performAuthorization(
    login: String,
    password: String,
): String? {
    val range = 1..3
    val rangeCapitalLetters = 'A'..'Z'
    val rangeLowercaseLetters = 'a'..'z'
    val rangeNumber = 1..9
    var token = ""
    var randomCharacters = ""

    if (login == USER_LOGIN && password == USER_PASSWORD) {
        for (i in ONE..THIRTY_TWO) {
            val randomCharactersInPassword = (range).random()
            when (randomCharactersInPassword) {
                1 -> randomCharacters = (rangeCapitalLetters).random().toString()
                2 -> randomCharacters = (rangeLowercaseLetters).random().toString()
                3 -> randomCharacters = (rangeNumber).random().toString()
            }
            token += randomCharacters
        }
        return token
    } else {
        return null
    }
}

fun giveListOfGoods(token: String?): Map<String, Int>? {
    val goodsInCart =
        mapOf(
            "Смартфон Pixel 8" to 45000,
            "Чехол силиконовый противоударный" to 300,
            "Чехол с MagSafe" to 450,
        )
    if (token == null) {
        return null
    } else {
        return goodsInCart
    }
}

const val USER_LOGIN = "user@mail.com"
const val USER_PASSWORD = "Qwerty2025"
const val ONE = 1
const val THIRTY_TWO = 32
