package katas.kyu7;

import java.util.Arrays;

public class NthSmallestElementArraySeries4 {
    public static int nthSmallest(final int[] arr, final int n) {
        return Arrays.stream(arr).sorted().toArray()[n - 1];
    }
}
