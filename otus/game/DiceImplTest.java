package ru.otus.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DiceImplTest {

    @Test
    void TestForAboveZeroBelowSeven() {
        DiceImpl dice = new DiceImpl();
        int roll = dice.roll();
        if (roll > 0 && roll < 7) {
            System.out.println("Ok");
        } else {
            System.err.println("No Ok");
        }

    }


}
