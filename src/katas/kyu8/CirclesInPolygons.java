package katas.kyu8;

public class CirclesInPolygons {
    int sides;
    int sideLength;

    public CirclesInPolygons(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter(){
        return Math.round(2 * sideLength / (2 * Math.tan(Math.toRadians(180 / (sides * 1.)))) * 1000) / 1000.;
    }
}
