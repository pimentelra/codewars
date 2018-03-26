package katas.kyu7;

import java.util.Collections;
import java.util.Map;

public class Kids80s1HowManyLicksDoesItTake {
    public static String totalLicks(Map<String, Integer> env) {
        int sum = env.values().stream().mapToInt(value -> value).sum();
        String challengeSentence = "";

        if (env.size() > 0) {
            int maxValue = Collections.max(env.entrySet(), Map.Entry.comparingByValue()).getValue();
            if (maxValue > 0) {
                String challenge = Collections.max(env.entrySet(), Map.Entry.comparingByValue()).getKey();
                if (Collections.max(env.entrySet(), Map.Entry.comparingByValue()).getValue() > 0) {
                    challengeSentence = " The toughest challenge was " + challenge + ".";
                }
            }
        }
        return "It took " + (252 + sum) + " licks to get to the tootsie roll center of a tootsie pop." + challengeSentence;
    }
}
