package org.example.lesson_2

fun main() {

    val crystallineOreMined = 7
    val ironOreMined = 11

    println((crystallineOreMined * BUFF - crystallineOreMined).toInt())
    println((ironOreMined * BUFF - ironOreMined).toInt())

}

const val BUFF = 1.2

