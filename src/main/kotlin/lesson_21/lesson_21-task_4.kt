package org.example.lesson_21

import java.io.File

fun File.addTextToBeginning(newText: String) {
    createNewFile()
    val oldText = readText()
    writeText(newText.lowercase() + oldText)
}

fun main() {
    val file1 = File("First.txt")

    file1.writeText("AAAA")
    file1.addTextToBeginning("OOOOO ")
    file1.addTextToBeginning("UUUUU ")

    val text = file1.readText()
    println(text)
}
