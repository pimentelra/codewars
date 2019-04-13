package katas.kyu7;

public class BattleOfTheCharactersEasy {
    public static String battle(final String x, final String y) {
        int xPower = x.chars().map(i -> i - 64).sum(), yPower = y.chars().map(i -> i - 64).sum();
        return xPower > yPower ? x : yPower > xPower ? y : "Tie!";
    }
}
