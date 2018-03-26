package katas.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class OddMarchBits8Bits {
    public static int[][] BitMarch(int n) {
        int[][] answer = new int[8 - n + 1][8];
        int[] firstArray = new int[8];
        IntStream.range(0, n).forEach(i1 -> firstArray[firstArray.length - 1 - i1] = 1);
        answer[0] = firstArray;

        int[] tempArray = Arrays.copyOf(firstArray, firstArray.length);
        int bound = 8 - n + 1;
        IntStream.range(1, bound).forEach(i -> {
            System.arraycopy(tempArray, 1, tempArray, 0, 7);
            tempArray[tempArray.length - 1] = 0;
            answer[i] = Arrays.copyOf(tempArray, tempArray.length);
        });

        return answer;
    }
}
