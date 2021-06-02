package katas.kyu8;

import java.util.Arrays;
import java.util.Comparator;

public class GravityFlip {
  public static int[] flip(char dir, int[] arr) {
    return dir == 'L' ? Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray()
        : Arrays.stream(arr).sorted().toArray();
  }
}
