package katas.kyu7;

import java.util.stream.IntStream;

public class LetterboxPaintSquad {
    public static int[] paintLetterboxes(final int start, final int end) {
        int[] answer = new int[10];
        IntStream.rangeClosed(start, end).forEach(n -> {
            while (n > 0) {
                answer[n % 10]++;
                n /= 10;
            }
        });
        return answer;
    }
}
