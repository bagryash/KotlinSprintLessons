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

    fun deleteMessage(deleteMessage: String) {
        println("Модератор $adminName удалил сообщение")
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

    robotBender.writeMessage(1, "Добро пожаловать в наш чат, Alex")
    userAlex.writeMessage(2, "Всем привет!")
    robotBender.writeMessage(3, "Ты здесь зачем?")
    userAlex.writeMessage(4, "Я здесь просто так")
    println()

    robotBender.readChat()
    userAlex.readChat()
    println()

    robotBender.deleteMessage("Я здесь просто так")
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
