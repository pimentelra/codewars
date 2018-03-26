package katas.kyu8;

import java.util.Arrays;

public class FindMaximumAndMinimumValuesOfAList {
    public int min(int[] list) {
        int[] sorted = Arrays.copyOf(list, list.length);
        Arrays.sort(sorted);
        return sorted[0];
    }

    public int max(int[] list) {
        int[] sorted = Arrays.copyOf(list, list.length);
        Arrays.sort(sorted);
        return sorted[list.length - 1];
    }
}
