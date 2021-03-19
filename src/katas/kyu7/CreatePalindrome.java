package katas.kyu7;

import java.util.stream.IntStream;

public class CreatePalindrome {

  public static boolean solve(String st) {
    return IntStream.range(0, st.length() / 2)
        .map(i -> Math.abs(st.charAt(i) - st.charAt(st.length() - 1 - i)))
        .allMatch(j -> j == 0 || j == 2);
  }
}
