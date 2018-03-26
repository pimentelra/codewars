package katas.kyu8;

public class IsItANumber {
    public boolean isDigit(String s) {
        return s.trim().matches("-?\\d+(\\.\\d+)?");
    }
}
