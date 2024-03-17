package DSA.Stack;

import java.util.Stack;

public class InfToPost {
    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostfix(String expression) {
        Stack<Character> stack = new Stack<>();
        String postfix = "";

        for (int i = 0; i < expression.length(); ++i) {
            char c = expression.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfix += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    return "Invalid Expression"; // invalid expression
                } else {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    postfix += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }

        return postfix;
    }

    public static void main(String[] args) {
        String expression = "A+B*C";
        System.out.println("Infix expression: " + expression);
        System.out.println("Postfix expression: " + infixToPostfix(expression));
    }
}

