package katas.kyu7;

public class ToLeetSpeak {
    public static String toLeetSpeak(final String speak) {
        String answer = speak.replaceAll("A", "@");
        answer = answer.replaceAll("B", "8");
        answer = answer.replaceAll("C", "(");
        answer = answer.replaceAll("E", "3");
        answer = answer.replaceAll("G", "6");
        answer = answer.replaceAll("H", "#");
        answer = answer.replaceAll("I", "!");
        answer = answer.replaceAll("L", "1");
        answer = answer.replaceAll("O", "0");
        answer = answer.replaceAll("S", "\\$");
        answer = answer.replaceAll("T", "7");
        return answer.replaceAll("Z", "2");
    }
}
