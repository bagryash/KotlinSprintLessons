class Forum(
    var users: MutableList<ForumMember> = mutableListOf(),
    var messages: MutableList<ForumMessage> = mutableListOf(),
) {
    var idCounter = 0

    fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(++idCounter, userName)
        users.add(newUser)
        return newUser
    }

    fun createNewMessage(id: Int) {
        users.forEach {
            if (id == it.userId) {
                println("Пользователь вводит сообщение:")
                val message = readln()
                val messageFromUser = ForumMessage(it.userName, message)
                messages.add(messageFromUser)
            }
        }
    }

    fun printThread() {
        messages.forEach {
            println(it.userName + ": " + it.useMessage)
        }
    }
}

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val userName: String,
    val useMessage: String,
)

fun main() {
    val chat = Forum()

    println("Введите имя нового пользователя:")
    val nameUser1 = readln()
    val user1 = chat.createNewUser(nameUser1)

    println("Введите имя нового пользователя:")
    val nameUser2 = readln()
    val user2 = chat.createNewUser(nameUser2)

    println("Первое сообщение от первого пользователя:")
    val message1User1 = chat.createNewMessage(user1.userId)

    println("Первое сообщение от второго пользователя:")
    val message1User2 = chat.createNewMessage(user2.userId)

    println("Первое сообщение от первого пользователя:")
    val message2User1 = chat.createNewMessage(user1.userId)

    println("Первое сообщение от второго пользователя:")
    val message2User2 = chat.createNewMessage(user2.userId)

    chat.printThread()
}
