class Forum(
    var messages: MutableList<String>? = mutableListOf()
) {
    fun printThread() {
        messages?.forEach {
            println(it)
        }
    }
}

class ForumMember(
    val userId: Int,
    val userName: String
)

class ForumMemberBuilder {
    var userId: Int = 0
    var userName = ""

    fun createNewUser(userId: Int, userName: String) = apply {
        this.userId = userId
        this.userName = userName
    }

    fun build(): ForumMember {
        return ForumMember(userId, userName)
    }
}

class ForumMessage(
    val authorId: Int,
    val message: String
)

class ForumMessageBuilder {
    var authorId = 0
    var message = ""

    fun createNewMessage(authorId: Int, userName: String) = apply {
        this.authorId = authorId
        this.message = userName
    }

    fun build(): ForumMessage {
        return ForumMessage(authorId, message)
    }
}

fun main() {
    val chat = Forum()

    println("Введите id нового пользователя:")
    val idUser1 = readln().toInt()
    println("Введите имя нового пользователя:")
    val nameUser1 = readln()
    val user1 = ForumMemberBuilder()
        .createNewUser(idUser1, nameUser1)
        .build()

    println("Введите id нового пользователя:")
    val idUser2 = readln().toInt()
    println("Введите имя нового пользователя:")
    val nameUser2 = readln()
    val user2 = ForumMemberBuilder()
        .createNewUser(idUser2, nameUser2)
        .build()

    println("Введите сообщение от первого пользователя:")
    var user1EnterMessage1 = readln()
    var messageUser1 = ForumMessageBuilder()
        .createNewMessage(idUser1, user1EnterMessage1)
        .build()
    chat.messages?.add("${user1.userName}:  ${messageUser1.message}")

    println("Введите сообщение от второго пользователя:")
    var user1EnterMessage2 = readln()
    var messageUser2 = ForumMessageBuilder()
        .createNewMessage(idUser2, user1EnterMessage2)
        .build()
    chat.messages?.add("${user2.userName}:  ${messageUser2.message}")

    println("Введите сообщение от первого пользователя:")
    user1EnterMessage1 = readln()
    messageUser1 = ForumMessageBuilder()
        .createNewMessage(idUser1, user1EnterMessage1)
        .build()
    chat.messages?.add("${user1.userName}:  ${messageUser1.message}")

    println("Введите сообщение от второго пользователя:")
    user1EnterMessage2 = readln()
    messageUser2 = ForumMessageBuilder()
        .createNewMessage(idUser2, user1EnterMessage2)
        .build()
    chat.messages?.add("${user2.userName}:  ${messageUser2.message}")

    chat.printThread()

}
