package org.example.lesson_15

abstract class User(
    val id: Int,
    val image: Int,
    val name: String,
) {
    val userName = name

    abstract fun showActions()

    fun writeMessage(
        id: Int,
        message: String,
    ) = println("$userName: $message")

    fun readChat() = println("$name читает чат")
}

class SimpleUser(
    id: Int,
    image: Int,
    name: String,
) : User(id, image, name) {
    override fun showActions() = println("Обычный пользователь $name: читает форум, пишет сообщения")
}

class Admin(
    id: Int,
    image: Int,
    name: String,
) : User(id, image, name) {
    val adminName = name

    override fun showActions() = println("Модератор $name: читает форум, пишет сообщения, удаляет пользователей, удаляет сообщения\"")

    fun deleteMessage(deleteMessage: String): String {
        val deleteMessege = deleteMessage
        println("Модератор $adminName удалил сообщение")
        return deleteMessege
    }

    fun deleteUser(user: SimpleUser): SimpleUser {
        val deleteUser = user
        println("Модератор $adminName удалил пользователя ${user.name}")
        return deleteUser
    }
}

fun main() {
    val usersList = mutableListOf<User>()
    val robotBender = Admin(1, 1, "robot Bender")
    usersList += robotBender
    val userAlex = SimpleUser(2, 2, "Alex")
    usersList += userAlex
    println()
    robotBender.showActions()
    userAlex.showActions()
    println()
    val chat = mutableListOf<String>()
    val message1 = robotBender.writeMessage(1, "Добро пожаловать в наш чат, Alex")
    val message2 = userAlex.writeMessage(2, "Всем привет!")
    val message3 = robotBender.writeMessage(3, "Ты здесь зачем?")
    val message4 = userAlex.writeMessage(4, "Я здесь просто так")
    println()
    robotBender.readChat()
    userAlex.readChat()
    println()
    val deleteMessage1 = robotBender.deleteMessage("Я здесь просто так")
    chat -= deleteMessage1
    println()
    userAlex.readChat()
    robotBender.readChat()
    println()
    val deleteUser = robotBender.deleteUser(userAlex)
    println("Пользователи в чате:")
    usersList -= deleteUser
    usersList.forEach {
        println(it.name + ": " + it::class.simpleName)
    }
}
