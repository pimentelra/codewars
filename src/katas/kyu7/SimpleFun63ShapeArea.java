package katas.kyu7;

public class SimpleFun63ShapeArea {
    public static int shapeArea(int n) {
        int sum = n + n - 1;
        for (int i = 1; i < n + n - 1; i += 2) sum += i + i;
        return sum;
    }
}
