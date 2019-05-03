package katas.kyu6;

public class PIApproximation {
    public static String iterPi2String(Double epsilon) {
        double pi = 0, den = 1; int iter = 0;
        for (; epsilon < Math.abs(Math.PI - 4 * pi); iter++, den += 2) pi = iter % 2 == 0 ? pi + (1 / den) : pi - (1 / den);
        return String.format("[%s, %s]", iter, String.format("%.10f", pi * 4));
    }
}
