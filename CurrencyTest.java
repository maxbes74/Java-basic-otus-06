import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class CurrencyTest {
    @ParameterizedTest
    @ValueSource(ints = {21, 101, 121, 1001})
    void EndOfTestingForCurrency1(int number) {
        Assertions.assertEquals("рубль", Currency.RUB.wordSum(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {23, 102, 1102})
    void EndOfTestingForCurrency2(int number) {
        Assertions.assertEquals("рубля", Currency.RUB.wordSum(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 7, 10, 11, 12, 17, 20, 27, 100, 105, 110, 111, 112, 115, 120, 125, 200, 1000, 1100, 1111})
    void EndOfTestingForCurrency3(int number) {
        Assertions.assertEquals("рублей", Currency.RUB.wordSum(number));
    }
}