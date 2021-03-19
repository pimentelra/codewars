package katas.kyu7;

public class ReverseTheBitsInAnInteger {

  public static int reverse_bits(int n) {
    return Integer.parseInt(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(), 2);
  }
}
