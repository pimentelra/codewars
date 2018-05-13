package katas.kyu7;

import com.google.common.base.Preconditions;

public class GuavaAgainstMillionDollarError {
    public class Sum {
        public Double sum(Double a, Double b) {
            a = Preconditions.checkNotNull(a, "Illegal Argument passed: First parameter is Null.");
            b = Preconditions.checkNotNull(b, "Illegal Argument passed: Second parameter is Null.");
            Preconditions.checkArgument(a > 0 && b > 0, "Illegal Argument passed: Non-positive value %s.", a <= 0 ? a : b);

            return a + b;
        }
    }
}
