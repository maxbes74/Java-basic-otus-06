import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Client ivanov = new Client("Иванов И.И.", 56);
        Client petrov = new Client("Петров А.В.", 35);
        Client sidorov = new Client("Сидоров П.Г.", 42);

        Account account = new Account();
        Set<String> setIvanov = account.accountClient();
        setIvanov.add("111");
        setIvanov.add("222");
        setIvanov.add("333");



//        Account accountIvanov = new Account(new String[]{"11111111111"});
//        Account accountPetrov = new Account(new String[]{"22222222222", "444444444444"});
//        Account accountSidorov = new Account(new String[]{"333333333333", "77777777777"});
//
//        Map<Client, Set<String> > persons = new HashMap<>();
//        persons.put(ivanov,setIvanov);
//
//        System.out.println(persons.get(ivanov));
    }
    public void getAccounts (Client client){
        Map<Client, Set<String>> persons = new HashMap<>();
        System.out.println(persons.get(client));
    }
}
