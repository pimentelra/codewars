package katas.kyu7;

public class FindSumOfTopLeftToBottomRightDiagonals {
    public static int diagonalSum(final int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) sum += matrix[i][i];
        return sum;
    }
}
