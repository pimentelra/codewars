package katas.kyu6;

public class BouncingBalls {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) return -1;
        int times = 1;
        while (window <= h * bounce) {
            h *= bounce;
            times += 2;
        }
        return times;
    }
}
