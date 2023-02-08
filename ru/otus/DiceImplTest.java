package ru.otus;

import org.junit.jupiter.api.Test;

class DiceImplTest {
    @Test
    void TestForAboveZeroBelowSeven() {
        DiceImpl dice = new DiceImpl();
        int roll = dice.roll();
        if (roll > 0 && roll < 7) {
            System.out.println("Тест пройден");
        } else {
            System.err.println("Тест не пройден!");
        }
    }
}
