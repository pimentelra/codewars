package katas.kyu7;

import java.util.Arrays;

public class NiceArray {
    public static boolean isNice(Integer[] arr) {
        return arr.length > 0 && Arrays.stream(arr).allMatch(
                i -> Arrays.stream(arr).anyMatch(j -> j.equals(i - 1)) || Arrays.stream(arr).anyMatch(k -> k.equals(i + 1)));
    }
}
