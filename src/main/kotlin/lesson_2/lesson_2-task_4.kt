package org.example.lesson_2

fun main() {

    val crystallineOreMined = 7
    val ironOreMined = 11

    println((BUFF / 100f * crystallineOreMined).toInt())
    println((BUFF / 100f * ironOreMined).toInt())

}

const val BUFF = 20

