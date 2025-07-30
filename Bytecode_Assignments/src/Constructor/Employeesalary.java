package Constructor;
class Person {
	 String name;
	 int age;
	 public Person(String name, int age) {
		 this.name=name;
		 this.age=age;
	 }
}
class Employee extends Person {
		private double salary;
		
		public Employee (String name,int age,double salary) {
			super(name,age);
			this.salary=salary;
		}
		public void displaysalary() {
			System.out.println("salary of name "+name + "is" + salary);
		}	
}
public class Employeesalary {
	public static void main(String[] args) {
		Employee p = new Employee("venky",20,30000);
		p.displaysalary();
	}
}
