package katas.kyu7;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SimpleFun41ElectionsWinners {
    static int find(final int[] votes, final int k) {
        Supplier<IntStream> stream = () -> IntStream.range(0, votes.length).map(v -> votes[v]);
        int beforeMax = stream.get().max().getAsInt();
        int afterMax = beforeMax + k;

        return (int) (beforeMax < afterMax ? stream.get().filter(v -> v + k > beforeMax).count() : stream.get().filter(v -> v == beforeMax).count() > 1 ? 0 : 1);
    }
}
