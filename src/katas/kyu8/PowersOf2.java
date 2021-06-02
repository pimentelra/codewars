package katas.kyu8;

import java.util.stream.IntStream;

public class PowersOf2 {
  public static long[] powersOfTwo(int n){
    return IntStream.rangeClosed(0, n).mapToLong(i -> (long) Math.pow(2, i)).toArray();
  }
}
