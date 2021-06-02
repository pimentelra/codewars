package katas.kyu8;

import java.util.stream.IntStream;

public class WhatIsBetween {
  public static int[] between(int a, int b) {
    return IntStream.rangeClosed(a, b).toArray();
  }
}
