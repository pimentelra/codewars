package katas.kyu7;

import java.util.Arrays;

public class MaxMinArrays {

  public static int[] solve(int[] arr) {
    int[] sorted = Arrays.stream(arr).sorted().toArray(), answer = new int[arr.length];
    for (int i = 0, j = 0; i < answer.length; j++) {
      answer[i++] = sorted[sorted.length - 1 - j];
      if (i != answer.length) {
        answer[i++] = sorted[j];
      }
    }
    return answer;
  }
}
