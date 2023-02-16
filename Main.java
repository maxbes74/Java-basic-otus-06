import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число и код валюты(RUB,USD,CNY) через пробел или exit");
            String command = cs.nextLine();
            if (command.equals("exit")) {
                break;
            } else {
                String[] parameters = command.split(" ");
                int number = Integer.parseInt(parameters[0]);
                String currencyCode = parameters[1];
                Currency instance = Currency.valueOf(currencyCode);
                System.out.println(number + " " + instance.wordSum(number));
            }
        }
    }
}
