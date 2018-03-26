package katas.kyu8;

import java.util.ArrayList;
import java.util.List;

public class UnfinishedLoopBugFixing1 {
    public static List<Integer> CreateList(int number) {
        List<Integer> list = new ArrayList<>();

        for (int count = 1; count <= number; count++) {
            list.add(count);
        }

        return list;
    }
}
