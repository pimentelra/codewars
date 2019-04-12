package katas.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleFunArrayPacking {
    public static long arrayPacking(int[] arr) {
        return Long.parseLong(IntStream.rangeClosed(1, arr.length).mapToObj(i -> arr[arr.length - i]).map(b -> String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0')).collect(Collectors.joining()), 2);
    }
}
