import java.util.*;

public class Bank {

    private static final Map<Client, List<Account>> clients = new HashMap<>();
    private static final Map<Account, Client> accounts = new HashMap<>();

    public static void main(String[] args) {

        Client ivanov = new Client("Иванов И.И.", 56);
        Client sidorov = new Client("Сидоров А.П.", 25);
        Client petrov = new Client("Петров Г.М.", 30);

        Account account1 = new Account(1);
        Account account2 = new Account(2, 30);
        List<Account> ivanovAccounts = List.of(account1, account2);


        Account account3 = new Account(3, 10);
        Account account4 = new Account(4, 1000);
        Account account5 = new Account(5, 5);
        List<Account> sidorovAccounts = List.of(account3, account4, account5);


        Account account6 = new Account(6, 58);
        List<Account> petrovAccounts = List.of(account6);


        //добавление монет
        //account1.setNumberOfCoins(100);
        //account2.setNumberOfCoins(30);

        //account3.setNumberOfCoins(10);
        //account4.setNumberOfCoins(1000);
        //account5.setNumberOfCoins(5);

        //account6.setNumberOfCoins(58);

        putClientAndAccounts(ivanov, ivanovAccounts);
        putClientAndAccounts(sidorov, sidorovAccounts);
        putClientAndAccounts(petrov, petrovAccounts);

        //полная информация о клиенте
//        infoClient(ivanov);
        // информация о счетах и количестве монет по клиенту.
//        getAccounts(sidorov);
        // информация о клиенте по счету.
        getClient(account5);
    }

    public static void putClientAndAccounts(Client client, List<Account> accounts) {
        for (Account account: accounts) {
            putClientAndAccount(client, account);
        }
    }

    private static void putClientAndAccount(Client client, Account newAccount) {
        // положим в первую
        List<Account> oldAccountList = new ArrayList<>();
        if (clients.get(client) != null) {
            oldAccountList = clients.get(client);
        }
        oldAccountList.add(newAccount);
        clients.put(client, oldAccountList);
        // положим во вторую
        accounts.put(newAccount, client);
    }

    public static void getAccounts(Client client) {
        System.out.println(clients.get(client));
    }

    public static void getClient(Account account) {
        System.out.println(accounts.get(account));
    }

    public static void infoClient(Client client) {
        System.out.println(client);
    }
}