package katas.kyu7;

import java.util.stream.IntStream;

public class PrincipalDiagonalVSSecondaryDiagonal {
    public static String diagonal(int[][] matrix) {
        int r = IntStream.range(0, matrix.length).map(i -> matrix[i][i] - matrix[i][matrix.length - 1 - i]).sum();
        return r == 0 ? "Draw!" : (r > 0 ? "Principal" : "Secondary") + " Diagonal win!";
    }
}
