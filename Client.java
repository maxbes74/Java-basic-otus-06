import java.util.*;

public class Client {
    private String fullName;
    private int age;
    List<String> listAccount;

    public Client(String fullName, int age, List<String> listAccount) {
        this.fullName = fullName;
        this.age = age;
        this.listAccount = listAccount;
    }

    public List<String> addAccount(String account) {
        List<String> list = new ArrayList<>();
        list.add(account);
        return list;
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

