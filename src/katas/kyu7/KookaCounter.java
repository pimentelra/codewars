package katas.kyu7;

public class KookaCounter {
    public static int kookaCounter(final String laughing) {
        return laughing.replaceAll("((ha)+|(Ha)+)", String.valueOf(1)).replaceAll("[^1]", "").length();
    }
}
