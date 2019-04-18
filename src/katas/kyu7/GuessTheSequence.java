package katas.kyu7;

import java.util.stream.IntStream;

public class GuessTheSequence {
    static int[] sequence(int x) {
        return IntStream.rangeClosed(1, x).mapToObj(String::valueOf).sorted().mapToInt(Integer::parseInt).toArray();
    }
}
