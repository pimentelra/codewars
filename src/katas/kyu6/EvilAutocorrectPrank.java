package katas.kyu6;

public class EvilAutocorrectPrank {
    public static String autocorrect(String input) {
        return input.replaceAll("(?i)\\b(u|you+)\\b", "your sister");
    }
}
