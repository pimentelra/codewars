package katas.kyu6;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PlayingWithPassphrases {
    public static String playPass(String s, int n) {
        return new StringBuilder(IntStream.range(0, s.length()).mapToObj(i -> {
            if (Character.isLetter(s.charAt(i))) {
                char c = (char) ((Character.toLowerCase(s.charAt(i)) - 97 + n) % 26 + 97);
                return "" + (i % 2 == 0 ? Character.toUpperCase(c) : Character.toLowerCase(c));
            }
            return Character.isDigit(s.charAt(i)) ? "" + (57 - s.charAt(i)) : "" + s.charAt(i);
        }).collect(Collectors.joining())).reverse().toString();
    }
}
