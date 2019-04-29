package katas.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HelpTheBookseller {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return lstOfArt.length == 0 || lstOf1stLetter.length == 0 ? "" : Arrays.stream(lstOf1stLetter)
                .map(s -> String.format("(%s : %s)", s, Arrays.stream(lstOfArt).filter(l -> s.equals("" + l.charAt(0))).map(t -> t.split(" ")[1]).mapToInt(Integer::parseInt).sum()))
                .collect(Collectors.joining(" - "));
    }
}
