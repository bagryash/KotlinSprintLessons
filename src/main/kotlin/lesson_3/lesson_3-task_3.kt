package org.example.lesson_3

fun main() {

    val x: Int = 9

    val table ="""   
        |$x x 1 = $x
        |$x x 2 = ${x * 2}
        |$x x 3 = ${x * 3}
        |$x x 4 = ${x * 4}
        |$x x 5 = ${x * 5}
        |$x x 6 = ${x * 6}
        |$x x 7 = ${x * 7}
        |$x x 8 = ${x * 8}
        |$x x 9 = ${x * 9}
    """.trimMargin()

    println(table)

}