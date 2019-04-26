package katas.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ThePoetAndThePendulum {
    public static int[] pendulum(final int[] values) {
        int[] sorted = Arrays.stream(values).sorted().toArray();
        return IntStream.concat(IntStream.range(0, sorted.length).map(i -> sorted.length - i - 1).filter(j -> j % 2 == 0).map(v -> sorted[v]), IntStream.range(0, sorted.length).filter(i -> i % 2 == 1).map(j -> sorted[j])).toArray();
    }
}
