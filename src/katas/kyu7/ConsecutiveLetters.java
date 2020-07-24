package katas.kyu7;

import java.util.stream.IntStream;

public class ConsecutiveLetters {
    public static boolean solve(String s) {
        int[] sorted = s.chars().distinct().sorted().toArray();
        return s.length() == sorted.length && IntStream.range(1, sorted.length).allMatch(i -> sorted[i] - sorted[i - 1] == 1);
    }
}
