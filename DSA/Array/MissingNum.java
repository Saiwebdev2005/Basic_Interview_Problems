package DSA.Array;

public class MissingNum {
  public static void main(String[] args) {
    System.out.println("Finding the Missing Number");
    int arr[] = { 0, 1, 2, 3, 5 };
    System.out.println("The Missing Number is " + MissingNumber(arr));

  }

  public static int MissingNumber(int arr[]) {
    int n = arr.length;
    int ActualSum = n * (n + 1) / 2;
    int PresentSum = 0;

    for (int i = 0; i < n; i++) {
      PresentSum += arr[i];
    }
    System.out.println("Actual sum is " + ActualSum);
    System.out.println("Present sum is " + PresentSum);

    return (ActualSum - PresentSum);
  }
}
