package katas.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaximumGapArraySeries4 {
    public static int maxGap(int[] numbers) {
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(copy);
        return IntStream.range(0, copy.length - 1).map(i -> Math.max(copy[i], copy[i + 1]) - Math.min(copy[i], copy[i + 1])).max().orElse(0);
    }
}
