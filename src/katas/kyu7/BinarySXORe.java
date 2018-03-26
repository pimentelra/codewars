package katas.kyu7;

import java.math.BigInteger;

public class BinarySXORe {
    public static BigInteger sxore(BigInteger n) {
        return new BigInteger[]{n, BigInteger.ONE, n.add(BigInteger.ONE), BigInteger.ZERO}[n.remainder(BigInteger.valueOf(4l)).intValue()];
    }
}
