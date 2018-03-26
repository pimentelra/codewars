package katas.kyu7;

import java.math.BigInteger;

public class FunctionsOfIntegersOnCartesianPlane {
    public static BigInteger sumin(int n) {
        long min = 0;
        for (int i = 1, j = n; i <= n; i++, j--) {
            min += i * j + i * (j - 1);
        }
        return BigInteger.valueOf(min);
    }

    public static BigInteger sumax(int n) {
        long max = 0;
        for (int i = n; i >= 1; i--) {
            max += i * i + i * (i - 1);
        }
        return BigInteger.valueOf(max);
    }

    public static BigInteger sumsum(int n) {
        long sum = 0;
        for (int i = 1, j = n; i < n; i++, j--) {
            sum += (i * (i + 1)) + (i * (n + j));
        }
        sum += n * (n + 1);
        return BigInteger.valueOf(sum);
    }
}
