package org.example.Lesson_11

class VoiceChatRoom(
    id: Int,
    var roomIcon: Int,
    var roomName: String,
    private var usersMikeOn: List<Int>,
    private var usersMikeMute: List<Int>,
    private var usersWithMikeDisable: List<Int>
) {

    fun addUser(id: Int) {
        usersMikeMute += id
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
