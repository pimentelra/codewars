package katas.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ScalingSquaredStrings {
    public static String scale(String strng, int k, int v) {
        if (strng.equals("")) return "";
        String[] array = strng.split("\n");
        StringBuilder answer = new StringBuilder();

        for (String anArray : array) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < anArray.length(); j++) {
                char[] chars = new char[k];
                Arrays.fill(chars, anArray.charAt(j));
                temp.append(new String(chars));
            }
            temp.append("\n");

            IntStream.range(0, v).mapToObj(j -> temp)
                    .forEach(answer::append);
        }
        return answer.toString().substring(0, answer.toString().length() - 1);
    }
}
