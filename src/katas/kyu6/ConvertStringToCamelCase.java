package katas.kyu6;

import java.util.stream.IntStream;

public class ConvertStringToCamelCase {
    static String toCamelCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        IntStream.range(1, sb.length())
                .filter(i -> !Character.isLetterOrDigit(sb.charAt(i - 1)) && Character.isLetterOrDigit(sb.charAt(i)))
                .forEach(i -> sb.setCharAt(i, Character.toUpperCase(sb.charAt(i))));
        return sb.toString().replaceAll("[^\\p{Alnum}]", "");
    }
}