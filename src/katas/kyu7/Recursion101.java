package katas.kyu7;

public class Recursion101 {
    public static int[] solve(int a, int b) {
        if (a == 0 || b == 0) return new int[]{a, b};
        if (a >= 2 * b) return solve(a - 2 * b, b);
        if (b >= 2 * a) return solve(a, b - 2 * a);
        return new int[]{a, b};
    }
}
