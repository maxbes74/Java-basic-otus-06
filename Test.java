import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Client ivanov = new Client("Иванов И.И.", 56);
        Client petrov = new Client("Петров А.В.", 35);
        Client sidorov = new Client("Сидоров П.Г.", 42);


        Account ivanovAccount = new Account();
        Set<String> setIvanovAccount = ivanovAccount.madeSetAccount();
        setIvanovAccount.add("123");
        setIvanovAccount.add("456");
        setIvanovAccount.add("734");
//        ivanovAccount.printerSet(setIvanovAccount);

        Account petrovAccount = new Account();
        Set<String> setPetrovAccount = petrovAccount.madeSetAccount();
        setPetrovAccount.add("555");
        setPetrovAccount.add("444");


        Map<Client, Set<String>> persons = new HashMap<>();
        persons.put(ivanov, setIvanovAccount);
        persons.put(petrov, setPetrovAccount);
        System.out.println(persons.get(ivanov));
        System.out.println(persons.get(petrov));

    }
}
