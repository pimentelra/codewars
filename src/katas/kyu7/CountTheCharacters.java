package katas.kyu7;

public class CountTheCharacters {
    public static int charCount(String str, char c) {
        return str.toLowerCase().replaceAll("[^" + String.valueOf(c).toLowerCase() + "]", "").length();
    }
}
