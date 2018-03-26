package katas.kyu8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringyStrings {
    public static String stringy(int size) {
        return IntStream.range(0, size).mapToObj(i -> i % 2 == 0 ? "1" : "0").collect(Collectors.joining());
    }
}
