package katas.kyu7;

import java.util.stream.Collectors;

public class UniqueStringCharacters {

  public static String solve(String a, String b) {
    return a.chars().filter(i -> b.indexOf(i) == -1).mapToObj(i -> "" + (char) i).collect(Collectors.joining())
        + b.chars().filter(j -> a.indexOf(j) == -1).mapToObj(j -> "" + (char) j).collect(Collectors.joining());
  }
}
