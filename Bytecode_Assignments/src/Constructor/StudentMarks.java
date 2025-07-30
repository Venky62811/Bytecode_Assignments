package Constructor;
class Student {
	private String name;
	private int age;
	private double GPA;
	
	public Student (String name,int age,double GPA) {
		this.name=name;
		this.age=age;
		this.GPA=GPA;
	}
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
		GPA=0.0;
	}
	public void displayGPA() {
		System.out.println("Student name is: " + name+ " "+"age is:" + " "+age +" and GPA: "+ GPA);
		
	}
	
}
public class StudentMarks {

	public static void main(String[] args) {
		Student s1=new Student("Venky",20,6.8);
		Student s2=new Student("Sasi",22);
		s1.displayGPA();
		s2.displayGPA();
	}

}
