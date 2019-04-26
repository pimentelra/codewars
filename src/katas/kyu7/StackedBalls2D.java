package katas.kyu7;

public class StackedBalls2D {
    public static double stackHeight2d(int layers) {
        return layers > 0 ? 1 + Math.sqrt(Math.pow(layers - 1, 2) - Math.pow((layers - 1) / 2., 2)) : 0;
    }
}
