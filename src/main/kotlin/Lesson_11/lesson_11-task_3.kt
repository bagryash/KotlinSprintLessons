package org.example.Lesson_11

fun main() {
    val room1 = VoiceChatRoom(1, 1, "Рыбалка", mutableListOf())
    val alex = User(1, 999, "Alex", "alex@mail.com", "5z9q5a", "on")

    println("Какой пользователь вошел в комнату?:")
    val newUserInRoomName: User = alex
    room1.addUser(newUserInRoomName)

    println("Какой пользователь включил микрофон(userName)?:")
    val newUserWithMikeOn = readln()
    room1.userMikeOn(newUserWithMikeOn)
}

class VoiceChatRoom(
    id: Int,
    var roomIcon: Int,
    var roomName: String,
    var users: MutableList<User>,
) {
    fun addUser(user: User) {
        users += user
    }

    fun userMikeOn(userName: String) {
        users.forEach {
            if (userName == it.userName) it.mikeStatus = "оn"
        }
    }
}

class User(
    var id: Int,
    var userIcon: Int,
    var userName: String,
    var login: String,
    var password: String,
    var userStatus: String,
    var mikeStatus: String = "mute",
)
