package katas.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MinimizeSumOfArrayArraySeries1 {
    public static int minSum(int[] passed) {
        Arrays.sort(passed);
        return IntStream.range(0, passed.length / 2).map(i -> passed[i] * passed[passed.length - 1 - i]).sum();
    }
}
