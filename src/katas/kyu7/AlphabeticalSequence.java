package katas.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AlphabeticalSequence {
    public static String alphaSeq(String s) {
        return Arrays.stream(s.toLowerCase().split("")).sorted().map(c -> String.format("%s%s", c.toUpperCase(), c.repeat(c.charAt(0) - 97))).collect(Collectors.joining(","));
    }
}
