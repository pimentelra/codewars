package katas.kyu7;

public class StackedBalls3DSquareBase {
    public static double stackHeight3d(int layers) {
        return layers == 0 ? 0 : 1 + Math.sqrt(Math.pow(Math.sqrt(Math.pow(layers - 1, 2) - Math.pow((layers - 1) / 2., 2)), 2) - Math.pow((layers - 1) / 2., 2));
    }
}
