package katas.kyu7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindCountOfMostFrequentItemInAnArray {
    public static int mostFrequentItemCount(int[] collection) {
        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
        for (int i : collection) {
            if (elementCountMap.containsKey(i)) {
                elementCountMap.put(i, elementCountMap.get(i) + 1);
            } else {
                elementCountMap.put(i, 1);
            }
        }

        int answer = 0;

        Set<Map.Entry<Integer, Integer>> entrySet = elementCountMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > answer) {
                answer = entry.getValue();
            }
        }

        return answer;
    }
}
