package DSA.Array;

import java.util.HashSet;

public class DuplicateNum {
  public static void main(String[] args) {
    System.out.println("Finding the Duplicate Number");
    int arr[] = { 1, 2, 3, 4, 5, 6, 6, 7 };
    findDuplicate(arr);
  }

  public static void findDuplicate(int arr[]) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr) {

      if (!set.add(num)) {
        System.out.println("Duplicate number found: " + num);
        return; // Exit the method once the duplicate is found
      }
    }
    System.out.println("No duplicate number found.");
  }
}
