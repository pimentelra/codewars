package katas.kyu7;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class SimpleArrayProduct {
  public static int solve(int [][] arr){
    AtomicReference<IntSummaryStatistics> iss = new AtomicReference<>(
        new IntSummaryStatistics(2, 1, 1, 2));

    Arrays.stream(arr).forEach(a -> {
      IntSummaryStatistics ss = IntStream.of(a).summaryStatistics();
      iss.set(IntStream.of(iss.get().getMax() * ss.getMax(), iss.get().getMax() * ss.getMin(),
          iss.get().getMin() * ss.getMax(), iss.get().getMin() * ss.getMin()).summaryStatistics());
    });

    return iss.get().getMax();
  }

}
