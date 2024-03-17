package DSA.Array;

public class PairWithSum {
  public static void main(String[] args) {
    System.out.println("Find the Pair with a Given Sum");
    int arr[] = { 1, 3, 4, 5, 10 };
    int sum = 15;
    Pair(arr, sum);
  }

  public static void Pair(int arr[], int target) {
    int n = arr.length;
    int left = 0, right = n - 1;
    while (left <= right) {
      int Currsum = arr[left] + arr[right];
      if (Currsum == target) {
        System.out.println("The Pair is [" + arr[left] + "," + arr[right] + "]");
        return;
      } else if (Currsum > target) {
        right--;
      } else if (Currsum < target) {
        left++;
      }
    }
    System.out.println("No Pair");
  }
}
