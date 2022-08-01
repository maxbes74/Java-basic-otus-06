import java.util.Scanner;

public class HomeWork {
    static public void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int userCorrectAnswer = 0;
        int userNotCorrectAnswer = 0;

        String[][] questions = {
                {"В файл с каким расширением компилируется java-файл?", "1. cs", "2. java", "3. class", "4. exe"},
                {"С помощью какой команды git можно получить полную копию удаленного репозитория?", "1. commit", "2. push", "3. clone", "4. copy"},
                {"Какой применяется цикл, когда не известно количество итераций?", "1. while", "2. for", "3. loop",}
        };
        int[] correctAnswers = {2, 3, 1};
        int k = 0;
        for (int i = 0; i < questions.length; i++) {
            for (int j = 0; j < questions[i].length; j++) {
                System.out.println(questions[i][j]);
            }
            if (cs.hasNextInt()) {
                int userVariants = cs.nextInt();
                if (userVariants == correctAnswers[k]) {
                    System.out.println("Правильно");
                    userCorrectAnswer++;
                } else {
                    System.out.println("Неправильно");
                    userNotCorrectAnswer++;
                }
            } else {
                System.out.println("Неправильно");
                userNotCorrectAnswer++;
                cs.next();
            }
            k++;
        }
        System.out.println("Результат: правильно " + userCorrectAnswer + ", неправильно " + userNotCorrectAnswer);
    }
}