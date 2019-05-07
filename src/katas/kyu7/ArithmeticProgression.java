package katas.kyu7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArithmeticProgression {
    public static String arithmeticSequenceElements(int first, int step, long total) {
        return Stream.iterate(first, n -> n + step).map(String::valueOf).limit(total).collect(Collectors.joining(", "));
    }
}

