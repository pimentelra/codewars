package katas.kyu7;

import java.util.Arrays;

public class SimpleFun40TimedReading {
    public static int timedReading(final int maxLength, final String text) {
        return text.replaceAll("[^a-zA-Z\\s]", "").isEmpty() ? 0 : (int) Arrays.stream(text.replaceAll("[^a-zA-Z\\s]", "").split(" ")).filter(w -> w.length() <= maxLength).count();
    }
}
