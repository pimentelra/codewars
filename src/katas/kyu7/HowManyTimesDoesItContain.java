package katas.kyu7;

public class HowManyTimesDoesItContain {
    public static int stringCounter(String inputS, char charS) {
        return (int) inputS.chars().filter(i -> i == charS).count();
    }
}
