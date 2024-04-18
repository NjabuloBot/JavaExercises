/*
 * Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and Programmer. 
 * Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.
 */

public class Exercise4 {

   public static void main(String[] args) {
      
   }
   
}

class Employee{
   String name,address,jobTitle;
   double salary;

   Employee(String name,String address,String jobTitle,double salary){
      this.name = name;
      this.address = address;
      this.jobTitle = jobTitle;
      this.salary = salary;
   }

   public String getName(){
      return name;
   }

   public String getAddress(){
      return address;
   }

   public double getSalary(){
      return salary;
   }

   public String getTitle(){
      return jobTitle;
   }

   public double calculatingBonuses(){
      return getSalary()+0.0;
   }

   public void performanceReport(){
      System.out.println("Employee's performance");
   }

   public void EmployeeProject(){
      System.out.println("Employee manages project");
   }

}

class Manager extends Employee{

   int numberOfWorkers;

   Manager(String name,String address,String jobTitle,int salary,int numberOfWorkers){
      super(name, address, jobTitle, salary);
      this.numberOfWorkers = numberOfWorkers;
   }

   @Override
   public void EmployeeProject(){
      System.out.println("Manager manages "+numberOfWorkers+" workers.");
   }

   @Override
   public void performanceReport(){
      System.out.println("Manager performed exceptionally well!");
   }

   @Override
   public double calculatingBonuses(){
      return getSalary()+2000.0;
   }
}

class Developer extends Employee{

   Developer(String name,String address,String jobTitle,int salary){
      super(name, address, jobTitle, salary);
   }
}

class Programmer extends Employee{

   Programmer(String name,String address,String jobTitle,int salary){
      super(name, address, jobTitle, salary);
   }
}