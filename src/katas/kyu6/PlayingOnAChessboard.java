package katas.kyu6;

public class PlayingOnAChessboard {
    public static String game(long n) {
        return n * n % 2 == 0 ? "[" + n * n / 2 + "]" : "[" + n * n + ", 2]";
    }
}
