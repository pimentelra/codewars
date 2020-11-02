package katas.kyu7;

import java.util.Arrays;
import java.util.Collections;

public class SumOfArraySingles {
    public static int repeats(int[] arr) {
        Integer[] arrayBoxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        return Arrays.stream(arr).distinct().filter(i -> Collections.frequency(Arrays.asList(arrayBoxed), i) == 1).sum();
    }
}
