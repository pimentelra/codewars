package katas.kyu7;

public class AreaOfACircle {
    public static double area(double radius) {
        if(radius <= 0) throw new IllegalArgumentException();
        return Math.PI * radius * radius;
    }
}
