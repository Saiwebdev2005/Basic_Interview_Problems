public class PalindromeNo {
  public static void main(String[] args) {
     System.out.println("Palindrome Number");
     int value = 112;
     System.out.println(palindrome(value));
  }
 
  public static boolean palindrome(int value){
     int originalValue = value;
     int reversedValue = 0; 
 
     // Reverse the number
     while(value != 0) {
       int digit = value % 10; 
       reversedValue = reversedValue * 10 + digit; 
       value /= 10; 
     }
 
    
     return originalValue == reversedValue;
  }
 }
 