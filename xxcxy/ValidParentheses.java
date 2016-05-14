package algorithm.lintcode.easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0, len = s.length(); i < len; i++) {
            char c = s.charAt(i);
            if (isLeftChar(c)) {
                stack.push(c);
            } else if (stack.empty() || !pair(stack.pop(), c)) {
                return false;
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }

    private String parentheses = "()[]{}";

    private boolean pair(final char c1, final char c2) {
        return parentheses.indexOf(new String(new char[]{c1, c2})) > -1;
    }

    private boolean isLeftChar(final char c) {
        return parentheses.indexOf(c) % 2 == 0;
    }
}
