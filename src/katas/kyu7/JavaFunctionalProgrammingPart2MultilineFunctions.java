package katas.kyu7;

import java.util.function.ToDoubleFunction;

public class JavaFunctionalProgrammingPart2MultilineFunctions {
    public static ToDoubleFunction<Triangle> f = t -> {
        double area = 0.5 * t.base * t.height;
        t.setArea(area);
        return area;
    };
}
