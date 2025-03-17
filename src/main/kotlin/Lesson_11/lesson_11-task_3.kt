package org.example.Lesson_11

fun main() {
    val room1 = VoiceChatRoom(1, 1, "Рыбалка", listOf(), listOf(), listOf(), listOf())

    println("Какой пользователь вошел в комнату?:")
    val newUserInRoomId = readln().toInt()
    val newUserInRoomName = readln()
    room1.addUser(newUserInRoomId, newUserInRoomName )

    println("Какой пользователь включил микрофон(id)?:")
    val newUserWithMikeOn = readln().toInt()
    room1.userMikeOn(newUserWithMikeOn)
}

class VoiceChatRoom(
    id: Int,
    var roomIcon: Int,
    var roomName: String,
    private var usersInRoom: List<String>,
    private var usersMikeOn: List<Int>,
    private var usersMikeMute: List<Int>,
    private var usersWithMikeDisable: List<Int>
) {

    fun addUser(id: Int, user: String) {
        usersMikeMute += id
        usersInRoom += user
    }

    fun userMikeOn(id: Int) {
        val newUserStatusId = readln().toInt()
        usersMikeOn += newUserStatusId
        usersMikeMute -= newUserStatusId
        usersWithMikeDisable -= newUserStatusId
    }
}

public class User(
    var id: Int,
    var userIcon: Int,
    var userName: String,
    var login: String,
    var password: String,
    var userStatus: String,
    var mikeStatus: String = "mute"
) {
}