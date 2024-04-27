package GFG.Stacks;

import java.util.Stack;

public class BalanceBrackets {

    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.isEmpty())
                return false;

            char c = s.charAt(i);
            switch (c) {
                case ')':
                    char c1 = stack.pop();
                    if (c1 == '{' || c1 == '[')
                        return false;
                    break;
                case ']':
                    char c2 = stack.pop();
                    if (c2 == '(' || c2 == '{')
                        return false;
                    break;
                case '}':
                    char c3 = stack.pop();
                    if (c3 == '[' || c3 == '(')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String s = "[({[([{}])]})}";
        System.out.println(isBalanced(s));
    }

}
