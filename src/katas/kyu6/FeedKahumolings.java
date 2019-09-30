package katas.kyu6;

import java.util.function.Supplier;
import java.util.stream.*;

public class FeedKahumolings {
    public static double[] serve(double food, double flavour, int mouths) {
        Supplier<DoubleStream> stream = () -> IntStream.range(0, mouths).mapToDouble(e -> Math.pow(flavour, e));
        return stream.get().map(m -> food / stream.get().sum() * m).toArray();
    }
}
