package ru.otus;

public class PlayGameTest {
    Player p1;
    Player p2;
    Dice dice;
    GameWinnerPrinter gameWinnerPrinter;
    Game game;

    public static void main(String[] args) {
        new PlayGameTest().givenPlayerOneWin();
        new PlayGameTest().givenPlayerTwoWin();
        new PlayGameTest().givenPlayersDraw();
    }

    public void givenPlayerOneWin() {
        p1 = new Player("Вася");
        p2 = new Player("Петя");
        dice = new DiceTest(0);
        gameWinnerPrinter = new GameWinnerPrinterTest("Вася");
        game = new Game(dice, gameWinnerPrinter);
        game.playGame(p1, p2);
    }

    public void givenPlayerTwoWin() {
        p1 = new Player("Вася");
        p2 = new Player("Петя");
        dice = new DiceTest(2);
        gameWinnerPrinter = new GameWinnerPrinterTest("Петя");
        game = new Game(dice, gameWinnerPrinter);
        game.playGame(p1, p2);

    }

    public void givenPlayersDraw() {
        p1 = new Player("Вася");
        p2 = new Player("Петя");
        dice = new DiceTest(4);
        gameWinnerPrinter = new GameWinnerPrinterTest("Ничья");
        game = new Game(dice, gameWinnerPrinter);
        game.playGame(p1, p2);

    }
}
