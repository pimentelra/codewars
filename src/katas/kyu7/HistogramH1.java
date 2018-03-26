package katas.kyu7;

import java.util.Collections;

public class HistogramH1 {
    public static String histogram(final int results[]) {
        StringBuilder answer = new StringBuilder();
        for (int i = results.length - 1; i >= 0; i--) {
            answer.append(String.valueOf(i + 1) + "|");
            if (results[i] > 0)
                answer.append(String.join("", Collections.nCopies(results[i], "#"))).append(" ").append(results[i]);
            answer.append("\n");
        }
        return answer.toString();
    }
}
