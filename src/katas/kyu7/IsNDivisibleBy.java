package katas.kyu7;

import java.util.stream.IntStream;

public class IsNDivisibleBy {
    public static boolean isDivisible(int... values) {
        if (values.length < 2) return true;
        return IntStream.range(1, values.length)
                .noneMatch(i -> values[i] == 0 || values[0] % values[i] != 0);
    }
}
