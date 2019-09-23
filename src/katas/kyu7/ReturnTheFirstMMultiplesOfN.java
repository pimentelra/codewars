package katas.kyu7;

import java.util.stream.IntStream;

public class ReturnTheFirstMMultiplesOfN {
    public static int[] multiples(int m, int n) {
        return IntStream.rangeClosed(1, m).map(i -> i * n).toArray();
    }
}
