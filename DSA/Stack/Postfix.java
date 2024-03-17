package DSA.Stack;

import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        System.out.println("Postfix Expression");
        Stack<Integer> stack = new Stack<>();
        char input[] = {'2','3','4','*','+'};

        for (char c : input) {
            if (c >= '0' && c <= '9') {
                stack.push(Character.getNumericValue(c));
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                int a = stack.pop();
                int b = stack.pop();
                int val = 0;
                switch (c) {
                    case '+':
                        val = b + a;
                        break;
                    case '-':
                        val = b - a;
                        break;
                    case '*':
                        val = b * a;
                        break;
                    case '/':
                        val = b / a;
                        break;
                }
                stack.push(val);
            }
        }
        System.out.println("The result of the postfix expression is " + stack.pop());
    }
}
