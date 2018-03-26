package katas.kyu7;

import java.util.Arrays;

public class MatchMyHusband {
    public static String match(int[] usefulness, int months) {
        int husband = Arrays.stream(usefulness).sum();
        double woman = 100 * Math.exp(-0.15 * months);
        return husband >= woman ? "Match!" : "No match!";
    }
}
