package katas.kyu7;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartialWordSearching {
    static String[] findWord(String x, String[] y) {
        ArrayList<String> answer = IntStream.range(0, y.length).filter(i -> y[i].toLowerCase().contains(x.toLowerCase())).mapToObj(i -> y[i]).collect(Collectors.toCollection(ArrayList::new));
        return answer.size() == 0 ? new String[]{"Empty"} : answer.toArray(new String[0]);
    }
}
