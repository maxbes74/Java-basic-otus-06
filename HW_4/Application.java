package HW_4;

public class Application {
    public static void main(String[] args) {
        // первый вопрос
        Answer answer1Question1 = new Answer("cs", false);
        Answer answer2Question1 = new Answer("java", true);
        Answer answer3Question1 = new Answer("class", false);
        Answer answer4Question1 = new Answer("exe", false);
        Answer[] answersQuestion1 = {answer1Question1, answer2Question1, answer3Question1, answer4Question1};
        Question question1 = new Question("В файл с каким расширением компилируется java-файл?", answersQuestion1);

        // второй вопрос
        Answer answer1Question2 = new Answer("commit", false);
        Answer answer2Question2 = new Answer("push", false);
        Answer answer3Question2 = new Answer("clone", true);
        Answer answer4Question2 = new Answer("copy", false);
        Answer[] answersQuestion2 = {answer1Question2, answer2Question2, answer3Question2, answer4Question2};
        Question question2 = new Question("С помощью какой команды git можно получить полную копию удаленного репозитория?", answersQuestion2);

        // третий вопрос
        Answer answer1Question3 = new Answer("while", true);
        Answer answer2Question3 = new Answer("for", false);
        Answer answer3Question3 = new Answer("loop", false);
        Answer[] answersQuestion3 = {answer1Question3, answer2Question3, answer3Question3};
        Question question3 = new Question("Какой применяется цикл, когда не известно количество итераций?", answersQuestion3);

        // тестируемся
        SimpleTest simpleTest = new SimpleTest(question1, question2, question3);
        simpleTest.runTest();
        simpleTest.printTotalQuestions();
        simpleTest.printCorrectAnswers();
    }
}