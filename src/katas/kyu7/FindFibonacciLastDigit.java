package katas.kyu7;

import java.math.BigInteger;

public class FindFibonacciLastDigit {
    public static int getFibNumb(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        for (int i = 31 - Integer.numberOfLeadingZeros(n); i >= 0; i--) {
            BigInteger d = a.multiply(b.shiftLeft(1).subtract(a));
            BigInteger e = a.multiply(a).add(b.multiply(b));
            a = d;
            b = e;
            if (((n >>> i) & 1) != 0) {
                BigInteger c = a.add(b);
                a = b;
                b = c;
            }
        }
        String answer = String.valueOf(a);
        return Integer.parseInt(answer.substring(answer.length() - 1));
    }
}
