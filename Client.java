import java.util.*;

public class Client {
    private final String fullName;
    private final int age;
    private final List<Account> listAccount;

    public Client(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        this.listAccount = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.listAccount.add(account);
    }

    @Override
    public String toString() {
        return "Клиент: " +
                "Ф.И.О. = '" + fullName + '\'' +
                ", возраст = " + age +
                ", Счета: " + listAccount +
                '}';
    }

    public List<Account> getListAccount() {
        return listAccount;
    }

}


