package katas.kyu7;

import java.util.stream.IntStream;

public class RobinsonCrusoe {
    public static double[] crusoe(int n, double d, int ang, double distmult, double angmult) {
        return new double[]{
                IntStream.range(0, n).mapToDouble(i -> i).reduce(0, (a, b) -> a + (d * Math.pow(distmult, b) * Math.cos(Math.toRadians(ang) * Math.pow(angmult, b)))),
                IntStream.range(0, n).mapToDouble(i -> i).reduce(0, (a, b) -> a + (d * Math.pow(distmult, b) * Math.sin(Math.toRadians(ang) * Math.pow(angmult, b))))
        };
    }
}
