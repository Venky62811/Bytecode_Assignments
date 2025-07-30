package StaticBlock;

public class Employee {
	static String companyname;
	static {
		System.out.println("Inside the block");
		companyname="TCS";
	}
	static {
		System.out.println("Static block2");
	}
	static {
		System.out.println("Static block3");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		System.out.println("Companyname: "+companyname);
	}
	static {
		System.out.println("Static block4");
	}
	static {
		System.out.println("Static block5");
	}

}
