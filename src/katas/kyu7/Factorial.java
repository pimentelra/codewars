package katas.kyu7;

public class Factorial {
    public static int factorial(int n) {
        if (n < 0 || n > 12) throw new IllegalArgumentException();
        switch (n) {
            case 0:
            case 1:
                return 1;
            default:
                return n * factorial(n - 1);
        }
    }
}
