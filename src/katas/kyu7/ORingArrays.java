package katas.kyu7;

import java.util.stream.IntStream;

public class ORingArrays {
    public static int[] orArrays(int[] arr1, int[] arr2) {
        return orArrays(arr1, arr2, 0);
    }

    public static int[] orArrays(int[] arr1, int[] arr2, int number) {
        return IntStream.range(0, Math.max(arr1.length, arr2.length)).map(i -> (i < arr1.length ? arr1[i] : number) | (i < arr2.length ? arr2[i] : number)).toArray();
    }
}
