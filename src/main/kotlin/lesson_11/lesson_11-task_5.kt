class Forum(
    var users: MutableList<ForumMember> = mutableListOf(),
    var messages: MutableList<String> = mutableListOf(),
) {
    fun printThread() {
        messages.forEach {
            println(it)
        }
    }

    class ForumMember(
        val userId: Int,
        val userName: String,
    )

    var idCounter = 0

    fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(++idCounter, userName)
        users.add(userName)
        return newUser
    }

    fun createNewMessage(id: Int){
        for (i in Forum.ForumMember)
    }
}

fun main() {
    val chat = Forum()

    println("Введите имя нового пользователя:")
    val nameUser1 = readln()
    chat.createNewUser(nameUser1)

    println("Введите имя нового пользователя:")
    val nameUser2 = readln()
    chat.createNewUser(nameUser2)


}
