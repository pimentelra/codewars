package katas.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SimpleDirectionsReversal {

  public static String[] solve(String[] arr) {
    String[][] temp = Arrays.stream(arr).map(s -> s.split(" on ")).toArray(String[][]::new);
    String[] answer = new String[arr.length];
    String s = "Begin on ";
    for (int i = temp.length - 1, j = 0; i >= 0; i--, j++) {
      answer[j] = s += temp[i][1];
      if (i > 0) s = (temp[i][0].equals("Left") ? "Right" : "Left") + " on ";
    }

    return answer;
  }

  public static String[] solve1(String[] arr) {
    String[][] temp = Arrays.stream(arr).map(s -> s.split(" on ")).toArray(String[][]::new);
    String[] answer = new String[arr.length];
    answer[0] = "Begin on " + temp[arr.length - 1][1];
    IntStream.range(1, arr.length).forEach(i -> answer[i] = String.format("%s on %s",
        temp[arr.length - i][0].equals("Left") ? "Right"
            : temp[i][0].equals("Right") ? "Left" : temp[i][0],
        temp[temp.length - 1 - i][1]));

    return answer;
  }
}
