package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val p = 70000
    val i = 16.7
    val t = 20
    val n = t

    val s = p * ((1 + 0.01*i).pow(n))
    println(s)
//    1536438.428.


}