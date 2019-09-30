package katas.kyu6;

public class VasyaAndSystemOfEquations {
    public static int Solution(int n, int m) {
        int count = 0;

        for (int a = 0; a <= m; a++)
            for (int b = 0; b <= n; b++)
                if (Math.pow(a, 2) + b == n && a + Math.pow(b, 2) == m) count++;
        return count;
    }
}
