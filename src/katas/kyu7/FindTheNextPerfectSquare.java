package katas.kyu7;

public class FindTheNextPerfectSquare {
    public static long findNextSquare(long sq) {
        return Math.sqrt((double) sq) == (int) Math.sqrt((double) sq) ? (long) Math.pow(Math.sqrt((double) sq) + 1, 2) : -1;
    }
}
