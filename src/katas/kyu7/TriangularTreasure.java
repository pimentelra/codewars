package katas.kyu7;

import java.util.stream.IntStream;

public class TriangularTreasure {
    public static int triangular(int n) {
        if (n <= 0) return 0;
        return IntStream.rangeClosed(1, n).sum();
    }
}
