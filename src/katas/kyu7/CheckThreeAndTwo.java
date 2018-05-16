package katas.kyu7;

public class CheckThreeAndTwo {
    public boolean checkThreeAndTwo(char[] chars) {
        return String.valueOf(chars).matches("^(?=(.)(?:.*\\1){1,2})(?=\\1*+(.)(?:\\1*\\2){1,2})(?!(?:\\1*+\\2*)*+.).*$");
    }
}
