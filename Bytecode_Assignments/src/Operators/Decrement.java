package Operators;

public class Decrement {

	public static void main(String[] args) {
		int a=20,b=0,c=0;
		// post decrement
		b=a--;
		System.out.println("B value is: "+b);
		System.out.println("A value is: "+a);
		// pre decrement
		c=--a;
		System.out.println("C value is: "+c);
		System.out.println("A value is: "+a);

	}

}
