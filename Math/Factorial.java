import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    System.out.println("Factorial of a number");

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter The Number");
    int value = scan.nextInt();
    System.out.println("The Factorial of " + value + " is " + factorial(value));

  }

  public static int factorial(int value) {
    int sum = 1;
    while (value != 0) {
      sum = sum * value;
      value--;
    }
    return sum;
  }
}