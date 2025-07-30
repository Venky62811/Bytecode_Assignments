package Constructor;
class person {
	private String name;
	private int age;
	
	public person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void introduce () {
		System.out.println("Person name is: " + name + " 	age is: " + age);
	}
}
public class PersonDemo {

	public static void main(String[] args) {
		person p = new person("Venky", 20);
		p.introduce();
	}

}
