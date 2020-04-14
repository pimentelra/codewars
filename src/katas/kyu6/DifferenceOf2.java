package katas.kyu6;

import java.util.Arrays;

public class DifferenceOf2 {
    public static int[][] twosDifference(int[] array) {
        return Arrays.stream(array).sorted().filter(i -> Arrays.stream(array).anyMatch(j -> j == i + 2)).mapToObj(k -> new int[]{k, k + 2}).toArray(int[][]::new);
    }
}