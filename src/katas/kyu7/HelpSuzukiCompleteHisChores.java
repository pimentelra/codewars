package katas.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HelpSuzukiCompleteHisChores {
    public static int[] choreAssignments(int[] chores) {
        Arrays.sort(chores);
        int[] answer = IntStream.range(0, chores.length / 2).map(i -> chores[i] + chores[chores.length - 1 - i]).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
