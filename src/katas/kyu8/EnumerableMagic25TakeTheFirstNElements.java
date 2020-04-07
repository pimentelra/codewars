package katas.kyu8;

import java.util.Arrays;

public class EnumerableMagic25TakeTheFirstNElements {
    public static int[] take(int[] arr, int n) {
        return Arrays.copyOfRange(arr, 0, Math.min(n, arr.length));
    }
}
