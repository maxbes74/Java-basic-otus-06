public class WordSum {
    public static String wordSum(int n) {

        if (n % 10 == 1 && n != 11)
            return ("рубль");
        else if (n % 10 >= 2 && n % 10 <= 4 && n / 10 != 1) {
            return ("рубля");
        } else {
            return ("рублей");
        }
    }
}