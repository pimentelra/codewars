package katas.kyu7;

import java.util.stream.IntStream;

public class AlternateSquareSum {
    public static int alternateSqSum(int[] arr) {
        return IntStream.range(0, arr.length).map(i -> (int) (i % 2 == 0 ? arr[i] : Math.pow(arr[i], 2))).sum();
    }
}
