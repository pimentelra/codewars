package katas.kyu7;

public class ARuleOfDivisibilityBy7 {
    public static long[] seven(long m) {
        long count = 0;
        while (m > 99) {
            m = m / 10 - 2 * (m % 10);
            count++;
        }
        return new long[]{m, count};
    }
}
