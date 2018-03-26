package katas.kyu8;

public class SentenceSmash {
    public static String smash(String... words) {
        return String.format("%s", String.join(" ", words));
    }
}
