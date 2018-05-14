package katas.kyu7;

import java.util.stream.IntStream;

public class MatrixSquareUpB {
    public static String[][] matrixSquareUp(int b) {
        return IntStream.range(0, b).mapToObj(i -> IntStream.range(0, b)
                    .mapToObj(j -> b - (j % b) <= i + 1 ? String.valueOf(b - (j % b)) : "x")
                    .toArray(String[]::new))
                .toArray(String[][]::new);
    }
}
