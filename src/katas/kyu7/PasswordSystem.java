package katas.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PasswordSystem {
    public static String helpZoom(final int[] key) {
        return Arrays.equals(key, IntStream.range(0, key.length).map(i -> key[key.length - i - 1]).toArray()) ? "Yes" : "No";
    }
}
