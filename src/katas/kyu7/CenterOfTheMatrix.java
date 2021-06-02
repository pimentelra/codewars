package katas.kyu7;

public class CenterOfTheMatrix {
  public static Integer center(int[][] matrix) {
    return (matrix.length % 2 == 0 || matrix[0].length % 2 == 0) ? null
        : matrix[matrix.length / 2][matrix[0].length / 2];
  }
}
