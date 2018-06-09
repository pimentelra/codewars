package katas.kyu6;

import java.util.Stack;

public class ValidBraces {
    public static boolean isValid(String braces) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < braces.length(); i++) {
            char current = braces.charAt(i);
            if (current == '(' || current == '[' || current == '{') stack.push(current);
            if (current == ')' || current == ']' || current == '}') {
                if (stack.empty()) return false;
                char previous = stack.pop();
                if (current - previous != 1 && current - previous != 2) return false;
            }
        }
        return stack.empty();
    }
}
