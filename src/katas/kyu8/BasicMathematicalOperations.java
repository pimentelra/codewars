package katas.kyu8;

public class BasicMathematicalOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        int result = 0;
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                return v1 / v2;
        }
        return result;
    }
}
