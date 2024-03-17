package DSA.Stack;

public class StackOperations {
  public static void main(String[] args) {
    int arr[] = new int[6]; // Initialize the array with a fixed size
    int top = 0; // Stack is empty initially

    // Push operation
    push(arr, 12, top);
    
    System.out.println("Top element after push: " + arr[top]);
top++;
    // Pop operation
    int poppedValue = pop(arr, top);
    top--;
    System.out.println("Popped value: " + poppedValue);
    System.out.println("Top element after pop: " + arr[top]);
  }

  public static void push(int arr[], int value, int top) {
    if (top >= arr.length - 1) {
      System.out.println("Stack is full. Cannot push " + value);
      return;
    }
    arr[++top] = value;
  }

  public static int pop(int arr[], int top) {
    if (top < 0) {
      System.out.println("Stack is empty. Cannot pop.");
      return -1; // Return -1 or throw an exception as per your design
    }
    return arr[top--];
  }
}
