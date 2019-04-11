package katas.kyu7;

import java.util.stream.IntStream;

public class HungarianVowelHarmonyEasy {
    public static String dative(String word) {
        String cases = "aáoóuúeéiíöőüű", regex = "[^"+ cases + "]";
        return word + (cases.indexOf(new StringBuilder(word.replaceAll(regex, "")).reverse().toString().charAt(0)) < 6 ? "nak" : "nek");
    }
}
