package katas.kyu7;

public class SimpleStringReversalII {
    public static String solve(String s, int a, int b) {
        return s.substring(0, a) + new StringBuilder(s.substring(a, Math.min(b + 1, s.length()))).reverse() + s.substring(Math.min(b + 1, s.length()));
    }
}
