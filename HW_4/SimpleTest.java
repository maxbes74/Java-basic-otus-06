package HW_4;

import java.util.Scanner;

public class SimpleTest {
    private final Question[] questions;
    private final Scanner scanner;

    public SimpleTest(Question... questions) {
        this.questions = questions;
        this.scanner = new Scanner(System.in);
    }

    public void runTest() {
        for (Question question : questions) {

            System.out.println(question.getQuestionStr());
            Answer[] answers = question.getAnswers();
            for (int a = 1; answers.length >= a; a++) {
                System.out.println(a + ". " + answers[a - 1].getAnswerStr());
            }
            System.out.println("Ваш ответ:");

            while (!scanner.hasNextInt()) {
                System.out.println("Введите номер ответа");
                scanner.next();
            }
            int userAnswer = scanner.nextInt();
            if (question.getCorrectAnswerNumberInArray() == userAnswer) {
                System.out.println("Правильно");
                question.setUserAnswerIsCorrect(true);
            } else {
                System.out.println("Неправильно");
                question.setUserAnswerIsCorrect(false);
            }
        }
    }

    public void printCorrectAnswers() {
        int correctAnswers = 0;
        for (Question question : questions) {
            if (question.isUserAnswerIsCorrect())
                correctAnswers++;
        }
        System.out.println("Колличество правельных ответов - " + correctAnswers);
    }

    public void printTotalQuestions() {
        System.out.println("Всего заданно вопросов - " + questions.length);
    }
}