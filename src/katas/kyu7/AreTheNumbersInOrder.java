package katas.kyu7;

import java.util.stream.IntStream;

public class AreTheNumbersInOrder {
    public static boolean isAscOrder(int[] arr) {
        return IntStream.range(0, arr.length - 1).noneMatch(i -> arr[i + 1] < arr[i]);
    }
}
