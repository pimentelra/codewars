package katas.kyu7;

public class FixStringCase {
    public static String solve(final String str) {
        return str.length() - str.replaceAll("\\p{Upper}", "").length() > str.length() / 2 ? str.toUpperCase() : str.toLowerCase();
    }
}
