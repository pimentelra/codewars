package katas.kyu7;

import java.util.Arrays;

public class SortOutTheMenFromBoys {
    public static int[] menFromBoys(final int[] values) {
        return Arrays.stream(values).distinct().boxed().sorted((i1, i2) -> {
            if ((i1 & 1) == (i2 & 1)) {
                if ((i1 & 1) == 0) return Integer.compare(i1, i2);
                return Integer.compare(i2, i1);
            }
            if ((i1 & 1) == 0) return -1;
            return 1;
        }).mapToInt(i -> i).toArray();
    }
}
