package katas.kyu7;

import java.util.stream.IntStream;

public class PlusMinusPlusPlusCount {
    public static int signChange(int[] arr) {
        return (int) IntStream.range(0, arr.length - 1).filter(i -> (arr[i] ^ arr[i + 1]) < 0).count();
    }
}
