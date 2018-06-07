package katas.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FormatWordsIntoASentence {
    public static String formatWords(String[] words) {
        if (words == null) return "";
        String[] filtered = Arrays.stream(words).filter(s -> !s.isEmpty()).toArray(String[]::new);
        return IntStream.range(0, filtered.length)
                .mapToObj(i -> filtered[i] + (i == filtered.length - 2 ? " and " : i == filtered.length - 1 ? "" : ", "))
                .collect(Collectors.joining());
    }
}
