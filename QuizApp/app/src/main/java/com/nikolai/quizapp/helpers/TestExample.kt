package com.nikolai.quizapp.helpers

import com.nikolai.quizapp.model.Answer
import com.nikolai.quizapp.model.Question
import com.nikolai.quizapp.model.Test

val question1 = Question("Какой город является столицей Казахстана?").apply {
    val answer1 = Answer(
        "Москва",
        false
    )
    this.answers.add(answer1)

    val answer2 = Answer(
        "Стамбул",
        false
    )
    this.answers.add(answer2)

    val answer3 = Answer(
        "Астана",
        true
    )
    this.answers.add(answer3)
}
val question2 = Question("На какой цвет светофора нужно переходить дорогу?").apply {
    val answer1 = Answer(
        "Зелёный",
        true
    )
    this.answers.add(answer1)

    val answer2 = Answer(
        "Жёлтый",
        false
    )
    this.answers.add(answer2)

    val answer3 = Answer(
        "Красный",
        false
    )
    this.answers.add(answer3)
}
val question3 = Question("В каком году началась Вторая Мировая Война?").apply {
    val answer1 = Answer(
        "1812",
        false
    )
    this.answers.add(answer1)

    val answer2 = Answer(
        "1941",
        false
    )
    this.answers.add(answer2)

    val answer3 = Answer(
        "1939",
        true
    )
    this.answers.add(answer3)
}
val testExample = Test().apply {
    this.questions.add(question1)
    this.questions.add(question2)
    this.questions.add(question3)
}