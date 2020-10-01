package katas.kyu7;

import java.util.stream.IntStream;

public class SimpleConsecutivePairs {
    public static int solve(int[] arr) {
        return (int) IntStream.iterate(0, i -> i < (arr.length % 2 == 0 ? arr.length : arr.length - 1), i -> i + 2)
                .filter(i -> Math.max(arr[i], arr[i + 1]) - Math.min(arr[i], arr[i + 1]) == 1).count();
    }
}
