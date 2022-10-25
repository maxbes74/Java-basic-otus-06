import java.util.*;

public class Application {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Client client =new Client("Иванов И.И.", 56);
        Account account = new Account(3);

        bank.addClient(client,
                List.of(new Account(1), new Account(2)));
        bank.addClient(new Client("Сидоров А.П.", 25),
                List.of(new Account(3), new Account(4), new Account(5)));
        bank.addClient(new Client("Петров Г.М.", 30),
                List.of(new Account(6)));

//        System.out.println(bank.getAccountsByClient(client));
        System.out.println(bank.getClientByAccount(account));
    }
}
