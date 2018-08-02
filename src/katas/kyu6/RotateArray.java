package katas.kyu6;

import java.util.Arrays;
import java.util.stream.Stream;

public class RotateArray {
    public Object[] rotate(Object[] data, int n) {
        if (n < 0) n += (Math.abs(n) / data.length + 1) * data.length;
        n %= data.length;
        return Stream.concat(Stream.of(Arrays.copyOfRange(data, data.length - n, data.length)), Stream.of(Arrays.copyOfRange(data, 0, data.length - n))).toArray(Object[]::new);
    }
}
