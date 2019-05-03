package katas.kyu6;

public class FindingNeoPG13 {
    public int[] find(Matrix matrix, int neo) {
        for (int i = 0; i < matrix.size(); i++) for (int j = 0; j < matrix.size(); j++) if (matrix.get(i, j) == neo) return new int[]{i, j};
        return null;
    }
}
