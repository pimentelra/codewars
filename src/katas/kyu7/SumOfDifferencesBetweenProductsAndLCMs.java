package katas.kyu7;

import java.math.BigInteger;
import java.util.Arrays;

public class SumOfDifferencesBetweenProductsAndLCMs {
    public static int sumDifferencesBetweenProductsAndLCMs(final int[][] pairs) {
        return Arrays.stream(pairs).mapToInt(i -> {
            int product = i[0] * i[1];
            int gcd = BigInteger.valueOf(i[0]).gcd(BigInteger.valueOf(i[1])).intValue();
            int lcd = gcd == 0 ? 0 : product / gcd;
            return product - lcd;
        }).sum();
    }
}
