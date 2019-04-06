package katas.kyu7;

import java.util.Arrays;
import java.util.stream.Stream;

public class DoubleSort {
    public static Object[] dbSort(Object[] a) {
        return Stream.concat(Arrays.stream(a).filter(o -> o instanceof Integer).sorted(),
                Arrays.stream(a).filter(o -> o instanceof String).sorted()).toArray();
    }
}
