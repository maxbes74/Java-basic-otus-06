import java.util.Scanner;

public class HomeWork {
    static public void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int userCorrectAnswer = 0;
        int userNotCorrectAnswer = 0;

        String[][] questions = {
                {"В каком расширении java копилирует?", "1. cs", "2. java", "3. class", "4. exe"},
                {"Команда git копия репозитория?", "1. commit", "2. push", "3. clone", "4. copy"},
                {"Цикл при неизвестном количестве?", "1. while", "2. for", "3. loop",}
        };
        int[] correctAnswers = {2, 4, 3};
        int k = 0;
        for (int i = 0; i < questions.length; i++) {
            for (int j = 0; j < questions[i].length; j++) {
                System.out.println(questions[i][j]);
            }
            int userVariants = cs.nextInt();
            if (userVariants == correctAnswers[k]) {
                System.out.println("Правильно");
                userCorrectAnswer++;
            } else {
                System.out.println("Неправильно");
                userNotCorrectAnswer++;
            }
            k++;
        }
        System.out.println("Результат: правильно " + userCorrectAnswer + ", неправильно " + userNotCorrectAnswer);
    }
}