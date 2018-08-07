package katas.kyu6;

import java.util.Arrays;

public class MultiTapKeypadTextEntryOnAnOldMobilePhone {
    public static int presses(String phrase) {
        String[] keyboard = {"1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9", "*", " 0", "#"};
        return phrase.toLowerCase().chars().map(c -> Arrays.stream(keyboard).mapToInt(i -> i.indexOf((char) c) + 1).sum()).sum();
    }
}
