package katas.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlternateCase {
    static String alternateCase(final String string) {
        return IntStream.range(0, string.length())
                .mapToObj(i -> Character.isUpperCase(string.charAt(i)) ? String.valueOf(string.charAt(i)).toLowerCase() : String.valueOf(string.charAt(i)).toUpperCase())
                .collect(Collectors.joining());
    }
}
