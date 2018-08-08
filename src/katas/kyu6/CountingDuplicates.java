package katas.kyu6;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        return (int) text.toLowerCase().chars().distinct().filter(c -> text.length() - text.toLowerCase().replace("" + (char) c, "").length() > 1).count();
    }
}
