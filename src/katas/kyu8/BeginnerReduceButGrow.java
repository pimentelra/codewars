package katas.kyu8;

import java.util.Arrays;

public class BeginnerReduceButGrow {
    public static int grow(int[] x) {
        return Arrays.stream(x).reduce(1, (a, b) -> a * b);
    }
}
