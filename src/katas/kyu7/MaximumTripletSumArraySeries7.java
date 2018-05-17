package katas.kyu7;

import java.util.Arrays;

public class MaximumTripletSumArraySeries7 {
    public static int maxTriSum(int[] numbers) {
        int[] d = Arrays.stream(numbers).distinct().sorted().toArray();
        return Arrays.stream(Arrays.copyOfRange(d, d.length - 3 < 0 ? 0 : d.length - 3, d.length)).sum();
    }
}
