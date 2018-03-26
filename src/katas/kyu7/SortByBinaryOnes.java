package katas.kyu7;

import java.util.Arrays;

public class SortByBinaryOnes {
    public static Integer[] sort(Integer[] list) {
        return Arrays.stream(list).sorted((a, b) -> (ones(b) - ones(a)) == 0 ? (a - b) : (ones(b) - ones(a))).toArray(Integer[]::new);
    }

    private static int ones(Integer integer) {
        return Integer.toBinaryString(integer).replaceAll("[^1]", "").length();
    }
}
