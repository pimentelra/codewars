package katas.kyu8;

public class DuckDuckGoose {
    public static String duckDuckGoose(Player[] players, int goose) {
        while (goose > players.length) goose -= players.length;
        return players[goose - 1].name;
    }
}
