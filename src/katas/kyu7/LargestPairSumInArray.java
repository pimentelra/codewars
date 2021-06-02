package katas.kyu7;

import java.util.Arrays;
import java.util.Comparator;

public class LargestPairSumInArray {
  public static int largestPairSum(int[] numbers) {
    return Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).limit(2)
        .reduce(0, Integer::sum);
  }

  public static int largestPairSum2(int[] numbers) {
    Arrays.sort(numbers);
    return numbers[numbers.length - 2] + numbers[numbers.length - 1];
  }
}
