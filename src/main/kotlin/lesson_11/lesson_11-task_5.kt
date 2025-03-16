package org.example.lesson_11

fun main() {

    val x1 = ForumMember(1, "Леша")
    val x2 = ForumMember(2, "Шелдон")

    val m1 = ForumMessage(1,"Привет, Шелдон!!!")
    val m2 = ForumMessage(2, "Вуфф-вуфф!")

}


class Forum() {
    fun createNewUser(id: Int, name: String){
        val userId = ForumMember.id
    }

    fun createNewMessage(id:Int){

    }

    fun printThread(){

    }
}

class ForumBuilder(){

}

class ForumMember(
    var userId: Int,
    var userName: String
)

class ForumMessage(
    val authorId: Int,
    val message: String,
) {
}