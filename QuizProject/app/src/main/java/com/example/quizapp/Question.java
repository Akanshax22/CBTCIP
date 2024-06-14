package com.example.quizapp;

public class Question {
    private String questionText;
    private String[] options;
    private int correctAnswerIndex;
    private int timeLimit; // in seconds

    public Question(String questionText, String[] options, int correctAnswerIndex, int timeLimit) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
        this.timeLimit = timeLimit;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public int getTimeLimit() {
        return timeLimit;
    }
}
