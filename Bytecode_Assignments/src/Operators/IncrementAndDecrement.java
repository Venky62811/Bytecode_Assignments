package Operators;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int a=20,b=0,c=0,d=0;
		b=a++ + --a;
		System.out.println("B value is: "+b);
		System.out.println("A value is: "+a);
		c=++b + a++ - ++a;
		System.out.println("C value is: "+c);
		System.out.println("B value is: "+b);
		System.out.println("A value is: "+a);
		d=c-- + ++c;
		System.out.println("D value is: "+d);
		System.out.println("C value is: "+c);

	}

}
