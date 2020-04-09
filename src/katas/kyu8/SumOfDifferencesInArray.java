package katas.kyu8;

import java.util.Arrays;

public class SumOfDifferencesInArray {
    public static int sumOfDifferences(int[] arr) {
        return arr.length < 2 ? 0 : Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt();
    }
}
