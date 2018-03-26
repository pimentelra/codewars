package katas.kyu7;

public class TwoToOne {
    public static String longest(String s1, String s2) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < alphabet.length(); i++) {
            if ((s1 + s2).contains(String.valueOf(alphabet.charAt(i))))
                answer.append(String.valueOf(alphabet.charAt(i)));
        }
        return answer.toString();

    }
}
