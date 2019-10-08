package katas.kyu6;

public class RoutesInASquareGrid {
    public static long calculateRoutes(int n) {
        if (n < 1) return 0;
        long count = 1;
        for (int i = 0; i < n; i++) count = (count * ((2 * n) - i)) / (i + 1);
        return count;
    }
}
