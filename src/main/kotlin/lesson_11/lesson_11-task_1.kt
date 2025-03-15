package org.example.lesson_11

fun main() {

    val userOne = User(id = 1, login = "User@777", password = "47-2874*5398", email = "user.one@email.com" )
    val userTwo = User(id = 2, login = "UsErTwO", password = "(28,730 -&5%", email ="user.two@email.com" )

    userOne.printUser()
    userTwo.printUser()
}