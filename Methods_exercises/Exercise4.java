/*
 * Write a Java method to count all vowels in a string.
 */
import java.util.Scanner;

public class Exercise4 {

   public static void main(String[] args) {
      Exercise4 exercise4 = new Exercise4();
      Scanner scanner = new Scanner(System.in);
      String word = scanner.nextLine();
      System.out.printf("NUmber of vowels: %d\n",exercise4.countVowels(word));
      scanner.close();
   }

   public int countVowels(String word){
      return word.replaceAll("[.[^aeiouAEIOU]]","").length();
   }
   
}
