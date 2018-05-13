package katas.kyu7;

public class GreatestCommonDivisorBitcount {
    public static int gcdBinary(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        if (x == 0 || y == 0) return Integer.bitCount(x + y);
        return gcdBinary(y, x % y);
    }
}
