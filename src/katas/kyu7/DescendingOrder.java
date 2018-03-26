package katas.kyu7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        if (num == 0) return 0;
        List<Integer> list = new LinkedList<>();
        for (int i = num; i > 0; i /= 10) list.add(i % 10);
        return Integer.valueOf(list.stream().map(Object::toString).sorted(Collections.reverseOrder()).collect(Collectors.joining()));
    }
}
