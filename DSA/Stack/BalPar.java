package DSA.Stack;

public class BalPar {
  public static void main(String[] args) {
    System.out.println("Balanced Parentheses");
    char stack[] = new char[6];
    char par[] = { '(', '(', ')', ')' };
    int top = 0;
    for (int i = 0; i < par.length; i++) {
      if (par[i] == '(') {
        push(par[i], stack, top);
        top++;
      } else if (par[i] == ')') {
        pop(stack, top);
        top--;
      }
    }
    if (top == 0) {
      System.out.println("It is an Balanced Parenthesis");
    } else {
      System.out.println("It is not an Balanced Parenthesis");
    }
  }

  public static void push(char val, char stack[], int top) {
    stack[top] = val;
  }

  public static void pop(char stack[], int top) {
    if (top < 0) {
      System.out.println("Stack underflow. Cannot pop.");
      return;
    }
    stack[top--] = 0; // Decrement top after popping
  }

}
