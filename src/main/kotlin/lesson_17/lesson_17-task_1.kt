package org.example.lesson_17

class QuizElement(
    _question: String,
    _answer: String,
) {
    val question: String = _question
        get() = field
    var answer: String = _answer
        get() = field
        set(answer) {
            field = answer
        }
}

fun main() {
}
