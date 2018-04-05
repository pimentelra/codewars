package katas.kyu7;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticProgression {
    public static String arithmeticSequenceElements(int first, int step, long total) {
        List<String> answer = new ArrayList<>();
        for (long i = first; step > 0 ? i < first + (step * total) : i > first + (step * total); i += step) answer.add(String.valueOf(i));
        return String.join(", ", answer);
    }
}

