package katas.kyu7;

public class CartesianNeighbors {
    public static int[][] cartesianNeighbor(int x, int y) {
        int[][] answer = new int[8][2];
        for (int i = 0, j = x - 1; j <= x + 1; j++)
            for (int k = y - 1; k <= y + 1; k++) if (j != x || k != y) answer[i++] = new int[]{j, k};
        return answer;
    }
}
