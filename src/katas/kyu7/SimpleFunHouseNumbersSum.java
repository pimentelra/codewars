package katas.kyu7;

import java.util.stream.IntStream;

public class SimpleFunHouseNumbersSum {
    public static int houseNumbersSum(final int[] arr) {
        return IntStream.range(0, IntStream.range(0, arr.length).filter(i -> arr[i] == 0).findFirst().getAsInt()).map(i -> arr[i]).sum();
    }
}
