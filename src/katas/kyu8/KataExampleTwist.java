package katas.kyu8;

import java.util.stream.IntStream;

public class KataExampleTwist {
    public static String[] kataExampleTwist() {
        return IntStream.range(0, 1000).mapToObj(i -> "codewars").toArray(String[]::new);
    }
}
