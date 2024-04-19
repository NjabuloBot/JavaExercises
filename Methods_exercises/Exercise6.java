//Write a Java method to compute the sum of digits in an integer.
import java.util.Scanner;

public class Exercise6 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Input an integer: ");
      String integer = scan.nextLine();
      Exercise6 exercise6 = new Exercise6();
      System.out.printf("The sum is: %d\n",exercise6.sumOfDigits(integer));
      scan.close();
   }

   public int sumOfDigits(String integer){
      int sum=0;
      String[] digits=integer.split("");
      for(String digit : digits){
         sum+=Integer.valueOf(digit);
      }
      return sum;
   }
}
