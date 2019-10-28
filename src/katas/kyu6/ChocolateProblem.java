package katas.kyu6;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ChocolateProblem {
    public static int chocolate(int n, int[] firstBar, int[] secondBar) {
        int pieces = 0;
        Map<Integer, Integer> indexByValue = IntStream.range(0, n).boxed().collect(Collectors.toMap(j -> firstBar[j], j -> j, (a, b) -> b));

        for (int i = 0; i < n; ) {
            int fIndex = indexByValue.get(secondBar[i]);
            while (i < n && fIndex < n && secondBar[i] == firstBar[fIndex]) {
                i++;
                fIndex++;
            }

            if (i != n) pieces++;
        }
        return pieces;
    }
}
