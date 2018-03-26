package katas.kyu7;

import java.util.ArrayList;
import java.util.Arrays;

public class UnflattenAListEasy {
    public static Object[] unflatten(int[] flatArray) {
        ArrayList<Object> answer = new ArrayList<>();
        for (int i = 0; i < flatArray.length; i++) {
            if (flatArray[i] < 3) answer.add(flatArray[i]);
            else {
                answer.add(Arrays.copyOfRange(flatArray, i, i + flatArray[i] > flatArray.length ? flatArray.length : i + flatArray[i]));
                i = i + flatArray[i] - 1;
            }
        }
        return answer.toArray();
    }
}
