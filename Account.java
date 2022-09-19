import java.util.*;

public class Account {
    private final int numberAccount;
    private int numberOfCoins;

    public Account() {
        this.numberAccount = (int) (Math.random() * 30);
        this.numberOfCoins = 0;

    }

    public void setNumberOfCoins(int numberOfCoins) {
        this.numberOfCoins = numberOfCoins;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public int getNumberOfCoins() {
        return numberOfCoins;
    }

    @Override
    public String toString() {
        return "Account{" +
                "numberAccount=" + numberAccount +
                ", numberOfCoins=" + numberOfCoins +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return numberAccount == account.numberAccount && numberOfCoins == account.numberOfCoins;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberAccount, numberOfCoins);
    }
}








