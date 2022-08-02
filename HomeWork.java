import java.util.Scanner;

public class HomeWork {
    static public void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int userCorrectAnswer = 0;
        int userNotCorrectAnswer = 0;

        String[] questions = {
                "В файл с каким расширением компилируется java-файл?",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?",
                "Какой применяется цикл, когда не известно количество итераций?"
        };
        String[][] answerOptions = {
                {"1. cs", "2. java", "3. class", "4. exe"},
                {"1. commit", "2. push", "3. clone", "4. copy"},
                {"1. while", "2. for", "3. loop",}
        };
        int[] correctAnswers = {2, 3, 1};
        int correctAnswerNumber = 0;
        int questionNumber = 0;

        for (int j = 0; j < answerOptions.length; j++) {
            System.out.println(questions[questionNumber]);
            for (int k = 0; k < answerOptions[j].length; k++) {
                System.out.println(answerOptions[j][k]);
            }
            System.out.println("Ваш ответ: ");
            while (!cs.hasNextInt()) {
                System.out.println("Введите номер ответа");
                cs.next();
            }
            int userVariants = cs.nextInt();
            if (userVariants == correctAnswers[correctAnswerNumber]) {
                System.out.println("Правильно");
                userCorrectAnswer++;
            } else {
                System.out.println("Неправильно");
                userNotCorrectAnswer++;
            }
            correctAnswerNumber++;
        }
        questionNumber++;
        System.out.println("Результат: правильно " + userCorrectAnswer + ", неправильно " + userNotCorrectAnswer);
    }
}
