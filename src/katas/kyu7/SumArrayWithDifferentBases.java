package katas.kyu7;

import java.util.Arrays;

public class SumArrayWithDifferentBases {
    public static long sumItUp(BasedNumbers[] numbersWithBases) {
        return Arrays.stream(numbersWithBases).mapToLong(x -> Integer.parseInt(x.number, x.base)).sum();
    }
}
