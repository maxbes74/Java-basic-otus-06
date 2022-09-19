import java.util.ArrayList;

public class Bank {
    public static void main(String[] args) {

        Client ivanov = new Client("Иванов И.И.", 56, new ArrayList<>());
        ivanov.listAccount.add("13123JGG");
        ivanov.listAccount.add("123123YEB");
        System.out.println(ivanov);
    }

}
