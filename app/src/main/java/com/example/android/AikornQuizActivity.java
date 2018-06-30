package com.example.android;

import android.app.Activity;

public class AikornQuizActivity extends Activity {

    private static String[] mQuestion;
    private String mQuestions [] = {
            "What is Google?",
            "Who founded Google?",
            "Who is the present CEO of Udacity",
            "The __________ Africa Challenge.",

    };

    private String mChoices [] [] = {
            {"A Search Engine", "A website", "An html"},
            {"Mark Zuckerburg", "Bill Gate", "Jose Mourhino"},
            {"Joseph Prince", "Tasha Cobbs", "Ronaldo"},
            {"Google", "Udacity", "AI"},

    };

    private String mCorrectAnswers[] = {"A Search Engine", "Jose Mourinho", "Ronaldo", "Google"};


    public static String getQuestion(int a) {
        String question = mQuestion [a];
        return question;
    }

    public String getChoices1(int a) {
        String choice0 = mChoices [a][0];
        return choice0;
    }

    public String getChoices2(int a) {
        String choice0 = mChoices [a][1];
        return choice0;
    }

    public String getChoices3(int a) {
        String choice0 = mChoices [a][2];
        return choice0;
    }

    public String[] getmCorrectAnswers(int a) {
        String answer = mCorrectAnswers[a];
        return mCorrectAnswers;
    }

}

