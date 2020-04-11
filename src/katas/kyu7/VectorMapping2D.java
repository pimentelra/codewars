package katas.kyu7;

public class VectorMapping2D {
    public static double[] mapVector(double[] v, double[] c1, double[] c2) {
        return new double[]{c2[0] + (v[0] - c1[0]) * c2[2] / c1[2], c2[1] + (v[1] - c1[1]) * c2[2] / c1[2]};
    }
}
