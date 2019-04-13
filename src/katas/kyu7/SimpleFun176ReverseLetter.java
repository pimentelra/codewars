package katas.kyu7;

public class SimpleFun176ReverseLetter {
    public static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("\\P{Alpha}", "")).reverse().toString();
    }
}
