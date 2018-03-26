package katas.kyu8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RepeatIt {
    public static String repeatString(final Object toRepeat, final int n) {
        return !(toRepeat instanceof String) ? "Not a string" : IntStream.range(0, n).mapToObj(i -> String.valueOf(toRepeat)).collect(Collectors.joining());
    }
}
