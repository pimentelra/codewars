package katas.kyu7;

import java.util.stream.IntStream;

public class SumOfOddCubedNumbers {
    public static int cubeOdd(int arr[]) {
        return IntStream.range(0, arr.length)
                .filter(i -> Math.abs(arr[i]) % 2 == 1)
                .map(i -> (int) Math.pow(arr[i], 3))
                .sum();
    }
}
