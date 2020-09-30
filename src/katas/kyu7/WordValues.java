package katas.kyu7;

import java.util.stream.IntStream;

public class WordValues {
    public static int[] nameValue(String[] arr) {
        return IntStream.range(1, arr.length + 1).mapToObj(i -> arr[i - 1].replace(" ", "").chars()
                .map(c -> c - 96).sum() * i).mapToInt(j -> j).toArray();
    }
}
