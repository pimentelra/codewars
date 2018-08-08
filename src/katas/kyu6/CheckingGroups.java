package katas.kyu6;

import java.util.Stack;

public class CheckingGroups {
    public static boolean groupCheck(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
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
