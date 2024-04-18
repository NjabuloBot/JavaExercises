package Methods;
/*
 * Write a Java method to find the smallest number among three
 */
import java.util.Scanner;

public class Exercise1 {

   public double smallestNumber(double num1,double num2,double num3){
      return Math.min(Math.min(num1, num2),num3);
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("First Number: ");
      double num1 = scan.nextDouble();
      System.out.print("Second Number: ");
      double num2 = scan.nextDouble();
      System.out.print("Third Number: ");
      double num3 = scan.nextDouble();
      Exercise1 exercise1 = new Exercise1();
      System.out.printf("The smallest number is %.0f\n",exercise1.smallestNumber(num1, num2, num3));
      scan.close();
   }
   
}
