public class Account {
    private final int numberAccount;
    private int numberOfCoins;

    public Account(int numberAccount) {
        this.numberAccount = numberAccount;
        this.numberOfCoins = 0;
    }

    public void setNumberOfCoins(int numberOfCoins) {
        this.numberOfCoins = numberOfCoins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (numberAccount != account.numberAccount) return false;
        return numberOfCoins == account.numberOfCoins;
    }

    @Override
    public int hashCode() {
        int result = numberAccount;
        result = 31 * result + numberOfCoins;
        return result;
    }

    @Override
    public String toString() {
        return "Счет {" +
                "№ счета = " + numberAccount +
                ", количество монет = " + numberOfCoins +
                '}';
    }
}