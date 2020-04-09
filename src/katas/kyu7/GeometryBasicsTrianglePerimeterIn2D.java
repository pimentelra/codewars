package katas.kyu7;

import java.awt.geom.Point2D;

public class GeometryBasicsTrianglePerimeterIn2D {
    public static double trianglePerimeter(final Geometry.Triangle t) {
        return Point2D.distance(t.a.x, t.a.y, t.b.x, t.b.y) +
                Point2D.distance(t.b.x, t.b.y, t.c.x, t.c.y) +
                Point2D.distance(t.c.x, t.c.y, t.a.x, t.a.y);
    }
}
