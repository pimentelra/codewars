package katas.kyu8;

import java.util.stream.IntStream;

public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        if (one.length() < 1) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        IntStream.range(0, one.length()).forEach(i -> {
            result.append(one.substring(i, i + 1));
            result.append(two.substring(i, i + 1));
            result.append(three.substring(i, i + 1));
        });

        return result.toString();
    }
}
