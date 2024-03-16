import java.util.*;
public class ArmStrong {
  public static void main(String[] args) {
    System.out.println("ArmStrong value");
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Value");
    int value = scan.nextInt();
    if(armstrong(value)){
      System.out.println("It is an armstrong");
    }
    else{
      System.out.println("It is not an armstrong");
    }
  }

public static boolean armstrong(int value){
  double sumValue = 0;
  int temp = value;
  int count = 0;
  
  while(temp != 0){
    count++;
    temp = temp/10;
  }
  System.out.println("The Total number in value is "+count);

  int temp2 = value;

  while(temp2 != 0){
    int no = temp2%10;
    sumValue += Math.pow(no, count);
    temp2 = temp2/10;
  }

  return (sumValue == value);
}
}
