package katas.kyu7;

public class CalculateTheHarmonicConjugatedPointOfATripletOfAlignedPoints {
    public static double harmPoints(double a, double b, double c) {
        return (a * (2 * b - c) - b * c) / (a + b - 2 * c);
    }
}
