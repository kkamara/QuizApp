package com.kelvinkamara.quizapp.utils

import com.kelvinkamara.quizapp.model.Question
import com.kelvinkamara.quizapp.R

object Constants {
    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val SCORE = "correct_answers"

    fun getQuestions(): MutableList<Question> {
        val questions = mutableListOf<Question>()

        val quest1 = Question(
            1,"Which country does this flag belong to?",
            R.drawable.italy_flag, "Italy",
            "India", "Iran",
            "Ireland", 1
        )
        questions.add(quest1)


        val quest2 = Question(
            1,"Which country does this flag belong to?",
            R.drawable.india_flag, "Ireland",
            "Germany", "India",
            "Finland", 3
        )
        questions.add(quest2)

        val quest3 = Question(
            1,"Which country does this flag belong to?",
            R.drawable.spain_flag, "Spain",
            "Italy", "France",
            "Brazil", 1
        )
        questions.add(quest3)

        val quest4 = Question(
            1,"Which country does this flag belong to?",
            R.drawable.brazil_flag, "England",
            "France", "Argentina",
            "Brazil", 4
        )
        questions.add(quest4)

        val quest5 = Question(
            1,"Which country does this flag belong to?",
            R.drawable.finland_flag, "Scotland",
            "Italy", "Finland",
            "France", 3
        )
        questions.add(quest5)

        val quest6 = Question(
            1,"Which country does this flag belong to?",
            R.drawable.germany_flag, "Argentina",
            "Romania", "Germany",
            "Spain", 3
        )
        questions.add(quest6)

        val quest7 = Question(
            1,"Which country does this flag belong to?",
            R.drawable.romania_flag, "Romania",
            "Belgium", "Ireland",
            "Italy", 1
        )
        questions.add(quest7)

        val quest8 = Question(
            1,"Which country does this flag belong to?",
            R.drawable.nigeria_flag, "Nigeria",
            "India", "Wales",
            "Italy", 1
        )
        questions.add(quest8)

        val quest9 = Question(
            1,"Which country does this flag belong to?",
            R.drawable.ireland_flag, "Argentina",
            "Ireland", "Scotland",
            "Romania", 2
        )
        questions.add(quest9)

        val quest10 = Question(
            1,"Which country does this flag belong to?",
            R.drawable.argentina_flag, "England",
            "Brazil", "France",
            "Argentina", 4
        )
        questions.add(quest10)

        return questions
    }
}