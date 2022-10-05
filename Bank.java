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
//        accountIvanov1.setNumberOfCoins(100);
//        accountIvanov2.setNumberOfCoins(30);
//
//        accountSidorov1.setNumberOfCoins(10);
//        accountSidorov2.setNumberOfCoins(1000);
//        accountSidorov3.setNumberOfCoins(5);
//
//        accountPetrov1.setNumberOfCoins(58);


//полная информация о клиенте

//        System.out.println(ivanov);
//        System.out.println(petrov);
//        System.out.println(sidorov);

        Map<Client, List<Account>> clients = new HashMap<>();
        clients.put(ivanov, listAccount1);
        clients.put(petrov, listAccount3);
        clients.put(sidorov, listAccount2);



        for (Map.Entry<Client, List<Account>> entry : clients.entrySet()) {
                if (entry.getValue().contains(account4))
                System.out.println(entry.getKey());


        }

        // информация о счетах и количестве монет по клиенту.

//        System.out.println(clients.get(ivanov));
//        System.out.println(clients.get(petrov));
//        System.out.println(clients.get(sidorov));
    }

}
