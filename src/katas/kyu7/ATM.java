package katas.kyu7;

public class ATM {
    public int solve(int n) {
        int[] values = new int[]{10, 20, 50, 100, 200, 500};
        int count = 0;

        if (n < values[0] || n % 10 != 0) return -1;

        for (int i = values.length - 1; i >= 0 && n > 0; i--) {
            count += n / values[i];
            n -= n / values[i] * values[i];
        }

        return count;
    }
}
