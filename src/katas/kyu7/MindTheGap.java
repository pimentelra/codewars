package katas.kyu7;

public class MindTheGap {
    public static int countMissingCarriages(String train) {
        return train.charAt(train.length() - 1) - '@' - train.length();
    }
}
