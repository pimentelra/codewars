package katas.kyu7;

public class CompoundArray {
    public static int[] compoundArray(int[] a, int[] b) {
        int[] answer = new int[a.length + b.length];
        int al = 0, bl = 0, i = 0;
        while (i < answer.length) {
            if (al < a.length) answer[i++] = a[al++];
            if (bl < b.length) answer[i++] = b[bl++];
        }
        return answer;
    }
}
