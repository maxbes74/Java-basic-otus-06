import java.util.*;

public class Bank {
    public static void main(String[] args) {

        Client ivanov = new Client("Иванов И.И.", 56);
        Client sidorov = new Client("Сидоров А.П.", 25);
        Client petrov = new Client("Петров Г.М.", 30);

        Account accountIvanov1 = new Account(1);
        Account accountIvanov2 = new Account(2);

        Account accountSidorov1 = new Account(3);
        Account accountSidorov2 = new Account(4);
        Account accountSidorov3 = new Account(5);

        Account accountPetrov1 = new Account(6);


//        accountIvanov1.setNumberOfCoins(100);
//        accountIvanov2.setNumberOfCoins(30);
//
//        accountSidorov1.setNumberOfCoins(10);
//        accountSidorov2.setNumberOfCoins(1000);
//        accountSidorov3.setNumberOfCoins(5);
//
//        accountPetrov1.setNumberOfCoins(58);


// добавление счета клиенту
        ivanov.addAccount(accountIvanov1);
        ivanov.addAccount(accountIvanov2);

        petrov.addAccount(accountPetrov1);

        sidorov.addAccount(accountSidorov1);
        sidorov.addAccount(accountSidorov2);
        sidorov.addAccount(accountSidorov3);


//полная информация о клиенте

//        System.out.println(ivanov);
//        System.out.println(petrov);
//        System.out.println(sidorov);

        Map<Client, List<Account>> clients = new HashMap<>();
        clients.put(ivanov, ivanov.getListAccount());
        clients.put(petrov, petrov.getListAccount());
        clients.put(sidorov, sidorov.getListAccount());

//        for ( Map.Entry <Client, List<Account>> entry : clients.entrySet()) {
//            System.out.println(entry.getKey());
//
//        }


        // информация о счетах и количестве монет по клиенту.

//        System.out.println(clients.get(ivanov));
//        System.out.println(clients.get(petrov));
//        System.out.println(clients.get(sidorov));
    }


}
