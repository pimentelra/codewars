package katas.kyu7;

public class PalindromeChainLength {

  public static int palindromeChainLength(long n) {
    int step = 0;
    long n1 = n, n2 = Long.parseLong(new StringBuilder(String.valueOf(n1)).reverse().toString());
    while (n1 != n2) {
      n1 += n2;
      n2 = Long.parseLong(new StringBuilder(String.valueOf(n1)).reverse().toString());
      step++;
    }

    return step;
  }
}
