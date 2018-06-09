package katas.kyu6;

public class PascalsTriangle2 {
    public static int[][] pascal(int depth) {
        int[] current = null, previous = {}, triangle[] = new int[depth][];
        for (int r = 0; r < depth; r++) {
            current = new int[previous.length + 1];
            current[0] = current[previous.length] = 1;
            for (int c = 1; c < previous.length; c++) current[c] = previous[c - 1] + previous[c];
            previous = triangle[r] = current;
        }
        return triangle;
    }
}
