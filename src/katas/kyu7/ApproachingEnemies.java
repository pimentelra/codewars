package katas.kyu7;

public class ApproachingEnemies {
    public double CalculateTime(double[] p1, double[] p2) {
        return Math.hypot(p2[0], p2[1]) * 5 / Math.hypot(p1[0] - p2[0], p1[1] - p2[1]);
    }
}
