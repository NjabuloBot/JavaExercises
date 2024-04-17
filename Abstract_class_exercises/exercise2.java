/*Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and 
perimeter of each shape.
 */

abstract class Shape{
   public abstract void calculateArea();
   public abstract void calculatePerimeter();
}

class Circle extends Shape{
   double pi = Math.PI;
   double radius = 4.0;
   double Area = pi*(Math.pow(radius, 2));
   double Perimeter = 2*pi*radius;

   public void calculateArea(){
      System.out.println(Area);
   }

   public void calculatePerimeter(){
      System.out.println(Perimeter);
   }
}

class Triangle extends Shape{
   //trianle with equal sides.
   double base = 2;
   double height = 5;
   double Area = 0.5*base*height;
   double perimeter = 3*base;

   public void calculateArea(){
      System.out.println(Area);
   }

   public void calculatePerimeter(){
      System.out.println(perimeter);
   }

}

public class exercise2 {
   public static void main(String[] args) {
      Circle circleInstance = new Circle();
      circleInstance.calculateArea();
      circleInstance.calculatePerimeter();
      Triangle triangleInstance = new Triangle();
      triangleInstance.calculateArea();
      triangleInstance.calculatePerimeter();
   }
}

