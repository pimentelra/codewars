package katas.kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SmallestUnusedID {

  public static int nextId(int[] ids) {
    return IntStream.rangeClosed(0, Arrays.stream(ids).max().orElse(0) + 1)
        .filter(i -> Arrays.stream(ids).noneMatch(j -> j == i)).findFirst().getAsInt();
  }
}
