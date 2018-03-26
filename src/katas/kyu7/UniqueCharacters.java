package katas.kyu7;

import java.util.stream.IntStream;

public class UniqueCharacters {
    public static boolean hasUniqueChars(String str) {
        return IntStream.range(0, str.length())
                .noneMatch(i -> str.replaceAll("[^" + str.substring(i, i + 1) + "]", "").length() != 1);
    }
}
