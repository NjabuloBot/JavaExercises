/*
 * Write a Java program to create a class called Shape with a method called getArea(). 
 * Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
 */
public class Exercise3{
   public static void main(String[] args) {
      Shape shapeInstance = new Rectangle(4,2);
      System.out.println(shapeInstance.getArea());
   }
}

class Shape{

   public int getArea(){
      return 0;
   }
}

class Rectangle extends Shape{

   int width;
   int height;

   public Rectangle(int width,int height){
      this.width = width;
      this.height = height;
   }

   @Override
   public int getArea(){
      return width*height;
   }
}