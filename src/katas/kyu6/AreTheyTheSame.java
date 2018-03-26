package katas.kyu6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AreTheyTheSame {
    public static boolean comp(int[] a, int[] b) {
            return a != null && b != null && a.length == b.length &&
                    Arrays.stream(a).noneMatch(i -> IntStream.of(b).noneMatch(x -> Math.pow(i, 2) == Math.abs(x))) &&
                    Arrays.stream(b).noneMatch(i -> IntStream.of(a).noneMatch(x -> Math.sqrt(i) == Math.abs(x)));
    }
}
