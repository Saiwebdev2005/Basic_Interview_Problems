package DSA.Stack;
import java.util.*;

public class QueueByStack {
    public static void main(String[] args) {
        System.out.println("Queue using stack");
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Enqueue elements
        enqueue(s1, s2, 1);
        enqueue(s1, s2, 2);
        enqueue(s1, s2, 3);

        // Dequeue elements
        System.out.println("Dequeued element: " + dequeue(s1, s2));
        System.out.println("Dequeued element: " + dequeue(s1, s2));

        // Peek at the next element
        System.out.println("Peeked element: " + peek(s1, s2));

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + isEmpty(s1, s2));
    }

    // Enqueue operation
    public static void enqueue(Stack<Integer> s1, Stack<Integer> s2, int val) {
        s1.push(val);
    }

    // Dequeue operation
    public static int dequeue(Stack<Integer> s1, Stack<Integer> s2) {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    // Peek operation
    public static int peek(Stack<Integer> s1, Stack<Integer> s2) {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    // Check if the queue is empty
    public static boolean isEmpty(Stack<Integer> s1, Stack<Integer> s2) {
        return s1.isEmpty() && s2.isEmpty();
    }
}
