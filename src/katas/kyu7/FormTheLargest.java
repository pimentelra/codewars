package katas.kyu7;

public class FormTheLargest {
    public static long maxNumber(long n) {
        long num = n, result = 0;
        int[] digits = new int[10];
        while (num != 0) {
            int v = (int) (num % 10);
            digits[v]++;
            num /= 10;
        }

        for (int i = 9; i >= 0; i--) for (int j = 0; j < digits[i]; j++) result = result * 10 + i;
        return result;
    }
}
