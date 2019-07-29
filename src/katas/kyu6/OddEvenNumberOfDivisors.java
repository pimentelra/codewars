package katas.kyu6;

import java.math.BigInteger;

public class OddEvenNumberOfDivisors {
    public static String oddity(BigInteger n) {
        return !(n.compareTo(BigInteger.ZERO) < 0 || n.compareTo(BigInteger.valueOf(n.sqrt().intValue() * n.sqrt().intValue())) != 0) ? "odd" : "even";
    }
}
