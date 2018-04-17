package katas.kyu7;

public class VisibleDotsOnADie {
    public int totalAmountVisible(int topNum, int numOfSides) {
        return (numOfSides + 1) * (numOfSides / 2) - (numOfSides + 1 - topNum);
    }
}
