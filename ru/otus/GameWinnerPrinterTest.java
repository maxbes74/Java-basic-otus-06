package ru.otus;

public class GameWinnerPrinterTest implements GameWinnerPrinter {
    String winner;

    public GameWinnerPrinterTest(String winner) {
        this.winner = winner;
    }

    @Override
    public void printWinner(Player winner) {
        if (this.winner.equals("Вася")) {
            System.out.println("Вася".equals(winner.getName()) ? "Тест пройден!" : "Тест не пройден!");
        }
        if (this.winner.equals("Петя")) {
            System.out.println("Петя".equals(winner.getName()) ? "Тест пройден!" : "Тест не пройден!");
        }
        if (this.winner.equals("Ничья")) {
            System.out.println("Вася".equals(winner.getName()) || ("Петя".equals(winner.getName())) ? "Тест не пройден!" : "Тест пройден!");
        }
    }
}
