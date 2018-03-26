package katas.kyu7;

public class NumbersWithThisDigitInside {
    public static long[] NumbersWithDigitInside(long x, long d) {
        long count = 0, sum = 0, product = 0;
        for (int i = 1; i <= x; i++) {
            if (String.valueOf(i).contains(String.valueOf(d))) {
                count += 1;
                sum += i;
                if (product == 0) product = 1;
                product *= i;
            }
        }
        return new long[]{count, sum, product};
    }
}
