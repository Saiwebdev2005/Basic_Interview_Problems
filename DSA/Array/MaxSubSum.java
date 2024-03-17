package DSA.Array;

public class MaxSubSum {
 public static void main(String[] args) {
    System.out.println("Maximum Sub-Array Sum");
    int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int maxSum = MaxSum(arr);
    System.out.println("Maximum Sub-Array Sum is: " + maxSum);
 }

 public static int MaxSum(int arr[]) {
    int n = arr.length;
    int maxSoFar = arr[0];
    int maxEndingHere = arr[0]; 

    for (int i = 1; i < n; i++) {
      // Update maxEndingHere to the maximum of the current element and the sum of maxEndingHere and the current element
      maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
      // Update maxSoFar to the maximum of maxSoFar and maxEndingHere
      maxSoFar = Math.max(maxSoFar, maxEndingHere);
    }

    return maxSoFar;
 }
}
