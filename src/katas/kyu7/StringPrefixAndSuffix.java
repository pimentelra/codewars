package katas.kyu7;

public class StringPrefixAndSuffix {
    public static int solve(String s) {
        return s.length() - s.replaceAll("^(\\w+)(?=.*\\1$)", "").length();
    }
}
