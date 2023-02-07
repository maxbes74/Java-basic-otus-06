import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число или exit");
            String command = cs.nextLine();
            if (command.equals("exit")) {
                break;
            } else {
                int n = Integer.parseInt(command);
                System.out.println(n + " " + WordSum.wordSum(n));
            }
        }
    }
}
