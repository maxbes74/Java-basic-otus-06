import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Map<Client, List<Account>> clients = new HashMap<>();
        clients.put(ivanov,ivanov.getListAccount());
        System.out.println(clients.get(ivanov));
    }

}
