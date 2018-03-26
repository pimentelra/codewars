package katas.kyu7;

import java.util.Arrays;

public class ClosestToZero {
    public static Integer find(int[] arr) {
        Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(array, (a, b) -> (Integer.compare(Math.abs(a), Math.abs(b))));
        return Math.abs(array[0]) == Math.abs(array[1]) ? null : array[0];
    }
}
