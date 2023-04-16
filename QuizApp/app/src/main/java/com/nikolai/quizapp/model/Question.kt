package com.nikolai.quizapp.model

class Question(
    val text: String
) {
    val answers: MutableList<Answer> = mutableListOf()
}