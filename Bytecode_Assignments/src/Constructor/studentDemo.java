package Constructor;
class student {
	String name;
	int age;

public student() {}
public student(String n) {
	name=n;
	age=10;
}
public student(String name,int age) {
	this.name=name;
	this.age=age;
}
}
public class studentDemo {

	public static void main(String[] args) {
		student s1= new student();
		student s2= new student("Venky1");
		student s3= new student("Venky2",20);
		System.out.println("name is: " + s1.name + "age is: " + s1.age);
		System.out.println("name is: " + s2.name + "age is: " + s2.age);
		System.out.println("name is: " + s3.name + "age is: " + s3.age);
	}

}
