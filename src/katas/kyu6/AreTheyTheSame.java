package katas.kyu6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AreTheyTheSame {
    public static boolean comp(int[] a, int[] b) {
        return a != null && b != null && a.length == b.length &&
                IntStream.range(0, b.length).allMatch(i -> Arrays.stream(b).sorted().toArray()[i] == Math.pow(Arrays.stream(a).map(Math::abs).sorted().toArray()[i], 2));
    }
}
