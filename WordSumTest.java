import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WordSumTest {

    @Test
    void wordSumTest() {
        String scenario1 = "Окончание для 1 рубль";
        try {
            Assertions.assertEquals("рубль", WordSum.wordSum(1));
            System.out.printf("\"%s\" Тест пройден! %n", scenario1);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario1, e.getMessage());
        }

        String scenario2 = "Окончание для 3 рубля";
        try {
            Assertions.assertEquals("рубля", WordSum.wordSum(3));
            System.out.printf("\"%s\" Тест пройден! %n", scenario2);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario2, e.getMessage());
        }

        String scenario3 = "Окончание для 45 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(45));
            System.out.printf("\"%s\" Тест пройден! %n", scenario3);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario3, e.getMessage());
        }
        String scenario4 = "Окончание для 5 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(5));
            System.out.printf("\"%s\" Тест пройден! %n", scenario4);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario4, e.getMessage());
        }
        String scenario5 = "Окончание для 7 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(7));
            System.out.printf("\"%s\" Тест пройден! %n", scenario5);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario5, e.getMessage());
        }
        String scenario6 = "Окончание для 10 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(10));
            System.out.printf("\"%s\" Тест пройден! %n", scenario6);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario6, e.getMessage());
        }
        String scenario7 = "Окончание для 11 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(11));
            System.out.printf("\"%s\" Тест пройден! %n", scenario7);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario7, e.getMessage());
        }
        String scenario8 = "Окончание для 12 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(12));
            System.out.printf("\"%s\" Тест пройден! %n", scenario8);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario8, e.getMessage());
        }
        String scenario9 = "Окончание для 17 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(17));
            System.out.printf("\"%s\" Тест пройден! %n", scenario9);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario9, e.getMessage());
        }
        String scenario10 = "Окончание для 20 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(20));
            System.out.printf("\"%s\" Тест пройден! %n", scenario10);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario10, e.getMessage());
        }
        String scenario11 = "Окончание для 21 рубль";
        try {
            Assertions.assertEquals("рубль", WordSum.wordSum(21));
            System.out.printf("\"%s\" Тест пройден! %n", scenario11);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario11, e.getMessage());
        }
        String scenario12 = "Окончание для 23 рубля";
        try {
            Assertions.assertEquals("рубля", WordSum.wordSum(23));
            System.out.printf("\"%s\" Тест пройден! %n", scenario12);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario12, e.getMessage());
        }
        String scenario13 = "Окончание для 27 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(27));
            System.out.printf("\"%s\" Тест пройден! %n", scenario13);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario13, e.getMessage());
        }
        String scenario14 = "Окончание для 100 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(100));
            System.out.printf("\"%s\" Тест пройден! %n", scenario14);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario14, e.getMessage());
        }
        String scenario15 = "Окончание для 101 рубль";
        try {
            Assertions.assertEquals("рубль", WordSum.wordSum(101));
            System.out.printf("\"%s\" Тест пройден! %n", scenario15);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario15, e.getMessage());
        }
        String scenario16 = "Окончание для 102 рубля";
        try {
            Assertions.assertEquals("рубля", WordSum.wordSum(102));
            System.out.printf("\"%s\" Тест пройден! %n", scenario16);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario16, e.getMessage());
        }
        String scenario17 = "Окончание для 105 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(105));
            System.out.printf("\"%s\" Тест пройден! %n", scenario17);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario17, e.getMessage());
        }
        String scenario18 = "Окончание для 110 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(110));
            System.out.printf("\"%s\" Тест пройден! %n", scenario18);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario18, e.getMessage());
        }
        String scenario19 = "Окончание для 111 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(111));
            System.out.printf("\"%s\" Тест пройден! %n", scenario19);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario19, e.getMessage());
        }
        String scenario20 = "Окончание для 112 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(112));
            System.out.printf("\"%s\" Тест пройден! %n", scenario20);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario20, e.getMessage());
        }
        String scenario21 = "Окончание для 115 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(115));
            System.out.printf("\"%s\" Тест пройден! %n", scenario21);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario21, e.getMessage());
        }
        String scenario22 = "Окончание для 120 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(120));
            System.out.printf("\"%s\" Тест пройден! %n", scenario22);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario22, e.getMessage());
        }
        String scenario23 = "Окончание для 121 рубль";
        try {
            Assertions.assertEquals("рубль", WordSum.wordSum(121));
            System.out.printf("\"%s\" Тест пройден! %n", scenario23);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario23, e.getMessage());
        }
        String scenario24 = "Окончание для 123 рубля";
        try {
            Assertions.assertEquals("рубля", WordSum.wordSum(123));
            System.out.printf("\"%s\" Тест пройден! %n", scenario24);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario24, e.getMessage());
        }
        String scenario25 = "Окончание для 125 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(125));
            System.out.printf("\"%s\" Тест пройден! %n", scenario25);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario25, e.getMessage());
        }
        String scenario26 = "Окончание для 200 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(200));
            System.out.printf("\"%s\" Тест пройден! %n", scenario26);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario26, e.getMessage());
        }
        String scenario27 = "Окончание для 1 000 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(1000));
            System.out.printf("\"%s\" Тест пройден! %n", scenario27);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario27, e.getMessage());
        }
        String scenario28 = "Окончание для 1 001 рубль";
        try {
            Assertions.assertEquals("рубль", WordSum.wordSum(1001));
            System.out.printf("\"%s\" Тест пройден! %n", scenario28);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario28, e.getMessage());
        }
        String scenario29 = "Окончание для 1 100 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(1100));
            System.out.printf("\"%s\" Тест пройден! %n", scenario29);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario29, e.getMessage());
        }
        String scenario30 = "Окончание для 1 102 рубля";
        try {
            Assertions.assertEquals("рубля", WordSum.wordSum(1102));
            System.out.printf("\"%s\" Тест пройден! %n", scenario30);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario30, e.getMessage());
        }
        String scenario31 = "Окончание для 1 111 рублей";
        try {
            Assertions.assertEquals("рублей", WordSum.wordSum(1111));
            System.out.printf("\"%s\" Тест пройден! %n", scenario31);
        } catch (Throwable e) {
            System.err.printf("\"%s\" Тест не пройден! \"%s\" %n", scenario31, e.getMessage());
        }
    }
}