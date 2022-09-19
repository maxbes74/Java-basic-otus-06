import java.util.*;

public class Client {
    private final String fullName;
    private final int age;
    private List <Account> listAccount;

    public Client(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        this.listAccount = new ArrayList<>();
    }
    public void addAccount (Account account){
        this.listAccount.add(account);
    }

    @Override
    public String toString() {
        return "Client{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", listAccount=" + listAccount +
                '}';
    }
}

