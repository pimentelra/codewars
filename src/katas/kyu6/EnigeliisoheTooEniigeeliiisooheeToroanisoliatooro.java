package katas.kyu6;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EnigeliisoheTooEniigeeliiisooheeToroanisoliatooro {
    public static String toexuto(String text) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return Arrays.stream(text.split("")).map(c -> {
            if (c.matches("(?i)[b-df-hj-np-tv-z]")) {
                Matcher matcher = Pattern.compile("(?i).*([aeiou])(?=[^aeiou]*" + c.charAt(0) + ").*").matcher(alphabet); matcher.matches();
                return c + matcher.group(1);
            }
            return c;
        }).collect(Collectors.joining(""));
    }
}
