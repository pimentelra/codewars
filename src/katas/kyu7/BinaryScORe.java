package katas.kyu7;

import java.math.BigInteger;

public class BinaryScORe {
    public static BigInteger score (BigInteger n) {
        return n.toString(2).contains("1") ? new BigInteger(n.toString(2).replaceAll("0", "1"), 2) : n;
    }
}
