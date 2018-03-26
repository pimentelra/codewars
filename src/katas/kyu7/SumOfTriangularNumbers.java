package katas.kyu7;

import java.util.stream.IntStream;

public class SumOfTriangularNumbers {
    public static int sumTriangularNumbers(int n) {
        return n < 1 ? 0 : IntStream.rangeClosed(1, n).map(i -> i * (i + 1) / 2).sum();
    }
}
