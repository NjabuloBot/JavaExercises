/*
 * Write a Java method to count all the words in a string.
 */

import java.util.Scanner;

public class Exercise5 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter you sentence: ");
      String sentence = scan.nextLine();
      Exercise5 exercise5 = new Exercise5();
      System.out.printf("Number of words in sentence: %d\n",exercise5.numberOfWords(sentence));
      scan.close();
   }

   public int numberOfWords(String sentence){
      return sentence.split("\s+").length;
   }
   
}
