package org.example.lesson_11

fun main() {

  val userThree = User2(3, "User1999","2WVlv3sGEkiP", "user.three@user-mail.com", null )

    userThree.setBio()
    userThree.changePassword()
    userThree.printUser2()

}

class User2(
  val id: Int,
  val login: String,
  var password: String,
  val email: String,
  var bio: String?
) {
  fun printUser2() {
    println("$id, $login, $password, $email, $bio")
  }

  fun setBio() {
    println("Введите вашу биографию:")
    bio = readln()
  }

  fun changePassword(){
    println("Введите ваш пароль:")
    val userEnterPassword = readln()
    if ( userEnterPassword == password) {
      println("Введите новый пароль:")
      password = readln()
      println("Ваш пароль успешно изменен!")
    } else println("Вы ввели неверный пароль!")
  }
}