import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    System.out.println("Prime Number");
    System.out.println("Enter the Value");
    Scanner scan = new Scanner(System.in);
    int value = scan.nextInt();
    if (prime(value)) {
      System.out.println("It is a Prime Number");
    } else {
      System.out.println("It is not a Prime Number");
    }
  }

  public static boolean prime(int value) {
    if (value % 2 == 0)
      return false;
    else
      return true;
  }
}
