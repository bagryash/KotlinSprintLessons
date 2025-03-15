package org.example.Lesson_11

fun main() {
    val room1 = VoiceChatRoom(1, 1, "ллл", listOf(), listOf(), listOf())

    println("Какой пользователь вошел в комнату?:")
    val newUserInRoom = readln().toInt()
    room1.addUser(newUserInRoom)
    println("Какой пользователь включил микрофон(id)?:")
    val newUserWithMikeOn = readln().toInt()
    room1.userMikeOn(newUserWithMikeOn)
}