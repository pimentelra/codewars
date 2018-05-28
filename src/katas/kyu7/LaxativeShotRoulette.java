package katas.kyu7;

import java.util.stream.IntStream;

public class LaxativeShotRoulette {
    public static double getChance(int n, int x, int a) {
        return Math.round(IntStream.range(0, a)
                .mapToDouble(i -> (n - x - i) / (double) (n - i))
                .reduce(1, (a1, b) -> a1 * b) * 100.0) / 100.0;
    }
}
