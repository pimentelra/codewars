package katas.kyu7;

import java.util.Arrays;

public class LongestVowelChain {
    public static int solve(String s){
        return Arrays.stream(s.split("[^aeiou]")).mapToInt(String::length).max().getAsInt();
    }
}
