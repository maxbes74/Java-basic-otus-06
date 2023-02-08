package ru.otus.game;

public class DiceTest implements Dice {
    int count;

    public DiceTest(int count) {
        this.count = count;
    }

    @Override
    public int roll() {
        int score = switch (count) {
            case 0 -> 6;
            case 1 -> 1;
            case 2 -> 1;
            case 3 -> 6;
            case 4 -> 1;
            case 5 -> 1;
            default -> 0;
        };
        count++;
        return score;
    }
}