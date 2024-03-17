package DSA.Array;

public class RotateArrByOne {
  public static void main(String[] args) {
    System.out.println("Rotate Array by one number");
    int arr[] = { 1, 2, 3, 4 };
    RotatedArr(arr);
  }

  public static void RotatedArr(int arr[]) {
    int n = arr.length;
    int firstVal = arr[0];
    for (int i = 0; i < n - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[n - 1] = firstVal;

    System.out.println("Rotated Array Value are");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]);
    }
  }
}
