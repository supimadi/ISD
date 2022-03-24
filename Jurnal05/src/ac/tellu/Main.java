package ac.tellu;

import java.util.Stack;

public class Main {

    public static int getPrecedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '^')
            return 3;
        else
            return -1;
    }

    public static boolean hashOperand(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static String toPolishNotation(String exp) {
        Stack<Character> stack = new Stack<>();

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < exp.length(); i++) {
            char cara = exp.charAt(i);

            if (Character.isLetterOrDigit(cara))
                output.append(cara);
            else if (cara == '(')
                stack.push(cara);
            else if (cara == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && getPrecedence(cara) <= getPrecedence(stack.peek()) && hashOperand(cara)){
                    output.append(stack.pop());
                }
                stack.push(cara);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "INVALID";
            output.append(stack.pop());
        }

        return output.toString();
    }

    public static void main(String[] args) {
        String contoh = "3-4*5";
        System.out.println(toPolishNotation(contoh));
    }
}