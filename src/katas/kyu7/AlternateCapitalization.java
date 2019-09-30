package katas.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlternateCapitalization {
    public static String[] capitalize(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        return new String[]{
                IntStream.range(0, chars.length)
                        .mapToObj(i -> String.valueOf(i % 2 == 0 ? Character.toUpperCase(chars[i]) : chars[i]))
                        .collect(Collectors.joining()),
                IntStream.range(0, chars.length)
                        .mapToObj(i -> String.valueOf(i % 2 == 1 ? Character.toUpperCase(chars[i]) : chars[i]))
                        .collect(Collectors.joining())

        };
    }
}
