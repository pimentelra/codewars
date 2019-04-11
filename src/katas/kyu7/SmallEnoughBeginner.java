package katas.kyu7;

import java.util.Arrays;

public class SmallEnoughBeginner {
    public static boolean smallEnough(int[] a, int limit) {
        return Arrays.stream(a).allMatch(i -> i <= limit);
    }
}
