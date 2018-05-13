package katas.kyu7;

import java.util.stream.IntStream;

public class ArraySquareUpB {
    public static int[] squareUp(int n) {
        return IntStream.range(0, n * n).map(i -> Math.abs(n - (i % n)) <= i / n + 1 ? Math.abs(n - (i % n)) : 0).toArray();
    }
}
