package katas.kyu8;

public class AreaOfASquare {
    public static double squareArea(double a) {
        return Math.round(Math.pow(a / (0.5 * Math.PI), 2) * 100) / 100.0;
    }
}
