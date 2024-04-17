/*
 * Write a Java program to create a class called Employee with methods called work() and getSalary(). 
 * Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
 */

public class Exercise2 {
   public static void main(String[] args) {
      Employee employeeInstance = new Employee(2000);
      employeeInstance.work();//Invokes Employee(Superclass) work method
      System.out.println(employeeInstance.getSalary());//Retrieves Employee(Superclass) salary
      HRManager hrManagerInstance = new HRManager(3000);
      hrManagerInstance.work();//Invokes HRManager(Subclass) work method
      System.out.println(hrManagerInstance.getSalary());//Retrieves HRManager(Subclass) salary.
   }
}

class Employee{
   int salary;

   public Employee(int salary){
      this.salary = salary;
   }

   public void work(){
      System.out.println("Working as an Employee");
   }

   public int getSalary(){
      return salary;
   }
}

class HRManager extends Employee{

   public HRManager(int salary){
      super(salary);
   }

   @Override
   public void work(){
      System.out.println("Working as a HRManager");
   }

   public void addEmployee(){
      System.out.println("Added new Employee.");
   }
}
