public class Exercise1{
   public static void main(String[] args) {
      Animal animalInstance = new Cat();
      animalInstance.makeSound();//Invokes Cat(Subclass) makeSound method
      Animal animalInstance2 = new Animal();
      animalInstance2.makeSound();//Invokes Animal(Superclass) makeSound method
      Cat catInstance = new Cat();
      catInstance.makeSound();//Invokes Cat(Subclass) makeSound method
   }
}

class Animal{
   public void makeSound(){
      System.out.println("Animal Sound.");
   }
}

class Cat extends Animal{
   @Override
   public void makeSound(){
      System.out.println("Cat meows.");
   }
}