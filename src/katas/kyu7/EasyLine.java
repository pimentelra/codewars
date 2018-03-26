package katas.kyu7;

import java.math.BigInteger;

public class EasyLine {
    public static BigInteger easyLine(int n) {
        BigInteger answer = BigInteger.valueOf(0);
        for (int i = 0; i <= n; i++) {
            answer = answer.add(binomi(n, i).pow(2));
        }
        return answer;
    }

    static BigInteger binomi(int n, int k) {
        BigInteger res = BigInteger.valueOf(1);

        if (k > n - k)
            k = n - k;

        for (int i = 0; i < k; ++i) {
            res = res.multiply(BigInteger.valueOf(n - i));
            res = res.divide(BigInteger.valueOf(i + 1));
        }

        return res;
    }
}
