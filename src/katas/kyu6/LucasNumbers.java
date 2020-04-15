package katas.kyu6;

public class LucasNumbers {
    public static int lucasnum(int n) {
        return n == 0 ? 2 : n == 1 ? 1 : n > 1 ? lucasnum(n - 1) + lucasnum(n - 2) : lucasnum(n + 2) - lucasnum(n + 1);
    }
}
