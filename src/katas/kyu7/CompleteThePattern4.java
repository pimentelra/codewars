package katas.kyu7;

import java.util.stream.IntStream;

public class CompleteThePattern4 {
    public static String pattern(int n) {
        if (n <= 0) return "";
        StringBuilder answer = new StringBuilder();
        IntStream.rangeClosed(1, n).forEach(i -> {
            IntStream.rangeClosed(i, n).forEach(answer::append);
            if (i != n) {
                answer.append("\n");
            }
        });
        return answer.toString();
    }
}
