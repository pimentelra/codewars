package katas.kyu7;

import java.util.Arrays;

public class PartsOfAList {
    public static String[][] partlist(String[] arr) {
        String[][] answer = new String[arr.length - 1][2];
        for (int i = 0; i < arr.length - 1; i++) {
            answer[i][0] = String.join(" ", Arrays.copyOfRange(arr, 0, i + 1));
            answer[i][1] = String.join(" ", Arrays.copyOfRange(arr, i + 1, arr.length));
        }
        return answer;
    }
}
