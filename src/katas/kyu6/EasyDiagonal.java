package katas.kyu6;

import java.math.BigInteger;

public class EasyDiagonal {
    public static BigInteger diagonal(int n, int p) {
        BigInteger ans = BigInteger.ZERO, previous = BigInteger.ZERO;
        for (int i = p, j = 0; j <= n - p; i++, j++) {
            previous = (j == 0) ? BigInteger.ONE : previous.multiply(BigInteger.valueOf(i)).divide(BigInteger.valueOf(j));
            ans = ans.add(previous);
        }
        return ans;
    }
}
