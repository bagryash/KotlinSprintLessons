package org.example.lesson_15

abstract class User(
    val id: Int,
    val image: Int,
    val name: String,
) {
    fun createMessage(
        id: Int,
        user: User,
        message: String,
    ): String {
        val newMessage = "${user.name}: $message"
        println(newMessage)
        return newMessage
    }

    fun readChat(chat: MutableList<String>) {
        chat.forEach {
            println(it)
        }
    }
}

class SimpleUser(
    id: Int,
    image: Int,
    name: String,
) : User(id, image, name)

class Admin(
    id: Int,
    image: Int,
    name: String,
) : User(id, image, name) {
    fun deleteMessage(deleteMessage: String): String {
        val deleteMessege = deleteMessage
        println("Модератор удалил сообщение")
        return deleteMessege
    }

    fun deleteUser(user: SimpleUser): SimpleUser {
        val deleteUser = user
        println("Модератор удалил пользователя ${user.name}")
        return deleteUser
    }
}

fun main() {
    val usersList = mutableListOf<User>()
    val robotBender = Admin(1, 1, "robot Bender")
    usersList += robotBender
    val userAlex = SimpleUser(2, 2, "Alex")
    usersList += userAlex
    usersList.forEach {
        println(it.name + ": " + it::class.simpleName)
    }
    println()

    val chat = mutableListOf<String>()
    val message1 = robotBender.createMessage(1, robotBender, "Добро пожаловать в наш чат, Alex")
    chat += message1
    val message2 = userAlex.createMessage(2, userAlex, "Всем привет!")
    chat += message2
    val message3 = robotBender.createMessage(3, robotBender, "Ты здесь зачем?")
    chat += message3
    val message4 = userAlex.createMessage(4, userAlex, "Я здесь просто так")
    chat += message4
    val deleteMessage1 = robotBender.deleteMessage(message4)
    chat -= deleteMessage1
    println()
    userAlex.readChat(chat)
    println()
    robotBender.readChat(chat)
    println()
    val deleteUser = robotBender.deleteUser(userAlex)

    usersList -= deleteUser
    usersList.forEach {
        println(it.name + ": " + it::class.simpleName)
    }
}
