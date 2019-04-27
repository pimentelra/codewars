package katas.kyu7;

public class SuitcasePacking {
    public static Boolean fit_in(int a, int b, int m, int n) {
        return a + b <= Math.max(m, n) && Math.max(a, b) <= Math.min(m, n);
    }
}
