/*  Write a Java program to create an abstract class Animal with an abstract method called sound(). 
Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound 
for each animal.*/

abstract class Animal{
   abstract void sound();
}

class Lion extends Animal{
   void sound(){
      System.out.println("Lion makes a sound!");
   }
}

class Tiger extends Animal{
   void sound(){
      System.out.println("Tiger makes a sound!");
   }
}

class Main{
   public static void main(String[] args) {
      Lion lionInstance = new Lion();
      Tiger tigerInstance = new Tiger();
      lionInstance.sound();
      tigerInstance.sound();
   }
}