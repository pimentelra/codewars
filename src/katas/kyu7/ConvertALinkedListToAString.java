package katas.kyu7;

public class ConvertALinkedListToAString {
    public static String stringify(Node list) {
        StringBuilder answerBuilder = new StringBuilder();
        try {
            while (true) {
                answerBuilder.append(list.getData()).append(" -> ");
                list = list.getNext();
            }
        } catch (NullPointerException ex) {
            answerBuilder.append("null");
        }
        return answerBuilder.toString();
    }
}
