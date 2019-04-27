package katas.kyu6;

public class MatrixAddition {
    public static int[][] matrixAddition(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) for (int j = 0; j < a[0].length; j++) b[i][j] += a[i][j];
        return b;
    }
}
