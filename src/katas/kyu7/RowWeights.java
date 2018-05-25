package katas.kyu7;

import java.util.stream.IntStream;

public class RowWeights {
    public static int[] rowWeights(final int[] weights) {
        return new int[]{
                IntStream.range(0, weights.length).filter(i -> i % 2 == 0).map(i -> weights[i]).sum(),
                IntStream.range(0, weights.length).filter(i -> i % 2 == 1).map(i -> weights[i]).sum()
        };
    }
}
