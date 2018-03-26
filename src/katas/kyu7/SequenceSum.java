package katas.kyu7;

import java.util.stream.IntStream;

public class SequenceSum {
    public static int[] sumOfN(int n) {
        int[] answer = new int[Math.abs(n) + 1];
        IntStream.range(1, answer.length).forEach(i -> answer[i] = answer[i - 1] + (Math.abs(n) / n) * i);
        return answer;
    }
}
