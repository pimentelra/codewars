package katas.kyu7;

import java.util.Arrays;

public class SortingTheOddWay {
    public static Double[] sortItOut(Double[] array) {
        Arrays.sort(array, (x, y) -> {
            if ((x.intValue() & 1) == (y.intValue() & 1)) {
                if (x.intValue() == y.intValue()) {
                    if ((x.intValue() & 1) == 1) return x < y ? -1 : 1;
                    return x < y ? 1 : -1;
                }
                if ((x.intValue() & 1) == 0) return Integer.compare(y.intValue(), x.intValue());
                return Integer.compare(x.intValue(), y.intValue());
            }
            if ((x.intValue() & 1) == 0) return 1;
            return -1;
        });
        return array;
    }
}
