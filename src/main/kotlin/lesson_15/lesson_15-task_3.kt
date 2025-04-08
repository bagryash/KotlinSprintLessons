package org.example.lesson_15

class Chat(
    val messagesList: MutableList<Message> = mutableListOf(),
) {
    fun printChat() {
        messagesList.forEach { message ->
            println("${message.user}: ${message.message}")
        }
    }
}

class Message(
    val id: Int,
    val user: String,
    val message: String,
)

abstract class User(
    val id: Int,
    val image: Int,
    val name: String,
) {
    fun createMessage(
        chat: Chat,
        id: Int,
        user: User,
        message: String,
    ): Message {
        val newMessage = Message(id, user.name, message)
        println("${user.name}: $message")
        chat.messagesList += newMessage
        return newMessage
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
    fun deleteMessage(
        chat: Chat,
        message: Message,
    ): Message {
        val deleteMessage = Message(message.id, message.user, message.message)
        println("Модератор  удалил сообщение")
        chat.messagesList.remove(message)
        return deleteMessage
    }
}

fun main() {
    val chat = Chat()

    val robotBender = Admin(1, 1, "robot Bender")
    val userAlex = SimpleUser(2, 2, "Alex")

    val message1 = robotBender.createMessage(chat, 1, robotBender, "Добро пожаловать в наш чат, Alex")
    val message2 = userAlex.createMessage(chat, 2, userAlex, "Всем привет!")
    val deleteMessage1 = robotBender.deleteMessage(chat, message2)

    chat.printChat()
}
