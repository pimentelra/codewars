package katas.kyu7;

import java.util.Arrays;
import java.util.function.IntFunction;

public class CurryingFunctionsMultiplyAllElementsInAnArray {
  public static IntFunction<int[]> multiplyAll(int[] array) {
    return i -> Arrays.stream(array).map(x -> x * i).toArray();
  }
}
