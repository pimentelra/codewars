package katas.kyu7;

import java.util.stream.IntStream;

public class StantonMeasure {
    public static int stantonMeasure(int[] arr) {
        int ones = (int) IntStream.range(0, arr.length).filter(i -> arr[i] == 1).count();
        return (int) IntStream.range(0, arr.length).filter(i -> arr[i] == ones).count();
    }
}
