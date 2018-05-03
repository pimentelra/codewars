package katas.kyu7;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HowManyDaysAreWeRepresentedInAForeignCountry {
    public static int daysRepresented(int[][] trips) {
        Set<Integer> set = IntStream.range(0, trips.length).flatMap(i -> IntStream.rangeClosed(trips[i][0], trips[i][1])).boxed().collect(Collectors.toSet());
        return set.size();
    }
}
