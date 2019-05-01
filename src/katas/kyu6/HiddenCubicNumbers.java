package katas.kyu6;

import java.util.Arrays;

public class HiddenCubicNumbers {
    public static String isSumOfCubes(String s) {
        StringBuilder sb = new StringBuilder(); int sum = 0;
        int[] arr = Arrays.stream(s.replaceAll("[^\\p{Digit}\\s]*", "").replaceAll("\\s\\s+", " ").trim()
                .split(" ")).map(n -> n.split("(?<=\\G.{3})")).flatMap(Arrays::stream).mapToInt(Integer::parseInt).toArray();

        for (int i : arr) {
            int res = (int) (Math.pow(i / 100, 3) + Math.pow((i / 10) % 10, 3) + Math.pow(i % 10, 3));
            if (i == res) {
                sb.append(i).append(" ");
                sum += res;
            }
        }

        return sb.length() == 0 ? "Unlucky" : sb.append(sum).append(" Lucky").toString();
    }
}
