package katas.kyu6;

public class AckermannFunction {
    public static Integer Ackermann(int m, int n) {
        if (m < 0 || n < 0) return null;
        if (m == 0) return n + 1;
        else if (n == 0) return Ackermann(m - 1, 1);
        else return Ackermann(m - 1, Ackermann(m, n - 1));
    }
}
