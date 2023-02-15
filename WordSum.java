public class WordSum {
    public static String wordSum(int n) {

        if (n % 100 >= 5 && n % 100 <= 20) {
            return ("рублей");
        } else if (n % 10 == 1)
            return ("рубль");
        else if (n % 10 >= 2 && n % 10 <= 4 && n / 10 != 1) {
            return ("рубля");
        } else {
            return ("рублей");
        }
    }
}