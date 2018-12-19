package katas.kyu8;

import java.util.Arrays;

public class BeginnerLostWithoutAMap {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(i -> 2 * i).toArray();
    }
}
