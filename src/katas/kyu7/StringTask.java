package katas.kyu7;

public class StringTask {
    public static String perform(String word) {
        return word.toLowerCase().replaceAll("[aeiouy]", "").replaceAll("([a-z])", ".$1");
    }
}
