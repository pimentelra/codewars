package katas.kyu7;

public class NumberOfRectanglesInAGrid {
    public static int numberOfRectangles(int m, int n) {
        return m * (m + 1) * n * (n + 1) / 4;
    }
}
