package katas.kyu7;

public class MaximumMultiple {
    public static int maxMultiple(int divisor, int bound) {
        for (int i = bound; i > divisor; i--) if (i % divisor == 0) return i;
        return divisor;
    }
}
