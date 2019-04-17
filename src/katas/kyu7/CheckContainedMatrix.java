package katas.kyu7;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CheckContainedMatrix {
    public static int[] checkIsContained(int[][] mat1, int[][] mat2) {
        for (int x = 0; x < mat1.length - 2; x++) {
            List<Integer> cornerMatches = new ArrayList<>();
            for (int y = 0; y < mat1[0].length - 2; y++) if (mat1[x][y] == mat2[0][0]) cornerMatches.add(y);
            for (Integer i : cornerMatches) if (patternMatches(mat1, new Point2D.Double(x, i), mat2)) return new int[]{x, i};
        }
        return new int[]{-1, -1};
    }

    private static boolean patternMatches(int[][] text, Point2D index, int[][] pattern) {
        return IntStream.range(0, 3).noneMatch(x -> IntStream.range(0, 3).anyMatch(y -> pattern[x][y] != text[(int) index.getX() + x][(int) index.getY() + y]));
    }
}
