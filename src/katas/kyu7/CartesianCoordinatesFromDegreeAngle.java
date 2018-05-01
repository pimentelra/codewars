package katas.kyu7;

import java.awt.geom.Point2D;

public class CartesianCoordinatesFromDegreeAngle {
    public Point2D coordinates(Double degrees, Double radius) {
        double radians = Math.toRadians(degrees);
        return new Point2D.Double(Math.round(Math.cos(radians) * radius * 10) / 10, Math.round(Math.sin(radians) * radius * 10) / 10);
    }
}
