public class Fibonacci {
  public static void main(String[] args) {
    System.out.println("Fibonacci Series");
    fibonacci(8);
  }

  public static void fibonacci(int value) {

    int a = 1, b = -1, c = 0;
    while (c < value) {
      c = a + b;
      b = a;
      a = c;
      System.out.println(c);
    }

  }
}