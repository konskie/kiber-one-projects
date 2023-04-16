package com.nikolai.quizappevenying.helpers

import com.nikolai.quizappevenying.model.Answer
import com.nikolai.quizappevenying.model.Question
import com.nikolai.quizappevenying.model.Test

var answer1 = Answer(
    isCorrect = false,
    text = "Треугольник"
)

var answer2 = Answer(
    isCorrect = false,
    text = "Квадрат"
)

var answer3 = Answer(
    isCorrect = true,
    text = "Круг"
)

var question1 = Question(
    text = "Фигура в которой нет углов",
    answers = listOf(answer1, answer2, answer3)
)

//////////////////////////////////////

var question2 = Question(
    text = "Как звали ассистентку в начале учебного года",
    answers = listOf(
        Answer(
            isCorrect = false,
            text = "Василиса"
        ),
        Answer(
            isCorrect = true,
            text = "Виолетта"
        ),
        Answer(
            isCorrect = false,
            text = "Елена"
        )
    )
)

var question3 = Question(
    text = "Как называется этот язык программирования",
    answers = listOf(
        Answer(
            isCorrect = false,
            text = "Kotlin"
        ),
        Answer(
            isCorrect = true,
            text = "C#"
        ),
        Answer(
            isCorrect = false,
            text = "Python"
        )
    )
)

val testExample = Test(
    score = 0,
    questions = listOf(question1, question2, question3)
)