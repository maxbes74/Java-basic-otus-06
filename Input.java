import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        System.out.println("Введите сумму: ");
        while (!cs.hasNextInt()) {
            System.out.println("Повтрите коректный ввод суммы: ");
            cs.next();
        }
        int n = cs.nextInt();
        if (n < 0) {
            System.out.println("Отрицательное значение!!!");
        return;}
        if (n % 10 == 1 && n != 11) System.out.println(n + " " + "рубль");
        else if (n % 10 >= 2 && n % 10 <= 4 && n / 10 != 1) System.out.println(n + " " + "рубля");
        else System.out.println(n + " " + "рублей");
    }
}