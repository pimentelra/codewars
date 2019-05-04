package katas.kyu6;

public class VasyaAndStairs {
    public static int NumberOfSteps(int n, int m) {
        for (int i = n % 2 == 0 ? n / 2 : n / 2 + 1; i <= n; i++) if (i % m == 0) return i;
        return -1;
    }
}
