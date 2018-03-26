package katas.kyu7;

import java.math.BigInteger;

public class TrianglesFromDots {
    public static BigInteger numberOfDots(BigInteger n) {
        return n.multiply(n.add(BigInteger.ONE)).divide(BigInteger.valueOf(2));
    }
}
