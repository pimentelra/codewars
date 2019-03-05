package katas.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Trigrams {
    public static String trigrams(String phrase) {
        return IntStream.rangeClosed(0, phrase.length() - 3)
                .mapToObj(i -> phrase.replace(' ', '_').substring(i, i + 3))
                .collect(Collectors.joining(" "));
    }
}
