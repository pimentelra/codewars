package katas.kyu8;

import java.util.stream.IntStream;

public class CountTheMonkeys {
    public static int[] monkeyCount(final int n){
        return IntStream.range(1, n + 1).toArray();
    }
}
