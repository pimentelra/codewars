package katas.kyu7;

import java.util.Arrays;

public class HowManyConsecutiveNumbersAreNeeded {

  public static int consecutive(final int[] arr) {
    int[] d = Arrays.stream(arr).distinct().sorted().toArray();
    return d.length == 0 ? 0 : d[d.length - 1] + 1 - d[0] - d.length;
  }
}
