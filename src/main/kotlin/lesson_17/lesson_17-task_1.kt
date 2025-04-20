package org.example.lesson_17

class QuizElement(
    quizQuestion: String,
    quizAnswer: String,
) {
    private val _question = quizQuestion
    private var _answer = quizAnswer

    val question: String
        get() = _question
    var answer: String
        get() = _answer
        set(value) {
            _answer = value
        }
}

fun main() {
}
