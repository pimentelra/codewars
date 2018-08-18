package katas.kyu8;

public class ExclamationMarksSeries11ReplaceAllVowelToExclamationMarkInTheSentence {
    public static String replace(final String s) {
        return s.replaceAll("(?i)[aeiou]", "!");
    }
}
