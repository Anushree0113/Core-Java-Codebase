package EY_Interview;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "([]){";
        boolean isValid = checkValidParenthesis(str);
        System.out.println("isValid = " + isValid);
    }

    private static boolean checkValidParenthesis(String s) {
        boolean isValid = false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (top == '(' && ch == ')' || top == '{' && ch == '}' || top == '[' && ch == ']') {
                    isValid = true;
                } else {
                    isValid = false;
                    break ;
                }

            }
        }
        if (!stack.isEmpty())
            isValid = false;

            return isValid;
    }
}
