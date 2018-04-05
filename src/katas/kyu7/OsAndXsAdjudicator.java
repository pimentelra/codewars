package katas.kyu7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OsAndXsAdjudicator {
    public String judge(List<Integer> history) {
        if (checkPlays(IntStream.range(0, history.size()).filter(i -> i % 2 == 0).mapToObj(history::get).collect(Collectors.toList()))) return "X_WIN";
        if (checkPlays(IntStream.range(0, history.size()).filter(i -> i % 2 != 0).mapToObj(history::get).collect(Collectors.toList()))) return "O_WIN";
        return "NO_WINNER";
    }

    private boolean checkPlays(List<Integer> list) {
        return list.containsAll(Arrays.asList(0, 1, 2)) ||
                list.containsAll(Arrays.asList(3, 4, 5)) ||
                list.containsAll(Arrays.asList(6, 7, 8)) ||
                list.containsAll(Arrays.asList(0, 3, 6)) ||
                list.containsAll(Arrays.asList(1, 4, 7)) ||
                list.containsAll(Arrays.asList(2, 5, 8)) ||
                list.containsAll(Arrays.asList(0, 4, 8)) ||
                list.containsAll(Arrays.asList(2, 4, 6));
    }
}
