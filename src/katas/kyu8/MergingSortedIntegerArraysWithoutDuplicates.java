package katas.kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergingSortedIntegerArraysWithoutDuplicates {
    public static int[] mergeArrays(int[] first, int[] second) {
        return IntStream.concat(Arrays.stream(first), Arrays.stream(second)).distinct().sorted().toArray();
    }
}
