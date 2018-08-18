package katas.kyu6;

import java.util.function.Function;

public class FunctionIteration {
}

class GetIterator {
    public static Function<Integer, Integer> getIterator(Function<Integer, Integer> func, int times) {
        return new GetIterator().new IterationFunction(func, times);
    }

    private class IterationFunction implements Function<Integer, Integer> {
        private int times;
        private Function<Integer, Integer> func;

        IterationFunction(Function<Integer, Integer> func, int times) {
            this.func = func;
            this.times = times;
        }

        public Integer apply(Integer result) {
            for (int i = 0; i < times; i++) result = func.apply(result);
            return result;
        }
    }
}
