import java.util.*;

public class Bank {
    public static void main(String[] args) {

        Client ivanov = new Client("Иванов И.И.", 56);
        Client sidorov = new Client("Сидоров А.П.", 25);
        Client petrov = new Client("Петров Г.М.", 30);

        Account account1 = new Account(1);
        Account account2 = new Account(2);
        List<Account> listAccount1 = new ArrayList<>();
        listAccount1.add(account1);
        listAccount1.add(account2);

        Account account3 = new Account(3);
        Account account4 = new Account(4);
        Account account5 = new Account(5);
        List<Account> listAccount2 = new ArrayList<>();
        listAccount2.add(account3);
        listAccount2.add(account4);
        listAccount2.add(account5);

        Account account6 = new Account(6);
        List<Account> listAccount3 = new ArrayList<>();
        listAccount3.add(account6);

//добавление монет
        account1.setNumberOfCoins(100);
        account2.setNumberOfCoins(30);

        account3.setNumberOfCoins(10);
        account4.setNumberOfCoins(1000);
        account5.setNumberOfCoins(5);

        account6.setNumberOfCoins(58);

        Map<Client, List<Account>> clients = new HashMap<>();
        clients.put(ivanov, listAccount1);
        clients.put(petrov, listAccount3);
        clients.put(sidorov, listAccount2);

        //полная информация о клиенте
        infoClient(ivanov);
        // информация о счетах и количестве монет по клиенту.
        getAccounts(clients, sidorov);
        // информация о кленте по счету.
        findClient(clients, account4);
    }

    public static void getAccounts(Map<Client, List<Account>> clients, Client client) {
        System.out.println(clients.get(client));
    }

    public static void findClient(Map<Client, List<Account>> clients, Account account) {
        for (Map.Entry<Client, List<Account>> entry : clients.entrySet()) {
            if (entry.getValue().contains(account))
                System.out.println(entry.getKey());
        }
    }

    public static void infoClient(Client client) {
        System.out.println(client);
    }
}