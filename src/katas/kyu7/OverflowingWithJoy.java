package katas.kyu7;

public class OverflowingWithJoy {
    public static int multiply(int a, int b) {
        if ((long) a * b < Integer.MIN_VALUE || (long) a * b > Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        return a * b;
    }
}
