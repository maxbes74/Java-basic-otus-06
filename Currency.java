public enum Currency {

    RUB(new String[]{"рубль", "рубля", "рублей"}),
    CNY(new String[]{"юань", "юаня", "юаней"}),
    USD(new String[]{"доллар", "доллара", "долларов"});

    private final String[] endings;

    Currency(String[] endings) {
        this.endings = endings;
    }

    public String wordSum(int number) {

        if (number % 100 >= 5 && number % 100 <= 20) {
            return endings[2];
        } else if (number % 10 == 1)
            return endings[0];
        else if (number % 10 >= 2 && number % 10 <= 4 && number / 10 != 1) {
            return endings[1];
        } else {
            return endings[2];
        }
    }
}