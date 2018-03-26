package katas.kyu7;

import java.util.Arrays;
import java.util.Comparator;

public class InspiringStrings {
    public static String longestWord(String wordString) {
        String[] words = wordString.split(" ");
        Arrays.sort(words, Comparator.comparingInt(String::length));
        return words[words.length - 1];
    }
}
