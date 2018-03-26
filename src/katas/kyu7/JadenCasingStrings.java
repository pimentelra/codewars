package katas.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCasingStrings {
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.length() == 0) return null;
        return Arrays.stream(phrase.split("\\s+")).map(i -> i = i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase()).collect(Collectors.joining(" "));
    }
}
