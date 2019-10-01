package katas.kyu7;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class ThePaperFoldSequence {
}

class PaperFold implements IntSupplier {
    private int i = 0;
    private int[] array = IntStream.rangeClosed(1, 1000000).map(i -> ~(i >> Integer.numberOfTrailingZeros(i) + 1) & 1).toArray();

    public int getAsInt() {
        return array[i++];
    }
}