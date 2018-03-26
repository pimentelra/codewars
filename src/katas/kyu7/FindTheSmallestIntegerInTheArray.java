package katas.kyu7;

import java.util.Arrays;

public class FindTheSmallestIntegerInTheArray {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }
}
