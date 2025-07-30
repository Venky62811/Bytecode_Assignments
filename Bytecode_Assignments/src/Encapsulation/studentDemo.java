package Encapsulation;
class Student {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		if(age>0) {
			this.age=age;
		}else {
			System.out.println("Invalid age");
		}
    }
}
public class studentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		s.setName("Venky");
		s.setAge(20);
		System.out.println("name is :" + s.getName());
		System.out.println("age is  :" + s.getAge());
	}

}
