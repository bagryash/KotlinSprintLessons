package org.example.lesson_10

fun main() {
    println("Введите ваш логин")
    val userEnterLogin = readln()
    println("Введите ваш пароль")
    val userEnterPassword = readln()

    println(
        giveListOfGoods(performAuthorization(userEnterLogin, userEnterPassword))
            ?: "Вы ввели неправильный логин или пароль",
    )
}

fun generateToken(): String {
    val range = 1..3
    val rangeCapitalLetters = 'A'..'Z'
    val rangeLowercaseLetters = 'a'..'z'
    val rangeNumber = '1'..'9'
    var token = ""

    for (i in ONE..THIRTY_TWO) {
        val randomCharactersInPassword = range.random()
        val randomCharacters =
            when (randomCharactersInPassword) {
                1 -> rangeCapitalLetters.random()
                2 -> rangeLowercaseLetters.random().toString()
                else -> rangeNumber.random().toString()
            }
        token += randomCharacters
    }
    return token
}

fun performAuthorization(
    login: String,
    password: String,
): String? {
    if (login == USER_LOGIN && password == USER_PASSWORD) return generateToken()
    else return null
}

fun giveListOfGoods(token: String?): Map<String, Int>? {
    val goodsInCart =
        mapOf(
            "Смартфон Pixel 8" to 45000,
            "Чехол силиконовый противоударный" to 300,
            "Чехол с MagSafe" to 450,
        )
    return if (token == null) {
        null
    } else {
        goodsInCart
    }
}

const val ONE = 1
const val THIRTY_TWO = 32
const val USER_LOGIN = "user.user@mail.com"
const val USER_PASSWORD = "Qwerty1234"
