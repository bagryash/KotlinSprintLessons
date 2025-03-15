package org.example.lesson_11

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