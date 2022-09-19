import java.util.*;

public class Client {
    private String fullName;
    private int age;
    List <Account> listAccount;

    public Client(String fullName, int age, List<Account> listAccount) {
        this.fullName = fullName;
        this.age = age;
        this.listAccount = listAccount;
    }

    public List<Account> addAccount(String setNumberAccount) {
        listAccount.add(0,setNumberAccount);
        return listAccount;
    }
}

