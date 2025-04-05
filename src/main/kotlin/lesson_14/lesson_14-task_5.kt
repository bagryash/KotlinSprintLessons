package org.example.lesson_14

class Chat(
    val messagesList: MutableList<Message> = mutableListOf(),
    val threadMessage: MutableList<ChildMessage> = mutableListOf(),
) {
    var idCounter = 0

    fun addMessage(
        user: String,
        message: String,
    ): Message {
        val newMassage = Message(++idCounter, user, message)
        messagesList += newMassage
        return newMassage
    }

    fun addThreadMessage(
        parentMessageId: Int,
        user: String,
        message: String,
    ): ChildMessage {
        val newThreadMessage = ChildMessage(parentMessageId, ++idCounter, user, message)
        threadMessage += newThreadMessage
        return newThreadMessage
    }

    fun printChat() {
        val groupedByParentMessageId = threadMessage.groupBy { it.parentMessageId }
        messagesList.forEach { message ->
            println("${message.userName}: ${message.useMessage}")
            for ((parentMessageId, group) in groupedByParentMessageId) {
                group.map {
                    if (message.id == it.parentMessageId) println("\t${it.userName} :  ${it.useMessage}")
                }
            }
        }
    }
}

class Message(
    val id: Int,
    val userName: String,
    val useMessage: String,
)

class ChildMessage(
    val parentMessageId: Int,
    val id: Int,
    val userName: String,
    val useMessage: String,
)

fun main() {
    val chat = Chat()

    val message1 = chat.addMessage("alex", "Всем привет!")
    val message2 = chat.addMessage("igor", "здорова")

    val threadMessage11 = chat.addThreadMessage(message1.id, "kate", "hi, Alex")
    val threadMessage12 = chat.addThreadMessage(message1.id, "ivanF", "Ну ты где?")

    val threadMessage21 = chat.addThreadMessage(message2.id, "alex", "Игорь, ты че не работаешь?")
    val threadMessage22 = chat.addThreadMessage(message2.id, "igor", "а я никогда не работаю:)")

    chat.printChat()
}
