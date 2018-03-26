package katas.kyu7;

import java.util.Arrays;

public class CalculateMeanAndConcatenateString {
    public static Object[] mean(char[] lst) {
        Object[] answer = new Object[2];
        String[] array = String.valueOf(lst).replaceAll("[^0-9]", "").split("");
        answer[0] = Arrays.stream(array).mapToInt(Integer::parseInt).sum() / (array.length * 1.);
        answer[1] = String.valueOf(lst).replaceAll("[^a-zA-Z]", "");
        return answer;
    }
}
