package katas.kyu6;

import java.util.ArrayList;
import java.util.List;

public class DeleteOccurrencesOfAnElementIfItOccursMoreThanNTimes {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> list = new ArrayList<>();
        for (int e : elements) if (list.stream().filter(n -> n == e).count() < maxOccurrences) list.add(e);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
