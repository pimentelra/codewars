package katas.kyu6;

import java.util.Stack;

public class ReversePolishNotationCalculator {
    public static double evaluate(String expr) {
        Stack<Double> stack = new Stack<>();

        for (String token : expr.split("\\s+")) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                default:
                    if (!token.isEmpty()) stack.push(Double.parseDouble(token));
                    break;
            }
        }
        return stack.empty() ? 0 : stack.pop();
    }
}
