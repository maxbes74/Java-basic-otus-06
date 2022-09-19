import java.util.ArrayList;

public class Bank {
    public static void main(String[] args) {

        Client ivanov = new Client("Иванов И.И.", 56);
        Account accountIvanov = new Account();
        Account accountIvanov2 = new Account();
        accountIvanov.setNumberOfCoins(100);
        accountIvanov2.setNumberOfCoins(30);

        ivanov.addAccount(accountIvanov);
        ivanov.addAccount(accountIvanov2);
        System.out.println(ivanov);
    }

}
