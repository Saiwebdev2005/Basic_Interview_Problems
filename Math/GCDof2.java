//0(log(a,b))
public class GCDof2 {
  public static void main(String[] args) {
     // Greater Common Divisor
     System.out.println("GCD Of Two Numbers");
     int v1 = 8, v2 = 12;
     System.out.println("The GCD is " + GCD(v1, v2));
  }
 
  public static int GCD(int v1, int v2) {
     // Ensure v1 is the larger number
     if (v1 < v2) {
       int temp = v1;
       v1 = v2;
       v2 = temp;
     }
 
     // Use the Euclidean algorithm to find the GCD
     while (v2 != 0) {
       int remainder = v1 % v2;
       v1 = v2;
       v2 = remainder;
     }
 
     return v1; // v1 is now the GCD
  }
 }
 