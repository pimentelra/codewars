package katas.kyu7;

import java.util.stream.IntStream;

public class BeginnerSeries3SumOfNumbers {
    public int GetSum(int a, int b) {
        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
    }
}
