package katas.kyu8;

import java.util.stream.IntStream;

public class ReversedSequence {
    public static int[] reverse(int n) {
        return IntStream.rangeClosed(1, n).map(i -> n - i + 1).toArray();
    }
}
