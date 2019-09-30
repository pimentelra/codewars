package katas.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AlphabetSymmetry {
    public static int[] solve(String[] arr) {
        return Arrays.stream(arr)
                .map(s -> IntStream.range(0, s.length()).filter(c -> c == s.toLowerCase().charAt(c) - 97).count())
                .mapToInt(Math::toIntExact).toArray();
    }
}
