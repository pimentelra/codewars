package katas.kyu8;

import java.util.Arrays;

public class ExpressionsMatter {
    public static int expressionsMatter(int a, int b, int c) {
        int[] arr = new int[]{
                a + b + c,
                a * b * c,
                a * (b + c),
                (a + b) * c,
                a * b + c,
                a + b * c
        };
        return Arrays.stream(arr).max().getAsInt();
    }
}
