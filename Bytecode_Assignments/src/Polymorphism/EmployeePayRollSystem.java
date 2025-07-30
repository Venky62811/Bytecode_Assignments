package Polymorphism;
class Employee
{
 String name;
 double calculateSalary() {
	return 0;
}
}
class FullTimeEmployee extends Employee{
	double monthlySalary;
	double calculateSalary() {
		return monthlySalary;
		
	}
	
}
class PartTimeEmployee extends Employee{
	int hoursWorked;
	double hourlyRate;
	double calculateSalary() {
		return hourlyRate;
	}
}
class ContractEmployee extends Employee{
	double contractAmount;
	double calculateSalary() {
		return contractAmount;
	}
}

public class EmployeePayRollSystem {

	public static void main(String[] args) {
		
     Employee emp;
     FullTimeEmployee fte = new FullTimeEmployee();
     fte.name = "Alice";
     fte.monthlySalary=50000;
     emp=fte;
     System.out.println(emp.name + "Salary " + emp.calculateSalary());
     
     PartTimeEmployee pte = new PartTimeEmployee();
     pte.name = "Bob";
     pte.hoursWorked = 80;
     pte.hourlyRate = 300;
     emp = pte;
     System.out.println(emp.name + " Salary: " + emp.calculateSalary());
     
     ContractEmployee ce = new ContractEmployee();
     ce.name = "Charlie";
     ce.contractAmount = 40000;
     emp = ce;
     System.out.println(emp.name + " Salary: " + emp.calculateSalary());

	}
}
