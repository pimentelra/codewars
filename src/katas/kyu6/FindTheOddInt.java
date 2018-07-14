package katas.kyu6;

import java.util.Arrays;

public class FindTheOddInt {
    public static int findIt(int[] a) {
        int oddNumber = a[0];
        oddNumber ^= Arrays.stream(a).reduce(0, (x, y) -> x ^ y);
        return oddNumber;
    }
}
