package katas.kyu7;

public class SplitInParts {
    public static String splitInParts(String s, int partLength) {
        return s.replaceAll("(.{" + partLength + "})", "$1 ").trim();
    }
}
