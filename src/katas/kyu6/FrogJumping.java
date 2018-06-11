package katas.kyu6;

public class FrogJumping {
    public static int solution(int[] a) {
        if (a.length == 0) return -1;
        int[] aux = new int[a.length];
        for (int i = 0, j = 0; i < aux.length; i++) {
            aux[i] = a[j];
            j = j + a[j];
            if (j < 0 || j >= a.length) return i + 1;
        }
        return -1;
    }
}
