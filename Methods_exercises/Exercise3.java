/*
 * Write a Java method to display the middle character of a string.
Note: a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
 */

public class Exercise3 {
   public String middleCharacter(String word){
      String middleChar ="";
      if(word.length()%2==0){
         middleChar = word.substring((word.length()/2-1),word.length()/2+1);
      }else{
         middleChar = word.substring((word.length()/2), (word.length()/2)+1);
      }
      return middleChar;
   }

   public static void main(String[] args) {
      Exercise3 exercise3 = new Exercise3();
      System.out.println(exercise3.middleCharacter("lol"));
   }
   
}
