/*
 * Write a Java method to compute the average of three numbers.
 */

import java.util.Scanner;

public class Exercise2 {
   public double avaerage(double num1,double num2,double num3){
      return (num1+num2+num3)/3;
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.printf("First Number: ");
      double num1 = scan.nextDouble();
      System.out.printf("Second Number: ");
      double num2 = scan.nextDouble();
      System.out.printf("Third Number: ");
      double num3 = scan.nextDouble();
      Exercise2 exercise2 = new Exercise2();
      System.out.printf("The average value : %.1f\n",exercise2.avaerage(num1, num2, num3));
      scan.close();
   }
}
