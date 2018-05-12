package katas.kyu8;

public class FindNearestSquareNumber {
    public int nearestSq(int n) {
        return (int) Math.pow(Math.round(Math.sqrt((double) n)), 2);
    }
}
