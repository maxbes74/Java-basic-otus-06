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
    }
}