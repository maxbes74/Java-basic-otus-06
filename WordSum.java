public class WordSum {
    public static int wordSum(int n) {

        if (n % 10 == 1 && n != 11) System.out.println(n + " " + "рубль");
        else if (n % 10 >= 2 && n % 10 <= 4 && n / 10 != 1) System.out.println(n + " " + "рубля");
        else System.out.println(n + " " + "рублей");
        return n;
    }
}