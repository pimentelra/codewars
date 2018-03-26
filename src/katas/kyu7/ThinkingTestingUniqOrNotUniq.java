package katas.kyu7;

import java.util.Arrays;

public class ThinkingTestingUniqOrNotUniq {
    public static int[] testit(int[] a, int[] b) {
        a = Arrays.stream(a).distinct().toArray();
        b = Arrays.stream(b).distinct().toArray();
        int answer[] = new int[a.length + b.length];
        System.arraycopy(a, 0, answer, 0, a.length);
        System.arraycopy(b, 0, answer, a.length, b.length);
        Arrays.sort(answer);
        return answer;
    }
}
