package katas.kyu6;

public class SequencesAndSeries {
    public static long getScore(long n) {
        return 50 * (n + n * (n - 1) / 2);
    }
}
