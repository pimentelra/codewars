package katas.kyu7;

public class StackedBalls3DTriangleBase {
    public static double stackHeight3d(int layers) {
        return layers == 0 ? 0 : (layers - 1) * Math.sqrt(2 / 3.) + 1;
    }
}
