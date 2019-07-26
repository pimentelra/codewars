package katas.kyu6;

public class TriangleNumberCheck {
    public static Boolean isTriangleNumber(long number) {
        int n = (int) Math.sqrt(2 * number);
        return n * (n + 1) / 2 == number;
    }
}
