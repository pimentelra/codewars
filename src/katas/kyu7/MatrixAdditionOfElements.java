package katas.kyu7;

import java.util.Arrays;

public class MatrixAdditionOfElements {
    public static int sumOfElements(int matrix[][]) {
        return Arrays.stream(matrix).mapToInt(i -> Arrays.stream(i).sum()).sum();
    }
}
