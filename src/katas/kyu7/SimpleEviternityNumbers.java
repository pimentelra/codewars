package katas.kyu7;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleEviternityNumbers {

  public static int solve(int a, int b) {
    return ((int) IntStream.range(a, b).mapToObj(String::valueOf)
        .filter(s -> s.matches("[853]+"))
        .map(i -> i.chars().mapToObj(j -> "" + (char) j).collect(
            Collectors.groupingBy(Function.identity(), Collectors.counting())))
        .filter(
            m -> m.getOrDefault("8", 0L) >= m.getOrDefault("5", 0L)
                && m.getOrDefault("5", 0L) >= m.getOrDefault("3", 0L)).count());

//    return (int) IntStream.range(a, b).mapToObj(String::valueOf)
//        .filter(s -> s.matches("[853]+"))
//        .filter(t -> t.replaceAll("[5]", "").length() >= t.replaceAll("[8]", "").length()
//            && t.replaceAll("[3]", "").length() >= t.replaceAll("[5]", "").length()).count();
  }

}
