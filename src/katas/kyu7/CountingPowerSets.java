package katas.kyu7;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CountingPowerSets {
    public static BigInteger powers(int[] list) {
        return new BigDecimal(Math.pow(2, list.length)).toBigInteger();
    }
}
