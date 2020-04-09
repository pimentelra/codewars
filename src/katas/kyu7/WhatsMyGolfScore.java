package katas.kyu7;

import java.util.stream.IntStream;

public class WhatsMyGolfScore {
    public static int golfScoreCalculator(String parList, String scoreList) {
        return IntStream.range(0, parList.length()).map(i -> scoreList.charAt(i) - parList.charAt(i)).sum();
    }
}
